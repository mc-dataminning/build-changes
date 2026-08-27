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

public abstract class aqv {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final vf f = vf.c("chat.filtered_full");
   public static final vf g = vf.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<ane> l = Lists.newArrayList();
   private final Map<UUID, ane> m = Maps.newHashMap();
   private final arb n = new arb(b);
   private final aqs o = new aqs(c);
   private final aqw p = new aqw(d);
   private final ard q = new ard(e);
   private final Map<UUID, ary> r = Maps.newHashMap();
   private final Map<UUID, aho> s = Maps.newHashMap();
   private final egp t;
   private boolean u;
   private final io<ahp> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public aqv(MinecraftServer $$0, io<ahp> $$1, egp $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(ug $$0, ane $$1, ans $$2) {
      GameProfile $$3 = $$1.fR();
      aqr $$4 = this.k.ar();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      sn $$8 = this.a($$1);
      ahf<ctp> $$9 = $$8 != null ? dmq.a(new Dynamic(tb.a, $$8.c("Dimension"))).resultOrPartial(a::error).orElse(ctp.h) : ctp.h;
      and $$10 = this.k.a($$9);
      and $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.F();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bj());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ad().getString(), $$13, $$1.aj(), $$1.dr(), $$1.dt(), $$1.dx()});
      egi $$14 = $$11.B_();
      $$1.c($$8);
      aoc $$15 = new aoc(this.k, $$0, $$1, $$2);
      ctl $$16 = $$11.Z();
      boolean $$17 = $$16.b(ctl.D);
      boolean $$18 = $$16.b(ctl.q);
      boolean $$19 = $$16.b(ctl.w);
      $$15.b(new aap($$1.aj(), $$14.n(), this.k.G(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11)));
      $$15.b(new zm($$14.s(), $$14.t()));
      $$15.b(new aay($$1.fT()));
      $$15.b(new abx($$1.fS().l));
      $$15.b(new adf(this.k.aG().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.at();
      vt $$20;
      if ($$1.fR().getName().equalsIgnoreCase($$6)) {
         $$20 = vf.a("multiplayer.player.joined", $$1.Q_());
      } else {
         $$20 = vf.a("multiplayer.player.joined.renamed", $$1.Q_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE());
      agh $$22 = this.k.as();
      if ($$22 != null) {
         $$1.a($$22);
      }

      $$1.c.b(abe.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cw(), $$1);
      this.a(abe.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aL().a($$1);

      for (bli $$23 : $$1.es()) {
         $$15.b(new ade($$1.aj(), $$23));
      }

      if ($$8 != null && $$8.b("RootVehicle", 10)) {
         sn $$24 = $$8.p("RootVehicle");
         blv $$25 = blz.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
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
               for (blv $$28 : $$25.cT()) {
                  if ($$28.cw().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bO()) {
               a.warn("Couldn't reattach entity to player");
               $$25.am();

               for (blv $$29 : $$25.cT()) {
                  $$29.am();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(ahx $$0, ane $$1) {
      Set<emp> $$2 = Sets.newHashSet();

      for (ems $$3 : $$0.g()) {
         $$1.c.b(ack.a($$3, true));
      }

      for (emo $$4 : emo.values()) {
         emp $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (xf<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(and $$0) {
      $$0.D_().a(new dkw() {
         @Override
         public void a(dky $$0, double $$1) {
            aqv.this.a(new abt($$0));
         }

         @Override
         public void a(dky $$0, double $$1, double $$2, long $$3) {
            aqv.this.a(new abs($$0));
         }

         @Override
         public void a(dky $$0, double $$1, double $$2) {
            aqv.this.a(new abr($$0));
         }

         @Override
         public void a(dky $$0, int $$1) {
            aqv.this.a(new abu($$0));
         }

         @Override
         public void b(dky $$0, int $$1) {
            aqv.this.a(new abv($$0));
         }

         @Override
         public void b(dky $$0, double $$1) {
         }

         @Override
         public void c(dky $$0, double $$1) {
         }
      });
   }

   @Nullable
   public sn a(ane $$0) {
      sn $$1 = this.k.aY().y();
      sn $$2;
      if (this.k.a($$0.fR()) && $$1 != null) {
         $$2 = $$1;
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(ane $$0) {
      this.t.a($$0);
      ary $$1 = this.r.get($$0.cw());
      if ($$1 != null) {
         $$1.a();
      }

      aho $$2 = this.s.get($$0.cw());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(ane $$0) {
      and $$1 = $$0.z();
      $$0.a(asc.j);
      this.b($$0);
      if ($$0.bO()) {
         blv $$2 = $$0.cW();
         if ($$2.cV()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cS().forEach($$0x -> $$0x.b(blv.c.d));
         }
      }

      $$0.ag();
      $$1.a($$0, blv.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aL().b($$0);
      UUID $$3 = $$0.cw();
      ane $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new abd(List.of($$0.cw())));
   }

   @Nullable
   public vf a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         arc $$2 = this.n.b($$1);
         vt $$3 = vf.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(vf.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return vf.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         aqt $$4 = this.o.b($$0);
         vt $$5 = vf.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(vf.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? vf.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public ane a(GameProfile $$0, ams $$1) {
      return new ane(this.k, this.k.F(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<ane> $$2 = Sets.newIdentityHashSet();

      for (ane $$3 : this.l) {
         if ($$3.cw().equals($$1)) {
            $$2.add($$3);
         }
      }

      ane $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (ane $$5 : $$2) {
         $$5.c.b(g);
      }

      return !$$2.isEmpty();
   }

   public ane a(ane $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, blv.c.b);
      hx $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      and $$5 = this.k.a($$0.T());
      Optional<elt> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cfi.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      and $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.F();
      ane $$9 = new ane(this.k, $$8, $$0.fR(), $$0.B());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.aj());
      $$9.a($$0.fm());

      for (String $$10 : $$0.ak()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         djh $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(cws.pl);
         elt $$14 = $$6.get();
         float $$17;
         if (!$$12.a(ash.R) && !$$13) {
            $$17 = $$3;
         } else {
            elt $$15 = elt.c($$2).d($$14).d();
            $$17 = (float)auo.d(auo.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ae(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new aaf(aaf.a, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dt() < (double)$$8.al()) {
         $$9.a_($$9.dr(), $$9.dt() + 1.0, $$9.dx());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      and $$19 = $$9.z();
      egi $$20 = $$19.B_();
      $$9.c.b(new abl($$9.d($$19), $$18));
      $$9.c.a($$9.dr(), $$9.dt(), $$9.dx(), $$9.dC(), $$9.dE());
      $$9.c.b(new aca($$8.T(), $$8.U()));
      $$9.c.b(new zm($$20.s(), $$20.t()));
      $$9.c.b(new acg($$9.ch, $$9.cg, $$9.cf));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cw(), $$9);
      $$9.h();
      $$9.c($$9.ev());
      if ($$11) {
         $$9.c.b(new acs(ars.uB, art.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.F_().g()));
      }

      return $$9;
   }

   public void d(ane $$0) {
      GameProfile $$1 = $$0.fR();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new abe(EnumSet.of(abe.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(xf<?> $$0) {
      for (ane $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(xf<?> $$0, ahf<ctp> $$1) {
      for (ane $$2 : this.l) {
         if ($$2.dM().ae() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cfi $$0, vf $$1) {
      emz $$2 = $$0.cg();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            ane $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cfi $$0, vf $$1) {
      emz $$2 = $$0.cg();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            ane $$4 = this.l.get($$3);
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

   public arb f() {
      return this.n;
   }

   public aqs g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aqx($$0, this.k.i(), this.p.a($$0)));
      ane $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      ane $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(ane $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new aac($$0, $$2));
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
   public ane a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         ane $$3 = this.l.get($$2);
         if ($$3.fR().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cfi $$0, double $$1, double $$2, double $$3, double $$4, ahf<ctp> $$5, xf<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         ane $$8 = this.l.get($$7);
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

   public ard i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aqw k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(ane $$0, and $$1) {
      dky $$2 = this.k.F().D_();
      $$0.c.b(new aai($$2));
      $$0.c.b(new aco($$1.X(), $$1.Y(), $$1.Z().b(ctl.l)));
      $$0.c.b(new aca($$1.T(), $$1.U()));
      if ($$1.ab()) {
         $$0.c.b(new aaf(aaf.b, 0.0F));
         $$0.c.b(new aaf(aaf.h, $$1.d(1.0F)));
         $$0.c.b(new aaf(aaf.i, $$1.b(1.0F)));
      }

      $$0.c.b(new aaf(aaf.n, 0.0F));
      this.k.aO().a($$0);
   }

   public void e(ane $$0) {
      $$0.bR.b();
      $$0.w();
      $$0.c.b(new abx($$0.fS().l));
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

   public List<ane> b(String $$0) {
      List<ane> $$1 = Lists.newArrayList();

      for (ane $$2 : this.l) {
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
   public sn r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(vf.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(vf $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(vf $$0, Function<ane, vf> $$1, boolean $$2) {
      this.k.a($$0);

      for (ane $$3 : this.l) {
         vf $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(vv $$0, ds $$1, vb.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(vv $$0, ane $$1, vb.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(vv $$0, Predicate<ane> $$1, @Nullable ane $$2, vb.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      vu $$5 = vu.a($$0);
      boolean $$6 = false;

      for (ane $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(vv $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public ary a(cfi $$0) {
      UUID $$1 = $$0.cw();
      ary $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(egk.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ad().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new ary(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public aho f(ane $$0) {
      UUID $$1 = $$0.cw();
      aho $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(egk.a).resolve($$1 + ".json");
         $$2 = new aho(this.k.aA(), this, this.k.aB(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new abz($$0));

      for (and $$1 : this.k.H()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new acm($$0));

      for (and $$1 : this.k.H()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<ane> t() {
      return this.l;
   }

   @Nullable
   public ane a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (aho $$0 : this.s.values()) {
         $$0.a(this.k.aB());
      }

      this.a(new xp(asz.a(this.v)));
      adf $$1 = new adf(this.k.aG().b());

      for (ane $$2 : this.l) {
         $$2.c.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
