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

public class ash extends dhi implements asg, dig {
   public static final jh a = new jh(100, 50, 0);
   public static final bso b = bsu.a(12000, 180000);
   public static final bso c = bsu.a(12000, 24000);
   private static final bso E = bsu.a(12000, 180000);
   public static final bso d = bsu.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<asi> I = Lists.newArrayList();
   private final ase J;
   private final MinecraftServer K;
   private final ewi L;
   private int M;
   final ece N = new ece();
   private final ecj<bvk> O;
   private final ecs P;
   public boolean e;
   private final awl Q;
   private int R;
   private final euv S;
   private final fdn<dkm> T = new fdn<>(this::d);
   private final fdn<etw> U = new fdn<>(this::d);
   private final eup V = new eup();
   final Set<bwi> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final crm f;
   private final ObjectLinkedOpenHashSet<dgm> Y = new ObjectLinkedOpenHashSet();
   private final List<dgm> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dgu> ab;
   @Nullable
   private ebt ac;
   final Int2ObjectMap<ckr> ad = new Int2ObjectOpenHashMap();
   private final die ae;
   private final eol af;
   private final boolean ag;
   private final bto ah;

   public ash(
      MinecraftServer $$0,
      Executor $$1,
      ewd.c $$2,
      ewi $$3,
      aly<dhi> $$4,
      ebr $$5,
      asr $$6,
      boolean $$7,
      long $$8,
      List<dgu> $$9,
      boolean $$10,
      @Nullable bto $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dzr $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      ecb<bvk> $$15 = new ebb(new ebm(new ebj($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bbs.s), this, $$0);
      this.O = new ecj<>(bvk.class, new ash.a(), $$15);
      this.J = new ase(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().v());
      this.J.h().b();
      this.S = new euv(this);
      this.X();
      this.aa();
      this.F_().a($$0.aw());
      this.f = this.v().a(crm.a(this), crm.a(this.ag()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new eol(this.J.m(), this.K_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new die(this, $$0.aZ().y(), this.af);
      if (this.ah() == dhi.k && this.ag().a(ebo.c)) {
         this.ac = new ebt(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new awl();
      this.P = new ecs(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.v().a(bto.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable ebt $$0) {
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
   public jq<dik> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public die b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bpt $$1 = bps.a();
      this.aa = true;
      bts $$2 = this.t();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.F_().s();
         $$1.b("weather");
         this.au();
         $$1.c();
      }

      int $$4 = this.N().c(dhe.Q);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.N().b(dhe.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.N().b(dhe.w) && this.af()) {
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
                     bvk $$3x = $$2x.dl();
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
         bps.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bps.a().c();
         if (this.L.o().b(dhe.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dgu $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void as() {
      this.Q.a();
      this.I.stream().filter(bwg::fR).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(eaa $$0, int $$1) {
      dgo $$2 = $$0.f();
      boolean $$3 = this.af();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bpt $$6 = bps.a();
      $$6.a("thunder");
      if ($$3 && this.ae() && this.A.a(100000) == 0) {
         jh $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bth $$8 = this.d_($$7);
            boolean $$9 = this.N().b(dhe.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dko.sN);
            if ($$9) {
               ckh $$10 = bvr.bg.a(this, bvq.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bwf $$11 = bvr.ax.a(this, bvq.h);
            if ($$11 != null) {
               $$11.e(fby.c($$7));
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
         eab[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            eab $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kj.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jh $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dxv $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  etx $$21 = $$20.y();
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
      jh $$1 = this.a(edq.a.e, $$0);
      jh $$2 = $$1.e();
      dik $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dko.eb.m());
      }

      if (this.af()) {
         int $$4 = this.N().c(dhe.U);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dxv $$5 = this.a_($$1);
            if ($$5.a(dko.ea)) {
               int $$6 = $$5.c(dry.c);
               if ($$6 < Math.min($$4, 8)) {
                  dxv $$7 = $$5.b(dry.c, Integer.valueOf($$6 + 1));
                  dkm.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dko.ea.m());
            }
         }

         dik.c $$8 = $$3.a($$2, this.O());
         if ($$8 != dik.c.a) {
            dxv $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jh> E(jh $$0) {
      Optional<jh> $$1 = this.z().e($$0x -> $$0x.a(cho.t), $$0x -> $$0x.v() == this.a(edq.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, chk.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jh b(jh $$0) {
      jh $$1 = this.a(edq.a.e, $$0);
      Optional<jh> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         fbt $$3 = fbt.a($$1, $$1.h(this.am() + 1)).g(3.0);
         List<bwg> $$4 = this.a(bwg.class, $$3, $$0x -> $$0x != null && $$0x.bL() && this.h($$0x.dw()));
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
      return this.N().c(dhe.Q) <= 100;
   }

   private void at() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.N().c(dhe.Q);
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
         if (this.N().b(dhe.w)) {
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

   private void a(jh $$0, etw $$1) {
      dxv $$2 = this.a_($$0);
      etx $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jh $$0, dkm $$1) {
      dxv $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bvk $$0) {
      $$0.bz();
      bpt $$1 = bps.a();
      $$0.af++;
      $$1.a(() -> ma.f.b($$0.aq()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (bvk $$2 : $$0.cZ()) {
         this.a($$0, $$2);
      }
   }

   private void a(bvk $$0, bvk $$1) {
      if ($$1.dR() || $$1.dl() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cpx || this.N.c($$1)) {
         $$1.bz();
         $$1.af++;
         bpt $$2 = bps.a();
         $$2.a(() -> ma.f.b($$1.aq()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bvk $$3 : $$1.cZ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cpx $$0, jh $$1) {
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

      evx $$1 = this.m().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bvk> List<? extends T> a(ecf<bvk, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bvk> void a(ecf<bvk, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bvk> void a(ecf<bvk, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
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

   public List<? extends cku> j() {
      return this.a(bvr.Q, bwg::bL);
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
      List<asi> $$0 = this.a(bwg::bL);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bvk $$0) {
      return this.i($$0);
   }

   public boolean c(bvk $$0) {
      return this.i($$0);
   }

   public void d(bvk $$0) {
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
      bvk $$1 = this.G().a($$0.cG());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cG());
         $$1.ao();
         this.a((asi)$$1, bvk.d.b);
      }

      this.O.a($$0);
   }

   private boolean i(bvk $$0) {
      if ($$0.dR()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bvr.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bvk $$0) {
      if ($$0.db().map(bvk::cG).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(eaa $$0) {
      $$0.J();
      $$0.c(this);
   }

   public void a(asi $$0, bvk.d $$1) {
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
   public void a(@Nullable cpx $$0, double $$1, double $$2, double $$3, jq<axe> $$4, axg $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ah(), new agt($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cpx $$0, bvk $$1, jq<axe> $$2, axg $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dB(), $$1.dD(), $$1.dH(), (double)$$2.a().a($$4), this.ah(), new ags($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jh $$1, int $$2) {
      if (this.N().b(dhe.X)) {
         this.K.ag().t().forEach($$3 -> {
            fby $$5;
            if ($$3.dW() == this) {
               fby $$4 = fby.b($$1);
               if ($$3.f($$4) < (double)bae.h(32)) {
                  $$5 = $$4;
               } else {
                  fby $$6 = $$4.d($$3.du()).d();
                  $$5 = $$3.du().e($$6.c(32.0));
               }
            } else {
               $$5 = $$3.du();
            }

            $$3.f.b(new aef($$0, jh.a((ka)$$5), $$2, true));
         });
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cpx $$0, int $$1, jh $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ah(), new aef($$1, $$2, $$3, false));
   }

   public int l() {
      return this.G_().p();
   }

   @Override
   public void a(jq<ecr> $$0, fby $$1, ecr.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jh $$0, dxv $$1, dxv $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ae.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      fcs $$5 = $$1.g(this, $$0);
      fcs $$6 = $$2.g(this, $$0);
      if (fcp.c($$5, $$6, fcc.g)) {
         List<cfs> $$7 = new ObjectArrayList();

         for (bwi $$8 : this.W) {
            cfs $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cfs $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jh $$0, dkm $$1) {
      this.a($$0, $$1, evb.a(this, null, null));
   }

   @Override
   public void a(jh $$0, dkm $$1, @Nullable evf $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jh $$0, dkm $$1, jm $$2, @Nullable evf $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jh $$0, dkm $$1, @Nullable evf $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dxv $$0, jh $$1, dkm $$2, @Nullable evf $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bvk $$0, byte $$1) {
      this.m().a($$0, new adv($$0, $$1));
   }

   @Override
   public void a(bvk $$0, bua $$1) {
      this.m().a($$0, new adr($$0, $$1));
   }

   public ase m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bvk $$0,
      @Nullable bua $$1,
      @Nullable dhb $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dhi.a $$8,
      lq $$9,
      lq $$10,
      jq<axe> $$11
   ) {
      dha.a $$12 = switch ($$8) {
         case a -> dha.a.a;
         case b -> this.a(dhe.R);
         case c -> this.N().b(dhe.c) ? this.a(dhe.S) : dha.a.a;
         case d -> this.a(dhe.T);
         case e -> dha.a.d;
      };
      fby $$13 = new fby($$3, $$4, $$5);
      dhy $$14 = new dhy(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lq $$15 = $$14.k() ? $$9 : $$10;

      for (asi $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<fby> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new adx($$13, $$17, $$15, $$11));
         }
      }
   }

   private dha.a a(dhe.e<dhe.a> $$0) {
      return this.N().b($$0) ? dha.a.c : dha.a.b;
   }

   @Override
   public void a(jh $$0, dkm $$1, int $$2, int $$3) {
      this.Y.add(new dgm($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dgm $$0 = (dgm)this.Y.removeFirst();
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

   private boolean a(dgm $$0) {
      dxv $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fdn<dkm> n() {
      return this.T;
   }

   public fdn<etw> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public euv q() {
      return this.S;
   }

   public esn r() {
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
         if ($$6.a(new fby($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bvk a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bvk b(int $$0) {
      bvk $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bvk)this.ad.get($$0);
   }

   @Nullable
   public bvk a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jh a(ayk<eok> $$0, jh $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<ju.c<eok>> $$4 = this.K_().e(mb.aU).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jh, jq<eok>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jh)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jh, jq<dik>> a(Predicate<jq<dik>> $$0, jh $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   public dcl s() {
      return this.K.aI();
   }

   @Override
   public bts t() {
      return this.K.aP();
   }

   @Override
   public boolean u() {
      return this.e;
   }

   public evx v() {
      return this.m().k();
   }

   @Nullable
   @Override
   public evr a(evp $$0) {
      return this.p().J().v().b(evr.a(), $$0.a());
   }

   @Override
   public void a(evp $$0, evr $$1) {
      this.p().J().v().a($$0.a(), $$1);
   }

   @Override
   public evp w() {
      return this.p().J().v().a(evq.a(), "idcounts").b();
   }

   public void a(jh $$0, float $$1) {
      jh $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new afz($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(asn.a, new dgo($$2), this.M, bbk.a);
      }

      int $$4 = this.N().c(dhe.ab) + 1;
      if ($$4 > 1) {
         this.m().a(asn.a, new dgo($$0), $$4, bbk.a);
      }

      this.M = $$4;
   }

   public LongSet x() {
      dhd $$0 = this.v().b(dhd.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dhd $$3 = this.v().a(dhd.a(), "chunks");
      dgo $$4 = new dgo($$0, $$1);
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
   public void a(jh $$0, dxv $$1, dxv $$2) {
      Optional<jq<chn>> $$3 = cho.a($$1);
      Optional<jq<chn>> $$4 = cho.a($$2);
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

   public chk z() {
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

   public crm A() {
      return this.f;
   }

   @Nullable
   public crk d(jh $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jh $$0) {
      return this.d($$0) != null;
   }

   public void a(chh $$0, bvk $$1, bwv $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      arm $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dht.d $$3 = this.m().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bwj> $$4 = (Entry<bwj>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bwj)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bvk> $$1) throws IOException {
      aze $$2 = aze.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bvk $$3 : $$1) {
         xv $$4 = $$3.an();
         xv $$5 = $$3.p_();
         $$2.a($$3.dB(), $$3.dD(), $$3.dH(), $$3.cG(), ma.f.b($$3.aq()), $$3.bL(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aze $$1 = aze.a().a("x").a("y").a("z").a("type").a($$0);

      for (dws $$2 : this.s) {
         jh $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eoc $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jh $$0, dkm $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bvk> B() {
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
   public ebt E() {
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
         a(this.s, dws::d),
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
   protected ech<bvk> G() {
      return this.O.d();
   }

   public void a(Stream<bvk> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bvk> $$0) {
      this.O.b($$0);
   }

   public void b(eaa $$0) {
      $$0.d(this.D_().c());
   }

   public void a(dzq $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public eup H() {
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
      return this.O.a($$0) && this.J.a.j().c(dgo.a($$0));
   }

   public boolean g(jh $$0) {
      return this.O.a($$0);
   }

   public boolean a(dgo $$0) {
      return this.O.a($$0);
   }

   @Override
   public cst J() {
      return this.K.aZ().K();
   }

   @Override
   public czn K() {
      return this.K.bn();
   }

   @Override
   public dvv L() {
      return this.K.bo();
   }

   public bam a(alz $$0) {
      return this.ah.a($$0);
   }

   public bto M() {
      return this.ah;
   }

   public dhe N() {
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

   final class a implements ecg<bvk> {
      public void a(bvk $$0) {
      }

      public void b(bvk $$0) {
         ash.this.g().a($$0);
      }

      public void c(bvk $$0) {
         ash.this.N.a($$0);
      }

      public void d(bvk $$0) {
         ash.this.N.b($$0);
      }

      public void e(bvk $$0) {
         ash.this.m().b($$0);
         if ($$0 instanceof asi $$1) {
            ash.this.I.add($$1);
            ash.this.f();
         }

         if ($$0 instanceof bwi $$2) {
            if (ash.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ash.this.W.add($$2);
         }

         if ($$0 instanceof cku $$4) {
            for (ckr $$5 : $$4.x()) {
               ash.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(eco::a);
      }

      public void f(bvk $$0) {
         ash.this.m().a($$0);
         if ($$0 instanceof asi $$1) {
            ash.this.I.remove($$1);
            ash.this.f();
         }

         if ($$0 instanceof bwi $$2) {
            if (ash.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ash.this.W.remove($$2);
         }

         if ($$0 instanceof cku $$4) {
            for (ckr $$5 : $$4.x()) {
               ash.this.ad.remove($$5.ar());
            }
         }

         $$0.a(eco::b);
      }

      public void g(bvk $$0) {
         $$0.a(eco::c);
      }
   }
}
