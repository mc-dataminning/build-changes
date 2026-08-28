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

public abstract class avn {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final wv e = wv.c("chat.filtered_full");
   public static final wv f = wv.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aro> l = Lists.newArrayList();
   private final Map<UUID, aro> m = Maps.newHashMap();
   private final avt n = new avt(a);
   private final avk o = new avk(b);
   private final avo p = new avo(c);
   private final avv q = new avv(d);
   private final Map<UUID, awq> r = Maps.newHashMap();
   private final Map<UUID, all> s = Maps.newHashMap();
   private final exc t;
   private boolean u;
   private final jz<alm> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public avn(MinecraftServer $$0, jz<alm> $$1, exc $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vo $$0, aro $$1, asd $$2) {
      GameProfile $$3 = $$1.gh();
      avj $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<tw> $$8 = this.a($$1);
      alc<dhp> $$9 = $$8.<alc<dhp>>flatMap($$0x -> ecj.a(new Dynamic(uk.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dhp.i);
      arn $$10 = this.k.a($$9);
      arn $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bl());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.al().getString(), $$13, $$1.ar(), $$1.dA(), $$1.dC(), $$1.dG()});
      ewv $$14 = $$11.y_();
      $$1.c($$8.orElse(null));
      asq $$15 = new asq(this.k, $$0, $$1, $$2);
      $$0.a(agl.a.a(wg.a(this.k.ba())), $$15);
      dhl $$16 = $$11.O();
      boolean $$17 = $$16.c(dhl.E);
      boolean $$18 = $$16.c(dhl.q);
      boolean $$19 = $$16.c(dhl.x);
      $$15.b(new adi($$1.ar(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new acd($$14.q(), $$14.r()));
      $$15.b(new ads($$1.gj()));
      $$15.b(new afg($$1.gi().j));
      dcs $$20 = this.k.aI();
      $$15.b(new agg($$20.b(), $$20.d()));
      this.e($$1);
      $$1.I().c();
      $$1.J().a($$1);
      this.a($$11.g(), $$1);
      this.k.av();
      xj $$21;
      if ($$1.gh().getName().equalsIgnoreCase($$6)) {
         $$21 = wv.a("multiplayer.player.joined", $$1.m_());
      } else {
         $$21 = wv.a("multiplayer.player.joined.renamed", $$1.m_(), $$6);
      }

      this.a($$21.a(n.o), false);
      $$15.a($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN());
      aka $$23 = this.k.au();
      if ($$23 != null && !$$2.d()) {
         $$1.a($$23);
      }

      $$1.f.b(ady.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cG(), $$1);
      this.a(ady.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      $$1.b($$8);
      $$1.a($$8);
      $$1.d();
   }

   protected void a(alw $$0, aro $$1) {
      Set<fdr> $$2 = Sets.newHashSet();

      for (fdu $$3 : $$0.g()) {
         $$1.f.b(afk.a($$3, true));
      }

      for (fdq $$4 : fdq.values()) {
         fdr $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zc<?> $$7 : $$0.d($$5)) {
               $$1.f.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(arn $$0) {
      $$0.A_().a(new eac() {
         @Override
         public void a(eae $$0, double $$1) {
            avn.this.a(new aer($$0));
         }

         @Override
         public void a(eae $$0, double $$1, double $$2, long $$3) {
            avn.this.a(new aeq($$0));
         }

         @Override
         public void a(eae $$0, double $$1, double $$2) {
            avn.this.a(new aep($$0));
         }

         @Override
         public void a(eae $$0, int $$1) {
            avn.this.a(new aes($$0));
         }

         @Override
         public void b(eae $$0, int $$1) {
            avn.this.a(new aet($$0));
         }

         @Override
         public void b(eae $$0, double $$1) {
         }

         @Override
         public void c(eae $$0, double $$1) {
         }
      });
   }

   public Optional<tw> a(aro $$0) {
      tw $$1 = this.k.aZ().w();
      Optional<tw> $$2;
      if (this.k.a($$0.gh()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aro $$0) {
      this.t.a($$0);
      awq $$1 = this.r.get($$0.cG());
      if ($$1 != null) {
         $$1.a();
      }

      all $$2 = this.s.get($$0.cG());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aro $$0) {
      arn $$1 = $$0.y();
      $$0.a(awu.j);
      this.b($$0);
      if ($$0.bZ()) {
         bvs $$2 = $$0.df();
         if ($$2.de()) {
            h.debug("Removing player mount");
            $$0.bP();
            $$2.db().forEach($$0x -> $$0x.c(bvs.e.d));
         }
      }

      $$0.ao();

      for (crl $$3 : $$0.ak()) {
         $$3.c(bvs.e.d);
      }

      $$1.a($$0, bvs.e.d);
      $$0.S().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$4 = $$0.cG();
      aro $$5 = this.m.get($$4);
      if ($$5 == $$0) {
         this.m.remove($$4);
         this.r.remove($$4);
         this.s.remove($$4);
      }

      this.a(new adx(List.of($$0.cG())));
   }

   @Nullable
   public wv a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avu $$2 = this.n.b($$1);
         xj $$3 = wv.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wv.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wv.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         avl $$4 = this.o.b($$0);
         xj $$5 = wv.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wv.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? wv.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aro a(GameProfile $$0, aqx $$1) {
      return new aro(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aro> $$2 = Sets.newIdentityHashSet();

      for (aro $$3 : this.l) {
         if ($$3.cG().equals($$1)) {
            $$2.add($$3);
         }
      }

      aro $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aro $$5 : $$2) {
         $$5.f.a(f);
      }

      return !$$2.isEmpty();
   }

   public aro a(aro $$0, boolean $$1, bvs.e $$2) {
      this.l.remove($$0);
      $$0.y().a($$0, $$2);
      evt $$3 = $$0.a(!$$1, evt.a);
      arn $$4 = $$3.b();
      aro $$5 = new aro(this.k, $$4, $$0.gh(), $$0.C());
      $$5.f = $$0.f;
      $$5.a($$0, $$1);
      $$5.e($$0.ar());
      $$5.b($$0.fx());
      if (!$$3.g()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.as()) {
         $$5.a($$6);
      }

      fcu $$7 = $$3.c();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.e(), $$3.f());
      if ($$3.g()) {
         $$5.f.b(new acy(acy.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      arn $$9 = $$5.y();
      ewv $$10 = $$9.y_();
      $$5.f.b(new aej($$5.b($$9), $$8));
      $$5.f.a($$5.dA(), $$5.dC(), $$5.dG(), $$5.dL(), $$5.dN());
      $$5.f.b(new aey($$4.aa(), $$4.ab()));
      $$5.f.b(new acd($$10.q(), $$10.r()));
      $$5.f.b(new afe($$5.cf, $$5.ce, $$5.cd));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cG(), $$5);
      $$5.d();
      $$5.d($$5.eF());
      jj $$11 = $$5.T();
      arn $$12 = this.k.a($$5.V());
      if (!$$1 && $$11 != null && $$12 != null) {
         dym $$13 = $$12.a_($$11);
         if ($$13.a(dkw.pP)) {
            $$5.f.b(new afs(awk.wi, awl.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.C_().g()));
         }
      }

      return $$5;
   }

   public void d(aro $$0) {
      this.a($$0, $$0.f);
   }

   public void a(bwr $$0, asq $$1) {
      for (buw $$2 : $$0.eC()) {
         $$1.b(new agf($$0.ar(), $$2, false));
      }
   }

   public void e(aro $$0) {
      GameProfile $$1 = $$0.gh();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new ady(EnumSet.of(ady.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zc<?> $$0) {
      for (aro $$1 : this.l) {
         $$1.f.b($$0);
      }
   }

   public void a(zc<?> $$0, alc<dhp> $$1) {
      for (aro $$2 : this.l) {
         if ($$2.dV().aj() == $$1) {
            $$2.f.b($$0);
         }
      }
   }

   public void a(cqi $$0, wv $$1) {
      feb $$2 = $$0.cr();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aro $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cqi $$0, wv $$1) {
      feb $$2 = $$0.cr();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aro $$4 = this.l.get($$3);
            if ($$4.cr() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gh().getName();
      }

      return $$0;
   }

   public avt f() {
      return this.n;
   }

   public avk g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new avp($$0, this.k.k(), this.p.a($$0)));
      aro $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aro $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(aro $$0, int $$1) {
      if ($$0.f != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.f.b(new acu($$0, $$2));
      }

      this.k.aG().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.aZ().m() || this.y;
   }

   @Nullable
   public aro a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aro $$3 = this.l.get($$2);
         if ($$3.gh().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cqi $$0, double $$1, double $$2, double $$3, double $$4, alc<dhp> $$5, zc<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aro $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dV().aj() == $$5) {
            double $$9 = $$1 - $$8.dA();
            double $$10 = $$2 - $$8.dC();
            double $$11 = $$3 - $$8.dG();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.f.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public avv i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public avo k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aro $$0, arn $$1) {
      eae $$2 = this.k.J().A_();
      $$0.f.b(new adb($$2));
      $$0.f.b(new afo($$1.ae(), $$1.af(), $$1.O().c(dhl.l)));
      $$0.f.b(new aey($$1.aa(), $$1.ab()));
      if ($$1.ah()) {
         $$0.f.b(new acy(acy.c, 0.0F));
         $$0.f.b(new acy(acy.i, $$1.d(1.0F)));
         $$0.f.b(new acy(acy.j, $$1.b(1.0F)));
      }

      $$0.f.b(new acy(acy.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(aro $$0) {
      $$0.bO.b();
      $$0.v();
      $$0.f.b(new afg($$0.gi().j));
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

   public List<aro> b(String $$0) {
      List<aro> $$1 = Lists.newArrayList();

      for (aro $$2 : this.l) {
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
   public tw r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).f.a(wv.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wv $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wv $$0, Function<aro, wv> $$1, boolean $$2) {
      this.k.a($$0);

      for (aro $$3 : this.l) {
         wv $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xl $$0, ex $$1, wr.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xl $$0, aro $$1, wr.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xl $$0, Predicate<aro> $$1, @Nullable aro $$2, wr.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xk $$5 = xk.a($$0);
      boolean $$6 = false;

      for (aro $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xl $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awq a(cqi $$0) {
      UUID $$1 = $$0.cG();
      awq $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ewx.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.al().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awq(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public all g(aro $$0) {
      UUID $$1 = $$0.cG();
      all $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ewx.a).resolve($$1 + ".json");
         $$2 = new all(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aew($$0));

      for (arn $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afm($$0));

      for (arn $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().b($$0);
         }
      }
   }

   public List<aro> t() {
      return this.l;
   }

   @Nullable
   public aro a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (all $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new zt(axr.a(this.v)));
      dcs $$1 = this.k.aI();
      agg $$2 = new agg($$1.b(), $$1.d());

      for (aro $$3 : this.l) {
         $$3.f.b($$2);
         $$3.J().a($$3);
      }
   }

   public boolean v() {
      return this.y;
   }
}
