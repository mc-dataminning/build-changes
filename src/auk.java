import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.io.File;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class auk {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final wx e = wx.c("chat.filtered_full");
   public static final wx f = wx.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aqo> l = Lists.newArrayList();
   private final Map<UUID, aqo> m = Maps.newHashMap();
   private final auq n = new auq(a);
   private final auh o = new auh(b);
   private final aul p = new aul(c);
   private final aus q = new aus(d);
   private final Map<UUID, avo> r = Maps.newHashMap();
   private final Map<UUID, akv> s = Maps.newHashMap();
   private final epa t;
   private boolean u;
   private final je<akw> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public auk(MinecraftServer $$0, je<akw> $$1, epa $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vv $$0, aqo $$1, arc $$2) {
      GameProfile $$3 = $$1.gb();
      aug $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ud> $$8 = this.a($$1);
      akm<daz> $$9 = $$8.<akm<daz>>flatMap($$0x -> duv.a(new Dynamic(ur.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(daz.h);
      aqn $$10 = this.k.a($$9);
      aqn $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bn());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.af().getString(), $$13, $$1.al(), $$1.du(), $$1.dw(), $$1.dA()});
      eot $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      arn $$15 = new arn(this.k, $$0, $$1, $$2);
      $$0.a(agd.a.bind(wi.a(this.k.bc())), $$15);
      dav $$16 = $$11.aa();
      boolean $$17 = $$16.b(dav.D);
      boolean $$18 = $$16.b(dav.q);
      boolean $$19 = $$16.b(dav.w);
      $$15.b(new adh($$1.al(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11), this.k.aB()));
      $$15.b(new acd($$14.q(), $$14.r()));
      $$15.b(new adq($$1.gd()));
      $$15.b(new aeq($$1.gc().k));
      $$15.b(new afy(this.k.aJ().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.aw();
      xl $$20;
      if ($$1.gb().getName().equalsIgnoreCase($$6)) {
         $$20 = wx.a("multiplayer.player.joined", $$1.O_());
      } else {
         $$20 = wx.a("multiplayer.player.joined.renamed", $$1.O_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH());
      ajm $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.c.b(adw.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cz(), $$1);
      this.a(adw.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aN().a($$1);

      for (bre $$23 : $$1.ex()) {
         $$15.b(new afx($$1.al(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         ud $$24 = $$8.get().p("RootVehicle");
         brw $$25 = bsc.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cz().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (brw $$28 : $$25.cW()) {
                  if ($$28.cz().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bR()) {
               h.warn("Couldn't reattach entity to player");
               $$25.ao();

               for (brw $$29 : $$25.cW()) {
                  $$29.ao();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(alf $$0, aqo $$1) {
      Set<evi> $$2 = Sets.newHashSet();

      for (evl $$3 : $$0.g()) {
         $$1.c.b(afd.a($$3, true));
      }

      for (evh $$4 : evh.values()) {
         evi $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (ze<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aqn $$0) {
      $$0.C_().a(new dss() {
         @Override
         public void a(dsu $$0, double $$1) {
            auk.this.a(new aem($$0));
         }

         @Override
         public void a(dsu $$0, double $$1, double $$2, long $$3) {
            auk.this.a(new ael($$0));
         }

         @Override
         public void a(dsu $$0, double $$1, double $$2) {
            auk.this.a(new aek($$0));
         }

         @Override
         public void a(dsu $$0, int $$1) {
            auk.this.a(new aen($$0));
         }

         @Override
         public void b(dsu $$0, int $$1) {
            auk.this.a(new aeo($$0));
         }

         @Override
         public void b(dsu $$0, double $$1) {
         }

         @Override
         public void c(dsu $$0, double $$1) {
         }
      });
   }

   public Optional<ud> a(aqo $$0) {
      ud $$1 = this.k.bb().w();
      Optional<ud> $$2;
      if (this.k.a($$0.gb()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aqo $$0) {
      this.t.a($$0);
      avo $$1 = this.r.get($$0.cz());
      if ($$1 != null) {
         $$1.a();
      }

      akv $$2 = this.s.get($$0.cz());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aqo $$0) {
      aqn $$1 = $$0.z();
      $$0.a(avs.j);
      this.b($$0);
      if ($$0.bR()) {
         brw $$2 = $$0.cZ();
         if ($$2.cY()) {
            h.debug("Removing player mount");
            $$0.ac();
            $$2.cV().forEach($$0x -> $$0x.b(brw.c.d));
         }
      }

      $$0.ai();
      $$1.a($$0, brw.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aN().b($$0);
      UUID $$3 = $$0.cz();
      aqo $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new adv(List.of($$0.cz())));
   }

   @Nullable
   public wx a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         aur $$2 = this.n.b($$1);
         xl $$3 = wx.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wx.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wx.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         aui $$4 = this.o.b($$0);
         xl $$5 = wx.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wx.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? wx.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aqo a(GameProfile $$0, aqc $$1) {
      return new aqo(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aqo> $$2 = Sets.newIdentityHashSet();

      for (aqo $$3 : this.l) {
         if ($$3.cz().equals($$1)) {
            $$2.add($$3);
         }
      }

      aqo $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aqo $$5 : $$2) {
         $$5.c.b(f);
      }

      return !$$2.isEmpty();
   }

   public aqo a(aqo $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, brw.c.b);
      io $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      aqn $$5 = this.k.a($$0.T());
      Optional<eum> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cly.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      aqn $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.I();
      aqo $$9 = new aqo(this.k, $$8, $$0.gb(), $$0.B());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.al());
      $$9.a($$0.fu());

      for (String $$10 : $$0.am()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         drd $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(dec.pl);
         eum $$14 = $$6.get();
         float $$17;
         if (!$$12.a(avx.R) && !$$13) {
            $$17 = $$3;
         } else {
            eum $$15 = eum.c($$2).d($$14).d();
            $$17 = (float)ayf.d(ayf.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ae(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new acx(acx.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dw() < (double)$$8.al()) {
         $$9.a_($$9.du(), $$9.dw() + 1.0, $$9.dA());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      aqn $$19 = $$9.z();
      eot $$20 = $$19.A_();
      $$9.c.b(new aee($$9.d($$19), $$18));
      $$9.c.a($$9.du(), $$9.dw(), $$9.dA(), $$9.dF(), $$9.dH());
      $$9.c.b(new aet($$8.U(), $$8.V()));
      $$9.c.b(new acd($$20.q(), $$20.r()));
      $$9.c.b(new aez($$9.cq, $$9.cp, $$9.co));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cz(), $$9);
      $$9.h();
      $$9.t($$9.eA());
      if ($$11) {
         $$9.c.b(new afl(avi.vv, avj.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.E_().g()));
      }

      return $$9;
   }

   public void d(aqo $$0) {
      GameProfile $$1 = $$0.gb();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new adw(EnumSet.of(adw.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(ze<?> $$0) {
      for (aqo $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(ze<?> $$0, akm<daz> $$1) {
      for (aqo $$2 : this.l) {
         if ($$2.dP().ae() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cly $$0, wx $$1) {
      evs $$2 = $$0.cj();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aqo $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cly $$0, wx $$1) {
      evs $$2 = $$0.cj();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aqo $$4 = this.l.get($$3);
            if ($$4.cj() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gb().getName();
      }

      return $$0;
   }

   public auq f() {
      return this.n;
   }

   public auh g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aum($$0, this.k.k(), this.p.a($$0)));
      aqo $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aqo $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(aqo $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new acu($$0, $$2));
      }

      this.k.aH().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.bb().m() || this.y;
   }

   @Nullable
   public aqo a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aqo $$3 = this.l.get($$2);
         if ($$3.gb().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, double $$4, akm<daz> $$5, ze<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aqo $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dP().ae() == $$5) {
            double $$9 = $$1 - $$8.du();
            double $$10 = $$2 - $$8.dw();
            double $$11 = $$3 - $$8.dA();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.c.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public aus i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aul k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aqo $$0, aqn $$1) {
      dsu $$2 = this.k.I().C_();
      $$0.c.b(new ada($$2));
      $$0.c.b(new afh($$1.Y(), $$1.Z(), $$1.aa().b(dav.l)));
      $$0.c.b(new aet($$1.U(), $$1.V()));
      if ($$1.ac()) {
         $$0.c.b(new acx(acx.c, 0.0F));
         $$0.c.b(new acx(acx.i, $$1.d(1.0F)));
         $$0.c.b(new acx(acx.j, $$1.b(1.0F)));
      }

      $$0.c.b(new acx(acx.o, 0.0F));
      this.k.aQ().a($$0);
   }

   public void e(aqo $$0) {
      $$0.ca.b();
      $$0.w();
      $$0.c.b(new aeq($$0.gc().k));
   }

   public int m() {
      return this.l.size();
   }

   public int n() {
      return this.g;
   }

   public boolean o() {
      return this.u;
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public List<aqo> b(String $$0) {
      List<aqo> $$1 = Lists.newArrayList();

      for (aqo $$2 : this.l) {
         if ($$2.A().equals($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public int p() {
      return this.w;
   }

   public int q() {
      return this.x;
   }

   public MinecraftServer c() {
      return this.k;
   }

   @Nullable
   public ud r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(wx.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wx $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wx $$0, Function<aqo, wx> $$1, boolean $$2) {
      this.k.a($$0);

      for (aqo $$3 : this.l) {
         wx $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xn $$0, ee $$1, wt.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xn $$0, aqo $$1, wt.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(xn $$0, Predicate<aqo> $$1, @Nullable aqo $$2, wt.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xm $$5 = xm.a($$0);
      boolean $$6 = false;

      for (aqo $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xn $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public avo a(cly $$0) {
      UUID $$1 = $$0.cz();
      avo $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eov.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.af().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new avo(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public akv f(aqo $$0) {
      UUID $$1 = $$0.cz();
      akv $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eov.a).resolve($$1 + ".json");
         $$2 = new akv(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aes($$0));

      for (aqn $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new aff($$0));

      for (aqn $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<aqo> t() {
      return this.l;
   }

   @Nullable
   public aqo a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (akv $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new zt(awp.a(this.v)));
      afy $$1 = new afy(this.k.aJ().b());

      for (aqo $$2 : this.l) {
         $$2.c.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
