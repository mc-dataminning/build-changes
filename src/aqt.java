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

public class aqt extends dcu implements ddq {
   public static final jd a = new jd(100, 50, 0);
   public static final bpv b = bqb.a(12000, 180000);
   public static final bpv c = bqb.a(12000, 24000);
   private static final bpv D = bqb.a(12000, 180000);
   public static final bpv d = bqb.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<aqu> H = Lists.newArrayList();
   private final aqr I;
   private final MinecraftServer J;
   private final ere K;
   private int L;
   final dxj M = new dxj();
   private final dxo<bsq> N;
   private final dxx O;
   public boolean e;
   private final aut P;
   private int Q;
   private final epx R;
   private final eyk<dfw> S = new eyk<>(this::d, this.ah());
   private final eyk<eox> T = new eyk<>(this::d, this.ah());
   private final epq U = new epq();
   final Set<btn> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final coi f;
   private final ObjectLinkedOpenHashSet<dbz> X = new ObjectLinkedOpenHashSet();
   private final List<dbz> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<dch> aa;
   @Nullable
   private dwy ab;
   final Int2ObjectMap<chw> ac = new Int2ObjectOpenHashMap();
   private final ddo ad;
   private final ejn ae;
   private final boolean af;
   private final bqx ag;

   public aqt(
      MinecraftServer $$0,
      Executor $$1,
      eqz.c $$2,
      ere $$3,
      akp<dcu> $$4,
      dww $$5,
      arc $$6,
      boolean $$7,
      long $$8,
      List<dch> $$9,
      boolean $$10,
      @Nullable bqx $$11
   ) {
      super($$3, $$4, $$0.bc(), $$5.a(), $$0::aT, false, $$7, $$8, $$0.bl());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      dux $$12 = $$5.b();
      boolean $$13 = $$0.aZ();
      DataFixer $$14 = $$0.aD();
      dxg<bsq> $$15 = new dwh(new dwr(new dwp($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, azv.s), this, $$0);
      this.N = new dxo<>(bsq.class, new aqt.a(), $$15);
      this.I = new aqr(this, $$2, $$14, $$0.ba(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new epx(this);
      this.U();
      this.X();
      this.C_().a($$0.ax());
      this.f = this.u().a(coi.a(this), coi.a(this.ae()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bb().y().b();
      this.ae = new ejn(this.I.m(), this.H_(), $$0.ba(), $$4, $$12, this.I.i(), this, $$12.d(), $$16, $$14);
      this.ad = new ddo(this, $$0.bb().y(), this.ae);
      if (this.af() == dcu.j && this.ae().a(dwt.c)) {
         this.ab = new dwy(this, $$16, $$0.bb().C());
      } else {
         this.ab = null;
      }

      this.P = new aut();
      this.O = new dxx(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(bqx.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dwy $$0) {
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
   public jm<ddu> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public ddo a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bne $$1 = this.ag();
      this.Z = true;
      brb $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.au();
      }

      int $$4 = this.ab().c(dcq.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.ab().b(dcq.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.ab().b(dcq.v) && this.ad()) {
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
            if (!$$2x.dL()) {
               if (this.i($$2x)) {
                  $$2x.aq();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dC();
                  $$1.c();
                  if (this.I.a.j().c($$2x.ds().a())) {
                     bsq $$3x = $$2x.dd();
                     if ($$3x != null) {
                        if (!$$3x.dL() && $$3x.x($$2x)) {
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
         if (this.A.o().b(dcq.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dch $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bsq $$0) {
      return this.J.ab() || !($$0 instanceof cfc) && !($$0 instanceof cge) ? !this.J.ac() && $$0 instanceof cmh : true;
   }

   private void as() {
      this.P.a();
      this.H.stream().filter(btl::fI).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dvg $$0, int $$1) {
      dcb $$2 = $$0.f();
      boolean $$3 = this.ad();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bne $$6 = this.ag();
      $$6.a("thunder");
      if ($$3 && this.ac() && this.z.a(100000) == 0) {
         jd $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bqo $$8 = this.d_($$7);
            boolean $$9 = this.ab().b(dcq.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dfy.ss);
            if ($$9) {
               chm $$10 = bsw.aO.a((dcu)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            btk $$11 = bsw.am.a((dcu)this);
            if ($$11 != null) {
               $$11.f(eww.c($$7));
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
         dvh[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dvh $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = kf.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jd $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dta $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eoy $$21 = $$20.u();
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
      jd $$1 = this.a(dyv.a.e, $$0);
      jd $$2 = $$1.d();
      ddu $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dfy.dO.o());
      }

      if (this.ad()) {
         int $$4 = this.ab().c(dcq.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dta $$5 = this.a_($$1);
            if ($$5.a(dfy.dN)) {
               int $$6 = $$5.c(dng.c);
               if ($$6 < Math.min($$4, 8)) {
                  dta $$7 = $$5.a(dng.c, Integer.valueOf($$6 + 1));
                  dfw.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dfy.dN.o());
            }
         }

         ddu.c $$8 = $$3.a($$2);
         if ($$8 != ddu.c.a) {
            dta $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jd> E(jd $$0) {
      Optional<jd> $$1 = this.y().e($$0x -> $$0x.a(ceu.t), $$0x -> $$0x.v() == this.a(dyv.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, ceq.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jd b(jd $$0) {
      jd $$1 = this.a(dyv.a.e, $$0);
      Optional<jd> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ewr $$3 = ewr.a($$1, new jd($$1.h(this.am()))).g(3.0);
         List<btl> $$4 = this.a(btl.class, $$3, $$0x -> $$0x != null && $$0x.bE() && this.h($$0x.dq()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dq();
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
      return this.ab().c(dcq.P) <= 100;
   }

   private void at() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.ab().c(dcq.P);
            wy $$1;
            if (this.P.a($$0)) {
               $$1 = wy.c("sleep.skipping_night");
            } else {
               $$1 = wy.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (aqu $$3 : this.H) {
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

   public alj f() {
      return this.J.aK();
   }

   private void au() {
      boolean $$0 = this.ad();
      if (this.D_().g()) {
         if (this.ab().b(dcq.v)) {
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

         this.y = ayn.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = ayn.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new ada(ada.i, this.w), this.af());
      }

      if (this.x != this.y) {
         this.J.ah().a(new ada(ada.j, this.y), this.af());
      }

      if ($$0 != this.ad()) {
         if ($$0) {
            this.J.ah().a(new ada(ada.d, 0.0F));
         } else {
            this.J.ah().a(new ada(ada.c, 0.0F));
         }

         this.J.ah().a(new ada(ada.i, this.w));
         this.J.ah().a(new ada(ada.j, this.y));
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

   private void a(jd $$0, eox $$1) {
      eoy $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((dcu)this, $$0);
      }
   }

   private void d(jd $$0, dfw $$1) {
      dta $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bsq $$0) {
      $$0.bv();
      bne $$1 = this.ag();
      $$0.ai++;
      this.ag().a(() -> lt.f.b($$0.am()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ag().c();

      for (bsq $$2 : $$0.cT()) {
         this.a($$0, $$2);
      }
   }

   private void a(bsq $$0, bsq $$1) {
      if ($$1.dL() || $$1.dd() != $$0) {
         $$1.ad();
      } else if ($$1 instanceof cmv || this.M.c($$1)) {
         $$1.bv();
         $$1.ai++;
         bne $$2 = this.ag();
         $$2.a(() -> lt.f.b($$1.am()).toString());
         $$2.d("tickPassenger");
         $$1.u();
         $$2.c();

         for (bsq $$3 : $$1.cT()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cmv $$0, jd $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable ayu $$0, boolean $$1, boolean $$2) {
      aqr $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wy.c("menu.savingLevel"));
         }

         this.av();
         if ($$0 != null) {
            $$0.c(wy.c("menu.savingChunks"));
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

   public <T extends bsq> List<? extends T> a(dxk<bsq, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bsq> void a(dxk<bsq, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bsq> void a(dxk<bsq, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return awz.a.b;
            }
         }

         return awz.a.a;
      });
   }

   public List<? extends chy> i() {
      return this.a(bsw.F, btl::bE);
   }

   public List<aqu> a(Predicate<? super aqu> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aqu> a(Predicate<? super aqu> $$0, int $$1) {
      List<aqu> $$2 = Lists.newArrayList();

      for (aqu $$3 : this.H) {
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
   public aqu j() {
      List<aqu> $$0 = this.a(btl::bE);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bsq $$0) {
      return this.j($$0);
   }

   public boolean c(bsq $$0) {
      return this.j($$0);
   }

   public void d(bsq $$0) {
      if ($$0 instanceof aqu $$1) {
         this.c($$1);
      } else {
         this.j($$0);
      }
   }

   public void a(aqu $$0) {
      this.c($$0);
   }

   public void b(aqu $$0) {
      this.c($$0);
   }

   private void c(aqu $$0) {
      bsq $$1 = this.G().a($$0.cA());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cA());
         $$1.ak();
         this.a((aqu)$$1, bsq.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bsq $$0) {
      if ($$0.dL()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bsw.a($$0.am()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bsq $$0) {
      if ($$0.cV().map(bsq::cA).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dvg $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(aqu $$0, bsq.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jd $$1, int $$2) {
      for (aqu $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dQ() == this && $$3.an() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dv();
            double $$5 = (double)$$1.v() - $$3.dx();
            double $$6 = (double)$$1.w() - $$3.dB();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new abz($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cmv $$0, double $$1, double $$2, double $$3, jm<avn> $$4, avp $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.af(), new afo($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cmv $$0, bsq $$1, jm<avn> $$2, avp $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.dv(), $$1.dx(), $$1.dB(), (double)$$2.a().a($$4), this.af(), new afn($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jd $$1, int $$2) {
      if (this.ab().b(dcq.W)) {
         this.J.ah().a(new adg($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cmv $$0, int $$1, jd $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.af(), new adg($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(jm<dxw> $$0, eww $$1, dxw.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(jd $$0, dta $$1, dta $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ad.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      exp $$5 = $$1.k(this, $$0);
      exp $$6 = $$2.k(this, $$0);
      if (exm.c($$5, $$6, exa.g)) {
         List<ccy> $$7 = new ObjectArrayList();

         for (btn $$8 : this.V) {
            ccy $$9 = $$8.J();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (ccy $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(jd $$0, dfw $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(jd $$0, dfw $$1, ji $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(jd $$0, dfw $$1, jd $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dta $$0, jd $$1, dfw $$2, jd $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bsq $$0, byte $$1) {
      this.l().a($$0, new acx($$0, $$1));
   }

   @Override
   public void a(bsq $$0, brj $$1) {
      this.l().a($$0, new act($$0, $$1));
   }

   public aqr l() {
      return this.I;
   }

   @Override
   public dcm a(
      @Nullable bsq $$0,
      @Nullable brj $$1,
      @Nullable dcn $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcu.a $$8,
      lk $$9,
      lk $$10,
      jm<avn> $$11
   ) {
      dcm $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (aqu $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new acy($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(jd $$0, dfw $$1, int $$2, int $$3) {
      this.X.add(new dbz($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         dbz $$0 = (dbz)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.af(), new acb($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(dbz $$0) {
      dta $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eyk<dfw> m() {
      return this.S;
   }

   public eyk<eox> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public epx p() {
      return this.R;
   }

   public eno q() {
      return this.J.ba();
   }

   public <T extends lk> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adh $$9 = new adh($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         aqu $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lk> boolean a(aqu $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zf<?> $$11 = new adh($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aqu $$0, boolean $$1, double $$2, double $$3, double $$4, zf<?> $$5) {
      if ($$0.dQ() != this) {
         return false;
      } else {
         jd $$6 = $$0.dq();
         if ($$6.a(new eww($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bsq a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bsq b(int $$0) {
      bsq $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bsq)this.ac.get($$0);
   }

   @Nullable
   public bsq a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jd a(awt<ejm> $$0, jd $$1, int $$2, boolean $$3) {
      if (!this.J.bb().y().c()) {
         return null;
      } else {
         Optional<jq.c<ejm>> $$4 = this.H_().d(lu.aR).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jd, jm<ejm>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jd)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jd, jm<ddu>> a(Predicate<jm<ddu>> $$0, jd $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public czb r() {
      return this.J.aJ();
   }

   @Override
   public brb s() {
      return this.J.aQ();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public eqt u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public eqn a(eql $$0) {
      return this.o().I().u().b(eqn.a(), $$0.a());
   }

   @Override
   public void a(eql $$0, eqn $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public eql v() {
      return this.o().I().u().a(eqm.a(), "idcounts").b();
   }

   public void a(jd $$0, float $$1) {
      jd $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new aew($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(aqy.a, new dcb($$2), this.L, azr.a);
      }

      int $$4 = this.ab().c(dcq.Z) + 1;
      if ($$4 > 1) {
         this.l().a(aqy.a, new dcb($$0), $$4, azr.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      dcp $$0 = this.u().b(dcp.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dcp $$3 = this.u().a(dcp.a(), "chunks");
      dcb $$4 = new dcb($$0, $$1);
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
   public List<aqu> x() {
      return this.H;
   }

   @Override
   public void a(jd $$0, dta $$1, dta $$2) {
      Optional<jm<cet>> $$3 = ceu.a($$1);
      Optional<jm<cet>> $$4 = ceu.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jd $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               age.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               age.a(this, $$5);
            }));
      }
   }

   public ceq y() {
      return this.l().l();
   }

   public boolean c(jd $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kf $$0) {
      return this.c($$0.q());
   }

   public boolean a(jd $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kf.a($$0)) <= $$1;
   }

   public int b(kf $$0) {
      return this.y().a($$0);
   }

   public coi z() {
      return this.f;
   }

   @Nullable
   public cog d(jd $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jd $$0) {
      return this.d($$0) != null;
   }

   public void a(cen $$0, bsq $$1, bub $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqa $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         ddf.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bto> $$4 = (Entry<bto>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bto)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bsq> $$1) throws IOException {
      axm $$2 = axm.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bsq $$3 : $$1) {
         wy $$4 = $$3.aj();
         wy $$5 = $$3.O_();
         $$2.a($$3.dv(), $$3.dx(), $$3.dB(), $$3.cA(), lt.f.b($$3.am()), $$3.bE(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axm $$1 = axm.a().a("x").a("y").a("z").a("type").a($$0);

      for (dry $$2 : this.r) {
         jd $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eje $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jd $$0, dfw $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ji $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bsq> A() {
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
   public dwy D() {
      return this.ab;
   }

   @Override
   public aqt E() {
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
         a(this.r, dry::d),
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
   protected dxm<bsq> G() {
      return this.N.d();
   }

   public void a(Stream<bsq> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bsq> $$0) {
      this.N.b($$0);
   }

   public void b(dvg $$0) {
      $$0.c(this.A_().c());
   }

   public void a(duw $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public epq H() {
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
      return this.N.a($$0) && this.I.a.j().c(dcb.a($$0));
   }

   public boolean g(jd $$0) {
      return this.N.a($$0);
   }

   public boolean a(dcb $$0) {
      return this.N.a($$0);
   }

   @Override
   public cpj J() {
      return this.J.bb().K();
   }

   @Override
   public cwr K() {
      return this.J.bp();
   }

   public ayv a(akq $$0) {
      return this.ag.a($$0);
   }

   public bqx L() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dxl<bsq> {
      public void a(bsq $$0) {
      }

      public void b(bsq $$0) {
         aqt.this.f().a($$0);
      }

      public void c(bsq $$0) {
         aqt.this.M.a($$0);
      }

      public void d(bsq $$0) {
         aqt.this.M.b($$0);
      }

      public void e(bsq $$0) {
         aqt.this.l().b($$0);
         if ($$0 instanceof aqu $$1) {
            aqt.this.H.add($$1);
            aqt.this.e();
         }

         if ($$0 instanceof btn $$2) {
            if (aqt.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqt.this.V.add($$2);
         }

         if ($$0 instanceof chy $$4) {
            for (chw $$5 : $$4.gi()) {
               aqt.this.ac.put($$5.an(), $$5);
            }
         }

         $$0.a(dxt::a);
      }

      public void f(bsq $$0) {
         aqt.this.l().a($$0);
         if ($$0 instanceof aqu $$1) {
            aqt.this.H.remove($$1);
            aqt.this.e();
         }

         if ($$0 instanceof btn $$2) {
            if (aqt.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqt.this.V.remove($$2);
         }

         if ($$0 instanceof chy $$4) {
            for (chw $$5 : $$4.gi()) {
               aqt.this.ac.remove($$5.an());
            }
         }

         $$0.a(dxt::b);
      }

      public void g(bsq $$0) {
         $$0.a(dxt::c);
      }
   }
}
