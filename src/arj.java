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

public class arj extends dej implements dfg {
   public static final jf a = new jf(100, 50, 0);
   public static final bqx b = brd.a(12000, 180000);
   public static final bqx c = brd.a(12000, 24000);
   private static final bqx D = brd.a(12000, 180000);
   public static final bqx d = brd.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<ark> H = Lists.newArrayList();
   private final arh I;
   private final MinecraftServer J;
   private final ete K;
   private int L;
   final dzc M = new dzc();
   private final dzh<btr> N;
   private final dzq O;
   public boolean e;
   private final avm P;
   private int Q;
   private final ers R;
   private final fal<dhm> S = new fal<>(this::d, this.ai());
   private final fal<eqs> T = new fal<>(this::d, this.ai());
   private final erl U = new erl();
   final Set<bup> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final cpn f;
   private final ObjectLinkedOpenHashSet<ddn> X = new ObjectLinkedOpenHashSet();
   private final List<ddn> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<ddv> aa;
   @Nullable
   private dyr ab;
   final Int2ObjectMap<cix> ac = new Int2ObjectOpenHashMap();
   private final dfe ad;
   private final elh ae;
   private final boolean af;
   private final brx ag;

   public arj(
      MinecraftServer $$0,
      Executor $$1,
      esz.c $$2,
      ete $$3,
      ald<dej> $$4,
      dyp $$5,
      ars $$6,
      boolean $$7,
      long $$8,
      List<ddv> $$9,
      boolean $$10,
      @Nullable brx $$11
   ) {
      super($$3, $$4, $$0.bb(), $$5.a(), $$0::aS, false, $$7, $$8, $$0.bk());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      dwp $$12 = $$5.b();
      boolean $$13 = $$0.aY();
      DataFixer $$14 = $$0.aC();
      dyz<btr> $$15 = new dxz(new dyk(new dyh($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bao.s), this, $$0);
      this.N = new dzh<>(btr.class, new arj.a(), $$15);
      this.I = new arh(this, $$2, $$14, $$0.aZ(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.N::a, () -> $$0.J().u());
      this.I.h().b();
      this.R = new ers(this);
      this.V();
      this.Y();
      this.B_().a($$0.aw());
      this.f = this.u().a(cpn.a(this), cpn.a(this.af()));
      if (!$$0.U()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.ba().y().b();
      this.ae = new elh(this.I.m(), this.G_(), $$0.aZ(), $$4, $$12, this.I.i(), this, $$12.d(), $$16, $$14);
      this.ad = new dfe(this, $$0.ba().y(), this.ae);
      if (this.ag() == dej.j && this.af().a(dym.c)) {
         this.ab = new dyr(this, $$16, $$0.ba().C());
      } else {
         this.ab = null;
      }

      this.P = new avm();
      this.O = new dzq(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(brx.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dyr $$0) {
      this.ab = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.K.a($$0);
      this.K.c($$1);
      this.K.b($$1);
      this.K.b($$2);
      this.K.a($$3);
   }

   @Override
   public jo<dfk> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dfe a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bog $$1 = this.ah();
      this.Z = true;
      bsb $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.B_().s();
         $$1.b("weather");
         this.av();
         $$1.c();
      }

      int $$4 = this.ac().c(def.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.ac().b(def.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.at();
         if (this.ac().b(def.v) && this.ae()) {
            this.g();
         }
      }

      this.V();
      if ($$3) {
         this.b();
      }

      $$1.a("tickPending");
      if (!this.aj() && $$3) {
         long $$6 = this.aa();
         $$1.a("blockTicks");
         this.S.a($$6, 65536, this::d);
         $$1.b("fluidTicks");
         this.T.a($$6, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      if ($$3) {
         this.f.a();
      }

      $$1.b("chunkSource");
      this.l().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.aw();
      }

      this.Z = false;
      $$1.c();
      boolean $$7 = !this.H.isEmpty() || !this.w().isEmpty();
      if ($$7) {
         this.h();
      }

      if ($$7 || this.Q++ < 300) {
         $$1.a("entities");
         if (this.ab != null && $$3) {
            $$1.a("dragonFight");
            this.ab.c();
            $$1.c();
         }

         this.M.a($$2x -> {
            if (!$$2x.dN()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dE();
                  $$1.c();
                  if ($$2x instanceof ark || this.I.a.j().c($$2x.du().a())) {
                     btr $$3x = $$2x.dg();
                     if ($$3x != null) {
                        if (!$$3x.dN() && $$3x.y($$2x)) {
                           return;
                        }

                        $$2x.af();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.U();
      }

      $$1.a("entityManagement");
      this.N.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.I.a.j().d($$0);
   }

   protected void b() {
      if (this.af) {
         long $$0 = this.A.c() + 1L;
         this.K.a($$0);
         this.ah().a("scheduledFunctions");
         this.K.s().a(this.J, $$0);
         this.ah().c();
         if (this.A.o().b(def.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (ddv $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void at() {
      this.P.a();
      this.H.stream().filter(bun::fN).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dwy $$0, int $$1) {
      ddp $$2 = $$0.f();
      boolean $$3 = this.ae();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bog $$6 = this.ah();
      $$6.a("thunder");
      if ($$3 && this.ad() && this.z.a(100000) == 0) {
         jf $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            brq $$8 = this.d_($$7);
            boolean $$9 = this.ac().b(def.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dho.ss);
            if ($$9) {
               cin $$10 = bty.aO.a(this, btx.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bum $$11 = bty.am.a(this, btx.h);
            if ($$11 != null) {
               $$11.e(eyw.c($$7));
               $$11.a($$9);
               this.b($$11);
            }
         }
      }

      $$6.b("iceandsnow");

      for (int $$12 = 0; $$12 < $$1; $$12++) {
         if (this.z.a(48) == 0) {
            this.a(this.a($$4, 0, $$5, 15));
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         dwz[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dwz $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kh.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jf $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dus $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eqt $$21 = $$20.y();
                  if ($$21.f()) {
                     $$21.b(this, $$19, this.z);
                  }

                  $$6.c();
               }
            }
         }
      }

      $$6.c();
   }

   @VisibleForTesting
   public void a(jf $$0) {
      jf $$1 = this.a(eao.a.e, $$0);
      jf $$2 = $$1.e();
      dfk $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dho.dO.n());
      }

      if (this.ae()) {
         int $$4 = this.ac().c(def.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dus $$5 = this.a_($$1);
            if ($$5.a(dho.dN)) {
               int $$6 = $$5.c(dow.c);
               if ($$6 < Math.min($$4, 8)) {
                  dus $$7 = $$5.b(dow.c, Integer.valueOf($$6 + 1));
                  dhm.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dho.dN.n());
            }
         }

         dfk.c $$8 = $$3.a($$2, this.N());
         if ($$8 != dfk.c.a) {
            dus $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jf> E(jf $$0) {
      Optional<jf> $$1 = this.y().e($$0x -> $$0x.a(cfu.t), $$0x -> $$0x.v() == this.a(eao.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cfq.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jf b(jf $$0) {
      jf $$1 = this.a(eao.a.e, $$0);
      Optional<jf> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         eyr $$3 = eyr.a($$1, $$1.h(this.an() + 1)).g(3.0);
         List<bun> $$4 = this.a(bun.class, $$3, $$0x -> $$0x != null && $$0x.bI() && this.h($$0x.ds()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).ds();
         } else {
            if ($$1.v() == this.H_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean c() {
      return this.Z;
   }

   public boolean d() {
      return this.ac().c(def.P) <= 100;
   }

   private void au() {
      if (this.d()) {
         if (!this.o().U() || this.o().r()) {
            int $$0 = this.ac().c(def.P);
            xe $$1;
            if (this.P.a($$0)) {
               $$1 = xe.c("sleep.skipping_night");
            } else {
               $$1 = xe.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (ark $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.P.a(this.H)) {
         this.au();
      }
   }

   public alx f() {
      return this.J.aJ();
   }

   private void av() {
      boolean $$0 = this.ae();
      if (this.C_().g()) {
         if (this.ac().b(def.v)) {
            int $$1 = this.K.f();
            int $$2 = this.K.h();
            int $$3 = this.K.j();
            boolean $$4 = this.A.g();
            boolean $$5 = this.A.i();
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
                  $$2 = d.a(this.z);
               } else {
                  $$2 = D.a(this.z);
               }

               if ($$3 > 0) {
                  if (--$$3 == 0) {
                     $$5 = !$$5;
                  }
               } else if ($$5) {
                  $$3 = c.a(this.z);
               } else {
                  $$3 = b.a(this.z);
               }
            }

            this.K.b($$2);
            this.K.c($$3);
            this.K.a($$1);
            this.K.a($$4);
            this.K.b($$5);
         }

         this.x = this.y;
         if (this.A.g()) {
            this.y += 0.01F;
         } else {
            this.y -= 0.01F;
         }

         this.y = azf.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = azf.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ag().a(new adh(adh.i, this.w), this.ag());
      }

      if (this.x != this.y) {
         this.J.ag().a(new adh(adh.j, this.y), this.ag());
      }

      if ($$0 != this.ae()) {
         if ($$0) {
            this.J.ag().a(new adh(adh.d, 0.0F));
         } else {
            this.J.ag().a(new adh(adh.c, 0.0F));
         }

         this.J.ag().a(new adh(adh.i, this.w));
         this.J.ag().a(new adh(adh.j, this.y));
      }
   }

   @VisibleForTesting
   public void g() {
      this.K.c(0);
      this.K.b(false);
      this.K.b(0);
      this.K.a(false);
   }

   public void h() {
      this.Q = 0;
   }

   private void a(jf $$0, eqs $$1) {
      dus $$2 = this.a_($$0);
      eqt $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jf $$0, dhm $$1) {
      dus $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(btr $$0) {
      $$0.by();
      bog $$1 = this.ah();
      $$0.ag++;
      this.ah().a(() -> lv.f.b($$0.ao()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ah().c();

      for (btr $$2 : $$0.cW()) {
         this.a($$0, $$2);
      }
   }

   private void a(btr $$0, btr $$1) {
      if ($$1.dN() || $$1.dg() != $$0) {
         $$1.af();
      } else if ($$1 instanceof cnx || this.M.c($$1)) {
         $$1.by();
         $$1.ag++;
         bog $$2 = this.ah();
         $$2.a(() -> lv.f.b($$1.ao()).toString());
         $$2.d("tickPassenger");
         $$1.u();
         $$2.c();

         for (btr $$3 : $$1.cW()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cnx $$0, jf $$1) {
      return !this.J.a(this, $$1, $$0) && this.B_().a($$1);
   }

   public void a(@Nullable azm $$0, boolean $$1, boolean $$2) {
      arh $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xe.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xe.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.N.c();
         } else {
            this.N.b();
         }
      }
   }

   private void b(boolean $$0) {
      if (this.ab != null) {
         this.J.ba().a(this.ab.b());
      }

      est $$1 = this.l().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends btr> List<? extends T> a(dzd<btr, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends btr> void a(dzd<btr, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends btr> void a(dzd<btr, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axr.a.b;
            }
         }

         return axr.a.a;
      });
   }

   public List<? extends cja> i() {
      return this.a(bty.F, bun::bI);
   }

   public List<ark> a(Predicate<? super ark> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<ark> a(Predicate<? super ark> $$0, int $$1) {
      List<ark> $$2 = Lists.newArrayList();

      for (ark $$3 : this.H) {
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
   public ark j() {
      List<ark> $$0 = this.a(bun::bI);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(btr $$0) {
      return this.i($$0);
   }

   public boolean c(btr $$0) {
      return this.i($$0);
   }

   public void d(btr $$0) {
      if ($$0 instanceof ark $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(ark $$0) {
      this.c($$0);
   }

   public void b(ark $$0) {
      this.c($$0);
   }

   private void c(ark $$0) {
      btr $$1 = this.G().a($$0.cD());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cD());
         $$1.am();
         this.a((ark)$$1, btr.c.b);
      }

      this.N.a($$0);
   }

   private boolean i(btr $$0) {
      if ($$0.dN()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bty.a($$0.ao()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(btr $$0) {
      if ($$0.cY().map(btr::cD).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dwy $$0) {
      $$0.H();
      $$0.b(this);
   }

   public void a(ark $$0, btr.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jf $$1, int $$2) {
      for (ark $$3 : this.J.ag().t()) {
         if ($$3 != null && $$3.dS() == this && $$3.ap() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dx();
            double $$5 = (double)$$1.v() - $$3.dz();
            double $$6 = (double)$$1.w() - $$3.dD();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new acg($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cnx $$0, double $$1, double $$2, double $$3, jo<awf> $$4, awh $$5, float $$6, float $$7, long $$8) {
      this.J.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ag(), new afy($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cnx $$0, btr $$1, jo<awf> $$2, awh $$3, float $$4, float $$5, long $$6) {
      this.J.ag().a($$0, $$1.dx(), $$1.dz(), $$1.dD(), (double)$$2.a().a($$4), this.ag(), new afx($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jf $$1, int $$2) {
      if (this.ac().b(def.W)) {
         this.J.ag().a(new adn($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cnx $$0, int $$1, jf $$2, int $$3) {
      this.J.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ag(), new adn($$1, $$2, $$3, false));
   }

   public int k() {
      return this.C_().p();
   }

   @Override
   public void a(jo<dzp> $$0, eyw $$1, dzp.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(jf $$0, dus $$1, dus $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ad.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      ezq $$5 = $$1.g(this, $$0);
      ezq $$6 = $$2.g(this, $$0);
      if (ezn.c($$5, $$6, eza.g)) {
         List<cdy> $$7 = new ObjectArrayList();

         for (bup $$8 : this.V) {
            cdy $$9 = $$8.P();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (cdy $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(jf $$0, dhm $$1) {
      this.a($$0, $$1, erx.a(this, null, null));
   }

   @Override
   public void a(jf $$0, dhm $$1, @Nullable esb $$2) {
      this.s.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jf $$0, dhm $$1, jk $$2, @Nullable esb $$3) {
      this.s.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jf $$0, dhm $$1, @Nullable esb $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dus $$0, jf $$1, dhm $$2, @Nullable esb $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(btr $$0, byte $$1) {
      this.l().a($$0, new ade($$0, $$1));
   }

   @Override
   public void a(btr $$0, bsj $$1) {
      this.l().a($$0, new ada($$0, $$1));
   }

   public arh l() {
      return this.I;
   }

   @Override
   public void a(
      @Nullable btr $$0,
      @Nullable bsj $$1,
      @Nullable dec $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dej.a $$8,
      lm $$9,
      lm $$10,
      jo<awf> $$11
   ) {
      deb.a $$12 = switch ($$8) {
         case a -> deb.a.a;
         case b -> this.a(def.Q);
         case c -> this.ac().b(def.c) ? this.a(def.R) : deb.a.a;
         case d -> this.a(def.S);
         case e -> deb.a.d;
      };
      eyw $$13 = new eyw($$3, $$4, $$5);
      dey $$14 = new dey(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.h();
      lm $$15 = $$14.j() ? $$9 : $$10;

      for (ark $$16 : this.H) {
         if ($$16.f($$13) < 4096.0) {
            Optional<eyw> $$17 = Optional.ofNullable($$14.i().get($$16));
            $$16.c.b(new adf($$13, $$17, $$15, $$11));
         }
      }
   }

   private deb.a a(def.e<def.a> $$0) {
      return this.ac().b($$0) ? deb.a.c : deb.a.b;
   }

   @Override
   public void a(jf $$0, dhm $$1, int $$2, int $$3) {
      this.X.add(new ddn($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         ddn $$0 = (ddn)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ag(), new aci($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(ddn $$0) {
      dus $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fal<dhm> m() {
      return this.S;
   }

   public fal<eqs> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public ers p() {
      return this.R;
   }

   public epj q() {
      return this.J.aZ();
   }

   public <T extends lm> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      ado $$9 = new ado($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         ark $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lm> boolean a(ark $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zl<?> $$11 = new ado($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(ark $$0, boolean $$1, double $$2, double $$3, double $$4, zl<?> $$5) {
      if ($$0.dS() != this) {
         return false;
      } else {
         jf $$6 = $$0.ds();
         if ($$6.a(new eyw($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public btr a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public btr b(int $$0) {
      btr $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (btr)this.ac.get($$0);
   }

   @Nullable
   public btr a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jf a(axl<elg> $$0, jf $$1, int $$2, boolean $$3) {
      if (!this.J.ba().y().c()) {
         return null;
      } else {
         Optional<js.c<elg>> $$4 = this.G_().e(lw.aT).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jf, jo<elg>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jf)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jf, jo<dfk>> a(Predicate<jo<dfk>> $$0, jf $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public dao r() {
      return this.J.aI();
   }

   @Override
   public bsb s() {
      return this.J.aP();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public est u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public esn a(esl $$0) {
      return this.o().J().u().b(esn.a(), $$0.a());
   }

   @Override
   public void a(esl $$0, esn $$1) {
      this.o().J().u().a($$0.a(), $$1);
   }

   @Override
   public esl v() {
      return this.o().J().u().a(esm.a(), "idcounts").b();
   }

   public void a(jf $$0, float $$1) {
      jf $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ag().a(new afe($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(aro.a, new ddp($$2), this.L, bak.a);
      }

      int $$4 = this.ac().c(def.aa) + 1;
      if ($$4 > 1) {
         this.l().a(aro.a, new ddp($$0), $$4, bak.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      dee $$0 = this.u().b(dee.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dee $$3 = this.u().a(dee.a(), "chunks");
      ddp $$4 = new ddp($$0, $$1);
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
         this.l().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<ark> x() {
      return this.H;
   }

   @Override
   public void a(jf $$0, dus $$1, dus $$2) {
      Optional<jo<cft>> $$3 = cfu.a($$1);
      Optional<jo<cft>> $$4 = cfu.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jf $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               ago.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               ago.a(this, $$5);
            }));
      }
   }

   public cfq y() {
      return this.l().l();
   }

   public boolean c(jf $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kh $$0) {
      return this.c($$0.k());
   }

   public boolean a(jf $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kh.a($$0)) <= $$1;
   }

   public int b(kh $$0) {
      return this.y().a($$0);
   }

   public cpn z() {
      return this.f;
   }

   @Nullable
   public cpl d(jf $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jf $$0) {
      return this.d($$0) != null;
   }

   public void a(cfn $$0, btr $$1, bvb $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqp $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         deu.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<buq> $$4 = (Entry<buq>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((buq)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.N.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.r.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.m().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.n().a()));
         $$2.write("distance_manager: " + $$1.j().d() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.l().f()));
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
         this.N.a($$10);
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

   private static void a(Writer $$0, Iterable<btr> $$1) throws IOException {
      ayf $$2 = ayf.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (btr $$3 : $$1) {
         xe $$4 = $$3.al();
         xe $$5 = $$3.R_();
         $$2.a($$3.dx(), $$3.dz(), $$3.dD(), $$3.cD(), lv.f.b($$3.ao()), $$3.bI(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ayf $$1 = ayf.a().a("x").a("y").a("z").a("type").a($$0);

      for (dtp $$2 : this.r) {
         jf $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eky $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jf $$0, dhm $$1) {
      if (!this.aj()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jk $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<btr> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.e() + "]";
   }

   public boolean B() {
      return this.J.ba().z();
   }

   @Override
   public long C() {
      return this.J.ba().y().b();
   }

   @Nullable
   public dyr D() {
      return this.ab;
   }

   @Override
   public arj E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> lv.f.b($$0.ao()).toString()),
         this.r.size(),
         a(this.r, dtp::d),
         this.m().a(),
         this.n().a(),
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
   protected dzf<btr> G() {
      return this.N.d();
   }

   public void a(Stream<btr> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<btr> $$0) {
      this.N.b($$0);
   }

   public void b(dwy $$0) {
      $$0.d(this.z_().c());
   }

   public void a(dwo $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public erl H() {
      return this.U;
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.N.close();
   }

   @Override
   public String I() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.N.e();
   }

   public boolean c(long $$0) {
      return this.N.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean f(jf $$0) {
      return this.N.a($$0) && this.I.a.j().c(ddp.a($$0));
   }

   public boolean g(jf $$0) {
      return this.N.a($$0);
   }

   public boolean a(ddp $$0) {
      return this.N.a($$0);
   }

   @Override
   public cqq J() {
      return this.J.ba().K();
   }

   @Override
   public cxq K() {
      return this.J.bo();
   }

   @Override
   public dss L() {
      return this.J.bp();
   }

   public azn a(ale $$0) {
      return this.ag.a($$0);
   }

   public brx M() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   @Override
   public int N() {
      return this.I.g().f();
   }

   final class a implements dze<btr> {
      public void a(btr $$0) {
      }

      public void b(btr $$0) {
         arj.this.f().a($$0);
      }

      public void c(btr $$0) {
         arj.this.M.a($$0);
      }

      public void d(btr $$0) {
         arj.this.M.b($$0);
      }

      public void e(btr $$0) {
         arj.this.l().b($$0);
         if ($$0 instanceof ark $$1) {
            arj.this.H.add($$1);
            arj.this.e();
         }

         if ($$0 instanceof bup $$2) {
            if (arj.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arj.this.V.add($$2);
         }

         if ($$0 instanceof cja $$4) {
            for (cix $$5 : $$4.gk()) {
               arj.this.ac.put($$5.ap(), $$5);
            }
         }

         $$0.a(dzm::a);
      }

      public void f(btr $$0) {
         arj.this.l().a($$0);
         if ($$0 instanceof ark $$1) {
            arj.this.H.remove($$1);
            arj.this.e();
         }

         if ($$0 instanceof bup $$2) {
            if (arj.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arj.this.V.remove($$2);
         }

         if ($$0 instanceof cja $$4) {
            for (cix $$5 : $$4.gk()) {
               arj.this.ac.remove($$5.ap());
            }
         }

         $$0.a(dzm::b);
      }

      public void g(btr $$0) {
         $$0.a(dzm::c);
      }
   }
}
