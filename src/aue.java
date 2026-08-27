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

public abstract class aue {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final wu f = wu.c("chat.filtered_full");
   public static final wu g = wu.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aqi> l = Lists.newArrayList();
   private final Map<UUID, aqi> m = Maps.newHashMap();
   private final auk n = new auk(b);
   private final aub o = new aub(c);
   private final auf p = new auf(d);
   private final aum q = new aum(e);
   private final Map<UUID, avi> r = Maps.newHashMap();
   private final Map<UUID, akp> s = Maps.newHashMap();
   private final eoe t;
   private boolean u;
   private final jd<akq> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public aue(MinecraftServer $$0, jd<akq> $$1, eoe $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(vs $$0, aqi $$1, aqw $$2) {
      GameProfile $$3 = $$1.fZ();
      aua $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ua> $$8 = this.a($$1);
      akg<dad> $$9 = $$8.<akg<dad>>flatMap($$0x -> dtz.a(new Dynamic(uo.a, $$0x.c("Dimension"))).resultOrPartial(a::error)).orElse(dad.h);
      aqh $$10 = this.k.a($$9);
      aqh $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bn());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ad().getString(), $$13, $$1.aj(), $$1.ds(), $$1.du(), $$1.dy()});
      enx $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      arh $$15 = new arh(this.k, $$0, $$1, $$2);
      $$0.a(afy.a.bind(wf.a(this.k.bc())), $$15);
      czz $$16 = $$11.aa();
      boolean $$17 = $$16.b(czz.D);
      boolean $$18 = $$16.b(czz.q);
      boolean $$19 = $$16.b(czz.w);
      $$15.b(new add($$1.aj(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11), this.k.aB()));
      $$15.b(new abz($$14.q(), $$14.r()));
      $$15.b(new adm($$1.gb()));
      $$15.b(new ael($$1.ga().k));
      $$15.b(new aft(this.k.aJ().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.aw();
      xi $$20;
      if ($$1.fZ().getName().equalsIgnoreCase($$6)) {
         $$20 = wu.a("multiplayer.player.joined", $$1.O_());
      } else {
         $$20 = wu.a("multiplayer.player.joined.renamed", $$1.O_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.ds(), $$1.du(), $$1.dy(), $$1.dD(), $$1.dF());
      ajg $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.d.b(ads.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cx(), $$1);
      this.a(ads.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aN().a($$1);

      for (bqt $$23 : $$1.ev()) {
         $$15.b(new afs($$1.aj(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         ua $$24 = $$8.get().p("RootVehicle");
         brh $$25 = brn.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cx().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (brh $$28 : $$25.cU()) {
                  if ($$28.cx().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bP()) {
               a.warn("Couldn't reattach entity to player");
               $$25.am();

               for (brh $$29 : $$25.cU()) {
                  $$29.am();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(akz $$0, aqi $$1) {
      Set<eul> $$2 = Sets.newHashSet();

      for (euo $$3 : $$0.g()) {
         $$1.d.b(aey.a($$3, true));
      }

      for (euk $$4 : euk.values()) {
         eul $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zb<?> $$7 : $$0.d($$5)) {
               $$1.d.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aqh $$0) {
      $$0.C_().a(new drw() {
         @Override
         public void a(dry $$0, double $$1) {
            aue.this.a(new aeh($$0));
         }

         @Override
         public void a(dry $$0, double $$1, double $$2, long $$3) {
            aue.this.a(new aeg($$0));
         }

         @Override
         public void a(dry $$0, double $$1, double $$2) {
            aue.this.a(new aef($$0));
         }

         @Override
         public void a(dry $$0, int $$1) {
            aue.this.a(new aei($$0));
         }

         @Override
         public void b(dry $$0, int $$1) {
            aue.this.a(new aej($$0));
         }

         @Override
         public void b(dry $$0, double $$1) {
         }

         @Override
         public void c(dry $$0, double $$1) {
         }
      });
   }

   public Optional<ua> a(aqi $$0) {
      ua $$1 = this.k.bb().w();
      Optional<ua> $$2;
      if (this.k.a($$0.fZ()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aqi $$0) {
      this.t.a($$0);
      avi $$1 = this.r.get($$0.cx());
      if ($$1 != null) {
         $$1.a();
      }

      akp $$2 = this.s.get($$0.cx());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aqi $$0) {
      aqh $$1 = $$0.z();
      $$0.a(avm.j);
      this.b($$0);
      if ($$0.bP()) {
         brh $$2 = $$0.cX();
         if ($$2.cW()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cT().forEach($$0x -> $$0x.b(brh.c.d));
         }
      }

      $$0.ag();
      $$1.a($$0, brh.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aN().b($$0);
      UUID $$3 = $$0.cx();
      aqi $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new adr(List.of($$0.cx())));
   }

   @Nullable
   public wu a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         aul $$2 = this.n.b($$1);
         xi $$3 = wu.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wu.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wu.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         auc $$4 = this.o.b($$0);
         xi $$5 = wu.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wu.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? wu.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aqi a(GameProfile $$0, apw $$1) {
      return new aqi(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aqi> $$2 = Sets.newIdentityHashSet();

      for (aqi $$3 : this.l) {
         if ($$3.cx().equals($$1)) {
            $$2.add($$3);
         }
      }

      aqi $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aqi $$5 : $$2) {
         $$5.d.b(g);
      }

      return !$$2.isEmpty();
   }

   public aqi a(aqi $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, brh.c.b);
      in $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      aqh $$5 = this.k.a($$0.T());
      Optional<etp> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = clh.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      aqh $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.I();
      aqi $$9 = new aqi(this.k, $$8, $$0.fZ(), $$0.B());
      $$9.d = $$0.d;
      $$9.a($$0, $$1);
      $$9.e($$0.aj());
      $$9.a($$0.fs());

      for (String $$10 : $$0.ak()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dqh $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(ddg.pl);
         etp $$14 = $$6.get();
         float $$17;
         if (!$$12.a(avr.R) && !$$13) {
            $$17 = $$3;
         } else {
            etp $$15 = etp.c($$2).d($$14).d();
            $$17 = (float)axz.d(axz.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ae(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.d.b(new act(act.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.du() < (double)$$8.al()) {
         $$9.a_($$9.ds(), $$9.du() + 1.0, $$9.dy());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      aqh $$19 = $$9.z();
      enx $$20 = $$19.A_();
      $$9.d.b(new adz($$9.d($$19), $$18));
      $$9.d.a($$9.ds(), $$9.du(), $$9.dy(), $$9.dD(), $$9.dF());
      $$9.d.b(new aeo($$8.U(), $$8.V()));
      $$9.d.b(new abz($$20.q(), $$20.r()));
      $$9.d.b(new aeu($$9.cr, $$9.cq, $$9.cp));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cx(), $$9);
      $$9.h();
      $$9.t($$9.ey());
      if ($$11) {
         $$9.d.b(new afg(avc.vk, avd.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.E_().g()));
      }

      return $$9;
   }

   public void d(aqi $$0) {
      GameProfile $$1 = $$0.fZ();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new ads(EnumSet.of(ads.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zb<?> $$0) {
      for (aqi $$1 : this.l) {
         $$1.d.b($$0);
      }
   }

   public void a(zb<?> $$0, akg<dad> $$1) {
      for (aqi $$2 : this.l) {
         if ($$2.dN().ae() == $$1) {
            $$2.d.b($$0);
         }
      }
   }

   public void a(clh $$0, wu $$1) {
      euv $$2 = $$0.ch();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aqi $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(clh $$0, wu $$1) {
      euv $$2 = $$0.ch();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aqi $$4 = this.l.get($$3);
            if ($$4.ch() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fZ().getName();
      }

      return $$0;
   }

   public auk f() {
      return this.n;
   }

   public aub g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aug($$0, this.k.k(), this.p.a($$0)));
      aqi $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aqi $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(aqi $$0, int $$1) {
      if ($$0.d != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.d.b(new acq($$0, $$2));
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
   public aqi a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aqi $$3 = this.l.get($$2);
         if ($$3.fZ().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable clh $$0, double $$1, double $$2, double $$3, double $$4, akg<dad> $$5, zb<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aqi $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dN().ae() == $$5) {
            double $$9 = $$1 - $$8.ds();
            double $$10 = $$2 - $$8.du();
            double $$11 = $$3 - $$8.dy();
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

   public aum i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public auf k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aqi $$0, aqh $$1) {
      dry $$2 = this.k.I().C_();
      $$0.d.b(new acw($$2));
      $$0.d.b(new afc($$1.Y(), $$1.Z(), $$1.aa().b(czz.l)));
      $$0.d.b(new aeo($$1.U(), $$1.V()));
      if ($$1.ac()) {
         $$0.d.b(new act(act.c, 0.0F));
         $$0.d.b(new act(act.i, $$1.d(1.0F)));
         $$0.d.b(new act(act.j, $$1.b(1.0F)));
      }

      $$0.d.b(new act(act.o, 0.0F));
      this.k.aQ().a($$0);
   }

   public void e(aqi $$0) {
      $$0.cb.b();
      $$0.w();
      $$0.d.b(new ael($$0.ga().k));
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

   public List<aqi> b(String $$0) {
      List<aqi> $$1 = Lists.newArrayList();

      for (aqi $$2 : this.l) {
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
   public ua r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).d.b(wu.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wu $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wu $$0, Function<aqi, wu> $$1, boolean $$2) {
      this.k.a($$0);

      for (aqi $$3 : this.l) {
         wu $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xk $$0, ed $$1, wq.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xk $$0, aqi $$1, wq.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(xk $$0, Predicate<aqi> $$1, @Nullable aqi $$2, wq.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xj $$5 = xj.a($$0);
      boolean $$6 = false;

      for (aqi $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(xk $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public avi a(clh $$0) {
      UUID $$1 = $$0.cx();
      avi $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(enz.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ad().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new avi(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public akp f(aqi $$0) {
      UUID $$1 = $$0.cx();
      akp $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(enz.a).resolve($$1 + ".json");
         $$2 = new akp(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aen($$0));

      for (aqh $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afa($$0));

      for (aqh $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<aqi> t() {
      return this.l;
   }

   @Nullable
   public aqi a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (akp $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new zq(awj.a(this.v)));
      aft $$1 = new aft(this.k.aJ().b());

      for (aqi $$2 : this.l) {
         $$2.d.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
