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

public abstract class avs {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final xa e = xa.c("chat.filtered_full");
   public static final xa f = xa.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<art> l = Lists.newArrayList();
   private final Map<UUID, art> m = Maps.newHashMap();
   private final avy n = new avy(a);
   private final avp o = new avp(b);
   private final avt p = new avt(c);
   private final awa q = new awa(d);
   private final Map<UUID, awv> r = Maps.newHashMap();
   private final Map<UUID, alq> s = Maps.newHashMap();
   private final ezy t;
   private boolean u;
   private final jm<alr> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public avs(MinecraftServer $$0, jm<alr> $$1, ezy $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vt $$0, art $$1, asi $$2) {
      GameProfile $$3 = $$1.gi();
      avo $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<tz> $$8 = this.a($$1);
      alh<djx> $$9 = $$8.<alh<djx>>flatMap($$0x -> efb.a(new Dynamic(un.a, $$0x.a("Dimension"))).resultOrPartial(h::error)).orElse(djx.i);
      ars $$10 = this.k.a($$9);
      ars $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bl());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ai().getString(), $$13, $$1.ao(), $$1.dA(), $$1.dC(), $$1.dG()});
      ezr $$14 = $$11.C_();
      $$1.e($$8.orElse(null));
      asv $$15 = new asv(this.k, $$0, $$1, $$2);
      $$0.a(agq.a.a(wl.a(this.k.ba())), $$15);
      djt $$16 = $$11.O();
      boolean $$17 = $$16.c(djt.F);
      boolean $$18 = $$16.c(djt.r);
      boolean $$19 = $$16.c(djt.y);
      $$15.b(new adn($$1.ao(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new aci($$14.q(), $$14.r()));
      $$15.b(new adx($$1.gk()));
      $$15.b(new afl($$1.gj().f()));
      dew $$20 = this.k.aI();
      $$15.b(new agl($$20.b(), $$20.c()));
      this.e($$1);
      $$1.I().c();
      $$1.J().a($$1);
      this.a($$11.g(), $$1);
      this.k.av();
      xo $$21;
      if ($$1.gi().getName().equalsIgnoreCase($$6)) {
         $$21 = xa.a("multiplayer.player.joined", $$1.m_());
      } else {
         $$21 = xa.a("multiplayer.player.joined.renamed", $$1.m_(), $$6);
      }

      this.a($$21.a(o.o), false);
      $$15.a($$1.dA(), $$1.dC(), $$1.dG(), $$1.dL(), $$1.dN());
      akf $$23 = this.k.au();
      if ($$23 != null && !$$2.d()) {
         $$1.a($$23);
      }

      $$1.f.b(aed.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cG(), $$1);
      this.a(aed.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      $$8.ifPresent($$1x -> {
         $$1.d($$1x);
         $$1.c($$1x);
      });
      $$1.d();
   }

   protected void a(amb $$0, art $$1) {
      Set<fgn> $$2 = Sets.newHashSet();

      for (fgq $$3 : $$0.f()) {
         $$1.f.b(afp.a($$3, true));
      }

      for (fgm $$4 : fgm.values()) {
         fgn $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zh<?> $$7 : $$0.d($$5)) {
               $$1.f.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(ars $$0) {
      $$0.E_().a(new ecu() {
         @Override
         public void a(ecw $$0, double $$1) {
            avs.this.a(new aew($$0));
         }

         @Override
         public void a(ecw $$0, double $$1, double $$2, long $$3) {
            avs.this.a(new aev($$0));
         }

         @Override
         public void a(ecw $$0, double $$1, double $$2) {
            avs.this.a(new aeu($$0));
         }

         @Override
         public void a(ecw $$0, int $$1) {
            avs.this.a(new aex($$0));
         }

         @Override
         public void b(ecw $$0, int $$1) {
            avs.this.a(new aey($$0));
         }

         @Override
         public void b(ecw $$0, double $$1) {
         }

         @Override
         public void c(ecw $$0, double $$1) {
         }
      });
   }

   public Optional<tz> a(art $$0) {
      tz $$1 = this.k.aZ().w();
      Optional<tz> $$2;
      if (this.k.a($$0.gi()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.i($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(art $$0) {
      this.t.a($$0);
      awv $$1 = this.r.get($$0.cG());
      if ($$1 != null) {
         $$1.a();
      }

      alq $$2 = this.s.get($$0.cG());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(art $$0) {
      ars $$1 = $$0.y();
      $$0.a(awz.j);
      this.b($$0);
      if ($$0.bY()) {
         bwt $$2 = $$0.df();
         if ($$2.de()) {
            h.debug("Removing player mount");
            $$0.bO();
            $$2.db().forEach($$0x -> $$0x.c(bwt.d.d));
         }
      }

      $$0.al();

      for (ctc $$3 : $$0.ah()) {
         $$3.c(bwt.d.d);
      }

      $$1.a($$0, bwt.d.d);
      $$0.S().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$4 = $$0.cG();
      art $$5 = this.m.get($$4);
      if ($$5 == $$0) {
         this.m.remove($$4);
         this.r.remove($$4);
         this.s.remove($$4);
      }

      this.a(new aec(List.of($$0.cG())));
   }

   @Nullable
   public xa a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avz $$2 = this.n.b($$1);
         xo $$3 = xa.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(xa.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xa.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         avq $$4 = this.o.b($$0);
         xo $$5 = xa.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(xa.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? xa.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public art a(GameProfile $$0, arc $$1) {
      return new art(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<art> $$2 = Sets.newIdentityHashSet();

      for (art $$3 : this.l) {
         if ($$3.cG().equals($$1)) {
            $$2.add($$3);
         }
      }

      art $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (art $$5 : $$2) {
         $$5.f.a(f);
      }

      return !$$2.isEmpty();
   }

   public art a(art $$0, boolean $$1, bwt.d $$2) {
      this.l.remove($$0);
      $$0.y().a($$0, $$2);
      eyo $$3 = $$0.a(!$$1, eyo.a);
      ars $$4 = $$3.b();
      art $$5 = new art(this.k, $$4, $$0.gi(), $$0.C());
      $$5.f = $$0.f;
      $$5.a($$0, $$1);
      $$5.e($$0.ao());
      $$5.b($$0.fy());
      if (!$$3.g()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.ap()) {
         $$5.a($$6);
      }

      ffq $$7 = $$3.c();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.e(), $$3.f());
      if ($$3.g()) {
         $$5.f.b(new add(add.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      ars $$9 = $$5.y();
      ezr $$10 = $$9.C_();
      $$5.f.b(new aeo($$5.b($$9), $$8));
      $$5.f.a($$5.dA(), $$5.dC(), $$5.dG(), $$5.dL(), $$5.dN());
      $$5.f.b(new afd($$4.aa(), $$4.ab()));
      $$5.f.b(new aci($$10.q(), $$10.r()));
      $$5.f.b(new afj($$5.ch, $$5.cg, $$5.cf));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cG(), $$5);
      $$5.d();
      $$5.d($$5.eG());
      art.a $$11 = $$5.T();
      if (!$$1 && $$11 != null) {
         ars $$12 = this.k.a($$11.a());
         if ($$12 != null) {
            iv $$13 = $$11.b();
            ebe $$14 = $$12.a_($$13);
            if ($$14.a(dne.pT)) {
               $$5.f.b(new afx(awp.wm, awq.e, (double)$$13.u(), (double)$$13.v(), (double)$$13.w(), 1.0F, 1.0F, $$4.G_().g()));
            }
         }
      }

      return $$5;
   }

   public void d(art $$0) {
      this.a($$0, $$0.f);
   }

   public void a(bxu $$0, asv $$1) {
      for (bvx $$2 : $$0.eD()) {
         $$1.b(new agk($$0.ao(), $$2, false));
      }
   }

   public void e(art $$0) {
      GameProfile $$1 = $$0.gi();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aed(EnumSet.of(aed.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zh<?> $$0) {
      for (art $$1 : this.l) {
         $$1.f.b($$0);
      }
   }

   public void a(zh<?> $$0, alh<djx> $$1) {
      for (art $$2 : this.l) {
         if ($$2.dV().aj() == $$1) {
            $$2.f.b($$0);
         }
      }
   }

   public void a(crx $$0, xa $$1) {
      fgx $$2 = $$0.cq();
      if ($$2 != null) {
         for (String $$4 : $$2.h()) {
            art $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(crx $$0, xa $$1) {
      fgx $$2 = $$0.cq();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            art $$4 = this.l.get($$3);
            if ($$4.cq() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gi().getName();
      }

      return $$0;
   }

   public avy f() {
      return this.n;
   }

   public avp g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new avu($$0, this.k.k(), this.p.a($$0)));
      art $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      art $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(art $$0, int $$1) {
      if ($$0.f != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.f.b(new acz($$0, $$2));
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
   public art a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         art $$3 = this.l.get($$2);
         if ($$3.gi().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable crx $$0, double $$1, double $$2, double $$3, double $$4, alh<djx> $$5, zh<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         art $$8 = this.l.get($$7);
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

   public awa i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public avt k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(art $$0, ars $$1) {
      ecw $$2 = this.k.J().E_();
      $$0.f.b(new adg($$2));
      $$0.f.b(new aft($$1.ae(), $$1.af(), $$1.O().c(djt.m)));
      $$0.f.b(new afd($$1.aa(), $$1.ab()));
      if ($$1.ah()) {
         $$0.f.b(new add(add.c, 0.0F));
         $$0.f.b(new add(add.i, $$1.d(1.0F)));
         $$0.f.b(new add(add.j, $$1.b(1.0F)));
      }

      $$0.f.b(new add(add.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(art $$0) {
      $$0.bQ.b();
      $$0.v();
      $$0.f.b(new afl($$0.gj().f()));
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

   public List<art> b(String $$0) {
      List<art> $$1 = Lists.newArrayList();

      for (art $$2 : this.l) {
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
   public tz r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).f.a(xa.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xa $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xa $$0, Function<art, xa> $$1, boolean $$2) {
      this.k.a($$0);

      for (art $$3 : this.l) {
         xa $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xq $$0, ej $$1, ww.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xq $$0, art $$1, ww.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xq $$0, Predicate<art> $$1, @Nullable art $$2, ww.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xp $$5 = xp.a($$0);
      boolean $$6 = false;

      for (art $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xq $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awv a(crx $$0) {
      UUID $$1 = $$0.cG();
      awv $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ezt.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ai().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (w.a($$6) && w.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awv(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alq g(art $$0) {
      UUID $$1 = $$0.cG();
      alq $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ezt.a).resolve($$1 + ".json");
         $$2 = new alq(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new afb($$0));

      for (ars $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afr($$0));

      for (ars $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().b($$0);
         }
      }
   }

   public List<art> t() {
      return this.l;
   }

   @Nullable
   public art a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (alq $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new zy(axv.a(this.v)));
      dew $$1 = this.k.aI();
      agl $$2 = new agl($$1.b(), $$1.c());

      for (art $$3 : this.l) {
         $$3.f.b($$2);
         $$3.J().a($$3);
      }
   }

   public boolean v() {
      return this.y;
   }
}
