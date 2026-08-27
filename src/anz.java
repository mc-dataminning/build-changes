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

public abstract class anz {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final tf f = tf.c("chat.filtered_full");
   public static final tf g = tf.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<akl> l = Lists.newArrayList();
   private final Map<UUID, akl> m = Maps.newHashMap();
   private final aof n = new aof(b);
   private final anw o = new anw(c);
   private final aoa p = new aoa(d);
   private final aoh q = new aoh(e);
   private final Map<UUID, apc> r = Maps.newHashMap();
   private final Map<UUID, aez> s = Maps.newHashMap();
   private final eca t;
   private boolean u;
   private final hl<afa> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public anz(MinecraftServer $$0, hl<afa> $$1, eca $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(sg $$0, akl $$1, int $$2) {
      GameProfile $$3 = $$1.fP();
      anv $$4 = this.k.ap();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      qr $$8 = this.a($$1);
      aeq<cpm> $$9 = $$8 != null ? dij.a(new Dynamic(rc.a, $$8.c("Dimension"))).resultOrPartial(a::error).orElse(cpm.h) : cpm.h;
      akk $$10 = this.k.a($$9);
      akk $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.D();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bf());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ab().getString(), $$13, $$1.ah(), $$1.dp(), $$1.dr(), $$1.dv()});
      ebu $$14 = $$11.u_();
      $$1.c($$8);
      ali $$15 = new ali(this.k, $$0, $$1, $$2);
      cpi $$16 = $$11.X();
      boolean $$17 = $$16.b(cpi.B);
      boolean $$18 = $$16.b(cpi.p);
      $$15.b(new yf($$1.ah(), $$14.n(), this.k.E(), this.n(), this.w, this.x, $$18, !$$17, $$1.d($$11)));
      $$15.b(new xc($$14.s(), $$14.t()));
      $$15.b(new yo($$1.fR()));
      $$15.b(new zm($$1.fQ().l));
      $$15.b(new aas(this.k.aE().b()));
      this.d($$1);
      $$1.E().c();
      $$1.F().a($$1);
      this.a($$11.f(), $$1);
      this.k.ar();
      ts $$19;
      if ($$1.fP().getName().equalsIgnoreCase($$6)) {
         $$19 = tf.a("multiplayer.player.joined", $$1.H_());
      } else {
         $$19 = tf.a("multiplayer.player.joined.renamed", $$1.H_(), $$6);
      }

      this.a($$19.a(n.o), false);
      $$15.a($$1.dp(), $$1.dr(), $$1.dv(), $$1.dA(), $$1.dC());
      adu $$21 = this.k.aq();
      if ($$21 != null) {
         $$1.a($$21);
      }

      $$1.c.b(yu.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cv(), $$1);
      this.a(yu.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aJ().a($$1);

      for (bhv $$22 : $$1.eq()) {
         $$15.b(new aar($$1.ah(), $$22));
      }

      if ($$8 != null && $$8.b("RootVehicle", 10)) {
         qr $$23 = $$8.p("RootVehicle");
         bii $$24 = bim.a($$23.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
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
               for (bii $$27 : $$24.cT()) {
                  if ($$27.cv().equals($$25)) {
                     $$1.a($$27, true);
                     break;
                  }
               }
            }

            if (!$$1.bN()) {
               a.warn("Couldn't reattach entity to player");
               $$24.ak();

               for (bii $$28 : $$24.cT()) {
                  $$28.ak();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(afi $$0, akl $$1) {
      Set<eia> $$2 = Sets.newHashSet();

      for (eib $$3 : $$0.g()) {
         $$1.c.b(zz.a($$3, true));
      }

      for (ehz $$4 : ehz.values()) {
         eia $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (ux<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(akk $$0) {
      $$0.w_().a(new dgp() {
         @Override
         public void a(dgr $$0, double $$1) {
            anz.this.a(new zi($$0));
         }

         @Override
         public void a(dgr $$0, double $$1, double $$2, long $$3) {
            anz.this.a(new zh($$0));
         }

         @Override
         public void a(dgr $$0, double $$1, double $$2) {
            anz.this.a(new zg($$0));
         }

         @Override
         public void a(dgr $$0, int $$1) {
            anz.this.a(new zj($$0));
         }

         @Override
         public void b(dgr $$0, int $$1) {
            anz.this.a(new zk($$0));
         }

         @Override
         public void b(dgr $$0, double $$1) {
         }

         @Override
         public void c(dgr $$0, double $$1) {
         }
      });
   }

   @Nullable
   public qr a(akl $$0) {
      qr $$1 = this.k.aU().y();
      qr $$2;
      if (this.k.a($$0.fP()) && $$1 != null) {
         $$2 = $$1;
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(akl $$0) {
      this.t.a($$0);
      apc $$1 = this.r.get($$0.cv());
      if ($$1 != null) {
         $$1.a();
      }

      aez $$2 = this.s.get($$0.cv());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(akl $$0) {
      akk $$1 = $$0.x();
      $$0.a(apg.j);
      this.b($$0);
      if ($$0.bN()) {
         bii $$2 = $$0.cV();
         if ($$2.cU()) {
            a.debug("Removing player mount");
            $$0.aa();
            $$2.cS().forEach($$0x -> $$0x.b(bii.c.d));
         }
      }

      $$0.ae();
      $$1.a($$0, bii.c.d);
      $$0.N().a();
      this.l.remove($$0);
      this.k.aJ().b($$0);
      UUID $$3 = $$0.cv();
      akl $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new yt(List.of($$0.cv())));
   }

   @Nullable
   public tf a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         aog $$2 = this.n.b($$1);
         ts $$3 = tf.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(tf.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return tf.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         anx $$4 = this.o.b($$0);
         ts $$5 = tf.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(tf.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? tf.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public akl e(GameProfile $$0) {
      return new akl(this.k, this.k.D(), $$0);
   }

   public boolean f(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<akl> $$2 = Sets.newIdentityHashSet();

      for (akl $$3 : this.l) {
         if ($$3.cv().equals($$1)) {
            $$2.add($$3);
         }
      }

      akl $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (akl $$5 : $$2) {
         $$5.c.b(g);
      }

      return !$$2.isEmpty();
   }

   public akl a(akl $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.x().a($$0, bii.c.b);
      gu $$2 = $$0.O();
      float $$3 = $$0.P();
      boolean $$4 = $$0.R();
      akk $$5 = this.k.a($$0.Q());
      Optional<ehe> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cbn.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      akk $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.D();
      akl $$9 = new akl(this.k, $$8, $$0.fP());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.ah());
      $$9.a($$0.fk());

      for (String $$10 : $$0.ai()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dfa $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(csn.pl);
         ehe $$14 = $$6.get();
         float $$17;
         if (!$$12.a(apl.R) && !$$13) {
            $$17 = $$3;
         } else {
            ehe $$15 = ehe.c($$2).d($$14).d();
            $$17 = (float)arp.d(arp.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ac(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new xv(xv.a, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dr() < (double)$$8.aj()) {
         $$9.e($$9.dp(), $$9.dr() + 1.0, $$9.dv());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      akk $$19 = $$9.x();
      ebu $$20 = $$19.u_();
      $$9.c.b(new za($$9.d($$19), $$18));
      $$9.c.a($$9.dp(), $$9.dr(), $$9.dv(), $$9.dA(), $$9.dC());
      $$9.c.b(new zp($$8.R(), $$8.S()));
      $$9.c.b(new xc($$20.s(), $$20.t()));
      $$9.c.b(new zv($$9.cf, $$9.ce, $$9.cd));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cv(), $$9);
      $$9.h();
      $$9.c($$9.et());
      if ($$11) {
         $$9.c.b(new aah(aow.tL, aox.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.y_().g()));
      }

      return $$9;
   }

   public void d(akl $$0) {
      GameProfile $$1 = $$0.fP();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new yu(EnumSet.of(yu.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(ux<?> $$0) {
      for (akl $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(ux<?> $$0, aeq<cpm> $$1) {
      for (akl $$2 : this.l) {
         if ($$2.dK().ac() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cbn $$0, tf $$1) {
      eif $$2 = $$0.cf();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            akl $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cbn $$0, tf $$1) {
      eif $$2 = $$0.cf();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            akl $$4 = this.l.get($$3);
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

   public aof f() {
      return this.n;
   }

   public anw g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aob($$0, this.k.i(), this.p.a($$0)));
      akl $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      akl $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(akl $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new xs($$0, $$2));
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
   public akl a(String $$0) {
      for (akl $$1 : this.l) {
         if ($$1.fP().getName().equalsIgnoreCase($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(@Nullable cbn $$0, double $$1, double $$2, double $$3, double $$4, aeq<cpm> $$5, ux<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         akl $$8 = this.l.get($$7);
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

   public aoh i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aoa k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(akl $$0, akk $$1) {
      dgr $$2 = this.k.D().w_();
      $$0.c.b(new xy($$2));
      $$0.c.b(new aad($$1.V(), $$1.W(), $$1.X().b(cpi.k)));
      $$0.c.b(new zp($$1.R(), $$1.S()));
      if ($$1.Z()) {
         $$0.c.b(new xv(xv.b, 0.0F));
         $$0.c.b(new xv(xv.h, $$1.d(1.0F)));
         $$0.c.b(new xv(xv.i, $$1.b(1.0F)));
      }
   }

   public void e(akl $$0) {
      $$0.bP.b();
      $$0.u();
      $$0.c.b(new zm($$0.fQ().l));
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

   public List<akl> b(String $$0) {
      List<akl> $$1 = Lists.newArrayList();

      for (akl $$2 : this.l) {
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
   public qr r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(tf.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(tf $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(tf $$0, Function<akl, tf> $$1, boolean $$2) {
      this.k.a($$0);

      for (akl $$3 : this.l) {
         tf $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(tu $$0, dr $$1, tb.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(tu $$0, akl $$1, tb.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(tu $$0, Predicate<akl> $$1, @Nullable akl $$2, tb.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.c(), $$3, $$4 ? null : "Not Secure");
      tt $$5 = tt.a($$0);
      boolean $$6 = false;

      for (akl $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.i();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(tu $$0) {
      return $$0.h() && !$$0.a(Instant.now());
   }

   public apc a(cbn $$0) {
      UUID $$1 = $$0.cv();
      apc $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ebv.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ab().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new apc(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public aez f(akl $$0) {
      UUID $$1 = $$0.cv();
      aez $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ebv.a).resolve($$1 + ".json");
         $$2 = new aez(this.k.ay(), this, this.k.az(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new zo($$0));

      for (akk $$1 : this.k.F()) {
         if ($$1 != null) {
            $$1.k().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new aab($$0));

      for (akk $$1 : this.k.F()) {
         if ($$1 != null) {
            $$1.k().b($$0);
         }
      }
   }

   public List<akl> t() {
      return this.l;
   }

   @Nullable
   public akl a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (aez $$0 : this.s.values()) {
         $$0.a(this.k.az());
      }

      this.a(new vg(aqd.a(this.v)));
      aas $$1 = new aas(this.k.aE().b());

      for (akl $$2 : this.l) {
         $$2.c.b($$1);
         $$2.F().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
