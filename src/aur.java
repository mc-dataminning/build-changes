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

public abstract class aur {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final wz e = wz.c("chat.filtered_full");
   public static final wz f = wz.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aqv> l = Lists.newArrayList();
   private final Map<UUID, aqv> m = Maps.newHashMap();
   private final auy n = new auy(a);
   private final auo o = new auo(b);
   private final aus p = new aus(c);
   private final ava q = new ava(d);
   private final Map<UUID, avv> r = Maps.newHashMap();
   private final Map<UUID, akz> s = Maps.newHashMap();
   private final eri t;
   private boolean u;
   private final jt<ala> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public aur(MinecraftServer $$0, jt<ala> $$1, eri $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vt $$0, aqv $$1, arj $$2) {
      GameProfile $$3 = $$1.fX();
      aun $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ub> $$8 = this.a($$1);
      akq<dcw> $$9 = $$8.<akq<dcw>>flatMap($$0x -> dwy.a(new Dynamic(up.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dcw.h);
      aqu $$10 = this.k.a($$9);
      aqu $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bn());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ah().getString(), $$13, $$1.an(), $$1.dt(), $$1.dv(), $$1.dz()});
      erb $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      aru $$15 = new aru(this.k, $$0, $$1, $$2);
      $$0.a(agh.a.a(wk.a(this.k.bc())), $$15);
      dcs $$16 = $$11.ab();
      boolean $$17 = $$16.b(dcs.D);
      boolean $$18 = $$16.b(dcs.q);
      boolean $$19 = $$16.b(dcs.w);
      $$15.b(new adl($$1.an(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aB()));
      $$15.b(new ach($$14.q(), $$14.r()));
      $$15.b(new adu($$1.fZ()));
      $$15.b(new aeu($$1.fY().k));
      $$15.b(new agc(this.k.aJ().b()));
      this.e($$1);
      $$1.I().c();
      $$1.J().a($$1);
      this.a($$11.f(), $$1);
      this.k.aw();
      xn $$20;
      if ($$1.fX().getName().equalsIgnoreCase($$6)) {
         $$20 = wz.a("multiplayer.player.joined", $$1.S_());
      } else {
         $$20 = wz.a("multiplayer.player.joined.renamed", $$1.S_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dt(), $$1.dv(), $$1.dz(), $$1.dE(), $$1.dG());
      ajq $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.c.b(aea.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cz(), $$1);
      this.a(aea.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aN().a($$1);
      this.d($$1);
      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         ub $$23 = $$8.get().p("RootVehicle");
         bsr $$24 = bsx.a($$23.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$24 != null) {
            UUID $$25;
            if ($$23.b("Attach")) {
               $$25 = $$23.a("Attach");
            } else {
               $$25 = null;
            }

            if ($$24.cz().equals($$25)) {
               $$1.a($$24, true);
            } else {
               for (bsr $$27 : $$24.cW()) {
                  if ($$27.cz().equals($$25)) {
                     $$1.a($$27, true);
                     break;
                  }
               }
            }

            if (!$$1.bS()) {
               h.warn("Couldn't reattach entity to player");
               $$24.aq();

               for (bsr $$28 : $$24.cW()) {
                  $$28.aq();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(alk $$0, aqv $$1) {
      Set<exy> $$2 = Sets.newHashSet();

      for (eyb $$3 : $$0.g()) {
         $$1.c.b(afh.a($$3, true));
      }

      for (exx $$4 : exx.values()) {
         exy $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zg<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aqu $$0) {
      $$0.C_().a(new dur() {
         @Override
         public void a(dut $$0, double $$1) {
            aur.this.a(new aeq($$0));
         }

         @Override
         public void a(dut $$0, double $$1, double $$2, long $$3) {
            aur.this.a(new aep($$0));
         }

         @Override
         public void a(dut $$0, double $$1, double $$2) {
            aur.this.a(new aeo($$0));
         }

         @Override
         public void a(dut $$0, int $$1) {
            aur.this.a(new aer($$0));
         }

         @Override
         public void b(dut $$0, int $$1) {
            aur.this.a(new aes($$0));
         }

         @Override
         public void b(dut $$0, double $$1) {
         }

         @Override
         public void c(dut $$0, double $$1) {
         }
      });
   }

   public Optional<ub> a(aqv $$0) {
      ub $$1 = this.k.bb().w();
      Optional<ub> $$2;
      if (this.k.a($$0.fX()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aqv $$0) {
      this.t.a($$0);
      avv $$1 = this.r.get($$0.cz());
      if ($$1 != null) {
         $$1.a();
      }

      akz $$2 = this.s.get($$0.cz());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aqv $$0) {
      aqu $$1 = $$0.A();
      $$0.a(avz.j);
      this.b($$0);
      if ($$0.bS()) {
         bsr $$2 = $$0.cZ();
         if ($$2.cY()) {
            h.debug("Removing player mount");
            $$0.ad();
            $$2.cV().forEach($$0x -> $$0x.b(bsr.c.d));
         }
      }

      $$0.ak();
      $$1.a($$0, bsr.c.d);
      $$0.R().a();
      this.l.remove($$0);
      this.k.aN().b($$0);
      UUID $$3 = $$0.cz();
      aqv $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new adz(List.of($$0.cz())));
   }

   @Nullable
   public wz a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         auz $$2 = this.n.b($$1);
         xn $$3 = wz.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wz.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wz.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         aup $$4 = this.o.b($$0);
         xn $$5 = wz.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wz.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? wz.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aqv a(GameProfile $$0, aqh $$1) {
      return new aqv(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aqv> $$2 = Sets.newIdentityHashSet();

      for (aqv $$3 : this.l) {
         if ($$3.cz().equals($$1)) {
            $$2.add($$3);
         }
      }

      aqv $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aqv $$5 : $$2) {
         $$5.c.a(f);
      }

      return !$$2.isEmpty();
   }

   public aqv a(aqv $$0, boolean $$1, bsr.c $$2) {
      this.l.remove($$0);
      $$0.A().a($$0, $$2);
      eqc $$3 = $$0.a($$1, eqc.a);
      aqu $$4 = $$3.a();
      aqv $$5 = new aqv(this.k, $$4, $$0.fX(), $$0.C());
      $$5.c = $$0.c;
      $$5.a($$0, $$1);
      $$5.e($$0.an());
      $$5.a($$0.fq());
      if (!$$3.f()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.ao()) {
         $$5.a($$6);
      }

      exc $$7 = $$3.b();
      $$5.b($$7.c, $$7.d, $$7.e, $$3.d(), $$3.e());
      if ($$3.f()) {
         $$5.c.b(new adb(adb.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      aqu $$9 = $$5.A();
      erb $$10 = $$9.A_();
      $$5.c.b(new aei($$5.b($$9), $$8));
      $$5.c.a($$5.dt(), $$5.dv(), $$5.dz(), $$5.dE(), $$5.dG());
      $$5.c.b(new aex($$4.V(), $$4.W()));
      $$5.c.b(new ach($$10.q(), $$10.r()));
      $$5.c.b(new afd($$5.cs, $$5.cr, $$5.cq));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cz(), $$5);
      $$5.h();
      $$5.v($$5.ew());
      if (!$$1) {
         jd $$11 = jd.a((jw)$$3.b());
         dtc $$12 = $$4.a_($$11);
         if ($$12.a(dga.pl)) {
            $$5.c.b(new afp(avp.vy, avq.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.E_().g()));
         }
      }

      return $$5;
   }

   public void d(aqv $$0) {
      this.a($$0, $$0.c);
   }

   public void a(btn $$0, aru $$1) {
      for (brz $$2 : $$0.et()) {
         $$1.b(new agb($$0.an(), $$2, false));
      }
   }

   public void e(aqv $$0) {
      GameProfile $$1 = $$0.fX();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aea(EnumSet.of(aea.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zg<?> $$0) {
      for (aqv $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(zg<?> $$0, akq<dcw> $$1) {
      for (aqv $$2 : this.l) {
         if ($$2.dO().af() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cmx $$0, wz $$1) {
      eyi $$2 = $$0.ck();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aqv $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cmx $$0, wz $$1) {
      eyi $$2 = $$0.ck();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aqv $$4 = this.l.get($$3);
            if ($$4.ck() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fX().getName();
      }

      return $$0;
   }

   public auy f() {
      return this.n;
   }

   public auo g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aut($$0, this.k.k(), this.p.a($$0)));
      aqv $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aqv $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(aqv $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new acy($$0, $$2));
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
   public aqv a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aqv $$3 = this.l.get($$2);
         if ($$3.fX().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cmx $$0, double $$1, double $$2, double $$3, double $$4, akq<dcw> $$5, zg<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aqv $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dO().af() == $$5) {
            double $$9 = $$1 - $$8.dt();
            double $$10 = $$2 - $$8.dv();
            double $$11 = $$3 - $$8.dz();
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

   public ava i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aus k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aqv $$0, aqu $$1) {
      dut $$2 = this.k.I().C_();
      $$0.c.b(new ade($$2));
      $$0.c.b(new afl($$1.Z(), $$1.aa(), $$1.ab().b(dcs.l)));
      $$0.c.b(new aex($$1.V(), $$1.W()));
      if ($$1.ad()) {
         $$0.c.b(new adb(adb.c, 0.0F));
         $$0.c.b(new adb(adb.i, $$1.d(1.0F)));
         $$0.c.b(new adb(adb.j, $$1.b(1.0F)));
      }

      $$0.c.b(new adb(adb.o, 0.0F));
      this.k.aQ().a($$0);
   }

   public void f(aqv $$0) {
      $$0.cc.b();
      $$0.x();
      $$0.c.b(new aeu($$0.fY().k));
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

   public List<aqv> b(String $$0) {
      List<aqv> $$1 = Lists.newArrayList();

      for (aqv $$2 : this.l) {
         if ($$2.B().equals($$0)) {
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
   public ub r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.a(wz.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wz $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wz $$0, Function<aqv, wz> $$1, boolean $$2) {
      this.k.a($$0);

      for (aqv $$3 : this.l) {
         wz $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xp $$0, et $$1, wv.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xp $$0, aqv $$1, wv.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xp $$0, Predicate<aqv> $$1, @Nullable aqv $$2, wv.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xo $$5 = xo.a($$0);
      boolean $$6 = false;

      for (aqv $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xp $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public avv a(cmx $$0) {
      UUID $$1 = $$0.cz();
      avv $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(erd.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ah().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new avv(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public akz g(aqv $$0) {
      UUID $$1 = $$0.cz();
      akz $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(erd.a).resolve($$1 + ".json");
         $$2 = new akz(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aew($$0));

      for (aqu $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afj($$0));

      for (aqu $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<aqv> t() {
      return this.l;
   }

   @Nullable
   public aqv a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (akz $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new zx(awx.a(this.v)));
      agc $$1 = new agc(this.k.aJ().b());

      for (aqv $$2 : this.l) {
         $$2.c.b($$1);
         $$2.J().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
