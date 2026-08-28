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
import java.util.Collection;
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

public class ard extends dgj implements arc, dhh {
   public static final ji a = new ji(100, 50, 0);
   public static final brq b = brw.a(12000, 180000);
   public static final brq c = brw.a(12000, 24000);
   private static final brq E = brw.a(12000, 180000);
   public static final brq d = brw.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<are> I = Lists.newArrayList();
   private final ara J;
   private final MinecraftServer K;
   private final evl L;
   private int M;
   final ebh N = new ebh();
   private final ebm<bum> O;
   private final ebv P;
   public boolean e;
   private final avg Q;
   private int R;
   private final ety S;
   private final fcq<djn> T = new fcq<>(this::d);
   private final fcq<esz> U = new fcq<>(this::d);
   private final ets V = new ets();
   final Set<bvk> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final cqn f;
   private final ObjectLinkedOpenHashSet<dfn> Y = new ObjectLinkedOpenHashSet();
   private final List<dfn> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dfv> ab;
   @Nullable
   private eaw ac;
   final Int2ObjectMap<cjt> ad = new Int2ObjectOpenHashMap();
   private final dhf ae;
   private final eno af;
   private final boolean ag;
   private final bsq ah;

   public ard(
      MinecraftServer $$0,
      Executor $$1,
      evg.c $$2,
      evl $$3,
      aku<dgj> $$4,
      eau $$5,
      arn $$6,
      boolean $$7,
      long $$8,
      List<dfv> $$9,
      boolean $$10,
      @Nullable bsq $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dyu $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      ebe<bum> $$15 = new eae(new eap(new eam($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, ban.s), this, $$0);
      this.O = new ebm<>(bum.class, new ard.a(), $$15);
      this.J = new ara(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().w());
      this.J.h().b();
      this.S = new ety(this);
      this.Y();
      this.ab();
      this.F_().a($$0.aw());
      this.f = this.w().a(cqn.a(this), cqn.a(this.ah()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new eno(this.J.m(), this.K_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dhf(this, $$0.aZ().y(), this.af);
      if (this.ai() == dgj.k && this.ah().a(ear.c)) {
         this.ac = new eaw(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new avg();
      this.P = new ebv(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.w().a(bsq.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable eaw $$0) {
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
   public jr<dhl> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public dhf b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bou $$1 = bot.a();
      this.aa = true;
      bsu $$2 = this.u();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.F_().s();
         $$1.b("weather");
         this.av();
         $$1.c();
      }

      int $$4 = this.O().c(dgf.Q);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.O().b(dgf.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.at();
         if (this.O().b(dgf.w) && this.ag()) {
            this.h();
         }
      }

      this.Y();
      if ($$3) {
         this.c();
      }

      $$1.a("tickPending");
      if (!this.aj() && $$3) {
         long $$6 = this.ad();
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
         this.aw();
      }

      this.aa = false;
      $$1.c();
      boolean $$7 = !this.I.isEmpty() || !this.y().isEmpty();
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
                  if ($$2x instanceof are || this.J.a.j().c($$2x.dx().a())) {
                     bum $$3x = $$2x.dk();
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
         this.X();
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
         if (this.L.o().b(dgf.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dfv $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void at() {
      this.Q.a();
      this.I.stream().filter(bvi::fR).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dzd $$0, int $$1) {
      dfp $$2 = $$0.f();
      boolean $$3 = this.ag();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bou $$6 = bot.a();
      $$6.a("thunder");
      if ($$3 && this.af() && this.A.a(100000) == 0) {
         ji $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bsj $$8 = this.d_($$7);
            boolean $$9 = this.O().b(dgf.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(djp.sU);
            if ($$9) {
               cjj $$10 = but.bf.a(this, bus.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bvh $$11 = but.aw.a(this, bus.h);
            if ($$11 != null) {
               $$11.f(fbb.c($$7));
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
         dze[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dze $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kk.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ji $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dwy $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  eta $$21 = $$20.y();
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
   public void a(ji $$0) {
      ji $$1 = this.a(ect.a.e, $$0);
      ji $$2 = $$1.e();
      dhl $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, djp.eb.m());
      }

      if (this.ag()) {
         int $$4 = this.O().c(dgf.U);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dwy $$5 = this.a_($$1);
            if ($$5.a(djp.ea)) {
               int $$6 = $$5.c(drb.c);
               if ($$6 < Math.min($$4, 8)) {
                  dwy $$7 = $$5.b(drb.c, Integer.valueOf($$6 + 1));
                  djn.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, djp.ea.m());
            }
         }

         dhl.c $$8 = $$3.a($$2, this.P());
         if ($$8 != dhl.c.a) {
            dwy $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<ji> E(ji $$0) {
      Optional<ji> $$1 = this.A().e($$0x -> $$0x.a(cgq.t), $$0x -> $$0x.v() == this.a(ect.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cgm.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ji b(ji $$0) {
      ji $$1 = this.a(ect.a.e, $$0);
      Optional<ji> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         faw $$3 = faw.a($$1, $$1.h(this.an() + 1)).g(3.0);
         List<bvi> $$4 = this.a(bvi.class, $$3, $$0x -> $$0x != null && $$0x.bL() && this.h($$0x.dv()));
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
      return this.O().c(dgf.Q) <= 100;
   }

   private void au() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.O().c(dgf.Q);
            wp $$1;
            if (this.Q.a($$0)) {
               $$1 = wp.c("sleep.skipping_night");
            } else {
               $$1 = wp.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (are $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void f() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.au();
      }
   }

   public alo g() {
      return this.K.aJ();
   }

   private void av() {
      boolean $$0 = this.ag();
      if (this.G_().g()) {
         if (this.O().b(dgf.w)) {
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

         this.z = ayz.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = ayz.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new act(act.i, this.x), this.ai());
      }

      if (this.y != this.z) {
         this.K.ag().a(new act(act.j, this.z), this.ai());
      }

      if ($$0 != this.ag()) {
         if ($$0) {
            this.K.ag().a(new act(act.d, 0.0F));
         } else {
            this.K.ag().a(new act(act.c, 0.0F));
         }

         this.K.ag().a(new act(act.i, this.x));
         this.K.ag().a(new act(act.j, this.z));
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

   private void a(ji $$0, esz $$1) {
      dwy $$2 = this.a_($$0);
      eta $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(ji $$0, djn $$1) {
      dwy $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bum $$0) {
      $$0.bz();
      bou $$1 = bot.a();
      $$0.af++;
      $$1.a(() -> mb.f.b($$0.aq()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (bum $$2 : $$0.cY()) {
         this.a($$0, $$2);
      }
   }

   private void a(bum $$0, bum $$1) {
      if ($$1.dQ() || $$1.dk() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof coy || this.N.c($$1)) {
         $$1.bz();
         $$1.af++;
         bou $$2 = bot.a();
         $$2.a(() -> mb.f.b($$1.aq()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bum $$3 : $$1.cY()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(coy $$0, ji $$1) {
      return !this.K.a(this, $$1, $$0) && this.F_().a($$1);
   }

   public void a(@Nullable azg $$0, boolean $$1, boolean $$2) {
      ara $$3 = this.m();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wp.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(wp.c("menu.savingChunks"));
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

      eva $$1 = this.m().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bum> List<? extends T> a(ebi<bum, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bum> void a(ebi<bum, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bum> void a(ebi<bum, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.H().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axl.a.b;
            }
         }

         return axl.a.a;
      });
   }

   public List<? extends cjw> j() {
      return this.a(but.P, bvi::bL);
   }

   public List<are> a(Predicate<? super are> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<are> a(Predicate<? super are> $$0, int $$1) {
      List<are> $$2 = Lists.newArrayList();

      for (are $$3 : this.I) {
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
   public are k() {
      List<are> $$0 = this.a(bvi::bL);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bum $$0) {
      return this.i($$0);
   }

   public boolean c(bum $$0) {
      return this.i($$0);
   }

   public void d(bum $$0) {
      if ($$0 instanceof are $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(are $$0) {
      this.c($$0);
   }

   public void b(are $$0) {
      this.c($$0);
   }

   private void c(are $$0) {
      bum $$1 = this.H().a($$0.cG());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cG());
         $$1.ao();
         this.a((are)$$1, bum.d.b);
      }

      this.O.a($$0);
   }

   private boolean i(bum $$0) {
      if ($$0.dQ()) {
         F.warn("Tried to add entity {} but it was marked as removed already", but.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bum $$0) {
      if ($$0.da().map(bum::cG).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dzd $$0) {
      $$0.J();
      $$0.c(this);
   }

   public void a(are $$0, bum.d $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ji $$1, int $$2) {
      for (are $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dV() == this && $$3.ar() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dA();
            double $$5 = (double)$$1.v() - $$3.dC();
            double $$6 = (double)$$1.w() - $$3.dG();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.f.b(new abr($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable coy $$0, double $$1, double $$2, double $$3, jr<avz> $$4, awb $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ai(), new afn($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable coy $$0, bum $$1, jr<avz> $$2, awb $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dA(), $$1.dC(), $$1.dG(), (double)$$2.a().a($$4), this.ai(), new afm($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ji $$1, int $$2) {
      if (this.O().b(dgf.X)) {
         this.K.ag().t().forEach($$3 -> {
            fbb $$5;
            if ($$3.dV() == this) {
               fbb $$4 = fbb.b($$1);
               if ($$3.g($$4) < (double)ayz.h(32)) {
                  $$5 = $$4;
               } else {
                  fbb $$6 = $$4.d($$3.dt()).d();
                  $$5 = $$3.dt().e($$6.c(32.0));
               }
            } else {
               $$5 = $$3.dt();
            }

            $$3.f.b(new acz($$0, ji.a((kb)$$5), $$2, true));
         });
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable coy $$0, int $$1, ji $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ai(), new acz($$1, $$2, $$3, false));
   }

   public int l() {
      return this.G_().p();
   }

   @Override
   public void a(jr<ebu> $$0, fbb $$1, ebu.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(ji $$0, dwy $$1, dwy $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         af.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      fbv $$5 = $$1.g(this, $$0);
      fbv $$6 = $$2.g(this, $$0);
      if (fbs.c($$5, $$6, fbf.g)) {
         List<ceu> $$7 = new ObjectArrayList();

         for (bvk $$8 : this.W) {
            ceu $$9 = $$8.P();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (ceu $$10 : $$7) {
               $$10.h();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(ji $$0, djn $$1) {
      this.a($$0, $$1, eue.a(this, null, null));
   }

   @Override
   public void a(ji $$0, djn $$1, @Nullable eui $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(ji $$0, djn $$1, jn $$2, @Nullable eui $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(ji $$0, djn $$1, @Nullable eui $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dwy $$0, ji $$1, djn $$2, @Nullable eui $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bum $$0, byte $$1) {
      this.m().a($$0, new acp($$0, $$1));
   }

   @Override
   public void a(bum $$0, btc $$1) {
      this.m().a($$0, new acl($$0, $$1));
   }

   public ara m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bum $$0,
      @Nullable btc $$1,
      @Nullable dgc $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dgj.a $$8,
      lr $$9,
      lr $$10,
      jr<avz> $$11
   ) {
      dgb.a $$12 = switch ($$8) {
         case a -> dgb.a.a;
         case b -> this.a(dgf.R);
         case c -> this.O().b(dgf.c) ? this.a(dgf.S) : dgb.a.a;
         case d -> this.a(dgf.T);
         case e -> dgb.a.d;
      };
      fbb $$13 = new fbb($$3, $$4, $$5);
      dgz $$14 = new dgz(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lr $$15 = $$14.l() ? $$9 : $$10;

      for (are $$16 : this.I) {
         if ($$16.g($$13) < 4096.0) {
            Optional<fbb> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new acr($$13, $$17, $$15, $$11));
         }
      }
   }

   private dgb.a a(dgf.e<dgf.a> $$0) {
      return this.O().b($$0) ? dgb.a.c : dgb.a.b;
   }

   @Override
   public void a(ji $$0, djn $$1, int $$2, int $$3) {
      this.Y.add(new dfn($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dfn $$0 = (dfn)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ai(), new abt($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(dfn $$0) {
      dwy $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fcq<djn> n() {
      return this.T;
   }

   public fcq<esz> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public ety q() {
      return this.S;
   }

   public erq r() {
      return this.K.aY();
   }

   public <T extends lr> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      return this.a($$0, false, false, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public <T extends lr> int a(T $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      ada $$11 = new ada($$0, $$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      int $$12 = 0;

      for (int $$13 = 0; $$13 < this.I.size(); $$13++) {
         are $$14 = this.I.get($$13);
         if (this.a($$14, $$1, $$3, $$4, $$5, $$11)) {
            $$12++;
         }
      }

      return $$12;
   }

   public <T extends lr> boolean a(
      are $$0, T $$1, boolean $$2, boolean $$3, double $$4, double $$5, double $$6, int $$7, double $$8, double $$9, double $$10, double $$11
   ) {
      yw<?> $$12 = new ada($$1, $$2, $$3, $$4, $$5, $$6, (float)$$8, (float)$$9, (float)$$10, (float)$$11, $$7);
      return this.a($$0, $$2, $$4, $$5, $$6, $$12);
   }

   private boolean a(are $$0, boolean $$1, double $$2, double $$3, double $$4, yw<?> $$5) {
      if ($$0.dV() != this) {
         return false;
      } else {
         ji $$6 = $$0.dv();
         if ($$6.a(new fbb($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bum a(int $$0) {
      return this.H().a($$0);
   }

   @Nullable
   public bum a(UUID $$0) {
      return this.H().a($$0);
   }

   @Deprecated
   @Nullable
   public bum b(int $$0) {
      bum $$1 = this.H().a($$0);
      return $$1 != null ? $$1 : (bum)this.ad.get($$0);
   }

   @Override
   public Collection<cjt> s() {
      return this.ad.values();
   }

   @Nullable
   public ji a(axf<enn> $$0, ji $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<jv.c<enn>> $$4 = this.K_().e(mc.aU).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ji, jr<enn>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ji)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ji, jr<dhl>> a(Predicate<jr<dhl>> $$0, ji $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   public dbm t() {
      return this.K.aI();
   }

   @Override
   public bsu u() {
      return this.K.aP();
   }

   @Override
   public boolean v() {
      return this.e;
   }

   public eva w() {
      return this.m().k();
   }

   @Nullable
   @Override
   public euu a(eus $$0) {
      return this.p().J().w().b(euu.a(), $$0.a());
   }

   @Override
   public void a(eus $$0, euu $$1) {
      this.p().J().w().a($$0.a(), $$1);
   }

   @Override
   public eus x() {
      return this.p().J().w().a(eut.a(), "idcounts").b();
   }

   public void a(ji $$0, float $$1) {
      ji $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new aet($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(arj.a, new dfp($$2), this.M, baf.a);
      }

      int $$4 = this.O().c(dgf.ab) + 1;
      if ($$4 > 1) {
         this.m().a(arj.a, new dfp($$0), $$4, baf.a);
      }

      this.M = $$4;
   }

   public LongSet y() {
      dge $$0 = this.w().b(dge.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dge $$3 = this.w().a(dge.a(), "chunks");
      dfp $$4 = new dfp($$0, $$1);
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
   public List<are> z() {
      return this.I;
   }

   @Override
   public void a(ji $$0, dwy $$1, dwy $$2) {
      Optional<jr<cgp>> $$3 = cgq.a($$1);
      Optional<jr<cgp>> $$4 = cgq.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ji $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5);
               agd.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5, $$1x);
               agd.a(this, $$5);
            }));
      }
   }

   public cgm A() {
      return this.m().l();
   }

   public boolean c(ji $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kk $$0) {
      return this.c($$0.k());
   }

   public boolean a(ji $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kk.a($$0)) <= $$1;
   }

   public int b(kk $$0) {
      return this.A().a($$0);
   }

   public cqn B() {
      return this.f;
   }

   @Nullable
   public cql d(ji $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(ji $$0) {
      return this.d($$0) != null;
   }

   public void a(cgj $$0, bum $$1, bvx $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqi $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dgu.d $$3 = this.m().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bvl> $$4 = (Entry<bvl>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bvl)$$4.getKey()).a(), $$4.getIntValue()));
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
         a($$12, this.H().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<bum> $$1) throws IOException {
      axz $$2 = axz.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bum $$3 : $$1) {
         wp $$4 = $$3.an();
         wp $$5 = $$3.p_();
         $$2.a($$3.dA(), $$3.dC(), $$3.dG(), $$3.cG(), mb.f.b($$3.aq()), $$3.bL(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axz $$1 = axz.a().a("x").a("y").a("z").a("type").a($$0);

      for (dvv $$2 : this.s) {
         ji $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(enf $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ji $$0, djn $$1) {
      if (!this.aj()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jn $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bum> C() {
      return this.H().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.L.e() + "]";
   }

   public boolean D() {
      return this.K.aZ().z();
   }

   @Override
   public long E() {
      return this.K.aZ().y().c();
   }

   @Nullable
   public eaw F() {
      return this.ac;
   }

   @Override
   public ard a() {
      return this;
   }

   @VisibleForTesting
   public String G() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> mb.f.b($$0.aq()).toString()),
         this.s.size(),
         a(this.s, dvv::d),
         this.n().a(),
         this.o().a(),
         this.J()
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
   protected ebk<bum> H() {
      return this.O.d();
   }

   public void a(Stream<bum> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bum> $$0) {
      this.O.b($$0);
   }

   public void b(dzd $$0) {
      $$0.d(this.D_().c());
   }

   public void a(dyt $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public ets I() {
      return this.V;
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.O.close();
   }

   @Override
   public String J() {
      return "Chunks[S] W: " + this.J.e() + " E: " + this.O.e();
   }

   public boolean c(long $$0) {
      return this.O.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.J.a($$0);
   }

   public boolean f(ji $$0) {
      return this.O.a($$0) && this.J.a.j().c(dfp.a($$0));
   }

   public boolean g(ji $$0) {
      return this.O.a($$0);
   }

   public boolean a(dfp $$0) {
      return this.O.a($$0);
   }

   @Override
   public cru K() {
      return this.K.aZ().K();
   }

   @Override
   public cyo L() {
      return this.K.bn();
   }

   @Override
   public duy M() {
      return this.K.bo();
   }

   public azh a(akv $$0) {
      return this.ah.a($$0);
   }

   public bsq N() {
      return this.ah;
   }

   public dgf O() {
      return this.L.o();
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.O.f()));
      return $$1;
   }

   @Override
   public int P() {
      return this.J.g().f();
   }

   final class a implements ebj<bum> {
      public void a(bum $$0) {
      }

      public void b(bum $$0) {
         ard.this.g().a($$0);
      }

      public void c(bum $$0) {
         ard.this.N.a($$0);
      }

      public void d(bum $$0) {
         ard.this.N.b($$0);
      }

      public void e(bum $$0) {
         ard.this.m().b($$0);
         if ($$0 instanceof are $$1) {
            ard.this.I.add($$1);
            ard.this.f();
         }

         if ($$0 instanceof bvk $$2) {
            if (ard.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               af.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ard.this.W.add($$2);
         }

         if ($$0 instanceof cjw $$4) {
            for (cjt $$5 : $$4.x()) {
               ard.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(ebr::a);
      }

      public void f(bum $$0) {
         ard.this.m().a($$0);
         if ($$0 instanceof are $$1) {
            ard.this.I.remove($$1);
            ard.this.f();
         }

         if ($$0 instanceof bvk $$2) {
            if (ard.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               af.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ard.this.W.remove($$2);
         }

         if ($$0 instanceof cjw $$4) {
            for (cjt $$5 : $$4.x()) {
               ard.this.ad.remove($$5.ar());
            }
         }

         $$0.a(ebr::b);
      }

      public void g(bum $$0) {
         $$0.a(ebr::c);
      }
   }
}
