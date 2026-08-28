import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class arp extends dfm implements aro, dgk {
   public static final jh a = new jh(100, 50, 0);
   public static final brp b = brv.a(12000, 180000);
   public static final brp c = brv.a(12000, 24000);
   private static final brp E = brv.a(12000, 180000);
   public static final brp d = brv.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<arq> I = Lists.newArrayList();
   private final arm J;
   private final MinecraftServer K;
   private final eug L;
   private int M;
   final eae N = new eae();
   private final eaj<bul> O;
   private final eas P;
   public boolean e;
   private final avt Q;
   private int R;
   private final esu S;
   private final fbn<diq> T = new fbn<>(this::d);
   private final fbn<eru> U = new fbn<>(this::d);
   private final esn V = new esn();
   final Set<bvj> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final cqj f;
   private final ObjectLinkedOpenHashSet<deq> Y = new ObjectLinkedOpenHashSet();
   private final List<deq> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dey> ab;
   @Nullable
   private dzt ac;
   final Int2ObjectMap<cjs> ad = new Int2ObjectOpenHashMap();
   private final dgi ae;
   private final emj af;
   private final boolean ag;
   private final bsp ah;

   public arp(
      MinecraftServer $$0,
      Executor $$1,
      eub.c $$2,
      eug $$3,
      ali<dfm> $$4,
      dzr $$5,
      arz $$6,
      boolean $$7,
      long $$8,
      List<dey> $$9,
      boolean $$10,
      @Nullable bsp $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dxr $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      eab<bul> $$15 = new dzb(new dzm(new dzj($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, baw.s), this, $$0);
      this.O = new eaj<>(bul.class, new arp.a(), $$15);
      this.J = new arm(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().v());
      this.J.h().b();
      this.S = new esu(this);
      this.W();
      this.Z();
      this.E_().a($$0.aw());
      this.f = this.v().a(cqj.a(this), cqj.a(this.af()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new emj(this.J.m(), this.J_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dgi(this, $$0.aZ().y(), this.af);
      if (this.ag() == dfm.k && this.af().a(dzo.c)) {
         this.ac = new dzt(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new avt();
      this.P = new eas(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.v().a(bsp.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dzt $$0) {
      this.ac = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.L.a($$0);
      this.L.c($$1);
      this.L.b($$1);
      this.L.b($$2);
      this.L.a($$3);
   }

   @Override
   public jq<dgo> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public dgi b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bou $$1 = bot.a();
      this.aa = true;
      bst $$2 = this.t();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.E_().s();
         $$1.b("weather");
         this.at();
         $$1.c();
      }

      int $$4 = this.N().c(dfi.P);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.N().b(dfi.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.N().b(dfi.v) && this.ae()) {
            this.h();
         }
      }

      this.W();
      if ($$3) {
         this.c();
      }

      $$1.a("tickPending");
      if (!this.ah() && $$3) {
         long $$6 = this.ab();
         $$1.a("blockTicks");
         this.T.a($$6, 65536, this::d);
         $$1.b("fluidTicks");
         this.U.a($$6, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      if ($$3) {
         this.f.a();
      }

      $$1.b("chunkSource");
      this.m().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.au();
      }

      this.aa = false;
      $$1.c();
      boolean $$7 = !this.I.isEmpty() || !this.x().isEmpty();
      if ($$7) {
         this.i();
      }

      if ($$7 || this.R++ < 300) {
         $$1.a("entities");
         if (this.ac != null && $$3) {
            $$1.a("dragonFight");
            this.ac.c();
            $$1.c();
         }

         this.N.a($$2x -> {
            if (!$$2x.dQ()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dH();
                  $$1.c();
                  if ($$2x instanceof arq || this.J.a.j().c($$2x.dx().a())) {
                     bul $$3x = $$2x.dk();
                     if ($$3x != null) {
                        if (!$$3x.dQ() && $$3x.y($$2x)) {
                           return;
                        }

                        $$2x.ae();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.V();
      }

      $$1.a("entityManagement");
      this.O.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.J.a.j().d($$0);
   }

   protected void c() {
      if (this.ag) {
         long $$0 = this.B.c() + 1L;
         this.L.a($$0);
         bot.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bot.a().c();
         if (this.L.o().b(dfi.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dey $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void ar() {
      this.Q.a();
      this.I.stream().filter(bvh::fP).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dya $$0, int $$1) {
      des $$2 = $$0.f();
      boolean $$3 = this.ae();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bou $$6 = bot.a();
      $$6.a("thunder");
      if ($$3 && this.ad() && this.A.a(100000) == 0) {
         jh $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bsi $$8 = this.d_($$7);
            boolean $$9 = this.N().b(dfi.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dis.ss);
            if ($$9) {
               cji $$10 = bus.bc.a(this, bur.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bvg $$11 = bus.av.a(this, bur.h);
            if ($$11 != null) {
               $$11.e(ezy.c($$7));
               $$11.a($$9);
               this.b($$11);
            }
         }
      }

      $$6.b("iceandsnow");

      for (int $$12 = 0; $$12 < $$1; $$12++) {
         if (this.A.a(48) == 0) {
            this.a(this.a($$4, 0, $$5, 15));
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         dyb[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dyb $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kj.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jh $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dvv $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  erv $$21 = $$20.y();
                  if ($$21.f()) {
                     $$21.a(this, $$19, this.A);
                  }

                  $$6.c();
               }
            }
         }
      }

      $$6.c();
   }

   @VisibleForTesting
   public void a(jh $$0) {
      jh $$1 = this.a(ebq.a.e, $$0);
      jh $$2 = $$1.e();
      dgo $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dis.dO.m());
      }

      if (this.ae()) {
         int $$4 = this.N().c(dfi.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dvv $$5 = this.a_($$1);
            if ($$5.a(dis.dN)) {
               int $$6 = $$5.c(dpz.c);
               if ($$6 < Math.min($$4, 8)) {
                  dvv $$7 = $$5.b(dpz.c, Integer.valueOf($$6 + 1));
                  diq.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dis.dN.m());
            }
         }

         dgo.c $$8 = $$3.a($$2, this.O());
         if ($$8 != dgo.c.a) {
            dvv $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jh> E(jh $$0) {
      Optional<jh> $$1 = this.z().e($$0x -> $$0x.a(cgp.t), $$0x -> $$0x.v() == this.a(ebq.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cgl.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jh b(jh $$0) {
      jh $$1 = this.a(ebq.a.e, $$0);
      Optional<jh> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ezt $$3 = ezt.a($$1, $$1.h(this.al() + 1)).g(3.0);
         List<bvh> $$4 = this.a(bvh.class, $$3, $$0x -> $$0x != null && $$0x.bL() && this.h($$0x.dv()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dv();
         } else {
            if ($$1.v() == this.K_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean d() {
      return this.aa;
   }

   public boolean e() {
      return this.N().c(dfi.P) <= 100;
   }

   private void as() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.N().c(dfi.P);
            xj $$1;
            if (this.Q.a($$0)) {
               $$1 = xj.c("sleep.skipping_night");
            } else {
               $$1 = xj.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (arq $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void f() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.as();
      }
   }

   public amc g() {
      return this.K.aJ();
   }

   private void at() {
      boolean $$0 = this.ae();
      if (this.F_().g()) {
         if (this.N().b(dfi.v)) {
            int $$1 = this.L.f();
            int $$2 = this.L.h();
            int $$3 = this.L.j();
            boolean $$4 = this.B.g();
            boolean $$5 = this.B.i();
            if ($$1 > 0) {
               $$1--;
               $$2 = $$4 ? 0 : 1;
               $$3 = $$5 ? 0 : 1;
               $$4 = false;
               $$5 = false;
            } else {
               if ($$2 > 0) {
                  if (--$$2 == 0) {
                     $$4 = !$$4;
                  }
               } else if ($$4) {
                  $$2 = d.a(this.A);
               } else {
                  $$2 = E.a(this.A);
               }

               if ($$3 > 0) {
                  if (--$$3 == 0) {
                     $$5 = !$$5;
                  }
               } else if ($$5) {
                  $$3 = c.a(this.A);
               } else {
                  $$3 = b.a(this.A);
               }
            }

            this.L.b($$2);
            this.L.c($$3);
            this.L.a($$1);
            this.L.a($$4);
            this.L.b($$5);
         }

         this.y = this.z;
         if (this.B.g()) {
            this.z += 0.01F;
         } else {
            this.z -= 0.01F;
         }

         this.z = azm.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = azm.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new adm(adm.i, this.x), this.ag());
      }

      if (this.y != this.z) {
         this.K.ag().a(new adm(adm.j, this.z), this.ag());
      }

      if ($$0 != this.ae()) {
         if ($$0) {
            this.K.ag().a(new adm(adm.d, 0.0F));
         } else {
            this.K.ag().a(new adm(adm.c, 0.0F));
         }

         this.K.ag().a(new adm(adm.i, this.x));
         this.K.ag().a(new adm(adm.j, this.z));
      }
   }

   @VisibleForTesting
   public void h() {
      this.L.c(0);
      this.L.b(false);
      this.L.b(0);
      this.L.a(false);
   }

   public void i() {
      this.R = 0;
   }

   private void a(jh $$0, eru $$1) {
      dvv $$2 = this.a_($$0);
      erv $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jh $$0, diq $$1) {
      dvv $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bul $$0) {
      $$0.bz();
      bou $$1 = bot.a();
      $$0.af++;
      $$1.a(() -> lz.f.b($$0.aq()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (bul $$2 : $$0.cZ()) {
         this.a($$0, $$2);
      }
   }

   private void a(bul $$0, bul $$1) {
      if ($$1.dQ() || $$1.dk() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cou || this.N.c($$1)) {
         $$1.bz();
         $$1.af++;
         bou $$2 = bot.a();
         $$2.a(() -> lz.f.b($$1.aq()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bul $$3 : $$1.cZ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cou $$0, jh $$1) {
      return !this.K.a(this, $$1, $$0) && this.E_().a($$1);
   }

   public void a(@Nullable azt $$0, boolean $$1, boolean $$2) {
      arm $$3 = this.m();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xj.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xj.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.O.c();
         } else {
            this.O.b();
         }
      }
   }

   private void b(boolean $$0) {
      if (this.ac != null) {
         this.K.aZ().a(this.ac.b());
      }

      etv $$1 = this.m().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bul> List<? extends T> a(eaf<bul, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bul> void a(eaf<bul, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bul> void a(eaf<bul, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axy.a.b;
            }
         }

         return axy.a.a;
      });
   }

   public List<? extends cjv> j() {
      return this.a(bus.O, bvh::bL);
   }

   public List<arq> a(Predicate<? super arq> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<arq> a(Predicate<? super arq> $$0, int $$1) {
      List<arq> $$2 = Lists.newArrayList();

      for (arq $$3 : this.I) {
         if ($$0.test($$3)) {
            $$2.add($$3);
            if ($$2.size() >= $$1) {
               return $$2;
            }
         }
      }

      return $$2;
   }

   @Nullable
   public arq k() {
      List<arq> $$0 = this.a(bvh::bL);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bul $$0) {
      return this.i($$0);
   }

   public boolean c(bul $$0) {
      return this.i($$0);
   }

   public void d(bul $$0) {
      if ($$0 instanceof arq $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(arq $$0) {
      this.c($$0);
   }

   public void b(arq $$0) {
      this.c($$0);
   }

   private void c(arq $$0) {
      bul $$1 = this.G().a($$0.cG());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cG());
         $$1.ao();
         this.a((arq)$$1, bul.c.b);
      }

      this.O.a($$0);
   }

   private boolean i(bul $$0) {
      if ($$0.dQ()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bus.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bul $$0) {
      if ($$0.db().map(bul::cG).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dya $$0) {
      $$0.G();
      $$0.c(this);
   }

   public void a(arq $$0, bul.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jh $$1, int $$2) {
      for (arq $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dV() == this && $$3.ar() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dA();
            double $$5 = (double)$$1.v() - $$3.dC();
            double $$6 = (double)$$1.w() - $$3.dG();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.f.b(new acl($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cou $$0, double $$1, double $$2, double $$3, jq<awm> $$4, awo $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ag(), new agd($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cou $$0, bul $$1, jq<awm> $$2, awo $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dA(), $$1.dC(), $$1.dG(), (double)$$2.a().a($$4), this.ag(), new agc($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jh $$1, int $$2) {
      if (this.N().b(dfi.W)) {
         this.K.ag().a(new ads($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cou $$0, int $$1, jh $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ag(), new ads($$1, $$2, $$3, false));
   }

   public int l() {
      return this.F_().p();
   }

   @Override
   public void a(jq<ear> $$0, ezy $$1, ear.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jh $$0, dvv $$1, dvv $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ae.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      fas $$5 = $$1.g(this, $$0);
      fas $$6 = $$2.g(this, $$0);
      if (fap.c($$5, $$6, fac.g)) {
         List<cet> $$7 = new ObjectArrayList();

         for (bvj $$8 : this.W) {
            cet $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cet $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jh $$0, diq $$1) {
      this.a($$0, $$1, esz.a(this, null, null));
   }

   @Override
   public void a(jh $$0, diq $$1, @Nullable etd $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jh $$0, diq $$1, jm $$2, @Nullable etd $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jh $$0, diq $$1, @Nullable etd $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dvv $$0, jh $$1, diq $$2, @Nullable etd $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bul $$0, byte $$1) {
      this.m().a($$0, new adj($$0, $$1));
   }

   @Override
   public void a(bul $$0, btb $$1) {
      this.m().a($$0, new adf($$0, $$1));
   }

   public arm m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bul $$0,
      @Nullable btb $$1,
      @Nullable dff $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dfm.a $$8,
      lq $$9,
      lq $$10,
      jq<awm> $$11
   ) {
      dfe.a $$12 = switch ($$8) {
         case a -> dfe.a.a;
         case b -> this.a(dfi.Q);
         case c -> this.N().b(dfi.c) ? this.a(dfi.R) : dfe.a.a;
         case d -> this.a(dfi.S);
         case e -> dfe.a.d;
      };
      ezy $$13 = new ezy($$3, $$4, $$5);
      dgc $$14 = new dgc(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lq $$15 = $$14.k() ? $$9 : $$10;

      for (arq $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<ezy> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new adk($$13, $$17, $$15, $$11));
         }
      }
   }

   private dfe.a a(dfi.e<dfi.a> $$0) {
      return this.N().b($$0) ? dfe.a.c : dfe.a.b;
   }

   @Override
   public void a(jh $$0, diq $$1, int $$2, int $$3) {
      this.Y.add(new deq($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         deq $$0 = (deq)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ag(), new acn($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(deq $$0) {
      dvv $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fbn<diq> n() {
      return this.T;
   }

   public fbn<eru> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public esu q() {
      return this.S;
   }

   public eql r() {
      return this.K.aY();
   }

   public <T extends lq> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adt $$9 = new adt($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.I.size(); $$11++) {
         arq $$12 = this.I.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lq> boolean a(arq $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zq<?> $$11 = new adt($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(arq $$0, boolean $$1, double $$2, double $$3, double $$4, zq<?> $$5) {
      if ($$0.dV() != this) {
         return false;
      } else {
         jh $$6 = $$0.dv();
         if ($$6.a(new ezy($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bul a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bul b(int $$0) {
      bul $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bul)this.ad.get($$0);
   }

   @Nullable
   public bul a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jh a(axs<emi> $$0, jh $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<ju.c<emi>> $$4 = this.J_().e(ma.aS).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jh, jq<emi>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jh)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jh, jq<dgo>> a(Predicate<jq<dgo>> $$0, jh $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   @Override
   public dbe s() {
      return this.K.aI();
   }

   @Override
   public bst t() {
      return this.K.aP();
   }

   @Override
   public boolean u() {
      return this.e;
   }

   public etv v() {
      return this.m().k();
   }

   @Nullable
   @Override
   public etp a(etn $$0) {
      return this.p().J().v().b(etp.a(), $$0.a());
   }

   @Override
   public void a(etn $$0, etp $$1) {
      this.p().J().v().a($$0.a(), $$1);
   }

   @Override
   public etn w() {
      return this.p().J().v().a(eto.a(), "idcounts").b();
   }

   public void a(jh $$0, float $$1) {
      jh $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new afj($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(arv.a, new des($$2), this.M, bas.a);
      }

      int $$4 = this.N().c(dfi.aa) + 1;
      if ($$4 > 1) {
         this.m().a(arv.a, new des($$0), $$4, bas.a);
      }

      this.M = $$4;
   }

   public LongSet x() {
      dfh $$0 = this.v().b(dfh.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dfh $$3 = this.v().a(dfh.a(), "chunks");
      des $$4 = new des($$0, $$1);
      long $$5 = $$4.a();
      boolean $$6;
      if ($$2) {
         $$6 = $$3.b().add($$5);
         if ($$6) {
            this.d($$0, $$1);
         }
      } else {
         $$6 = $$3.b().remove($$5);
      }

      $$3.a($$6);
      if ($$6) {
         this.m().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<arq> y() {
      return this.I;
   }

   @Override
   public void a(jh $$0, dvv $$1, dvv $$2) {
      Optional<jq<cgo>> $$3 = cgp.a($$1);
      Optional<jq<cgo>> $$4 = cgp.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jh $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.p().execute(() -> {
               this.z().a($$5);
               agt.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.p().execute(() -> {
               this.z().a($$5, $$1x);
               agt.a(this, $$5);
            }));
      }
   }

   public cgl z() {
      return this.m().l();
   }

   public boolean c(jh $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kj $$0) {
      return this.c($$0.k());
   }

   public boolean a(jh $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kj.a($$0)) <= $$1;
   }

   public int b(kj $$0) {
      return this.z().a($$0);
   }

   public cqj A() {
      return this.f;
   }

   @Nullable
   public cqh d(jh $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jh $$0) {
      return this.d($$0) != null;
   }

   public void a(cgi $$0, bul $$1, bvw $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqu $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dfx.d $$3 = this.m().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bvk> $$4 = (Entry<bvk>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bvk)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.O.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.s.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.n().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.o().a()));
         $$2.write("distance_manager: " + $$1.j().d() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.m().f()));
      }

      o $$5 = new o("Level dump", new Exception("dummy"));
      this.a($$5);

      try (Writer $$6 = Files.newBufferedWriter($$0.resolve("example_crash.txt"))) {
         $$6.write($$5.a(y.c));
      }

      Path $$7 = $$0.resolve("chunks.csv");

      try (Writer $$8 = Files.newBufferedWriter($$7)) {
         $$1.a($$8);
      }

      Path $$9 = $$0.resolve("entity_chunks.csv");

      try (Writer $$10 = Files.newBufferedWriter($$9)) {
         this.O.a($$10);
      }

      Path $$11 = $$0.resolve("entities.csv");

      try (Writer $$12 = Files.newBufferedWriter($$11)) {
         a($$12, this.G().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<bul> $$1) throws IOException {
      aym $$2 = aym.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bul $$3 : $$1) {
         xj $$4 = $$3.an();
         xj $$5 = $$3.o_();
         $$2.a($$3.dA(), $$3.dC(), $$3.dG(), $$3.cG(), lz.f.b($$3.aq()), $$3.bL(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aym $$1 = aym.a().a("x").a("y").a("z").a("type").a($$0);

      for (dus $$2 : this.s) {
         jh $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(ema $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jh $$0, diq $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bul> B() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.L.e() + "]";
   }

   public boolean C() {
      return this.K.aZ().z();
   }

   @Override
   public long D() {
      return this.K.aZ().y().c();
   }

   @Nullable
   public dzt E() {
      return this.ac;
   }

   @Override
   public arp a() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> lz.f.b($$0.aq()).toString()),
         this.s.size(),
         a(this.s, dus::d),
         this.n().a(),
         this.o().a(),
         this.I()
      );
   }

   private static <T> String a(Iterable<T> $$0, Function<T, String> $$1) {
      try {
         Object2IntOpenHashMap<String> $$2 = new Object2IntOpenHashMap();

         for (T $$3 : $$0) {
            String $$4 = $$1.apply($$3);
            $$2.addTo($$4, 1);
         }

         return $$2.object2IntEntrySet()
            .stream()
            .sorted(Comparator.comparing(Entry::getIntValue).reversed())
            .limit(5L)
            .map($$0x -> (String)$$0x.getKey() + ":" + $$0x.getIntValue())
            .collect(Collectors.joining(","));
      } catch (Exception var6) {
         return "";
      }
   }

   @Override
   protected eah<bul> G() {
      return this.O.d();
   }

   public void a(Stream<bul> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bul> $$0) {
      this.O.b($$0);
   }

   public void b(dya $$0) {
      $$0.d(this.C_().c());
   }

   public void a(dxq $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public esn H() {
      return this.V;
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.O.close();
   }

   @Override
   public String I() {
      return "Chunks[S] W: " + this.J.e() + " E: " + this.O.e();
   }

   public boolean c(long $$0) {
      return this.O.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.J.a($$0);
   }

   public boolean f(jh $$0) {
      return this.O.a($$0) && this.J.a.j().c(des.a($$0));
   }

   public boolean g(jh $$0) {
      return this.O.a($$0);
   }

   public boolean a(des $$0) {
      return this.O.a($$0);
   }

   @Override
   public crq J() {
      return this.K.aZ().K();
   }

   @Override
   public cyk K() {
      return this.K.bn();
   }

   @Override
   public dtv L() {
      return this.K.bo();
   }

   public azu a(alj $$0) {
      return this.ah.a($$0);
   }

   public bsp M() {
      return this.ah;
   }

   public dfi N() {
      return this.L.o();
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.O.f()));
      return $$1;
   }

   @Override
   public int O() {
      return this.J.g().f();
   }

   final class a implements eag<bul> {
      public void a(bul $$0) {
      }

      public void b(bul $$0) {
         arp.this.g().a($$0);
      }

      public void c(bul $$0) {
         arp.this.N.a($$0);
      }

      public void d(bul $$0) {
         arp.this.N.b($$0);
      }

      public void e(bul $$0) {
         arp.this.m().b($$0);
         if ($$0 instanceof arq $$1) {
            arp.this.I.add($$1);
            arp.this.f();
         }

         if ($$0 instanceof bvj $$2) {
            if (arp.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arp.this.W.add($$2);
         }

         if ($$0 instanceof cjv $$4) {
            for (cjs $$5 : $$4.gi()) {
               arp.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(eao::a);
      }

      public void f(bul $$0) {
         arp.this.m().a($$0);
         if ($$0 instanceof arq $$1) {
            arp.this.I.remove($$1);
            arp.this.f();
         }

         if ($$0 instanceof bvj $$2) {
            if (arp.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arp.this.W.remove($$2);
         }

         if ($$0 instanceof cjv $$4) {
            for (cjs $$5 : $$4.gi()) {
               arp.this.ad.remove($$5.ar());
            }
         }

         $$0.a(eao::b);
      }

      public void g(bul $$0) {
         $$0.a(eao::c);
      }
   }
}
