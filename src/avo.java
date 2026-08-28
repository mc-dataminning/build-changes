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

public abstract class avo {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final xi e = xi.c("chat.filtered_full");
   public static final xi f = xi.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aro> l = Lists.newArrayList();
   private final Map<UUID, aro> m = Maps.newHashMap();
   private final avu n = new avu(a);
   private final avl o = new avl(b);
   private final avp p = new avp(c);
   private final avw q = new avw(d);
   private final Map<UUID, awr> r = Maps.newHashMap();
   private final Map<UUID, alq> s = Maps.newHashMap();
   private final ett t;
   private boolean u;
   private final jx<alr> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public avo(MinecraftServer $$0, jx<alr> $$1, ett $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(wc $$0, aro $$1, asd $$2) {
      GameProfile $$3 = $$1.gj();
      avk $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<uk> $$8 = this.a($$1);
      alh<dfb> $$9 = $$8.<alh<dfb>>flatMap($$0x -> dzf.a(new Dynamic(uy.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dfb.i);
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
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.am().getString(), $$13, $$1.as(), $$1.dC(), $$1.dE(), $$1.dI()});
      etm $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      asq $$15 = new asq(this.k, $$0, $$1, $$2);
      $$0.a(agu.a.a(wt.a(this.k.ba())), $$15);
      dex $$16 = $$11.ac();
      boolean $$17 = $$16.b(dex.D);
      boolean $$18 = $$16.b(dex.q);
      boolean $$19 = $$16.b(dex.w);
      $$15.b(new adv($$1.as(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new acr($$14.q(), $$14.r()));
      $$15.b(new aef($$1.gl()));
      $$15.b(new afq($$1.gk().j));
      $$15.b(new agp(this.k.aI().e()));
      this.e($$1);
      $$1.J().c();
      $$1.K().a($$1);
      this.a($$11.f(), $$1);
      this.k.av();
      xw $$20;
      if ($$1.gj().getName().equalsIgnoreCase($$6)) {
         $$20 = xi.a("multiplayer.player.joined", $$1.S_());
      } else {
         $$20 = xi.a("multiplayer.player.joined.renamed", $$1.S_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dC(), $$1.dE(), $$1.dI(), $$1.dN(), $$1.dP());
      akf $$22 = this.k.au();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.g.b(ael.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cH(), $$1);
      this.a(ael.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      $$1.b($$8);
      $$1.a($$8);
      $$1.h();
   }

   protected void a(amb $$0, aro $$1) {
      Set<fak> $$2 = Sets.newHashSet();

      for (fan $$3 : $$0.g()) {
         $$1.g.b(afu.a($$3, true));
      }

      for (faj $$4 : faj.values()) {
         fak $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zp<?> $$7 : $$0.d($$5)) {
               $$1.g.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(arn $$0) {
      $$0.C_().a(new dwy() {
         @Override
         public void a(dxa $$0, double $$1) {
            avo.this.a(new afb($$0));
         }

         @Override
         public void a(dxa $$0, double $$1, double $$2, long $$3) {
            avo.this.a(new afa($$0));
         }

         @Override
         public void a(dxa $$0, double $$1, double $$2) {
            avo.this.a(new aez($$0));
         }

         @Override
         public void a(dxa $$0, int $$1) {
            avo.this.a(new afc($$0));
         }

         @Override
         public void b(dxa $$0, int $$1) {
            avo.this.a(new afd($$0));
         }

         @Override
         public void b(dxa $$0, double $$1) {
         }

         @Override
         public void c(dxa $$0, double $$1) {
         }
      });
   }

   public Optional<uk> a(aro $$0) {
      uk $$1 = this.k.aZ().w();
      Optional<uk> $$2;
      if (this.k.a($$0.gj()) && $$1 != null) {
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
      awr $$1 = this.r.get($$0.cH());
      if ($$1 != null) {
         $$1.a();
      }

      alq $$2 = this.s.get($$0.cH());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aro $$0) {
      arn $$1 = $$0.B();
      $$0.a(awv.j);
      this.b($$0);
      if ($$0.ca()) {
         bue $$2 = $$0.dh();
         if ($$2.dg()) {
            h.debug("Removing player mount");
            $$0.af();
            $$2.dd().forEach($$0x -> $$0x.b(bue.c.d));
         }
      }

      $$0.ap();

      for (cpq $$3 : $$0.al()) {
         $$3.b(bue.c.d);
      }

      $$1.a($$0, bue.c.d);
      $$0.T().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$4 = $$0.cH();
      aro $$5 = this.m.get($$4);
      if ($$5 == $$0) {
         this.m.remove($$4);
         this.r.remove($$4);
         this.s.remove($$4);
      }

      this.a(new aek(List.of($$0.cH())));
   }

   @Nullable
   public xi a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avv $$2 = this.n.b($$1);
         xw $$3 = xi.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(xi.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xi.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         avm $$4 = this.o.b($$0);
         xw $$5 = xi.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(xi.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? xi.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aro a(GameProfile $$0, aqz $$1) {
      return new aro(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aro> $$2 = Sets.newIdentityHashSet();

      for (aro $$3 : this.l) {
         if ($$3.cH().equals($$1)) {
            $$2.add($$3);
         }
      }

      aro $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aro $$5 : $$2) {
         $$5.g.a(f);
      }

      return !$$2.isEmpty();
   }

   public aro a(aro $$0, boolean $$1, bue.c $$2) {
      this.l.remove($$0);
      $$0.B().a($$0, $$2);
      esi $$3 = $$0.a(!$$1, esi.a);
      arn $$4 = $$3.a();
      aro $$5 = new aro(this.k, $$4, $$0.gj(), $$0.D());
      $$5.g = $$0.g;
      $$5.a($$0, $$1);
      $$5.e($$0.as());
      $$5.b($$0.fA());
      if (!$$3.f()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.at()) {
         $$5.a($$6);
      }

      ezn $$7 = $$3.b();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.d(), $$3.e());
      if ($$3.f()) {
         $$5.g.b(new adl(adl.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      arn $$9 = $$5.B();
      etm $$10 = $$9.A_();
      $$5.g.b(new aet($$5.b($$9), $$8));
      $$5.g.a($$5.dC(), $$5.dE(), $$5.dI(), $$5.dN(), $$5.dP());
      $$5.g.b(new afi($$4.W(), $$4.X()));
      $$5.g.b(new acr($$10.q(), $$10.r()));
      $$5.g.b(new afo($$5.cs, $$5.cr, $$5.cq));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cH(), $$5);
      $$5.h();
      $$5.x($$5.eG());
      jh $$11 = $$5.U();
      arn $$12 = this.k.a($$5.W());
      if (!$$1 && $$11 != null && $$12 != null) {
         dvj $$13 = $$12.a_($$11);
         if ($$13.a(dig.pl)) {
            $$5.g.b(new agc(awl.vx, awm.e, (double)$$11.u(), (double)$$11.v(), (double)$$11.w(), 1.0F, 1.0F, $$4.E_().g()));
         }
      }

      return $$5;
   }

   public void d(aro $$0) {
      this.a($$0, $$0.g);
   }

   public void a(bva $$0, asq $$1) {
      for (btj $$2 : $$0.eD()) {
         $$1.b(new ago($$0.as(), $$2, false));
      }
   }

   public void e(aro $$0) {
      GameProfile $$1 = $$0.gj();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new ael(EnumSet.of(ael.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zp<?> $$0) {
      for (aro $$1 : this.l) {
         $$1.g.b($$0);
      }
   }

   public void a(zp<?> $$0, alh<dfb> $$1) {
      for (aro $$2 : this.l) {
         if ($$2.dX().ag() == $$1) {
            $$2.g.b($$0);
         }
      }
   }

   public void a(com $$0, xi $$1) {
      fau $$2 = $$0.cs();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aro $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(com $$0, xi $$1) {
      fau $$2 = $$0.cs();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aro $$4 = this.l.get($$3);
            if ($$4.cs() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gj().getName();
      }

      return $$0;
   }

   public avu f() {
      return this.n;
   }

   public avl g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new avq($$0, this.k.k(), this.p.a($$0)));
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
      if ($$0.g != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.g.b(new adi($$0, $$2));
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
         if ($$3.gj().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable com $$0, double $$1, double $$2, double $$3, double $$4, alh<dfb> $$5, zp<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aro $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dX().ag() == $$5) {
            double $$9 = $$1 - $$8.dC();
            double $$10 = $$2 - $$8.dE();
            double $$11 = $$3 - $$8.dI();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.g.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public avw i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public avp k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aro $$0, arn $$1) {
      dxa $$2 = this.k.J().C_();
      $$0.g.b(new ado($$2));
      $$0.g.b(new afy($$1.aa(), $$1.ab(), $$1.ac().b(dex.l)));
      $$0.g.b(new afi($$1.W(), $$1.X()));
      if ($$1.ae()) {
         $$0.g.b(new adl(adl.c, 0.0F));
         $$0.g.b(new adl(adl.i, $$1.d(1.0F)));
         $$0.g.b(new adl(adl.j, $$1.b(1.0F)));
      }

      $$0.g.b(new adl(adl.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(aro $$0) {
      $$0.cc.b();
      $$0.y();
      $$0.g.b(new afq($$0.gk().j));
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
         if ($$2.C().equals($$0)) {
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
   public uk r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).g.a(xi.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xi $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xi $$0, Function<aro, xi> $$1, boolean $$2) {
      this.k.a($$0);

      for (aro $$3 : this.l) {
         xi $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xy $$0, ew $$1, xe.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xy $$0, aro $$1, xe.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xy $$0, Predicate<aro> $$1, @Nullable aro $$2, xe.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xx $$5 = xx.a($$0);
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

   private boolean a(xy $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awr a(com $$0) {
      UUID $$1 = $$0.cH();
      awr $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eto.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.am().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awr(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alq g(aro $$0) {
      UUID $$1 = $$0.cH();
      alq $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eto.a).resolve($$1 + ".json");
         $$2 = new alq(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new afg($$0));

      for (arn $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afw($$0));

      for (arn $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.l().b($$0);
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
      for (alq $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new aag(axs.a(this.v)));
      agp $$1 = new agp(this.k.aI().e());

      for (aro $$2 : this.l) {
         $$2.g.b($$1);
         $$2.K().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
