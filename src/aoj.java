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

public abstract class aoj {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final tl f = tl.c("chat.filtered_full");
   public static final tl g = tl.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aku> l = Lists.newArrayList();
   private final Map<UUID, aku> m = Maps.newHashMap();
   private final aop n = new aop(b);
   private final aog o = new aog(c);
   private final aok p = new aok(d);
   private final aor q = new aor(e);
   private final Map<UUID, apm> r = Maps.newHashMap();
   private final Map<UUID, afh> s = Maps.newHashMap();
   private final ecd t;
   private boolean u;
   private final hl<afi> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public aoj(MinecraftServer $$0, hl<afi> $$1, ecd $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(sm $$0, aku $$1, ali $$2) {
      GameProfile $$3 = $$1.fR();
      aof $$4 = this.k.ap();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      qw $$8 = this.a($$1);
      aey<cqb> $$9 = $$8 != null ? dim.a(new Dynamic(ri.a, $$8.c("Dimension"))).resultOrPartial(a::error).orElse(cqb.h) : cqb.h;
      akt $$10 = this.k.a($$9);
      akt $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.D();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.be());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ab().getString(), $$13, $$1.ah(), $$1.dq(), $$1.ds(), $$1.dw()});
      ebx $$14 = $$11.z_();
      $$1.c($$8);
      als $$15 = new als(this.k, $$0, $$1, $$2);
      cpx $$16 = $$11.X();
      boolean $$17 = $$16.b(cpx.B);
      boolean $$18 = $$16.b(cpx.p);
      boolean $$19 = $$16.b(cpx.v);
      $$15.b(new ym($$1.ah(), $$14.n(), this.k.E(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11)));
      $$15.b(new xj($$14.s(), $$14.t()));
      $$15.b(new yv($$1.fT()));
      $$15.b(new zt($$1.fS().l));
      $$15.b(new aaz(this.k.aE().b()));
      this.d($$1);
      $$1.F().c();
      $$1.G().a($$1);
      this.a($$11.f(), $$1);
      this.k.ar();
      tz $$20;
      if ($$1.fR().getName().equalsIgnoreCase($$6)) {
         $$20 = tl.a("multiplayer.player.joined", $$1.N_());
      } else {
         $$20 = tl.a("multiplayer.player.joined.renamed", $$1.N_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dq(), $$1.ds(), $$1.dw(), $$1.dB(), $$1.dD());
      aea $$22 = this.k.aq();
      if ($$22 != null) {
         $$1.a($$22);
      }

      $$1.c.b(zb.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cv(), $$1);
      this.a(zb.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aJ().a($$1);

      for (bij $$23 : $$1.er()) {
         $$15.b(new aay($$1.ah(), $$23));
      }

      if ($$8 != null && $$8.b("RootVehicle", 10)) {
         qw $$24 = $$8.p("RootVehicle");
         biw $$25 = bja.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cv().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (biw $$28 : $$25.cT()) {
                  if ($$28.cv().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bN()) {
               a.warn("Couldn't reattach entity to player");
               $$25.ak();

               for (biw $$29 : $$25.cT()) {
                  $$29.ak();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(afq $$0, aku $$1) {
      Set<eid> $$2 = Sets.newHashSet();

      for (eie $$3 : $$0.g()) {
         $$1.c.b(aag.a($$3, true));
      }

      for (eic $$4 : eic.values()) {
         eid $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (ve<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(akt $$0) {
      $$0.B_().a(new dgs() {
         @Override
         public void a(dgu $$0, double $$1) {
            aoj.this.a(new zp($$0));
         }

         @Override
         public void a(dgu $$0, double $$1, double $$2, long $$3) {
            aoj.this.a(new zo($$0));
         }

         @Override
         public void a(dgu $$0, double $$1, double $$2) {
            aoj.this.a(new zn($$0));
         }

         @Override
         public void a(dgu $$0, int $$1) {
            aoj.this.a(new zq($$0));
         }

         @Override
         public void b(dgu $$0, int $$1) {
            aoj.this.a(new zr($$0));
         }

         @Override
         public void b(dgu $$0, double $$1) {
         }

         @Override
         public void c(dgu $$0, double $$1) {
         }
      });
   }

   @Nullable
   public qw a(aku $$0) {
      qw $$1 = this.k.aT().y();
      qw $$2;
      if (this.k.a($$0.fR()) && $$1 != null) {
         $$2 = $$1;
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aku $$0) {
      this.t.a($$0);
      apm $$1 = this.r.get($$0.cv());
      if ($$1 != null) {
         $$1.a();
      }

      afh $$2 = this.s.get($$0.cv());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aku $$0) {
      akt $$1 = $$0.x();
      $$0.a(apq.j);
      this.b($$0);
      if ($$0.bN()) {
         biw $$2 = $$0.cV();
         if ($$2.cU()) {
            a.debug("Removing player mount");
            $$0.aa();
            $$2.cS().forEach($$0x -> $$0x.b(biw.c.d));
         }
      }

      $$0.ae();
      $$1.a($$0, biw.c.d);
      $$0.O().a();
      this.l.remove($$0);
      this.k.aJ().b($$0);
      UUID $$3 = $$0.cv();
      aku $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new za(List.of($$0.cv())));
   }

   @Nullable
   public tl a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         aoq $$2 = this.n.b($$1);
         tz $$3 = tl.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(tl.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return tl.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         aoh $$4 = this.o.b($$0);
         tz $$5 = tl.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(tl.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? tl.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aku a(GameProfile $$0, aki $$1) {
      return new aku(this.k, this.k.D(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aku> $$2 = Sets.newIdentityHashSet();

      for (aku $$3 : this.l) {
         if ($$3.cv().equals($$1)) {
            $$2.add($$3);
         }
      }

      aku $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aku $$5 : $$2) {
         $$5.c.b(g);
      }

      return !$$2.isEmpty();
   }

   public aku a(aku $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.x().a($$0, biw.c.b);
      gw $$2 = $$0.P();
      float $$3 = $$0.Q();
      boolean $$4 = $$0.S();
      akt $$5 = this.k.a($$0.R());
      Optional<ehh> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cca.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      akt $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.D();
      aku $$9 = new aku(this.k, $$8, $$0.fR(), $$0.z());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.ah());
      $$9.a($$0.fm());

      for (String $$10 : $$0.ai()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dfd $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(cte.pl);
         ehh $$14 = $$6.get();
         float $$17;
         if (!$$12.a(apv.R) && !$$13) {
            $$17 = $$3;
         } else {
            ehh $$15 = ehh.c($$2).d($$14).d();
            $$17 = (float)asb.d(asb.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ac(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new yc(yc.a, 0.0F));
      }

      while (!$$8.g($$9) && $$9.ds() < (double)$$8.aj()) {
         $$9.e($$9.dq(), $$9.ds() + 1.0, $$9.dw());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      akt $$19 = $$9.x();
      ebx $$20 = $$19.z_();
      $$9.c.b(new zh($$9.d($$19), $$18));
      $$9.c.a($$9.dq(), $$9.ds(), $$9.dw(), $$9.dB(), $$9.dD());
      $$9.c.b(new zw($$8.R(), $$8.S()));
      $$9.c.b(new xj($$20.s(), $$20.t()));
      $$9.c.b(new aac($$9.ch, $$9.cg, $$9.cf));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cv(), $$9);
      $$9.h();
      $$9.c($$9.eu());
      if ($$11) {
         $$9.c.b(new aao(apg.tL, aph.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.D_().g()));
      }

      return $$9;
   }

   public void d(aku $$0) {
      GameProfile $$1 = $$0.fR();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new zb(EnumSet.of(zb.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(ve<?> $$0) {
      for (aku $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(ve<?> $$0, aey<cqb> $$1) {
      for (aku $$2 : this.l) {
         if ($$2.dL().ac() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cca $$0, tl $$1) {
      eii $$2 = $$0.cf();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aku $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cca $$0, tl $$1) {
      eii $$2 = $$0.cf();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aku $$4 = this.l.get($$3);
            if ($$4.cf() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fR().getName();
      }

      return $$0;
   }

   public aop f() {
      return this.n;
   }

   public aog g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aol($$0, this.k.i(), this.p.a($$0)));
      aku $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aku $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(aku $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new xz($$0, $$2));
      }

      this.k.aC().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.aT().o() || this.y;
   }

   @Nullable
   public aku a(String $$0) {
      for (aku $$1 : this.l) {
         if ($$1.fR().getName().equalsIgnoreCase($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(@Nullable cca $$0, double $$1, double $$2, double $$3, double $$4, aey<cqb> $$5, ve<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aku $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dL().ac() == $$5) {
            double $$9 = $$1 - $$8.dq();
            double $$10 = $$2 - $$8.ds();
            double $$11 = $$3 - $$8.dw();
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

   public aor i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aok k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aku $$0, akt $$1) {
      dgu $$2 = this.k.D().B_();
      $$0.c.b(new yf($$2));
      $$0.c.b(new aak($$1.V(), $$1.W(), $$1.X().b(cpx.k)));
      $$0.c.b(new zw($$1.R(), $$1.S()));
      if ($$1.Z()) {
         $$0.c.b(new yc(yc.b, 0.0F));
         $$0.c.b(new yc(yc.h, $$1.d(1.0F)));
         $$0.c.b(new yc(yc.i, $$1.b(1.0F)));
      }

      $$0.c.b(new yc(yc.n, 0.0F));
   }

   public void e(aku $$0) {
      $$0.bR.b();
      $$0.u();
      $$0.c.b(new zt($$0.fS().l));
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

   public List<aku> b(String $$0) {
      List<aku> $$1 = Lists.newArrayList();

      for (aku $$2 : this.l) {
         if ($$2.y().equals($$0)) {
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
   public qw r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(tl.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(tl $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(tl $$0, Function<aku, tl> $$1, boolean $$2) {
      this.k.a($$0);

      for (aku $$3 : this.l) {
         tl $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(ub $$0, dt $$1, th.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(ub $$0, aku $$1, th.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(ub $$0, Predicate<aku> $$1, @Nullable aku $$2, th.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.c(), $$3, $$4 ? null : "Not Secure");
      ua $$5 = ua.a($$0);
      boolean $$6 = false;

      for (aku $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.i();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(ub $$0) {
      return $$0.h() && !$$0.a(Instant.now());
   }

   public apm a(cca $$0) {
      UUID $$1 = $$0.cv();
      apm $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eby.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ab().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new apm(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public afh f(aku $$0) {
      UUID $$1 = $$0.cv();
      afh $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eby.a).resolve($$1 + ".json");
         $$2 = new afh(this.k.ay(), this, this.k.az(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new zv($$0));

      for (akt $$1 : this.k.F()) {
         if ($$1 != null) {
            $$1.k().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new aai($$0));

      for (akt $$1 : this.k.F()) {
         if ($$1 != null) {
            $$1.k().b($$0);
         }
      }
   }

   public List<aku> t() {
      return this.l;
   }

   @Nullable
   public aku a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (afh $$0 : this.s.values()) {
         $$0.a(this.k.az());
      }

      this.a(new vn(aqn.a(this.v)));
      aaz $$1 = new aaz(this.k.aE().b());

      for (aku $$2 : this.l) {
         $$2.c.b($$1);
         $$2.G().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
