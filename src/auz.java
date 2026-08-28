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

public abstract class auz {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final xl e = xl.c("chat.filtered_full");
   public static final xl f = xl.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<arc> l = Lists.newArrayList();
   private final Map<UUID, arc> m = Maps.newHashMap();
   private final avf n = new avf(a);
   private final auv o = new auv(b);
   private final ava p = new ava(c);
   private final avh q = new avh(d);
   private final Map<UUID, awc> r = Maps.newHashMap();
   private final Map<UUID, alj> s = Maps.newHashMap();
   private final epu t;
   private boolean u;
   private final jp<alk> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public auz(MinecraftServer $$0, jp<alk> $$1, epu $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(wj $$0, arc $$1, arq $$2) {
      GameProfile $$3 = $$1.gb();
      auu $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ur> $$8 = this.a($$1);
      ala<dbt> $$9 = $$8.<ala<dbt>>flatMap($$0x -> dvp.a(new Dynamic(vf.a, $$0x.c("Dimension"))).resultOrPartial(h::error)).orElse(dbt.h);
      arb $$10 = this.k.a($$9);
      arb $$11;
      if ($$10 == null) {
         h.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bn());
      h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.af().getString(), $$13, $$1.al(), $$1.du(), $$1.dw(), $$1.dA()});
      epn $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      asb $$15 = new asb(this.k, $$0, $$1, $$2);
      $$0.a(agr.a.bind(ww.a(this.k.bc())), $$15);
      dbp $$16 = $$11.ab();
      boolean $$17 = $$16.b(dbp.D);
      boolean $$18 = $$16.b(dbp.q);
      boolean $$19 = $$16.b(dbp.w);
      $$15.b(new adv($$1.al(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11), this.k.aB()));
      $$15.b(new acr($$14.q(), $$14.r()));
      $$15.b(new aee($$1.gd()));
      $$15.b(new afe($$1.gc().k));
      $$15.b(new agm(this.k.aJ().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.aw();
      xz $$20;
      if ($$1.gb().getName().equalsIgnoreCase($$6)) {
         $$20 = xl.a("multiplayer.player.joined", $$1.O_());
      } else {
         $$20 = xl.a("multiplayer.player.joined.renamed", $$1.O_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.du(), $$1.dw(), $$1.dA(), $$1.dF(), $$1.dH());
      aka $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.c.b(aek.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cz(), $$1);
      this.a(aek.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aN().a($$1);

      for (brx $$23 : $$1.ex()) {
         $$15.b(new agl($$1.al(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         ur $$24 = $$8.get().p("RootVehicle");
         bsp $$25 = bsv.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cz().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (bsp $$28 : $$25.cW()) {
                  if ($$28.cz().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bR()) {
               h.warn("Couldn't reattach entity to player");
               $$25.ao();

               for (bsp $$29 : $$25.cW()) {
                  $$29.ao();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(alt $$0, arc $$1) {
      Set<ewi> $$2 = Sets.newHashSet();

      for (ewl $$3 : $$0.g()) {
         $$1.c.b(afr.a($$3, true));
      }

      for (ewh $$4 : ewh.values()) {
         ewi $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zs<?> $$7 : $$0.d($$5)) {
               $$1.c.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(arb $$0) {
      $$0.C_().a(new dtm() {
         @Override
         public void a(dto $$0, double $$1) {
            auz.this.a(new afa($$0));
         }

         @Override
         public void a(dto $$0, double $$1, double $$2, long $$3) {
            auz.this.a(new aez($$0));
         }

         @Override
         public void a(dto $$0, double $$1, double $$2) {
            auz.this.a(new aey($$0));
         }

         @Override
         public void a(dto $$0, int $$1) {
            auz.this.a(new afb($$0));
         }

         @Override
         public void b(dto $$0, int $$1) {
            auz.this.a(new afc($$0));
         }

         @Override
         public void b(dto $$0, double $$1) {
         }

         @Override
         public void c(dto $$0, double $$1) {
         }
      });
   }

   public Optional<ur> a(arc $$0) {
      ur $$1 = this.k.bb().w();
      Optional<ur> $$2;
      if (this.k.a($$0.gb()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         h.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(arc $$0) {
      this.t.a($$0);
      awc $$1 = this.r.get($$0.cz());
      if ($$1 != null) {
         $$1.a();
      }

      alj $$2 = this.s.get($$0.cz());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(arc $$0) {
      arb $$1 = $$0.z();
      $$0.a(awg.j);
      this.b($$0);
      if ($$0.bR()) {
         bsp $$2 = $$0.cZ();
         if ($$2.cY()) {
            h.debug("Removing player mount");
            $$0.ac();
            $$2.cV().forEach($$0x -> $$0x.b(bsp.c.d));
         }
      }

      $$0.ai();
      $$1.a($$0, bsp.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aN().b($$0);
      UUID $$3 = $$0.cz();
      arc $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new aej(List.of($$0.cz())));
   }

   @Nullable
   public xl a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         avg $$2 = this.n.b($$1);
         xz $$3 = xl.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(xl.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xl.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         auw $$4 = this.o.b($$0);
         xz $$5 = xl.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(xl.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? xl.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public arc a(GameProfile $$0, aqq $$1) {
      return new arc(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<arc> $$2 = Sets.newIdentityHashSet();

      for (arc $$3 : this.l) {
         if ($$3.cz().equals($$1)) {
            $$2.add($$3);
         }
      }

      arc $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (arc $$5 : $$2) {
         $$5.c.b(f);
      }

      return !$$2.isEmpty();
   }

   public arc a(arc $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, bsp.c.b);
      iz $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      arb $$5 = this.k.a($$0.T());
      Optional<evm> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cms.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      arb $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.I();
      arc $$9 = new arc(this.k, $$8, $$0.gb(), $$0.B());
      $$9.c = $$0.c;
      $$9.a($$0, $$1);
      $$9.e($$0.al());
      $$9.a($$0.fu());

      for (String $$10 : $$0.am()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         drx $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(dew.pl);
         evm $$14 = $$6.get();
         float $$17;
         if (!$$12.a(awl.R) && !$$13) {
            $$17 = $$3;
         } else {
            evm $$15 = evm.c($$2).d($$14).d();
            $$17 = (float)ayu.d(ayu.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.af(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.c.b(new adl(adl.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dw() < (double)$$8.am()) {
         $$9.a_($$9.du(), $$9.dw() + 1.0, $$9.dA());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      arb $$19 = $$9.z();
      epn $$20 = $$19.A_();
      $$9.c.b(new aes($$9.d($$19), $$18));
      $$9.c.a($$9.du(), $$9.dw(), $$9.dA(), $$9.dF(), $$9.dH());
      $$9.c.b(new afh($$8.V(), $$8.W()));
      $$9.c.b(new acr($$20.q(), $$20.r()));
      $$9.c.b(new afn($$9.cq, $$9.cp, $$9.co));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cz(), $$9);
      $$9.h();
      $$9.t($$9.eA());
      if ($$11) {
         $$9.c.b(new afz(avw.vv, avx.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.E_().g()));
      }

      return $$9;
   }

   public void d(arc $$0) {
      GameProfile $$1 = $$0.gb();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aek(EnumSet.of(aek.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zs<?> $$0) {
      for (arc $$1 : this.l) {
         $$1.c.b($$0);
      }
   }

   public void a(zs<?> $$0, ala<dbt> $$1) {
      for (arc $$2 : this.l) {
         if ($$2.dP().af() == $$1) {
            $$2.c.b($$0);
         }
      }
   }

   public void a(cms $$0, xl $$1) {
      ews $$2 = $$0.cj();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            arc $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cms $$0, xl $$1) {
      ews $$2 = $$0.cj();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            arc $$4 = this.l.get($$3);
            if ($$4.cj() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gb().getName();
      }

      return $$0;
   }

   public avf f() {
      return this.n;
   }

   public auv g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new avb($$0, this.k.k(), this.p.a($$0)));
      arc $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      arc $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(arc $$0, int $$1) {
      if ($$0.c != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.c.b(new adi($$0, $$2));
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
   public arc a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         arc $$3 = this.l.get($$2);
         if ($$3.gb().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cms $$0, double $$1, double $$2, double $$3, double $$4, ala<dbt> $$5, zs<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         arc $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dP().af() == $$5) {
            double $$9 = $$1 - $$8.du();
            double $$10 = $$2 - $$8.dw();
            double $$11 = $$3 - $$8.dA();
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

   public avh i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public ava k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(arc $$0, arb $$1) {
      dto $$2 = this.k.I().C_();
      $$0.c.b(new ado($$2));
      $$0.c.b(new afv($$1.Z(), $$1.aa(), $$1.ab().b(dbp.l)));
      $$0.c.b(new afh($$1.V(), $$1.W()));
      if ($$1.ad()) {
         $$0.c.b(new adl(adl.c, 0.0F));
         $$0.c.b(new adl(adl.i, $$1.d(1.0F)));
         $$0.c.b(new adl(adl.j, $$1.b(1.0F)));
      }

      $$0.c.b(new adl(adl.o, 0.0F));
      this.k.aQ().a($$0);
   }

   public void e(arc $$0) {
      $$0.ca.b();
      $$0.w();
      $$0.c.b(new afe($$0.gc().k));
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

   public List<arc> b(String $$0) {
      List<arc> $$1 = Lists.newArrayList();

      for (arc $$2 : this.l) {
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
   public ur r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).c.b(xl.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xl $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xl $$0, Function<arc, xl> $$1, boolean $$2) {
      this.k.a($$0);

      for (arc $$3 : this.l) {
         xl $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(yb $$0, ep $$1, xh.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(yb $$0, arc $$1, xh.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(yb $$0, Predicate<arc> $$1, @Nullable arc $$2, xh.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      ya $$5 = ya.a($$0);
      boolean $$6 = false;

      for (arc $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(yb $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public awc a(cms $$0) {
      UUID $$1 = $$0.cz();
      awc $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(epp.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.af().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new awc(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alj f(arc $$0) {
      UUID $$1 = $$0.cz();
      alj $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(epp.a).resolve($$1 + ".json");
         $$2 = new alj(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new afg($$0));

      for (arb $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new aft($$0));

      for (arb $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<arc> t() {
      return this.l;
   }

   @Nullable
   public arc a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (alj $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new aah(axe.a(this.v)));
      agm $$1 = new agm(this.k.aJ().b());

      for (arc $$2 : this.l) {
         $$2.c.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
