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

public class ash extends dha implements asg, dhy {
   public static final jh a = new jh(100, 50, 0);
   public static final bsj b = bsp.a(12000, 180000);
   public static final bsj c = bsp.a(12000, 24000);
   private static final bsj E = bsp.a(12000, 180000);
   public static final bsj d = bsp.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<asi> I = Lists.newArrayList();
   private final ase J;
   private final MinecraftServer K;
   private final ewa L;
   private int M;
   final ebw N = new ebw();
   private final ecb<bvf> O;
   private final eck P;
   public boolean e;
   private final awl Q;
   private int R;
   private final eun S;
   private final fdh<dke> T = new fdh<>(this::d);
   private final fdh<eto> U = new fdh<>(this::d);
   private final euh V = new euh();
   final Set<bwd> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final crh f;
   private final ObjectLinkedOpenHashSet<dge> Y = new ObjectLinkedOpenHashSet();
   private final List<dge> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dgm> ab;
   @Nullable
   private ebl ac;
   final Int2ObjectMap<ckm> ad = new Int2ObjectOpenHashMap();
   private final dhw ae;
   private final eod af;
   private final boolean ag;
   private final btj ah;

   public ash(
      MinecraftServer $$0,
      Executor $$1,
      evv.c $$2,
      ewa $$3,
      aly<dha> $$4,
      ebj $$5,
      asr $$6,
      boolean $$7,
      long $$8,
      List<dgm> $$9,
      boolean $$10,
      @Nullable btj $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dzj $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      ebt<bvf> $$15 = new eat(new ebe(new ebb($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bbo.s), this, $$0);
      this.O = new ecb<>(bvf.class, new ash.a(), $$15);
      this.J = new ase(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().v());
      this.J.h().b();
      this.S = new eun(this);
      this.X();
      this.aa();
      this.F_().a($$0.aw());
      this.f = this.v().a(crh.a(this), crh.a(this.ag()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new eod(this.J.m(), this.K_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dhw(this, $$0.aZ().y(), this.af);
      if (this.ah() == dha.k && this.ag().a(ebg.c)) {
         this.ac = new ebl(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new awl();
      this.P = new eck(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.v().a(btj.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable ebl $$0) {
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
   public jq<dic> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public dhw b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bpo $$1 = bpn.a();
      this.aa = true;
      btn $$2 = this.t();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.F_().s();
         $$1.b("weather");
         this.au();
         $$1.c();
      }

      int $$4 = this.N().c(dgw.P);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.N().b(dgw.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.N().b(dgw.v) && this.af()) {
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
            if (!$$2x.dQ()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dH();
                  $$1.c();
                  if ($$2x instanceof asi || this.J.a.j().c($$2x.dx().a())) {
                     bvf $$3x = $$2x.dk();
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
         bpn.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bpn.a().c();
         if (this.L.o().b(dgw.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dgm $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void as() {
      this.Q.a();
      this.I.stream().filter(bwb::fP).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dzs $$0, int $$1) {
      dgg $$2 = $$0.f();
      boolean $$3 = this.af();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bpo $$6 = bpn.a();
      $$6.a("thunder");
      if ($$3 && this.ae() && this.A.a(100000) == 0) {
         jh $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            btc $$8 = this.d_($$7);
            boolean $$9 = this.N().b(dgw.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dkg.sN);
            if ($$9) {
               ckc $$10 = bvm.bg.a(this, bvl.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bwa $$11 = bvm.ax.a(this, bvl.h);
            if ($$11 != null) {
               $$11.e(fbs.c($$7));
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
         dzt[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dzt $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kj.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jh $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dxn $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  etp $$21 = $$20.y();
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
      jh $$1 = this.a(edi.a.e, $$0);
      jh $$2 = $$1.e();
      dic $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dkg.eb.m());
      }

      if (this.af()) {
         int $$4 = this.N().c(dgw.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dxn $$5 = this.a_($$1);
            if ($$5.a(dkg.ea)) {
               int $$6 = $$5.c(drq.c);
               if ($$6 < Math.min($$4, 8)) {
                  dxn $$7 = $$5.b(drq.c, Integer.valueOf($$6 + 1));
                  dke.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dkg.ea.m());
            }
         }

         dic.c $$8 = $$3.a($$2, this.O());
         if ($$8 != dic.c.a) {
            dxn $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jh> E(jh $$0) {
      Optional<jh> $$1 = this.z().e($$0x -> $$0x.a(chj.t), $$0x -> $$0x.v() == this.a(edi.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, chf.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jh b(jh $$0) {
      jh $$1 = this.a(edi.a.e, $$0);
      Optional<jh> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         fbn $$3 = fbn.a($$1, $$1.h(this.am() + 1)).g(3.0);
         List<bwb> $$4 = this.a(bwb.class, $$3, $$0x -> $$0x != null && $$0x.bL() && this.h($$0x.dv()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dv();
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
      return this.N().c(dgw.P) <= 100;
   }

   private void at() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.N().c(dgw.P);
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
         if (this.N().b(dgw.v)) {
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

   private void a(jh $$0, eto $$1) {
      dxn $$2 = this.a_($$0);
      etp $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jh $$0, dke $$1) {
      dxn $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bvf $$0) {
      $$0.bz();
      bpo $$1 = bpn.a();
      $$0.af++;
      $$1.a(() -> ma.f.b($$0.aq()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (bvf $$2 : $$0.cZ()) {
         this.a($$0, $$2);
      }
   }

   private void a(bvf $$0, bvf $$1) {
      if ($$1.dQ() || $$1.dk() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cps || this.N.c($$1)) {
         $$1.bz();
         $$1.af++;
         bpo $$2 = bpn.a();
         $$2.a(() -> ma.f.b($$1.aq()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bvf $$3 : $$1.cZ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cps $$0, jh $$1) {
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

      evp $$1 = this.m().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bvf> List<? extends T> a(ebx<bvf, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bvf> void a(ebx<bvf, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bvf> void a(ebx<bvf, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
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

   public List<? extends ckp> j() {
      return this.a(bvm.Q, bwb::bL);
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
      List<asi> $$0 = this.a(bwb::bL);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bvf $$0) {
      return this.i($$0);
   }

   public boolean c(bvf $$0) {
      return this.i($$0);
   }

   public void d(bvf $$0) {
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
      bvf $$1 = this.G().a($$0.cG());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cG());
         $$1.ao();
         this.a((asi)$$1, bvf.c.b);
      }

      this.O.a($$0);
   }

   private boolean i(bvf $$0) {
      if ($$0.dQ()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bvm.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bvf $$0) {
      if ($$0.db().map(bvf::cG).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dzs $$0) {
      $$0.G();
      $$0.c(this);
   }

   public void a(asi $$0, bvf.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jh $$1, int $$2) {
      for (asi $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dV() == this && $$3.ar() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dA();
            double $$5 = (double)$$1.v() - $$3.dC();
            double $$6 = (double)$$1.w() - $$3.dG();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.f.b(new acx($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cps $$0, double $$1, double $$2, double $$3, jq<axe> $$4, axg $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ah(), new agt($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cps $$0, bvf $$1, jq<axe> $$2, axg $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dA(), $$1.dC(), $$1.dG(), (double)$$2.a().a($$4), this.ah(), new ags($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jh $$1, int $$2) {
      if (this.N().b(dgw.W)) {
         this.K.ag().a(new aef($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cps $$0, int $$1, jh $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ah(), new aef($$1, $$2, $$3, false));
   }

   public int l() {
      return this.G_().p();
   }

   @Override
   public void a(jq<ecj> $$0, fbs $$1, ecj.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jh $$0, dxn $$1, dxn $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ae.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      fcm $$5 = $$1.g(this, $$0);
      fcm $$6 = $$2.g(this, $$0);
      if (fcj.c($$5, $$6, fbw.g)) {
         List<cfn> $$7 = new ObjectArrayList();

         for (bwd $$8 : this.W) {
            cfn $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cfn $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jh $$0, dke $$1) {
      this.a($$0, $$1, eut.a(this, null, null));
   }

   @Override
   public void a(jh $$0, dke $$1, @Nullable eux $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jh $$0, dke $$1, jm $$2, @Nullable eux $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jh $$0, dke $$1, @Nullable eux $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dxn $$0, jh $$1, dke $$2, @Nullable eux $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bvf $$0, byte $$1) {
      this.m().a($$0, new adv($$0, $$1));
   }

   @Override
   public void a(bvf $$0, btv $$1) {
      this.m().a($$0, new adr($$0, $$1));
   }

   public ase m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bvf $$0,
      @Nullable btv $$1,
      @Nullable dgt $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dha.a $$8,
      lq $$9,
      lq $$10,
      jq<axe> $$11
   ) {
      dgs.a $$12 = switch ($$8) {
         case a -> dgs.a.a;
         case b -> this.a(dgw.Q);
         case c -> this.N().b(dgw.c) ? this.a(dgw.R) : dgs.a.a;
         case d -> this.a(dgw.S);
         case e -> dgs.a.d;
      };
      fbs $$13 = new fbs($$3, $$4, $$5);
      dhq $$14 = new dhq(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lq $$15 = $$14.k() ? $$9 : $$10;

      for (asi $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<fbs> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new adx($$13, $$17, $$15, $$11));
         }
      }
   }

   private dgs.a a(dgw.e<dgw.a> $$0) {
      return this.N().b($$0) ? dgs.a.c : dgs.a.b;
   }

   @Override
   public void a(jh $$0, dke $$1, int $$2, int $$3) {
      this.Y.add(new dge($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dge $$0 = (dge)this.Y.removeFirst();
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

   private boolean a(dge $$0) {
      dxn $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fdh<dke> n() {
      return this.T;
   }

   public fdh<eto> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public eun q() {
      return this.S;
   }

   public esf r() {
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
      if ($$0.dV() != this) {
         return false;
      } else {
         jh $$6 = $$0.dv();
         if ($$6.a(new fbs($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bvf a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bvf b(int $$0) {
      bvf $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bvf)this.ad.get($$0);
   }

   @Nullable
   public bvf a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jh a(ayk<eoc> $$0, jh $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<ju.c<eoc>> $$4 = this.K_().e(mb.aT).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jh, jq<eoc>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jh)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jh, jq<dic>> a(Predicate<jq<dic>> $$0, jh $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   public dcf s() {
      return this.K.aI();
   }

   @Override
   public btn t() {
      return this.K.aP();
   }

   @Override
   public boolean u() {
      return this.e;
   }

   public evp v() {
      return this.m().k();
   }

   @Nullable
   @Override
   public evj a(evh $$0) {
      return this.p().J().v().b(evj.a(), $$0.a());
   }

   @Override
   public void a(evh $$0, evj $$1) {
      this.p().J().v().a($$0.a(), $$1);
   }

   @Override
   public evh w() {
      return this.p().J().v().a(evi.a(), "idcounts").b();
   }

   public void a(jh $$0, float $$1) {
      jh $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new afz($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(asn.a, new dgg($$2), this.M, bbk.a);
      }

      int $$4 = this.N().c(dgw.aa) + 1;
      if ($$4 > 1) {
         this.m().a(asn.a, new dgg($$0), $$4, bbk.a);
      }

      this.M = $$4;
   }

   public LongSet x() {
      dgv $$0 = this.v().b(dgv.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dgv $$3 = this.v().a(dgv.a(), "chunks");
      dgg $$4 = new dgg($$0, $$1);
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
   public void a(jh $$0, dxn $$1, dxn $$2) {
      Optional<jq<chi>> $$3 = chj.a($$1);
      Optional<jq<chi>> $$4 = chj.a($$2);
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

   public chf z() {
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

   public crh A() {
      return this.f;
   }

   @Nullable
   public crf d(jh $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jh $$0) {
      return this.d($$0) != null;
   }

   public void a(chc $$0, bvf $$1, bwq $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      arm $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dhl.d $$3 = this.m().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bwe> $$4 = (Entry<bwe>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bwe)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bvf> $$1) throws IOException {
      aze $$2 = aze.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bvf $$3 : $$1) {
         xv $$4 = $$3.an();
         xv $$5 = $$3.p_();
         $$2.a($$3.dA(), $$3.dC(), $$3.dG(), $$3.cG(), ma.f.b($$3.aq()), $$3.bL(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aze $$1 = aze.a().a("x").a("y").a("z").a("type").a($$0);

      for (dwk $$2 : this.s) {
         jh $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(enu $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jh $$0, dke $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bvf> B() {
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
   public ebl E() {
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
         a(this.s, dwk::d),
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
   protected ebz<bvf> G() {
      return this.O.d();
   }

   public void a(Stream<bvf> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bvf> $$0) {
      this.O.b($$0);
   }

   public void b(dzs $$0) {
      $$0.d(this.D_().c());
   }

   public void a(dzi $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public euh H() {
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
      return this.O.a($$0) && this.J.a.j().c(dgg.a($$0));
   }

   public boolean g(jh $$0) {
      return this.O.a($$0);
   }

   public boolean a(dgg $$0) {
      return this.O.a($$0);
   }

   @Override
   public cso J() {
      return this.K.aZ().K();
   }

   @Override
   public czi K() {
      return this.K.bn();
   }

   @Override
   public dvn L() {
      return this.K.bo();
   }

   public bam a(alz $$0) {
      return this.ah.a($$0);
   }

   public btj M() {
      return this.ah;
   }

   public dgw N() {
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

   final class a implements eby<bvf> {
      public void a(bvf $$0) {
      }

      public void b(bvf $$0) {
         ash.this.g().a($$0);
      }

      public void c(bvf $$0) {
         ash.this.N.a($$0);
      }

      public void d(bvf $$0) {
         ash.this.N.b($$0);
      }

      public void e(bvf $$0) {
         ash.this.m().b($$0);
         if ($$0 instanceof asi $$1) {
            ash.this.I.add($$1);
            ash.this.f();
         }

         if ($$0 instanceof bwd $$2) {
            if (ash.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ash.this.W.add($$2);
         }

         if ($$0 instanceof ckp $$4) {
            for (ckm $$5 : $$4.x()) {
               ash.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(ecg::a);
      }

      public void f(bvf $$0) {
         ash.this.m().a($$0);
         if ($$0 instanceof asi $$1) {
            ash.this.I.remove($$1);
            ash.this.f();
         }

         if ($$0 instanceof bwd $$2) {
            if (ash.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ash.this.W.remove($$2);
         }

         if ($$0 instanceof ckp $$4) {
            for (ckm $$5 : $$4.x()) {
               ash.this.ad.remove($$5.ar());
            }
         }

         $$0.a(ecg::b);
      }

      public void g(bvf $$0) {
         $$0.a(ecg::c);
      }
   }
}
