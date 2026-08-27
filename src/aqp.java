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

public abstract class aqp {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final vd f = vd.c("chat.filtered_full");
   public static final vd g = vd.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<ana> l = Lists.newArrayList();
   private final Map<UUID, ana> m = Maps.newHashMap();
   private final aqv n = new aqv(b);
   private final aqm o = new aqm(c);
   private final aqq p = new aqq(d);
   private final aqx q = new aqx(e);
   private final Map<UUID, ars> r = Maps.newHashMap();
   private final Map<UUID, ahl> s = Maps.newHashMap();
   private final egi t;
   private boolean u;
   private final io<ahm> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public aqp(MinecraftServer $$0, io<ahm> $$1, egi $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(ue $$0, ana $$1, ano $$2) {
      GameProfile $$3 = $$1.fR();
      aql $$4 = this.k.ar();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      sl $$8 = this.a($$1);
      ahc<cti> $$9 = $$8 != null ? dmj.a(new Dynamic(sz.a, $$8.c("Dimension"))).resultOrPartial(a::error).orElse(cti.h) : cti.h;
      amz $$10 = this.k.a($$9);
      amz $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.F();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bj());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ad().getString(), $$13, $$1.aj(), $$1.dr(), $$1.dt(), $$1.dx()});
      egb $$14 = $$11.B_();
      $$1.c($$8);
      any $$15 = new any(this.k, $$0, $$1, $$2);
      cte $$16 = $$11.Z();
      boolean $$17 = $$16.b(cte.D);
      boolean $$18 = $$16.b(cte.q);
      boolean $$19 = $$16.b(cte.w);
      $$15.b(new aam($$1.aj(), $$14.n(), this.k.G(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11)));
      $$15.b(new zj($$14.s(), $$14.t()));
      $$15.b(new aav($$1.fT()));
      $$15.b(new abu($$1.fS().l));
      $$15.b(new adc(this.k.aG().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.at();
      vr $$20;
      if ($$1.fR().getName().equalsIgnoreCase($$6)) {
         $$20 = vd.a("multiplayer.player.joined", $$1.Q_());
      } else {
         $$20 = vd.a("multiplayer.player.joined.renamed", $$1.Q_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE());
      age $$22 = this.k.as();
      if ($$22 != null) {
         $$1.a($$22);
      }

      $$1.c.b(abb.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cw(), $$1);
      this.a(abb.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aL().a($$1);

      for (blc $$23 : $$1.es()) {
         $$15.b(new adb($$1.aj(), $$23));
      }

      if ($$8 != null && $$8.b("RootVehicle", 10)) {
         sl $$24 = $$8.p("RootVehicle");
         blp $$25 = blt.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cw().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (blp $$28 : $$25.cT()) {
                  if ($$28.cw().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bO()) {
               a.warn("Couldn't reattach entity to player");
               $$25.am();

               for (blp $$29 : $$25.cT()) {
                  $$29.am();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(ahu $$0, ana $$1) {
      Set<emi> $$2 = Sets.newHashSet();

      for (eml $$3 : $$0.g()) {
         $$1.c.b(ach.a($$3, true));
      }

      for (emh $$4 : emh.values()) {
         emi $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (xd<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(amz $$0) {
      $$0.D_().a(new dkp() {
         @Override
         public void a(dkr $$0, double $$1) {
            aqp.this.a(new abq($$0));
         }

         @Override
         public void a(dkr $$0, double $$1, double $$2, long $$3) {
            aqp.this.a(new abp($$0));
         }

         @Override
         public void a(dkr $$0, double $$1, double $$2) {
            aqp.this.a(new abo($$0));
         }

         @Override
         public void a(dkr $$0, int $$1) {
            aqp.this.a(new abr($$0));
         }

         @Override
         public void b(dkr $$0, int $$1) {
            aqp.this.a(new abs($$0));
         }

         @Override
         public void b(dkr $$0, double $$1) {
         }

         @Override
         public void c(dkr $$0, double $$1) {
         }
      });
   }

   @Nullable
   public sl a(ana $$0) {
      sl $$1 = this.k.aY().y();
      sl $$2;
      if (this.k.a($$0.fR()) && $$1 != null) {
         $$2 = $$1;
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(ana $$0) {
      this.t.a($$0);
      ars $$1 = this.r.get($$0.cw());
      if ($$1 != null) {
         $$1.a();
      }

      ahl $$2 = this.s.get($$0.cw());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(ana $$0) {
      amz $$1 = $$0.z();
      $$0.a(arw.j);
      this.b($$0);
      if ($$0.bO()) {
         blp $$2 = $$0.cW();
         if ($$2.cV()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cS().forEach($$0x -> $$0x.b(blp.c.d));
         }
      }

      $$0.ag();
      $$1.a($$0, blp.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aL().b($$0);
      UUID $$3 = $$0.cw();
      ana $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new aba(List.of($$0.cw())));
   }

   @Nullable
   public vd a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         aqw $$2 = this.n.b($$1);
         vr $$3 = vd.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(vd.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return vd.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         aqn $$4 = this.o.b($$0);
         vr $$5 = vd.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(vd.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? vd.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public ana a(GameProfile $$0, amo $$1) {
      return new ana(this.k, this.k.F(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<ana> $$2 = Sets.newIdentityHashSet();

      for (ana $$3 : this.l) {
         if ($$3.cw().equals($$1)) {
            $$2.add($$3);
         }
      }

      ana $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (ana $$5 : $$2) {
         $$5.c.b(g);
      }

      return !$$2.isEmpty();
   }

   public ana a(ana $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, blp.c.b);
      hx $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      amz $$5 = this.k.a($$0.T());
      Optional<elm> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cfb.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      amz $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.F();
      ana $$9 = new ana(this.k, $$8, $$0.fR(), $$0.B());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.aj());
      $$9.a($$0.fm());

      for (String $$10 : $$0.ak()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dja $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(cwl.pl);
         elm $$14 = $$6.get();
         float $$17;
         if (!$$12.a(asb.R) && !$$13) {
            $$17 = $$3;
         } else {
            elm $$15 = elm.c($$2).d($$14).d();
            $$17 = (float)aui.d(aui.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ae(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new aac(aac.a, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dt() < (double)$$8.al()) {
         $$9.a_($$9.dr(), $$9.dt() + 1.0, $$9.dx());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      amz $$19 = $$9.z();
      egb $$20 = $$19.B_();
      $$9.c.b(new abi($$9.d($$19), $$18));
      $$9.c.a($$9.dr(), $$9.dt(), $$9.dx(), $$9.dC(), $$9.dE());
      $$9.c.b(new abx($$8.T(), $$8.U()));
      $$9.c.b(new zj($$20.s(), $$20.t()));
      $$9.c.b(new acd($$9.ch, $$9.cg, $$9.cf));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cw(), $$9);
      $$9.h();
      $$9.c($$9.ev());
      if ($$11) {
         $$9.c.b(new acp(arm.uB, arn.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.F_().g()));
      }

      return $$9;
   }

   public void d(ana $$0) {
      GameProfile $$1 = $$0.fR();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new abb(EnumSet.of(abb.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(xd<?> $$0) {
      for (ana $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(xd<?> $$0, ahc<cti> $$1) {
      for (ana $$2 : this.l) {
         if ($$2.dM().ae() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cfb $$0, vd $$1) {
      ems $$2 = $$0.cg();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            ana $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cfb $$0, vd $$1) {
      ems $$2 = $$0.cg();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            ana $$4 = this.l.get($$3);
            if ($$4.cg() != $$2) {
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

   public aqv f() {
      return this.n;
   }

   public aqm g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aqr($$0, this.k.i(), this.p.a($$0)));
      ana $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      ana $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(ana $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new zz($$0, $$2));
      }

      this.k.aE().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.aY().o() || this.y;
   }

   @Nullable
   public ana a(String $$0) {
      for (ana $$1 : this.l) {
         if ($$1.fR().getName().equalsIgnoreCase($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(@Nullable cfb $$0, double $$1, double $$2, double $$3, double $$4, ahc<cti> $$5, xd<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         ana $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dM().ae() == $$5) {
            double $$9 = $$1 - $$8.dr();
            double $$10 = $$2 - $$8.dt();
            double $$11 = $$3 - $$8.dx();
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

   public aqx i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aqq k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(ana $$0, amz $$1) {
      dkr $$2 = this.k.F().D_();
      $$0.c.b(new aaf($$2));
      $$0.c.b(new acl($$1.X(), $$1.Y(), $$1.Z().b(cte.l)));
      $$0.c.b(new abx($$1.T(), $$1.U()));
      if ($$1.ab()) {
         $$0.c.b(new aac(aac.b, 0.0F));
         $$0.c.b(new aac(aac.h, $$1.d(1.0F)));
         $$0.c.b(new aac(aac.i, $$1.b(1.0F)));
      }

      $$0.c.b(new aac(aac.n, 0.0F));
      this.k.aO().a($$0);
   }

   public void e(ana $$0) {
      $$0.bR.b();
      $$0.w();
      $$0.c.b(new abu($$0.fS().l));
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

   public List<ana> b(String $$0) {
      List<ana> $$1 = Lists.newArrayList();

      for (ana $$2 : this.l) {
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
   public sl r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(vd.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(vd $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(vd $$0, Function<ana, vd> $$1, boolean $$2) {
      this.k.a($$0);

      for (ana $$3 : this.l) {
         vd $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(vt $$0, ds $$1, uz.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(vt $$0, ana $$1, uz.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(vt $$0, Predicate<ana> $$1, @Nullable ana $$2, uz.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.c(), $$3, $$4 ? null : "Not Secure");
      vs $$5 = vs.a($$0);
      boolean $$6 = false;

      for (ana $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.i();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(vt $$0) {
      return $$0.h() && !$$0.a(Instant.now());
   }

   public ars a(cfb $$0) {
      UUID $$1 = $$0.cw();
      ars $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(egd.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ad().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new ars(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public ahl f(ana $$0) {
      UUID $$1 = $$0.cw();
      ahl $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(egd.a).resolve($$1 + ".json");
         $$2 = new ahl(this.k.aA(), this, this.k.aB(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new abw($$0));

      for (amz $$1 : this.k.H()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new acj($$0));

      for (amz $$1 : this.k.H()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<ana> t() {
      return this.l;
   }

   @Nullable
   public ana a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (ahl $$0 : this.s.values()) {
         $$0.a(this.k.aB());
      }

      this.a(new xm(ast.a(this.v)));
      adc $$1 = new adc(this.k.aG().b());

      for (ana $$2 : this.l) {
         $$2.c.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
