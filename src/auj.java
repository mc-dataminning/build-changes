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

public abstract class auj {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final wx f = wx.c("chat.filtered_full");
   public static final wx g = wx.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aqn> l = Lists.newArrayList();
   private final Map<UUID, aqn> m = Maps.newHashMap();
   private final aup n = new aup(b);
   private final aug o = new aug(c);
   private final auk p = new auk(d);
   private final aur q = new aur(e);
   private final Map<UUID, avn> r = Maps.newHashMap();
   private final Map<UUID, aku> s = Maps.newHashMap();
   private final eoy t;
   private boolean u;
   private final je<akv> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public auj(MinecraftServer $$0, je<akv> $$1, eoy $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(vv $$0, aqn $$1, arb $$2) {
      GameProfile $$3 = $$1.gb();
      auf $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ud> $$8 = this.a($$1);
      akl<dax> $$9 = $$8.<akl<dax>>flatMap($$0x -> dut.a(new Dynamic(ur.a, $$0x.c("Dimension"))).resultOrPartial(a::error)).orElse(dax.h);
      aqm $$10 = this.k.a($$9);
      aqm $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bn());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.af().getString(), $$13, $$1.al(), $$1.du(), $$1.dw(), $$1.dA()});
      eor $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      arm $$15 = new arm(this.k, $$0, $$1, $$2);
      $$0.a(agc.a.bind(wi.a(this.k.bc())), $$15);
      dat $$16 = $$11.aa();
      boolean $$17 = $$16.b(dat.D);
      boolean $$18 = $$16.b(dat.q);
      boolean $$19 = $$16.b(dat.w);
      $$15.b(new adh($$1.al(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11), this.k.aB()));
      $$15.b(new acd($$14.q(), $$14.r()));
      $$15.b(new adq($$1.gd()));
      $$15.b(new aep($$1.gc().k));
      $$15.b(new afx(this.k.aJ().b()));
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
      ajl $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.d.b(adw.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cz(), $$1);
      this.a(adw.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aN().a($$1);

      for (brc $$23 : $$1.ex()) {
         $$15.b(new afw($$1.al(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         ud $$24 = $$8.get().p("RootVehicle");
         bru $$25 = bsa.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
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
               for (bru $$28 : $$25.cW()) {
                  if ($$28.cz().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bR()) {
               a.warn("Couldn't reattach entity to player");
               $$25.ao();

               for (bru $$29 : $$25.cW()) {
                  $$29.ao();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(ale $$0, aqn $$1) {
      Set<evg> $$2 = Sets.newHashSet();

      for (evj $$3 : $$0.g()) {
         $$1.d.b(afc.a($$3, true));
      }

      for (evf $$4 : evf.values()) {
         evg $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (ze<?> $$7 : $$0.d($$5)) {
               $$1.d.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aqm $$0) {
      $$0.C_().a(new dsq() {
         @Override
         public void a(dss $$0, double $$1) {
            auj.this.a(new ael($$0));
         }

         @Override
         public void a(dss $$0, double $$1, double $$2, long $$3) {
            auj.this.a(new aek($$0));
         }

         @Override
         public void a(dss $$0, double $$1, double $$2) {
            auj.this.a(new aej($$0));
         }

         @Override
         public void a(dss $$0, int $$1) {
            auj.this.a(new aem($$0));
         }

         @Override
         public void b(dss $$0, int $$1) {
            auj.this.a(new aen($$0));
         }

         @Override
         public void b(dss $$0, double $$1) {
         }

         @Override
         public void c(dss $$0, double $$1) {
         }
      });
   }

   public Optional<ud> a(aqn $$0) {
      ud $$1 = this.k.bb().w();
      Optional<ud> $$2;
      if (this.k.a($$0.gb()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aqn $$0) {
      this.t.a($$0);
      avn $$1 = this.r.get($$0.cz());
      if ($$1 != null) {
         $$1.a();
      }

      aku $$2 = this.s.get($$0.cz());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aqn $$0) {
      aqm $$1 = $$0.z();
      $$0.a(avr.j);
      this.b($$0);
      if ($$0.bR()) {
         bru $$2 = $$0.cZ();
         if ($$2.cY()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cV().forEach($$0x -> $$0x.b(bru.c.d));
         }
      }

      $$0.ai();
      $$1.a($$0, bru.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aN().b($$0);
      UUID $$3 = $$0.cz();
      aqn $$4 = this.m.get($$3);
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
         auq $$2 = this.n.b($$1);
         xl $$3 = wx.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wx.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wx.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         auh $$4 = this.o.b($$0);
         xl $$5 = wx.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wx.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? wx.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aqn a(GameProfile $$0, aqb $$1) {
      return new aqn(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aqn> $$2 = Sets.newIdentityHashSet();

      for (aqn $$3 : this.l) {
         if ($$3.cz().equals($$1)) {
            $$2.add($$3);
         }
      }

      aqn $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aqn $$5 : $$2) {
         $$5.d.b(g);
      }

      return !$$2.isEmpty();
   }

   public aqn a(aqn $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, bru.c.b);
      io $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      aqm $$5 = this.k.a($$0.T());
      Optional<euk> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = clw.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      aqm $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.I();
      aqn $$9 = new aqn(this.k, $$8, $$0.gb(), $$0.B());
      $$9.d = $$0.d;
      $$9.a($$0, $$1);
      $$9.e($$0.al());
      $$9.a($$0.fu());

      for (String $$10 : $$0.am()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         drb $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(dea.pl);
         euk $$14 = $$6.get();
         float $$17;
         if (!$$12.a(avw.R) && !$$13) {
            $$17 = $$3;
         } else {
            euk $$15 = euk.c($$2).d($$14).d();
            $$17 = (float)ayd.d(ayd.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ae(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.d.b(new acx(acx.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dw() < (double)$$8.al()) {
         $$9.a_($$9.du(), $$9.dw() + 1.0, $$9.dA());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      aqm $$19 = $$9.z();
      eor $$20 = $$19.A_();
      $$9.d.b(new aed($$9.d($$19), $$18));
      $$9.d.a($$9.du(), $$9.dw(), $$9.dA(), $$9.dF(), $$9.dH());
      $$9.d.b(new aes($$8.U(), $$8.V()));
      $$9.d.b(new acd($$20.q(), $$20.r()));
      $$9.d.b(new aey($$9.cr, $$9.cq, $$9.cp));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cz(), $$9);
      $$9.h();
      $$9.t($$9.eA());
      if ($$11) {
         $$9.d.b(new afk(avh.vv, avi.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.E_().g()));
      }

      return $$9;
   }

   public void d(aqn $$0) {
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
      for (aqn $$1 : this.l) {
         $$1.d.b($$0);
      }
   }

   public void a(ze<?> $$0, akl<dax> $$1) {
      for (aqn $$2 : this.l) {
         if ($$2.dP().ae() == $$1) {
            $$2.d.b($$0);
         }
      }
   }

   public void a(clw $$0, wx $$1) {
      evq $$2 = $$0.cj();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aqn $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(clw $$0, wx $$1) {
      evq $$2 = $$0.cj();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aqn $$4 = this.l.get($$3);
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

   public aup f() {
      return this.n;
   }

   public aug g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aul($$0, this.k.k(), this.p.a($$0)));
      aqn $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aqn $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(aqn $$0, int $$1) {
      if ($$0.d != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.d.b(new acu($$0, $$2));
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
   public aqn a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aqn $$3 = this.l.get($$2);
         if ($$3.gb().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable clw $$0, double $$1, double $$2, double $$3, double $$4, akl<dax> $$5, ze<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aqn $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dP().ae() == $$5) {
            double $$9 = $$1 - $$8.du();
            double $$10 = $$2 - $$8.dw();
            double $$11 = $$3 - $$8.dA();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.d.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public aur i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public auk k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aqn $$0, aqm $$1) {
      dss $$2 = this.k.I().C_();
      $$0.d.b(new ada($$2));
      $$0.d.b(new afg($$1.Y(), $$1.Z(), $$1.aa().b(dat.l)));
      $$0.d.b(new aes($$1.U(), $$1.V()));
      if ($$1.ac()) {
         $$0.d.b(new acx(acx.c, 0.0F));
         $$0.d.b(new acx(acx.i, $$1.d(1.0F)));
         $$0.d.b(new acx(acx.j, $$1.b(1.0F)));
      }

      $$0.d.b(new acx(acx.o, 0.0F));
      this.k.aQ().a($$0);
   }

   public void e(aqn $$0) {
      $$0.cb.b();
      $$0.w();
      $$0.d.b(new aep($$0.gc().k));
   }

   public int m() {
      return this.l.size();
   }

   public int n() {
      return this.h;
   }

   public boolean o() {
      return this.u;
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public List<aqn> b(String $$0) {
      List<aqn> $$1 = Lists.newArrayList();

      for (aqn $$2 : this.l) {
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
         this.l.get($$0).d.b(wx.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wx $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wx $$0, Function<aqn, wx> $$1, boolean $$2) {
      this.k.a($$0);

      for (aqn $$3 : this.l) {
         wx $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xn $$0, ee $$1, wt.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xn $$0, aqn $$1, wt.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(xn $$0, Predicate<aqn> $$1, @Nullable aqn $$2, wt.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xm $$5 = xm.a($$0);
      boolean $$6 = false;

      for (aqn $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(xn $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public avn a(clw $$0) {
      UUID $$1 = $$0.cz();
      avn $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eot.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.af().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new avn(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public aku f(aqn $$0) {
      UUID $$1 = $$0.cz();
      aku $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eot.a).resolve($$1 + ".json");
         $$2 = new aku(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aer($$0));

      for (aqm $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afe($$0));

      for (aqm $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<aqn> t() {
      return this.l;
   }

   @Nullable
   public aqn a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (aku $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new zt(awo.a(this.v)));
      afx $$1 = new afx(this.k.aJ().b());

      for (aqn $$2 : this.l) {
         $$2.d.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
