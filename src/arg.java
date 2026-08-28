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

public class arg extends dds implements dep {
   public static final je a = new je(100, 50, 0);
   public static final bqp b = bqv.a(12000, 180000);
   public static final bqp c = bqv.a(12000, 24000);
   private static final bqp D = bqv.a(12000, 180000);
   public static final bqp d = bqv.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<arh> H = Lists.newArrayList();
   private final are I;
   private final MinecraftServer J;
   private final esm K;
   private int L;
   final dyk M = new dyk();
   private final dyp<btj> N;
   private final dyy O;
   public boolean e;
   private final avj P;
   private int Q;
   private final era R;
   private final ezs<dgv> S = new ezs<>(this::d, this.ai());
   private final ezs<eqa> T = new ezs<>(this::d, this.ai());
   private final eqt U = new eqt();
   final Set<buh> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final cpe f;
   private final ObjectLinkedOpenHashSet<dcw> X = new ObjectLinkedOpenHashSet();
   private final List<dcw> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<dde> aa;
   @Nullable
   private dxz ab;
   final Int2ObjectMap<cip> ac = new Int2ObjectOpenHashMap();
   private final den ad;
   private final ekp ae;
   private final boolean af;
   private final brp ag;

   public arg(
      MinecraftServer $$0,
      Executor $$1,
      esh.c $$2,
      esm $$3,
      ala<dds> $$4,
      dxx $$5,
      arp $$6,
      boolean $$7,
      long $$8,
      List<dde> $$9,
      boolean $$10,
      @Nullable brp $$11
   ) {
      super($$3, $$4, $$0.bb(), $$5.a(), $$0::aS, false, $$7, $$8, $$0.bk());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      dvx $$12 = $$5.b();
      boolean $$13 = $$0.aY();
      DataFixer $$14 = $$0.aC();
      dyh<btj> $$15 = new dxh(new dxs(new dxp($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bal.s), this, $$0);
      this.N = new dyp<>(btj.class, new arg.a(), $$15);
      this.I = new are(this, $$2, $$14, $$0.aZ(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.N::a, () -> $$0.J().u());
      this.I.h().b();
      this.R = new era(this);
      this.V();
      this.Y();
      this.A_().a($$0.aw());
      this.f = this.u().a(cpe.a(this), cpe.a(this.af()));
      if (!$$0.U()) {
         $$3.a($$0.t_());
      }

      long $$16 = $$0.ba().y().b();
      this.ae = new ekp(this.I.m(), this.F_(), $$0.aZ(), $$4, $$12, this.I.i(), this, $$12.d(), $$16, $$14);
      this.ad = new den(this, $$0.ba().y(), this.ae);
      if (this.ag() == dds.j && this.af().a(dxu.c)) {
         this.ab = new dxz(this, $$16, $$0.ba().C());
      } else {
         this.ab = null;
      }

      this.P = new avj();
      this.O = new dyy(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(brp.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dxz $$0) {
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
   public jn<det> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public den a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bny $$1 = this.ah();
      this.Z = true;
      brt $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.A_().s();
         $$1.b("weather");
         this.av();
         $$1.c();
      }

      int $$4 = this.ac().c(ddo.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.ac().b(ddo.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.at();
         if (this.ac().b(ddo.v) && this.ae()) {
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
                  if ($$2x instanceof arh || this.I.a.j().c($$2x.du().a())) {
                     btj $$3x = $$2x.dg();
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
         if (this.A.o().b(ddo.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dde $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void at() {
      this.P.a();
      this.H.stream().filter(buf::fL).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dwg $$0, int $$1) {
      dcy $$2 = $$0.f();
      boolean $$3 = this.ae();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bny $$6 = this.ah();
      $$6.a("thunder");
      if ($$3 && this.ad() && this.z.a(100000) == 0) {
         je $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bri $$8 = this.d_($$7);
            boolean $$9 = this.ac().b(ddo.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dgx.ss);
            if ($$9) {
               cif $$10 = btq.aO.a(this, btp.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bue $$11 = btq.am.a(this, btp.h);
            if ($$11 != null) {
               $$11.e(eye.c($$7));
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
         dwh[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dwh $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = kg.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  je $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dua $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eqb $$21 = $$20.y();
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
   public void a(je $$0) {
      je $$1 = this.a(dzw.a.e, $$0);
      je $$2 = $$1.e();
      det $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dgx.dO.o());
      }

      if (this.ae()) {
         int $$4 = this.ac().c(ddo.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dua $$5 = this.a_($$1);
            if ($$5.a(dgx.dN)) {
               int $$6 = $$5.c(dof.c);
               if ($$6 < Math.min($$4, 8)) {
                  dua $$7 = $$5.b(dof.c, Integer.valueOf($$6 + 1));
                  dgv.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dgx.dN.o());
            }
         }

         det.c $$8 = $$3.a($$2, this.N());
         if ($$8 != det.c.a) {
            dua $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<je> E(je $$0) {
      Optional<je> $$1 = this.y().e($$0x -> $$0x.a(cfm.t), $$0x -> $$0x.v() == this.a(dzw.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cfi.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected je b(je $$0) {
      je $$1 = this.a(dzw.a.e, $$0);
      Optional<je> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         exz $$3 = exz.a($$1, new je($$1.h(this.an()))).g(3.0);
         List<buf> $$4 = this.a(buf.class, $$3, $$0x -> $$0x != null && $$0x.bI() && this.h($$0x.ds()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).ds();
         } else {
            if ($$1.v() == this.G_() - 1) {
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
      return this.ac().c(ddo.P) <= 100;
   }

   private void au() {
      if (this.d()) {
         if (!this.o().U() || this.o().r()) {
            int $$0 = this.ac().c(ddo.P);
            xd $$1;
            if (this.P.a($$0)) {
               $$1 = xd.c("sleep.skipping_night");
            } else {
               $$1 = xd.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (arh $$3 : this.H) {
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

   public alu f() {
      return this.J.aJ();
   }

   private void av() {
      boolean $$0 = this.ae();
      if (this.B_().g()) {
         if (this.ac().b(ddo.v)) {
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

         this.y = azc.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = azc.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ag().a(new adg(adg.i, this.w), this.ag());
      }

      if (this.x != this.y) {
         this.J.ag().a(new adg(adg.j, this.y), this.ag());
      }

      if ($$0 != this.ae()) {
         if ($$0) {
            this.J.ag().a(new adg(adg.d, 0.0F));
         } else {
            this.J.ag().a(new adg(adg.c, 0.0F));
         }

         this.J.ag().a(new adg(adg.i, this.w));
         this.J.ag().a(new adg(adg.j, this.y));
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

   private void a(je $$0, eqa $$1) {
      dua $$2 = this.a_($$0);
      eqb $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(je $$0, dgv $$1) {
      dua $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(btj $$0) {
      $$0.by();
      bny $$1 = this.ah();
      $$0.ag++;
      this.ah().a(() -> lu.f.b($$0.ao()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ah().c();

      for (btj $$2 : $$0.cW()) {
         this.a($$0, $$2);
      }
   }

   private void a(btj $$0, btj $$1) {
      if ($$1.dN() || $$1.dg() != $$0) {
         $$1.af();
      } else if ($$1 instanceof cnp || this.M.c($$1)) {
         $$1.by();
         $$1.ag++;
         bny $$2 = this.ah();
         $$2.a(() -> lu.f.b($$1.ao()).toString());
         $$2.d("tickPassenger");
         $$1.u();
         $$2.c();

         for (btj $$3 : $$1.cW()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cnp $$0, je $$1) {
      return !this.J.a(this, $$1, $$0) && this.A_().a($$1);
   }

   public void a(@Nullable azj $$0, boolean $$1, boolean $$2) {
      are $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xd.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xd.c("menu.savingChunks"));
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

      esb $$1 = this.l().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends btj> List<? extends T> a(dyl<btj, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends btj> void a(dyl<btj, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends btj> void a(dyl<btj, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axo.a.b;
            }
         }

         return axo.a.a;
      });
   }

   public List<? extends cis> i() {
      return this.a(btq.F, buf::bI);
   }

   public List<arh> a(Predicate<? super arh> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<arh> a(Predicate<? super arh> $$0, int $$1) {
      List<arh> $$2 = Lists.newArrayList();

      for (arh $$3 : this.H) {
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
   public arh j() {
      List<arh> $$0 = this.a(buf::bI);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(btj $$0) {
      return this.i($$0);
   }

   public boolean c(btj $$0) {
      return this.i($$0);
   }

   public void d(btj $$0) {
      if ($$0 instanceof arh $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(arh $$0) {
      this.c($$0);
   }

   public void b(arh $$0) {
      this.c($$0);
   }

   private void c(arh $$0) {
      btj $$1 = this.G().a($$0.cD());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cD());
         $$1.am();
         this.a((arh)$$1, btj.c.b);
      }

      this.N.a($$0);
   }

   private boolean i(btj $$0) {
      if ($$0.dN()) {
         E.warn("Tried to add entity {} but it was marked as removed already", btq.a($$0.ao()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(btj $$0) {
      if ($$0.cY().map(btj::cD).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dwg $$0) {
      $$0.H();
      $$0.b(this);
   }

   public void a(arh $$0, btj.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, je $$1, int $$2) {
      for (arh $$3 : this.J.ag().t()) {
         if ($$3 != null && $$3.dS() == this && $$3.ap() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dx();
            double $$5 = (double)$$1.v() - $$3.dz();
            double $$6 = (double)$$1.w() - $$3.dD();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new acf($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cnp $$0, double $$1, double $$2, double $$3, jn<awc> $$4, awe $$5, float $$6, float $$7, long $$8) {
      this.J.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ag(), new afx($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cnp $$0, btj $$1, jn<awc> $$2, awe $$3, float $$4, float $$5, long $$6) {
      this.J.ag().a($$0, $$1.dx(), $$1.dz(), $$1.dD(), (double)$$2.a().a($$4), this.ag(), new afw($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, je $$1, int $$2) {
      if (this.ac().b(ddo.W)) {
         this.J.ag().a(new adm($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cnp $$0, int $$1, je $$2, int $$3) {
      this.J.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ag(), new adm($$1, $$2, $$3, false));
   }

   public int k() {
      return this.B_().p();
   }

   @Override
   public void a(jn<dyx> $$0, eye $$1, dyx.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(je $$0, dua $$1, dua $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ad.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      eyx $$5 = $$1.g(this, $$0);
      eyx $$6 = $$2.g(this, $$0);
      if (eyu.c($$5, $$6, eyi.g)) {
         List<cdq> $$7 = new ObjectArrayList();

         for (buh $$8 : this.V) {
            cdq $$9 = $$8.P();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (cdq $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(je $$0, dgv $$1) {
      this.a($$0, $$1, erf.a(this, null, null));
   }

   @Override
   public void a(je $$0, dgv $$1, @Nullable erj $$2) {
      this.s.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(je $$0, dgv $$1, jj $$2, @Nullable erj $$3) {
      this.s.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(je $$0, dgv $$1, @Nullable erj $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dua $$0, je $$1, dgv $$2, @Nullable erj $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(btj $$0, byte $$1) {
      this.l().a($$0, new add($$0, $$1));
   }

   @Override
   public void a(btj $$0, bsb $$1) {
      this.l().a($$0, new acz($$0, $$1));
   }

   public are l() {
      return this.I;
   }

   @Override
   public void a(
      @Nullable btj $$0,
      @Nullable bsb $$1,
      @Nullable ddl $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dds.a $$8,
      ll $$9,
      ll $$10,
      jn<awc> $$11
   ) {
      ddk.a $$12 = switch ($$8) {
         case a -> ddk.a.a;
         case b -> this.a(ddo.Q);
         case c -> this.ac().b(ddo.c) ? this.a(ddo.R) : ddk.a.a;
         case d -> this.a(ddo.S);
         case e -> ddk.a.d;
      };
      eye $$13 = new eye($$3, $$4, $$5);
      deh $$14 = new deh(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.h();
      ll $$15 = $$14.j() ? $$9 : $$10;

      for (arh $$16 : this.H) {
         if ($$16.f($$13) < 4096.0) {
            Optional<eye> $$17 = Optional.ofNullable($$14.i().get($$16));
            $$16.c.b(new ade($$13, $$17, $$15, $$11));
         }
      }
   }

   private ddk.a a(ddo.e<ddo.a> $$0) {
      return this.ac().b($$0) ? ddk.a.c : ddk.a.b;
   }

   @Override
   public void a(je $$0, dgv $$1, int $$2, int $$3) {
      this.X.add(new dcw($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         dcw $$0 = (dcw)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ag(), new ach($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(dcw $$0) {
      dua $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public ezs<dgv> m() {
      return this.S;
   }

   public ezs<eqa> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public era p() {
      return this.R;
   }

   public eor q() {
      return this.J.aZ();
   }

   public <T extends ll> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adn $$9 = new adn($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         arh $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends ll> boolean a(arh $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zk<?> $$11 = new adn($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(arh $$0, boolean $$1, double $$2, double $$3, double $$4, zk<?> $$5) {
      if ($$0.dS() != this) {
         return false;
      } else {
         je $$6 = $$0.ds();
         if ($$6.a(new eye($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public btj a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public btj b(int $$0) {
      btj $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (btj)this.ac.get($$0);
   }

   @Nullable
   public btj a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public je a(axi<eko> $$0, je $$1, int $$2, boolean $$3) {
      if (!this.J.ba().y().c()) {
         return null;
      } else {
         Optional<jr.c<eko>> $$4 = this.F_().d(lv.aR).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<je, jn<eko>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (je)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<je, jn<det>> a(Predicate<jn<det>> $$0, je $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public czx r() {
      return this.J.aI();
   }

   @Override
   public brt s() {
      return this.J.aP();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public esb u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public erv a(ert $$0) {
      return this.o().J().u().b(erv.a(), $$0.a());
   }

   @Override
   public void a(ert $$0, erv $$1) {
      this.o().J().u().a($$0.a(), $$1);
   }

   @Override
   public ert v() {
      return this.o().J().u().a(eru.a(), "idcounts").b();
   }

   public void a(je $$0, float $$1) {
      je $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ag().a(new afd($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(arl.a, new dcy($$2), this.L, bah.a);
      }

      int $$4 = this.ac().c(ddo.aa) + 1;
      if ($$4 > 1) {
         this.l().a(arl.a, new dcy($$0), $$4, bah.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      ddn $$0 = this.u().b(ddn.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      ddn $$3 = this.u().a(ddn.a(), "chunks");
      dcy $$4 = new dcy($$0, $$1);
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
   public List<arh> x() {
      return this.H;
   }

   @Override
   public void a(je $$0, dua $$1, dua $$2) {
      Optional<jn<cfl>> $$3 = cfm.a($$1);
      Optional<jn<cfl>> $$4 = cfm.a($$2);
      if (!Objects.equals($$3, $$4)) {
         je $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               agn.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               agn.a(this, $$5);
            }));
      }
   }

   public cfi y() {
      return this.l().l();
   }

   public boolean c(je $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kg $$0) {
      return this.c($$0.k());
   }

   public boolean a(je $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kg.a($$0)) <= $$1;
   }

   public int b(kg $$0) {
      return this.y().a($$0);
   }

   public cpe z() {
      return this.f;
   }

   @Nullable
   public cpc d(je $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(je $$0) {
      return this.d($$0) != null;
   }

   public void a(cff $$0, btj $$1, but $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqm $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         ded.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bui> $$4 = (Entry<bui>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bui)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<btj> $$1) throws IOException {
      ayc $$2 = ayc.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (btj $$3 : $$1) {
         xd $$4 = $$3.al();
         xd $$5 = $$3.Q_();
         $$2.a($$3.dx(), $$3.dz(), $$3.dD(), $$3.cD(), lu.f.b($$3.ao()), $$3.bI(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ayc $$1 = ayc.a().a("x").a("y").a("z").a("type").a($$0);

      for (dsy $$2 : this.r) {
         je $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(ekg $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(je $$0, dgv $$1) {
      if (!this.aj()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jj $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<btj> A() {
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
   public dxz D() {
      return this.ab;
   }

   @Override
   public arg E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> lu.f.b($$0.ao()).toString()),
         this.r.size(),
         a(this.r, dsy::d),
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
   protected dyn<btj> G() {
      return this.N.d();
   }

   public void a(Stream<btj> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<btj> $$0) {
      this.N.b($$0);
   }

   public void b(dwg $$0) {
      $$0.d(this.y_().c());
   }

   public void a(dvw $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public eqt H() {
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

   public boolean f(je $$0) {
      return this.N.a($$0) && this.I.a.j().c(dcy.a($$0));
   }

   public boolean g(je $$0) {
      return this.N.a($$0);
   }

   public boolean a(dcy $$0) {
      return this.N.a($$0);
   }

   @Override
   public cqh J() {
      return this.J.ba().K();
   }

   @Override
   public cxm K() {
      return this.J.bo();
   }

   @Override
   public dsb L() {
      return this.J.bp();
   }

   public azk a(alb $$0) {
      return this.ag.a($$0);
   }

   public brp M() {
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

   final class a implements dym<btj> {
      public void a(btj $$0) {
      }

      public void b(btj $$0) {
         arg.this.f().a($$0);
      }

      public void c(btj $$0) {
         arg.this.M.a($$0);
      }

      public void d(btj $$0) {
         arg.this.M.b($$0);
      }

      public void e(btj $$0) {
         arg.this.l().b($$0);
         if ($$0 instanceof arh $$1) {
            arg.this.H.add($$1);
            arg.this.e();
         }

         if ($$0 instanceof buh $$2) {
            if (arg.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arg.this.V.add($$2);
         }

         if ($$0 instanceof cis $$4) {
            for (cip $$5 : $$4.gk()) {
               arg.this.ac.put($$5.ap(), $$5);
            }
         }

         $$0.a(dyu::a);
      }

      public void f(btj $$0) {
         arg.this.l().a($$0);
         if ($$0 instanceof arh $$1) {
            arg.this.H.remove($$1);
            arg.this.e();
         }

         if ($$0 instanceof buh $$2) {
            if (arg.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arg.this.V.remove($$2);
         }

         if ($$0 instanceof cis $$4) {
            for (cip $$5 : $$4.gk()) {
               arg.this.ac.remove($$5.ap());
            }
         }

         $$0.a(dyu::b);
      }

      public void g(btj $$0) {
         $$0.a(dyu::c);
      }
   }
}
