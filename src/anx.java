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

public abstract class anx {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final te f = te.c("chat.filtered_full");
   public static final te g = te.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<akj> l = Lists.newArrayList();
   private final Map<UUID, akj> m = Maps.newHashMap();
   private final aod n = new aod(b);
   private final anu o = new anu(c);
   private final any p = new any(d);
   private final aof q = new aof(e);
   private final Map<UUID, apa> r = Maps.newHashMap();
   private final Map<UUID, aex> s = Maps.newHashMap();
   private final eby t;
   private boolean u;
   private final hm<aey> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public anx(MinecraftServer $$0, hm<aey> $$1, eby $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(sf $$0, akj $$1, int $$2) {
      GameProfile $$3 = $$1.fP();
      ant $$4 = this.k.ap();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      qs $$8 = this.a($$1);
      aeo<cpk> $$9 = $$8 != null ? dih.a(new Dynamic(rd.a, $$8.c("Dimension"))).resultOrPartial(a::error).orElse(cpk.h) : cpk.h;
      aki $$10 = this.k.a($$9);
      aki $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.D();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bf());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ab().getString(), $$13, $$1.ah(), $$1.dp(), $$1.dr(), $$1.dv()});
      ebs $$14 = $$11.u_();
      $$1.c($$8);
      alg $$15 = new alg(this.k, $$0, $$1, $$2);
      cpg $$16 = $$11.X();
      boolean $$17 = $$16.b(cpg.B);
      boolean $$18 = $$16.b(cpg.p);
      $$15.b(new ye($$1.ah(), $$14.n(), this.k.E(), this.n(), this.w, this.x, $$18, !$$17, $$1.d($$11)));
      $$15.b(new xb($$14.s(), $$14.t()));
      $$15.b(new yn($$1.fR()));
      $$15.b(new zl($$1.fQ().l));
      $$15.b(new aar(this.k.aE().b()));
      this.d($$1);
      $$1.E().c();
      $$1.F().a($$1);
      this.a($$11.f(), $$1);
      this.k.ar();
      tr $$19;
      if ($$1.fP().getName().equalsIgnoreCase($$6)) {
         $$19 = te.a("multiplayer.player.joined", $$1.H_());
      } else {
         $$19 = te.a("multiplayer.player.joined.renamed", $$1.H_(), $$6);
      }

      this.a($$19.a(n.o), false);
      $$15.a($$1.dp(), $$1.dr(), $$1.dv(), $$1.dA(), $$1.dC());
      ads $$21 = this.k.aq();
      if ($$21 != null) {
         $$1.a($$21);
      }

      $$1.c.b(yt.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cv(), $$1);
      this.a(yt.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aJ().a($$1);

      for (bht $$22 : $$1.eq()) {
         $$15.b(new aaq($$1.ah(), $$22));
      }

      if ($$8 != null && $$8.b("RootVehicle", 10)) {
         qs $$23 = $$8.p("RootVehicle");
         big $$24 = bik.a($$23.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$24 != null) {
            UUID $$25;
            if ($$23.b("Attach")) {
               $$25 = $$23.a("Attach");
            } else {
               $$25 = null;
            }

            if ($$24.cv().equals($$25)) {
               $$1.a($$24, true);
            } else {
               for (big $$27 : $$24.cT()) {
                  if ($$27.cv().equals($$25)) {
                     $$1.a($$27, true);
                     break;
                  }
               }
            }

            if (!$$1.bN()) {
               a.warn("Couldn't reattach entity to player");
               $$24.ak();

               for (big $$28 : $$24.cT()) {
                  $$28.ak();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(afg $$0, akj $$1) {
      Set<eib> $$2 = Sets.newHashSet();

      for (eic $$3 : $$0.g()) {
         $$1.c.b(zy.a($$3, true));
      }

      for (eia $$4 : eia.values()) {
         eib $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (uw<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aki $$0) {
      $$0.w_().a(new dgn() {
         @Override
         public void a(dgp $$0, double $$1) {
            anx.this.a(new zh($$0));
         }

         @Override
         public void a(dgp $$0, double $$1, double $$2, long $$3) {
            anx.this.a(new zg($$0));
         }

         @Override
         public void a(dgp $$0, double $$1, double $$2) {
            anx.this.a(new zf($$0));
         }

         @Override
         public void a(dgp $$0, int $$1) {
            anx.this.a(new zi($$0));
         }

         @Override
         public void b(dgp $$0, int $$1) {
            anx.this.a(new zj($$0));
         }

         @Override
         public void b(dgp $$0, double $$1) {
         }

         @Override
         public void c(dgp $$0, double $$1) {
         }
      });
   }

   @Nullable
   public qs a(akj $$0) {
      qs $$1 = this.k.aU().y();
      qs $$2;
      if (this.k.a($$0.fP()) && $$1 != null) {
         $$2 = $$1;
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(akj $$0) {
      this.t.a($$0);
      apa $$1 = this.r.get($$0.cv());
      if ($$1 != null) {
         $$1.a();
      }

      aex $$2 = this.s.get($$0.cv());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(akj $$0) {
      aki $$1 = $$0.x();
      $$0.a(ape.j);
      this.b($$0);
      if ($$0.bN()) {
         big $$2 = $$0.cV();
         if ($$2.cU()) {
            a.debug("Removing player mount");
            $$0.aa();
            $$2.cS().forEach($$0x -> $$0x.b(big.c.d));
         }
      }

      $$0.ae();
      $$1.a($$0, big.c.d);
      $$0.N().a();
      this.l.remove($$0);
      this.k.aJ().b($$0);
      UUID $$3 = $$0.cv();
      akj $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new ys(List.of($$0.cv())));
   }

   @Nullable
   public te a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         aoe $$2 = this.n.b($$1);
         tr $$3 = te.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(te.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return te.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         anv $$4 = this.o.b($$0);
         tr $$5 = te.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(te.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? te.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public akj e(GameProfile $$0) {
      return new akj(this.k, this.k.D(), $$0);
   }

   public boolean f(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<akj> $$2 = Sets.newIdentityHashSet();

      for (akj $$3 : this.l) {
         if ($$3.cv().equals($$1)) {
            $$2.add($$3);
         }
      }

      akj $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (akj $$5 : $$2) {
         $$5.c.b(g);
      }

      return !$$2.isEmpty();
   }

   public akj a(akj $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.x().a($$0, big.c.b);
      gv $$2 = $$0.O();
      float $$3 = $$0.P();
      boolean $$4 = $$0.R();
      aki $$5 = this.k.a($$0.Q());
      Optional<ehf> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cbl.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      aki $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.D();
      akj $$9 = new akj(this.k, $$8, $$0.fP());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.ah());
      $$9.a($$0.fk());

      for (String $$10 : $$0.ai()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dey $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(csl.pl);
         ehf $$14 = $$6.get();
         float $$17;
         if (!$$12.a(apj.R) && !$$13) {
            $$17 = $$3;
         } else {
            ehf $$15 = ehf.c($$2).d($$14).d();
            $$17 = (float)aro.d(aro.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ac(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new xu(xu.a, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dr() < (double)$$8.aj()) {
         $$9.e($$9.dp(), $$9.dr() + 1.0, $$9.dv());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      aki $$19 = $$9.x();
      ebs $$20 = $$19.u_();
      $$9.c.b(new yz($$9.d($$19), $$18));
      $$9.c.a($$9.dp(), $$9.dr(), $$9.dv(), $$9.dA(), $$9.dC());
      $$9.c.b(new zo($$8.R(), $$8.S()));
      $$9.c.b(new xb($$20.s(), $$20.t()));
      $$9.c.b(new zu($$9.cf, $$9.ce, $$9.cd));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cv(), $$9);
      $$9.h();
      $$9.c($$9.et());
      if ($$11) {
         $$9.c.b(new aag(aou.tL, aov.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.y_().g()));
      }

      return $$9;
   }

   public void d(akj $$0) {
      GameProfile $$1 = $$0.fP();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new yt(EnumSet.of(yt.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(uw<?> $$0) {
      for (akj $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(uw<?> $$0, aeo<cpk> $$1) {
      for (akj $$2 : this.l) {
         if ($$2.dK().ac() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cbl $$0, te $$1) {
      eig $$2 = $$0.cf();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            akj $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cbl $$0, te $$1) {
      eig $$2 = $$0.cf();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            akj $$4 = this.l.get($$3);
            if ($$4.cf() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fP().getName();
      }

      return $$0;
   }

   public aod f() {
      return this.n;
   }

   public anu g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new anz($$0, this.k.i(), this.p.a($$0)));
      akj $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      akj $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(akj $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new xr($$0, $$2));
      }

      this.k.aC().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean g(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.aU().o() || this.y;
   }

   @Nullable
   public akj a(String $$0) {
      for (akj $$1 : this.l) {
         if ($$1.fP().getName().equalsIgnoreCase($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(@Nullable cbl $$0, double $$1, double $$2, double $$3, double $$4, aeo<cpk> $$5, uw<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         akj $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dK().ac() == $$5) {
            double $$9 = $$1 - $$8.dp();
            double $$10 = $$2 - $$8.dr();
            double $$11 = $$3 - $$8.dv();
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

   public aof i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public any k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(akj $$0, aki $$1) {
      dgp $$2 = this.k.D().w_();
      $$0.c.b(new xx($$2));
      $$0.c.b(new aac($$1.V(), $$1.W(), $$1.X().b(cpg.k)));
      $$0.c.b(new zo($$1.R(), $$1.S()));
      if ($$1.Z()) {
         $$0.c.b(new xu(xu.b, 0.0F));
         $$0.c.b(new xu(xu.h, $$1.d(1.0F)));
         $$0.c.b(new xu(xu.i, $$1.b(1.0F)));
      }
   }

   public void e(akj $$0) {
      $$0.bP.b();
      $$0.u();
      $$0.c.b(new zl($$0.fQ().l));
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

   public List<akj> b(String $$0) {
      List<akj> $$1 = Lists.newArrayList();

      for (akj $$2 : this.l) {
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
   public qs r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(te.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(te $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(te $$0, Function<akj, te> $$1, boolean $$2) {
      this.k.a($$0);

      for (akj $$3 : this.l) {
         te $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(tt $$0, ds $$1, ta.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(tt $$0, akj $$1, ta.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(tt $$0, Predicate<akj> $$1, @Nullable akj $$2, ta.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.c(), $$3, $$4 ? null : "Not Secure");
      ts $$5 = ts.a($$0);
      boolean $$6 = false;

      for (akj $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.i();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(tt $$0) {
      return $$0.h() && !$$0.a(Instant.now());
   }

   public apa a(cbl $$0) {
      UUID $$1 = $$0.cv();
      apa $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ebt.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ab().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new apa(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public aex f(akj $$0) {
      UUID $$1 = $$0.cv();
      aex $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ebt.a).resolve($$1 + ".json");
         $$2 = new aex(this.k.ay(), this, this.k.az(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new zn($$0));

      for (aki $$1 : this.k.F()) {
         if ($$1 != null) {
            $$1.k().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new aaa($$0));

      for (aki $$1 : this.k.F()) {
         if ($$1 != null) {
            $$1.k().b($$0);
         }
      }
   }

   public List<akj> t() {
      return this.l;
   }

   @Nullable
   public akj a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (aex $$0 : this.s.values()) {
         $$0.a(this.k.az());
      }

      this.a(new vf(aqb.a(this.v)));
      aar $$1 = new aar(this.k.aE().b());

      for (akj $$2 : this.l) {
         $$2.c.b($$1);
         $$2.F().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
