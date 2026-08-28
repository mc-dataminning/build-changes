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

public class ash extends dhh implements asg, dif {
   public static final jh a = new jh(100, 50, 0);
   public static final bsn b = bst.a(12000, 180000);
   public static final bsn c = bst.a(12000, 24000);
   private static final bsn E = bst.a(12000, 180000);
   public static final bsn d = bst.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<asi> I = Lists.newArrayList();
   private final ase J;
   private final MinecraftServer K;
   private final ewh L;
   private int M;
   final ecd N = new ecd();
   private final eci<bvj> O;
   private final ecr P;
   public boolean e;
   private final awl Q;
   private int R;
   private final euu S;
   private final fdm<dkl> T = new fdm<>(this::d);
   private final fdm<etv> U = new fdm<>(this::d);
   private final euo V = new euo();
   final Set<bwh> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final crl f;
   private final ObjectLinkedOpenHashSet<dgl> Y = new ObjectLinkedOpenHashSet();
   private final List<dgl> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dgt> ab;
   @Nullable
   private ebs ac;
   final Int2ObjectMap<ckq> ad = new Int2ObjectOpenHashMap();
   private final did ae;
   private final eok af;
   private final boolean ag;
   private final btn ah;

   public ash(
      MinecraftServer $$0,
      Executor $$1,
      ewc.c $$2,
      ewh $$3,
      aly<dhh> $$4,
      ebq $$5,
      asr $$6,
      boolean $$7,
      long $$8,
      List<dgt> $$9,
      boolean $$10,
      @Nullable btn $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dzq $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      eca<bvj> $$15 = new eba(new ebl(new ebi($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bbs.s), this, $$0);
      this.O = new eci<>(bvj.class, new ash.a(), $$15);
      this.J = new ase(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().v());
      this.J.h().b();
      this.S = new euu(this);
      this.X();
      this.aa();
      this.F_().a($$0.aw());
      this.f = this.v().a(crl.a(this), crl.a(this.ag()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new eok(this.J.m(), this.K_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new did(this, $$0.aZ().y(), this.af);
      if (this.ah() == dhh.k && this.ag().a(ebn.c)) {
         this.ac = new ebs(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new awl();
      this.P = new ecr(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.v().a(btn.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable ebs $$0) {
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
   public jq<dij> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public did b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bps $$1 = bpr.a();
      this.aa = true;
      btr $$2 = this.t();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.F_().s();
         $$1.b("weather");
         this.au();
         $$1.c();
      }

      int $$4 = this.N().c(dhd.Q);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.N().b(dhd.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.N().b(dhd.w) && this.af()) {
            this.h();
         }
      }

      this.X();
      if ($$3) {
         this.c();
      }

      $$1.a("tickPending");
      if (!this.ai() && $$3) {
         long $$6 = this.ac();
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
         this.av();
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
            if (!$$2x.dR()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dI();
                  $$1.c();
                  if ($$2x instanceof asi || this.J.a.j().c($$2x.dy().a())) {
                     bvj $$3x = $$2x.dl();
                     if ($$3x != null) {
                        if (!$$3x.dR() && $$3x.y($$2x)) {
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
         this.W();
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
         bpr.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bpr.a().c();
         if (this.L.o().b(dhd.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dgt $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void as() {
      this.Q.a();
      this.I.stream().filter(bwf::fR).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dzz $$0, int $$1) {
      dgn $$2 = $$0.f();
      boolean $$3 = this.af();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bps $$6 = bpr.a();
      $$6.a("thunder");
      if ($$3 && this.ae() && this.A.a(100000) == 0) {
         jh $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            btg $$8 = this.d_($$7);
            boolean $$9 = this.N().b(dhd.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dkn.sN);
            if ($$9) {
               ckg $$10 = bvq.bg.a(this, bvp.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bwe $$11 = bvq.ax.a(this, bvp.h);
            if ($$11 != null) {
               $$11.e(fbx.c($$7));
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
         eaa[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            eaa $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kj.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jh $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dxu $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  etw $$21 = $$20.y();
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
      jh $$1 = this.a(edp.a.e, $$0);
      jh $$2 = $$1.e();
      dij $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dkn.eb.m());
      }

      if (this.af()) {
         int $$4 = this.N().c(dhd.U);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dxu $$5 = this.a_($$1);
            if ($$5.a(dkn.ea)) {
               int $$6 = $$5.c(drx.c);
               if ($$6 < Math.min($$4, 8)) {
                  dxu $$7 = $$5.b(drx.c, Integer.valueOf($$6 + 1));
                  dkl.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dkn.ea.m());
            }
         }

         dij.c $$8 = $$3.a($$2, this.O());
         if ($$8 != dij.c.a) {
            dxu $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jh> E(jh $$0) {
      Optional<jh> $$1 = this.z().e($$0x -> $$0x.a(chn.t), $$0x -> $$0x.v() == this.a(edp.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, chj.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jh b(jh $$0) {
      jh $$1 = this.a(edp.a.e, $$0);
      Optional<jh> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         fbs $$3 = fbs.a($$1, $$1.h(this.am() + 1)).g(3.0);
         List<bwf> $$4 = this.a(bwf.class, $$3, $$0x -> $$0x != null && $$0x.bL() && this.h($$0x.dw()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dw();
         } else {
            if ($$1.v() == this.L_() - 1) {
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
      return this.N().c(dhd.Q) <= 100;
   }

   private void at() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.N().c(dhd.Q);
            xv $$1;
            if (this.Q.a($$0)) {
               $$1 = xv.c("sleep.skipping_night");
            } else {
               $$1 = xv.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (asi $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void f() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.at();
      }
   }

   public ams g() {
      return this.K.aJ();
   }

   private void au() {
      boolean $$0 = this.af();
      if (this.G_().g()) {
         if (this.N().b(dhd.w)) {
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

         this.z = bae.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = bae.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new adz(adz.i, this.x), this.ah());
      }

      if (this.y != this.z) {
         this.K.ag().a(new adz(adz.j, this.z), this.ah());
      }

      if ($$0 != this.af()) {
         if ($$0) {
            this.K.ag().a(new adz(adz.d, 0.0F));
         } else {
            this.K.ag().a(new adz(adz.c, 0.0F));
         }

         this.K.ag().a(new adz(adz.i, this.x));
         this.K.ag().a(new adz(adz.j, this.z));
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

   private void a(jh $$0, etv $$1) {
      dxu $$2 = this.a_($$0);
      etw $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jh $$0, dkl $$1) {
      dxu $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bvj $$0) {
      $$0.bz();
      bps $$1 = bpr.a();
      $$0.af++;
      $$1.a(() -> ma.f.b($$0.aq()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (bvj $$2 : $$0.cZ()) {
         this.a($$0, $$2);
      }
   }

   private void a(bvj $$0, bvj $$1) {
      if ($$1.dR() || $$1.dl() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cpw || this.N.c($$1)) {
         $$1.bz();
         $$1.af++;
         bps $$2 = bpr.a();
         $$2.a(() -> ma.f.b($$1.aq()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bvj $$3 : $$1.cZ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cpw $$0, jh $$1) {
      return !this.K.a(this, $$1, $$0) && this.F_().a($$1);
   }

   public void a(@Nullable bal $$0, boolean $$1, boolean $$2) {
      ase $$3 = this.m();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xv.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xv.c("menu.savingChunks"));
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

      evw $$1 = this.m().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bvj> List<? extends T> a(ece<bvj, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bvj> void a(ece<bvj, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bvj> void a(ece<bvj, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return ayq.a.b;
            }
         }

         return ayq.a.a;
      });
   }

   public List<? extends ckt> j() {
      return this.a(bvq.Q, bwf::bL);
   }

   public List<asi> a(Predicate<? super asi> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<asi> a(Predicate<? super asi> $$0, int $$1) {
      List<asi> $$2 = Lists.newArrayList();

      for (asi $$3 : this.I) {
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
   public asi k() {
      List<asi> $$0 = this.a(bwf::bL);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bvj $$0) {
      return this.i($$0);
   }

   public boolean c(bvj $$0) {
      return this.i($$0);
   }

   public void d(bvj $$0) {
      if ($$0 instanceof asi $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(asi $$0) {
      this.c($$0);
   }

   public void b(asi $$0) {
      this.c($$0);
   }

   private void c(asi $$0) {
      bvj $$1 = this.G().a($$0.cG());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cG());
         $$1.ao();
         this.a((asi)$$1, bvj.d.b);
      }

      this.O.a($$0);
   }

   private boolean i(bvj $$0) {
      if ($$0.dR()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bvq.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bvj $$0) {
      if ($$0.db().map(bvj::cG).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dzz $$0) {
      $$0.G();
      $$0.c(this);
   }

   public void a(asi $$0, bvj.d $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jh $$1, int $$2) {
      for (asi $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dW() == this && $$3.ar() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dB();
            double $$5 = (double)$$1.v() - $$3.dD();
            double $$6 = (double)$$1.w() - $$3.dH();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.f.b(new acx($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cpw $$0, double $$1, double $$2, double $$3, jq<axe> $$4, axg $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ah(), new agt($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cpw $$0, bvj $$1, jq<axe> $$2, axg $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dB(), $$1.dD(), $$1.dH(), (double)$$2.a().a($$4), this.ah(), new ags($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jh $$1, int $$2) {
      if (this.N().b(dhd.X)) {
         this.K.ag().a(new aef($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cpw $$0, int $$1, jh $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ah(), new aef($$1, $$2, $$3, false));
   }

   public int l() {
      return this.G_().p();
   }

   @Override
   public void a(jq<ecq> $$0, fbx $$1, ecq.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jh $$0, dxu $$1, dxu $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ae.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      fcr $$5 = $$1.g(this, $$0);
      fcr $$6 = $$2.g(this, $$0);
      if (fco.c($$5, $$6, fcb.g)) {
         List<cfr> $$7 = new ObjectArrayList();

         for (bwh $$8 : this.W) {
            cfr $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cfr $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jh $$0, dkl $$1) {
      this.a($$0, $$1, eva.a(this, null, null));
   }

   @Override
   public void a(jh $$0, dkl $$1, @Nullable eve $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jh $$0, dkl $$1, jm $$2, @Nullable eve $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jh $$0, dkl $$1, @Nullable eve $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dxu $$0, jh $$1, dkl $$2, @Nullable eve $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bvj $$0, byte $$1) {
      this.m().a($$0, new adv($$0, $$1));
   }

   @Override
   public void a(bvj $$0, btz $$1) {
      this.m().a($$0, new adr($$0, $$1));
   }

   public ase m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bvj $$0,
      @Nullable btz $$1,
      @Nullable dha $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dhh.a $$8,
      lq $$9,
      lq $$10,
      jq<axe> $$11
   ) {
      dgz.a $$12 = switch ($$8) {
         case a -> dgz.a.a;
         case b -> this.a(dhd.R);
         case c -> this.N().b(dhd.c) ? this.a(dhd.S) : dgz.a.a;
         case d -> this.a(dhd.T);
         case e -> dgz.a.d;
      };
      fbx $$13 = new fbx($$3, $$4, $$5);
      dhx $$14 = new dhx(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lq $$15 = $$14.k() ? $$9 : $$10;

      for (asi $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<fbx> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new adx($$13, $$17, $$15, $$11));
         }
      }
   }

   private dgz.a a(dhd.e<dhd.a> $$0) {
      return this.N().b($$0) ? dgz.a.c : dgz.a.b;
   }

   @Override
   public void a(jh $$0, dkl $$1, int $$2, int $$3) {
      this.Y.add(new dgl($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dgl $$0 = (dgl)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ah(), new acz($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(dgl $$0) {
      dxu $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fdm<dkl> n() {
      return this.T;
   }

   public fdm<etv> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public euu q() {
      return this.S;
   }

   public esm r() {
      return this.K.aY();
   }

   public <T extends lq> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      aeg $$9 = new aeg($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.I.size(); $$11++) {
         asi $$12 = this.I.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lq> boolean a(asi $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      aac<?> $$11 = new aeg($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(asi $$0, boolean $$1, double $$2, double $$3, double $$4, aac<?> $$5) {
      if ($$0.dW() != this) {
         return false;
      } else {
         jh $$6 = $$0.dw();
         if ($$6.a(new fbx($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bvj a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bvj b(int $$0) {
      bvj $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bvj)this.ad.get($$0);
   }

   @Nullable
   public bvj a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jh a(ayk<eoj> $$0, jh $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<ju.c<eoj>> $$4 = this.K_().e(mb.aU).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jh, jq<eoj>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jh)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jh, jq<dij>> a(Predicate<jq<dij>> $$0, jh $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   public dck s() {
      return this.K.aI();
   }

   @Override
   public btr t() {
      return this.K.aP();
   }

   @Override
   public boolean u() {
      return this.e;
   }

   public evw v() {
      return this.m().k();
   }

   @Nullable
   @Override
   public evq a(evo $$0) {
      return this.p().J().v().b(evq.a(), $$0.a());
   }

   @Override
   public void a(evo $$0, evq $$1) {
      this.p().J().v().a($$0.a(), $$1);
   }

   @Override
   public evo w() {
      return this.p().J().v().a(evp.a(), "idcounts").b();
   }

   public void a(jh $$0, float $$1) {
      jh $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new afz($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(asn.a, new dgn($$2), this.M, bbk.a);
      }

      int $$4 = this.N().c(dhd.ab) + 1;
      if ($$4 > 1) {
         this.m().a(asn.a, new dgn($$0), $$4, bbk.a);
      }

      this.M = $$4;
   }

   public LongSet x() {
      dhc $$0 = this.v().b(dhc.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dhc $$3 = this.v().a(dhc.a(), "chunks");
      dgn $$4 = new dgn($$0, $$1);
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
   public List<asi> y() {
      return this.I;
   }

   @Override
   public void a(jh $$0, dxu $$1, dxu $$2) {
      Optional<jq<chm>> $$3 = chn.a($$1);
      Optional<jq<chm>> $$4 = chn.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jh $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.p().execute(() -> {
               this.z().a($$5);
               ahj.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.p().execute(() -> {
               this.z().a($$5, $$1x);
               ahj.a(this, $$5);
            }));
      }
   }

   public chj z() {
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

   public crl A() {
      return this.f;
   }

   @Nullable
   public crj d(jh $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jh $$0) {
      return this.d($$0) != null;
   }

   public void a(chg $$0, bvj $$1, bwu $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      arm $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dhs.d $$3 = this.m().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bwi> $$4 = (Entry<bwi>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bwi)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bvj> $$1) throws IOException {
      aze $$2 = aze.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bvj $$3 : $$1) {
         xv $$4 = $$3.an();
         xv $$5 = $$3.p_();
         $$2.a($$3.dB(), $$3.dD(), $$3.dH(), $$3.cG(), ma.f.b($$3.aq()), $$3.bL(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aze $$1 = aze.a().a("x").a("y").a("z").a("type").a($$0);

      for (dwr $$2 : this.s) {
         jh $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eob $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jh $$0, dkl $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bvj> B() {
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
   public ebs E() {
      return this.ac;
   }

   @Override
   public ash a() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> ma.f.b($$0.aq()).toString()),
         this.s.size(),
         a(this.s, dwr::d),
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
   protected ecg<bvj> G() {
      return this.O.d();
   }

   public void a(Stream<bvj> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bvj> $$0) {
      this.O.b($$0);
   }

   public void b(dzz $$0) {
      $$0.d(this.D_().c());
   }

   public void a(dzp $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public euo H() {
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
      return this.O.a($$0) && this.J.a.j().c(dgn.a($$0));
   }

   public boolean g(jh $$0) {
      return this.O.a($$0);
   }

   public boolean a(dgn $$0) {
      return this.O.a($$0);
   }

   @Override
   public css J() {
      return this.K.aZ().K();
   }

   @Override
   public czm K() {
      return this.K.bn();
   }

   @Override
   public dvu L() {
      return this.K.bo();
   }

   public bam a(alz $$0) {
      return this.ah.a($$0);
   }

   public btn M() {
      return this.ah;
   }

   public dhd N() {
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

   final class a implements ecf<bvj> {
      public void a(bvj $$0) {
      }

      public void b(bvj $$0) {
         ash.this.g().a($$0);
      }

      public void c(bvj $$0) {
         ash.this.N.a($$0);
      }

      public void d(bvj $$0) {
         ash.this.N.b($$0);
      }

      public void e(bvj $$0) {
         ash.this.m().b($$0);
         if ($$0 instanceof asi $$1) {
            ash.this.I.add($$1);
            ash.this.f();
         }

         if ($$0 instanceof bwh $$2) {
            if (ash.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ash.this.W.add($$2);
         }

         if ($$0 instanceof ckt $$4) {
            for (ckq $$5 : $$4.x()) {
               ash.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(ecn::a);
      }

      public void f(bvj $$0) {
         ash.this.m().a($$0);
         if ($$0 instanceof asi $$1) {
            ash.this.I.remove($$1);
            ash.this.f();
         }

         if ($$0 instanceof bwh $$2) {
            if (ash.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ash.this.W.remove($$2);
         }

         if ($$0 instanceof ckt $$4) {
            for (ckq $$5 : $$4.x()) {
               ash.this.ad.remove($$5.ar());
            }
         }

         $$0.a(ecn::b);
      }

      public void g(bvj $$0) {
         $$0.a(ecn::c);
      }
   }
}
