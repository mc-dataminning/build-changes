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

public abstract class avq {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final wy e = wy.c("chat.filtered_full");
   public static final wy f = wy.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<arr> l = Lists.newArrayList();
   private final Map<UUID, arr> m = Maps.newHashMap();
   private final avw n = new avw(a);
   private final avn o = new avn(b);
   private final avr p = new avr(c);
   private final avy q = new avy(d);
   private final Map<UUID, awt> r = Maps.newHashMap();
   private final Map<UUID, alo> s = Maps.newHashMap();
   private final ezk t;
   private boolean u;
   private final jm<alp> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public avq(MinecraftServer $$0, jm<alp> $$1, ezk $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(vr $$0, arr $$1, asg $$2) {
      GameProfile $$3 = $$1.gh();
      avm $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<tz> $$8 = this.a($$1);
      alf<djm> $$9 = $$8.<alf<djm>>flatMap($$0x -> eeq.a(new Dynamic(un.a, $$0x.a("Dimension"))).resultOrPartial(h::error)).orElse(djm.i);
      arq $$10 = this.k.a($$9);
      arq $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.J();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bl());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ai().getString(), $$13, $$1.ao(), $$1.dz(), $$1.dB(), $$1.dF()});
      ezd $$14 = $$11.y_();
      $$1.c($$8.orElse(null));
      ast $$15 = new ast(this.k, $$0, $$1, $$2);
      $$0.a(ago.a.a(wj.a(this.k.ba())), $$15);
      dji $$16 = $$11.O();
      boolean $$17 = $$16.c(dji.F);
      boolean $$18 = $$16.c(dji.r);
      boolean $$19 = $$16.c(dji.y);
      $$15.b(new adl($$1.ao(), $$14.l(), this.k.K(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aA()));
      $$15.b(new acg($$14.q(), $$14.r()));
      $$15.b(new adv($$1.gj()));
      $$15.b(new afj($$1.gi().f()));
      del $$20 = this.k.aI();
      $$15.b(new agj($$20.b(), $$20.c()));
      this.e($$1);
      $$1.I().c();
      $$1.J().a($$1);
      this.a($$11.g(), $$1);
      this.k.av();
      xm $$21;
      if ($$1.gh().getName().equalsIgnoreCase($$6)) {
         $$21 = wy.a("multiplayer.player.joined", $$1.m_());
      } else {
         $$21 = wy.a("multiplayer.player.joined.renamed", $$1.m_(), $$6);
      }

      this.a($$21.a(o.o), false);
      $$15.a($$1.dz(), $$1.dB(), $$1.dF(), $$1.dK(), $$1.dM());
      akd $$23 = this.k.au();
      if ($$23 != null && !$$2.d()) {
         $$1.a($$23);
      }

      $$1.f.b(aeb.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cF(), $$1);
      this.a(aeb.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.a($$1);
      this.k.aM().a($$1);
      this.d($$1);
      $$1.b($$8);
      $$1.a($$8);
      $$1.d();
   }

   protected void a(alz $$0, arr $$1) {
      Set<ffz> $$2 = Sets.newHashSet();

      for (fgc $$3 : $$0.f()) {
         $$1.f.b(afn.a($$3, true));
      }

      for (ffy $$4 : ffy.values()) {
         ffz $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zf<?> $$7 : $$0.d($$5)) {
               $$1.f.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(arq $$0) {
      $$0.A_().a(new ecj() {
         @Override
         public void a(ecl $$0, double $$1) {
            avq.this.a(new aeu($$0));
         }

         @Override
         public void a(ecl $$0, double $$1, double $$2, long $$3) {
            avq.this.a(new aet($$0));
         }

         @Override
         public void a(ecl $$0, double $$1, double $$2) {
            avq.this.a(new aes($$0));
         }

         @Override
         public void a(ecl $$0, int $$1) {
            avq.this.a(new aev($$0));
         }

         @Override
         public void b(ecl $$0, int $$1) {
            avq.this.a(new aew($$0));
         }

         @Override
         public void b(ecl $$0, double $$1) {
         }

         @Override
         public void c(ecl $$0, double $$1) {
         }
      });
   }

   public Optional<tz> a(arr $$0) {
      tz $$1 = this.k.aZ().w();
      Optional<tz> $$2;
      if (this.k.a($$0.gh()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(arr $$0) {
      this.t.a($$0);
      awt $$1 = this.r.get($$0.cF());
      if ($$1 != null) {
         $$1.a();
      }

      alo $$2 = this.s.get($$0.cF());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(arr $$0) {
      arq $$1 = $$0.y();
      $$0.a(awx.j);
      this.b($$0);
      if ($$0.bX()) {
         bwi $$2 = $$0.de();
         if ($$2.dd()) {
            h.debug("Removing player mount");
            $$0.bN();
            $$2.da().forEach($$0x -> $$0x.c(bwi.d.d));
         }
      }

      $$0.al();

      for (csr $$3 : $$0.ah()) {
         $$3.c(bwi.d.d);
      }

      $$1.a($$0, bwi.d.d);
      $$0.S().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$4 = $$0.cF();
      arr $$5 = this.m.get($$4);
      if ($$5 == $$0) {
         this.m.remove($$4);
         this.r.remove($$4);
         this.s.remove($$4);
      }

      this.a(new aea(List.of($$0.cF())));
   }

   @Nullable
   public wy a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avx $$2 = this.n.b($$1);
         xm $$3 = wy.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(wy.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return wy.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         avo $$4 = this.o.b($$0);
         xm $$5 = wy.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(wy.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? wy.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public arr a(GameProfile $$0, ara $$1) {
      return new arr(this.k, this.k.J(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<arr> $$2 = Sets.newIdentityHashSet();

      for (arr $$3 : this.l) {
         if ($$3.cF().equals($$1)) {
            $$2.add($$3);
         }
      }

      arr $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (arr $$5 : $$2) {
         $$5.f.a(f);
      }

      return !$$2.isEmpty();
   }

   public arr a(arr $$0, boolean $$1, bwi.d $$2) {
      this.l.remove($$0);
      $$0.y().a($$0, $$2);
      eya $$3 = $$0.a(!$$1, eya.a);
      arq $$4 = $$3.b();
      arr $$5 = new arr(this.k, $$4, $$0.gh(), $$0.C());
      $$5.f = $$0.f;
      $$5.a($$0, $$1);
      $$5.e($$0.ao());
      $$5.b($$0.fx());
      if (!$$3.g()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.ap()) {
         $$5.a($$6);
      }

      ffc $$7 = $$3.c();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.e(), $$3.f());
      if ($$3.g()) {
         $$5.f.b(new adb(adb.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      arq $$9 = $$5.y();
      ezd $$10 = $$9.y_();
      $$5.f.b(new aem($$5.b($$9), $$8));
      $$5.f.a($$5.dz(), $$5.dB(), $$5.dF(), $$5.dK(), $$5.dM());
      $$5.f.b(new afb($$4.aa(), $$4.ab()));
      $$5.f.b(new acg($$10.q(), $$10.r()));
      $$5.f.b(new afh($$5.ch, $$5.cg, $$5.cf));
      this.d($$5);
      this.a($$5, $$4);
      this.e($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cF(), $$5);
      $$5.d();
      $$5.d($$5.eF());
      arr.a $$11 = $$5.T();
      if (!$$1 && $$11 != null) {
         arq $$12 = this.k.a($$11.a());
         if ($$12 != null) {
            iv $$13 = $$11.b();
            eat $$14 = $$12.a_($$13);
            if ($$14.a(dmt.pT)) {
               $$5.f.b(new afv(awn.wm, awo.e, (double)$$13.u(), (double)$$13.v(), (double)$$13.w(), 1.0F, 1.0F, $$4.C_().g()));
            }
         }
      }

      return $$5;
   }

   public void d(arr $$0) {
      this.a($$0, $$0.f);
   }

   public void a(bxj $$0, ast $$1) {
      for (bvm $$2 : $$0.eC()) {
         $$1.b(new agi($$0.ao(), $$2, false));
      }
   }

   public void e(arr $$0) {
      GameProfile $$1 = $$0.gh();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aeb(EnumSet.of(aeb.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zf<?> $$0) {
      for (arr $$1 : this.l) {
         $$1.f.b($$0);
      }
   }

   public void a(zf<?> $$0, alf<djm> $$1) {
      for (arr $$2 : this.l) {
         if ($$2.dU().aj() == $$1) {
            $$2.f.b($$0);
         }
      }
   }

   public void a(crm $$0, wy $$1) {
      fgj $$2 = $$0.cp();
      if ($$2 != null) {
         for (String $$4 : $$2.h()) {
            arr $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(crm $$0, wy $$1) {
      fgj $$2 = $$0.cp();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            arr $$4 = this.l.get($$3);
            if ($$4.cp() != $$2) {
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

   public avw f() {
      return this.n;
   }

   public avn g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new avs($$0, this.k.k(), this.p.a($$0)));
      arr $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      arr $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(arr $$0, int $$1) {
      if ($$0.f != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.f.b(new acx($$0, $$2));
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
   public arr a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         arr $$3 = this.l.get($$2);
         if ($$3.gh().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable crm $$0, double $$1, double $$2, double $$3, double $$4, alf<djm> $$5, zf<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         arr $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dU().aj() == $$5) {
            double $$9 = $$1 - $$8.dz();
            double $$10 = $$2 - $$8.dB();
            double $$11 = $$3 - $$8.dF();
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

   public avy i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public avr k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(arr $$0, arq $$1) {
      ecl $$2 = this.k.J().A_();
      $$0.f.b(new ade($$2));
      $$0.f.b(new afr($$1.ae(), $$1.af(), $$1.O().c(dji.m)));
      $$0.f.b(new afb($$1.aa(), $$1.ab()));
      if ($$1.ah()) {
         $$0.f.b(new adb(adb.c, 0.0F));
         $$0.f.b(new adb(adb.i, $$1.d(1.0F)));
         $$0.f.b(new adb(adb.j, $$1.b(1.0F)));
      }

      $$0.f.b(new adb(adb.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void f(arr $$0) {
      $$0.bQ.b();
      $$0.v();
      $$0.f.b(new afj($$0.gi().f()));
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

   public List<arr> b(String $$0) {
      List<arr> $$1 = Lists.newArrayList();

      for (arr $$2 : this.l) {
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
         this.l.get($$0).f.a(wy.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(wy $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(wy $$0, Function<arr, wy> $$1, boolean $$2) {
      this.k.a($$0);

      for (arr $$3 : this.l) {
         wy $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xo $$0, ej $$1, wu.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xo $$0, arr $$1, wu.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(xo $$0, Predicate<arr> $$1, @Nullable arr $$2, wu.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xn $$5 = xn.a($$0);
      boolean $$6 = false;

      for (arr $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(xo $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awt a(crm $$0) {
      UUID $$1 = $$0.cF();
      awt $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ezf.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ai().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (w.a($$6) && w.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awt(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alo g(arr $$0) {
      UUID $$1 = $$0.cF();
      alo $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ezf.a).resolve($$1 + ".json");
         $$2 = new alo(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aez($$0));

      for (arq $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afp($$0));

      for (arq $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.m().b($$0);
         }
      }
   }

   public List<arr> t() {
      return this.l;
   }

   @Nullable
   public arr a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (alo $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new zw(axt.a(this.v)));
      del $$1 = this.k.aI();
      agj $$2 = new agj($$1.b(), $$1.c());

      for (arr $$3 : this.l) {
         $$3.f.b($$2);
         $$3.J().a($$3);
      }
   }

   public boolean v() {
      return this.y;
   }
}
