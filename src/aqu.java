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

public class aqu extends dcw implements dds {
   public static final jd a = new jd(100, 50, 0);
   public static final bpw b = bqc.a(12000, 180000);
   public static final bpw c = bqc.a(12000, 24000);
   private static final bpw D = bqc.a(12000, 180000);
   public static final bpw d = bqc.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<aqv> H = Lists.newArrayList();
   private final aqs I;
   private final MinecraftServer J;
   private final eri K;
   private int L;
   final dxm M = new dxm();
   private final dxr<bsr> N;
   private final dya O;
   public boolean e;
   private final auu P;
   private int Q;
   private final eqb R;
   private final eyo<dfy> S = new eyo<>(this::d, this.ah());
   private final eyo<epb> T = new eyo<>(this::d, this.ah());
   private final epu U = new epu();
   final Set<btp> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final cok f;
   private final ObjectLinkedOpenHashSet<dcb> X = new ObjectLinkedOpenHashSet();
   private final List<dcb> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<dcj> aa;
   @Nullable
   private dxb ab;
   final Int2ObjectMap<chy> ac = new Int2ObjectOpenHashMap();
   private final ddq ad;
   private final ejq ae;
   private final boolean af;
   private final bqy ag;

   public aqu(
      MinecraftServer $$0,
      Executor $$1,
      erd.c $$2,
      eri $$3,
      akq<dcw> $$4,
      dwz $$5,
      ard $$6,
      boolean $$7,
      long $$8,
      List<dcj> $$9,
      boolean $$10,
      @Nullable bqy $$11
   ) {
      super($$3, $$4, $$0.bc(), $$5.a(), $$0::aT, false, $$7, $$8, $$0.bl());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      duz $$12 = $$5.b();
      boolean $$13 = $$0.aZ();
      DataFixer $$14 = $$0.aD();
      dxj<bsr> $$15 = new dwk(new dwu(new dws($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, azw.s), this, $$0);
      this.N = new dxr<>(bsr.class, new aqu.a(), $$15);
      this.I = new aqs(this, $$2, $$14, $$0.ba(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new eqb(this);
      this.U();
      this.X();
      this.C_().a($$0.ax());
      this.f = this.u().a(cok.a(this), cok.a(this.ae()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bb().y().b();
      this.ae = new ejq(this.I.m(), this.H_(), $$0.ba(), $$4, $$12, this.I.i(), this, $$12.d(), $$16, $$14);
      this.ad = new ddq(this, $$0.bb().y(), this.ae);
      if (this.af() == dcw.j && this.ae().a(dww.c)) {
         this.ab = new dxb(this, $$16, $$0.bb().C());
      } else {
         this.ab = null;
      }

      this.P = new auu();
      this.O = new dya(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(bqy.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dxb $$0) {
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
   public jm<ddw> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public ddq a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bnf $$1 = this.ag();
      this.Z = true;
      brc $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.au();
      }

      int $$4 = this.ab().c(dcs.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.ab().b(dcs.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.ab().b(dcs.v) && this.ad()) {
            this.g();
         }
      }

      this.U();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ai() && $$3) {
         long $$6 = this.Z();
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
            if (!$$2x.dK()) {
               if (this.i($$2x)) {
                  $$2x.aq();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dB();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dr().a())) {
                     bsr $$3x = $$2x.dd();
                     if ($$3x != null) {
                        if (!$$3x.dK() && $$3x.x($$2x)) {
                           return;
                        }

                        $$2x.ad();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.T();
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
         this.K.s().a(this.J, $$0);
         if (this.A.o().b(dcs.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dcj $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bsr $$0) {
      return this.J.ab() || !($$0 instanceof cfe) && !($$0 instanceof cgg) ? !this.J.ac() && $$0 instanceof cmj : true;
   }

   private void as() {
      this.P.a();
      this.H.stream().filter(btn::fI).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dvi $$0, int $$1) {
      dcd $$2 = $$0.f();
      boolean $$3 = this.ad();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bnf $$6 = this.ag();
      $$6.a("thunder");
      if ($$3 && this.ac() && this.z.a(100000) == 0) {
         jd $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bqp $$8 = this.d_($$7);
            boolean $$9 = this.ab().b(dcs.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dga.ss);
            if ($$9) {
               cho $$10 = bsx.aO.a((dcw)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            btm $$11 = bsx.am.a((dcw)this);
            if ($$11 != null) {
               $$11.f(exa.c($$7));
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
         dvj[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dvj $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = kf.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jd $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dtc $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  epc $$21 = $$20.u();
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
   public void a(jd $$0) {
      jd $$1 = this.a(dyy.a.e, $$0);
      jd $$2 = $$1.e();
      ddw $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dga.dO.o());
      }

      if (this.ad()) {
         int $$4 = this.ab().c(dcs.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dtc $$5 = this.a_($$1);
            if ($$5.a(dga.dN)) {
               int $$6 = $$5.c(dni.c);
               if ($$6 < Math.min($$4, 8)) {
                  dtc $$7 = $$5.a(dni.c, Integer.valueOf($$6 + 1));
                  dfy.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dga.dN.o());
            }
         }

         ddw.c $$8 = $$3.a($$2);
         if ($$8 != ddw.c.a) {
            dtc $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jd> E(jd $$0) {
      Optional<jd> $$1 = this.y().e($$0x -> $$0x.a(cew.t), $$0x -> $$0x.v() == this.a(dyy.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, ces.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jd b(jd $$0) {
      jd $$1 = this.a(dyy.a.e, $$0);
      Optional<jd> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ewv $$3 = ewv.a($$1, new jd($$1.h(this.am()))).g(3.0);
         List<btn> $$4 = this.a(btn.class, $$3, $$0x -> $$0x != null && $$0x.bE() && this.h($$0x.dp()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dp();
         } else {
            if ($$1.v() == this.I_() - 1) {
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
      return this.ab().c(dcs.P) <= 100;
   }

   private void at() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.ab().c(dcs.P);
            wz $$1;
            if (this.P.a($$0)) {
               $$1 = wz.c("sleep.skipping_night");
            } else {
               $$1 = wz.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (aqv $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.P.a(this.H)) {
         this.at();
      }
   }

   public alk f() {
      return this.J.aK();
   }

   private void au() {
      boolean $$0 = this.ad();
      if (this.D_().g()) {
         if (this.ab().b(dcs.v)) {
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

         this.y = ayo.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = ayo.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new adb(adb.i, this.w), this.af());
      }

      if (this.x != this.y) {
         this.J.ah().a(new adb(adb.j, this.y), this.af());
      }

      if ($$0 != this.ad()) {
         if ($$0) {
            this.J.ah().a(new adb(adb.d, 0.0F));
         } else {
            this.J.ah().a(new adb(adb.c, 0.0F));
         }

         this.J.ah().a(new adb(adb.i, this.w));
         this.J.ah().a(new adb(adb.j, this.y));
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

   private void a(jd $$0, epb $$1) {
      epc $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((dcw)this, $$0);
      }
   }

   private void d(jd $$0, dfy $$1) {
      dtc $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bsr $$0) {
      $$0.bv();
      bnf $$1 = this.ag();
      $$0.ai++;
      this.ag().a(() -> lt.f.b($$0.am()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ag().c();

      for (bsr $$2 : $$0.cT()) {
         this.a($$0, $$2);
      }
   }

   private void a(bsr $$0, bsr $$1) {
      if ($$1.dK() || $$1.dd() != $$0) {
         $$1.ad();
      } else if ($$1 instanceof cmx || this.M.c($$1)) {
         $$1.bv();
         $$1.ai++;
         bnf $$2 = this.ag();
         $$2.a(() -> lt.f.b($$1.am()).toString());
         $$2.d("tickPassenger");
         $$1.u();
         $$2.c();

         for (bsr $$3 : $$1.cT()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cmx $$0, jd $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable ayv $$0, boolean $$1, boolean $$2) {
      aqs $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wz.c("menu.savingLevel"));
         }

         this.av();
         if ($$0 != null) {
            $$0.c(wz.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.N.c();
         } else {
            this.N.b();
         }
      }
   }

   private void av() {
      if (this.ab != null) {
         this.J.bb().a(this.ab.b());
      }

      this.l().k().a();
   }

   public <T extends bsr> List<? extends T> a(dxn<bsr, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bsr> void a(dxn<bsr, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bsr> void a(dxn<bsr, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axa.a.b;
            }
         }

         return axa.a.a;
      });
   }

   public List<? extends cia> i() {
      return this.a(bsx.F, btn::bE);
   }

   public List<aqv> a(Predicate<? super aqv> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aqv> a(Predicate<? super aqv> $$0, int $$1) {
      List<aqv> $$2 = Lists.newArrayList();

      for (aqv $$3 : this.H) {
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
   public aqv j() {
      List<aqv> $$0 = this.a(btn::bE);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bsr $$0) {
      return this.j($$0);
   }

   public boolean c(bsr $$0) {
      return this.j($$0);
   }

   public void d(bsr $$0) {
      if ($$0 instanceof aqv $$1) {
         this.c($$1);
      } else {
         this.j($$0);
      }
   }

   public void a(aqv $$0) {
      this.c($$0);
   }

   public void b(aqv $$0) {
      this.c($$0);
   }

   private void c(aqv $$0) {
      bsr $$1 = this.G().a($$0.cA());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cA());
         $$1.ak();
         this.a((aqv)$$1, bsr.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bsr $$0) {
      if ($$0.dK()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bsx.a($$0.am()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bsr $$0) {
      if ($$0.cV().map(bsr::cA).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dvi $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(aqv $$0, bsr.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jd $$1, int $$2) {
      for (aqv $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dP() == this && $$3.an() != $$0) {
            double $$4 = (double)$$1.u() - $$3.du();
            double $$5 = (double)$$1.v() - $$3.dw();
            double $$6 = (double)$$1.w() - $$3.dA();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new aca($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cmx $$0, double $$1, double $$2, double $$3, jm<avo> $$4, avq $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.af(), new afp($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cmx $$0, bsr $$1, jm<avo> $$2, avq $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.du(), $$1.dw(), $$1.dA(), (double)$$2.a().a($$4), this.af(), new afo($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jd $$1, int $$2) {
      if (this.ab().b(dcs.W)) {
         this.J.ah().a(new adh($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cmx $$0, int $$1, jd $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.af(), new adh($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(jm<dxz> $$0, exa $$1, dxz.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(jd $$0, dtc $$1, dtc $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ad.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      ext $$5 = $$1.k(this, $$0);
      ext $$6 = $$2.k(this, $$0);
      if (exq.c($$5, $$6, exe.g)) {
         List<cda> $$7 = new ObjectArrayList();

         for (btp $$8 : this.V) {
            cda $$9 = $$8.N();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (cda $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(jd $$0, dfy $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(jd $$0, dfy $$1, ji $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(jd $$0, dfy $$1, jd $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dtc $$0, jd $$1, dfy $$2, jd $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bsr $$0, byte $$1) {
      this.l().a($$0, new acy($$0, $$1));
   }

   @Override
   public void a(bsr $$0, brk $$1) {
      this.l().a($$0, new acu($$0, $$1));
   }

   public aqs l() {
      return this.I;
   }

   @Override
   public dco a(
      @Nullable bsr $$0,
      @Nullable brk $$1,
      @Nullable dcp $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcw.a $$8,
      lk $$9,
      lk $$10,
      jm<avo> $$11
   ) {
      dco $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (aqv $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new acz($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(jd $$0, dfy $$1, int $$2, int $$3) {
      this.X.add(new dcb($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         dcb $$0 = (dcb)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.af(), new acc($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(dcb $$0) {
      dtc $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eyo<dfy> m() {
      return this.S;
   }

   public eyo<epb> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public eqb p() {
      return this.R;
   }

   public ens q() {
      return this.J.ba();
   }

   public <T extends lk> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adi $$9 = new adi($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         aqv $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lk> boolean a(aqv $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zg<?> $$11 = new adi($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aqv $$0, boolean $$1, double $$2, double $$3, double $$4, zg<?> $$5) {
      if ($$0.dP() != this) {
         return false;
      } else {
         jd $$6 = $$0.dp();
         if ($$6.a(new exa($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bsr a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bsr b(int $$0) {
      bsr $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bsr)this.ac.get($$0);
   }

   @Nullable
   public bsr a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jd a(awu<ejp> $$0, jd $$1, int $$2, boolean $$3) {
      if (!this.J.bb().y().c()) {
         return null;
      } else {
         Optional<jq.c<ejp>> $$4 = this.H_().d(lu.aR).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jd, jm<ejp>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jd)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jd, jm<ddw>> a(Predicate<jm<ddw>> $$0, jd $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public czd r() {
      return this.J.aJ();
   }

   @Override
   public brc s() {
      return this.J.aQ();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public eqx u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public eqr a(eqp $$0) {
      return this.o().I().u().b(eqr.a(), $$0.a());
   }

   @Override
   public void a(eqp $$0, eqr $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public eqp v() {
      return this.o().I().u().a(eqq.a(), "idcounts").b();
   }

   public void a(jd $$0, float $$1) {
      jd $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new aex($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(aqz.a, new dcd($$2), this.L, azs.a);
      }

      int $$4 = this.ab().c(dcs.Z) + 1;
      if ($$4 > 1) {
         this.l().a(aqz.a, new dcd($$0), $$4, azs.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      dcr $$0 = this.u().b(dcr.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dcr $$3 = this.u().a(dcr.a(), "chunks");
      dcd $$4 = new dcd($$0, $$1);
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
   public List<aqv> x() {
      return this.H;
   }

   @Override
   public void a(jd $$0, dtc $$1, dtc $$2) {
      Optional<jm<cev>> $$3 = cew.a($$1);
      Optional<jm<cev>> $$4 = cew.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jd $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               agf.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               agf.a(this, $$5);
            }));
      }
   }

   public ces y() {
      return this.l().l();
   }

   public boolean c(jd $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kf $$0) {
      return this.c($$0.k());
   }

   public boolean a(jd $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kf.a($$0)) <= $$1;
   }

   public int b(kf $$0) {
      return this.y().a($$0);
   }

   public cok z() {
      return this.f;
   }

   @Nullable
   public coi d(jd $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jd $$0) {
      return this.d($$0) != null;
   }

   public void a(cep $$0, bsr $$1, bud $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqb $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         ddh.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<btq> $$4 = (Entry<btq>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((btq)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.N.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.r.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.m().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.n().a()));
         $$2.write("distance_manager: " + $$1.j().c() + "\n");
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

   private static void a(Writer $$0, Iterable<bsr> $$1) throws IOException {
      axn $$2 = axn.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bsr $$3 : $$1) {
         wz $$4 = $$3.aj();
         wz $$5 = $$3.S_();
         $$2.a($$3.du(), $$3.dw(), $$3.dA(), $$3.cA(), lt.f.b($$3.am()), $$3.bE(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axn $$1 = axn.a().a("x").a("y").a("z").a("type").a($$0);

      for (dsa $$2 : this.r) {
         jd $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(ejh $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jd $$0, dfy $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ji $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bsr> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.e() + "]";
   }

   public boolean B() {
      return this.J.bb().z();
   }

   @Override
   public long C() {
      return this.J.bb().y().b();
   }

   @Nullable
   public dxb D() {
      return this.ab;
   }

   @Override
   public aqu E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> lt.f.b($$0.am()).toString()),
         this.r.size(),
         a(this.r, dsa::d),
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
   protected dxp<bsr> G() {
      return this.N.d();
   }

   public void a(Stream<bsr> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bsr> $$0) {
      this.N.b($$0);
   }

   public void b(dvi $$0) {
      $$0.c(this.A_().c());
   }

   public void a(duy $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public epu H() {
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

   public boolean f(jd $$0) {
      return this.N.a($$0) && this.I.a.j().c(dcd.a($$0));
   }

   public boolean g(jd $$0) {
      return this.N.a($$0);
   }

   public boolean a(dcd $$0) {
      return this.N.a($$0);
   }

   @Override
   public cpl J() {
      return this.J.bb().K();
   }

   @Override
   public cwt K() {
      return this.J.bp();
   }

   public ayw a(akr $$0) {
      return this.ag.a($$0);
   }

   public bqy L() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dxo<bsr> {
      public void a(bsr $$0) {
      }

      public void b(bsr $$0) {
         aqu.this.f().a($$0);
      }

      public void c(bsr $$0) {
         aqu.this.M.a($$0);
      }

      public void d(bsr $$0) {
         aqu.this.M.b($$0);
      }

      public void e(bsr $$0) {
         aqu.this.l().b($$0);
         if ($$0 instanceof aqv $$1) {
            aqu.this.H.add($$1);
            aqu.this.e();
         }

         if ($$0 instanceof btp $$2) {
            if (aqu.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqu.this.V.add($$2);
         }

         if ($$0 instanceof cia $$4) {
            for (chy $$5 : $$4.gh()) {
               aqu.this.ac.put($$5.an(), $$5);
            }
         }

         $$0.a(dxw::a);
      }

      public void f(bsr $$0) {
         aqu.this.l().a($$0);
         if ($$0 instanceof aqv $$1) {
            aqu.this.H.remove($$1);
            aqu.this.e();
         }

         if ($$0 instanceof btp $$2) {
            if (aqu.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqu.this.V.remove($$2);
         }

         if ($$0 instanceof cia $$4) {
            for (chy $$5 : $$4.gh()) {
               aqu.this.ac.remove($$5.an());
            }
         }

         $$0.a(dxw::b);
      }

      public void g(bsr $$0) {
         $$0.a(dxw::c);
      }
   }
}
