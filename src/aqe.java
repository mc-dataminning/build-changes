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

public class aqe extends czu implements dap {
   public static final im a = new im(100, 50, 0);
   public static final bnv b = bob.a(12000, 180000);
   public static final bnv c = bob.a(12000, 24000);
   private static final bnv D = bob.a(12000, 180000);
   public static final bnv d = bob.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<aqf> H = Lists.newArrayList();
   private final aqc I;
   private final MinecraftServer J;
   private final env K;
   private int L;
   final due M = new due();
   private final duj<bql> N;
   private final dus O;
   public boolean e;
   private final aue P;
   private int Q;
   private final emp R;
   private final eut<dcv> S = new eut<>(this::d, this.ag());
   private final eut<elq> T = new eut<>(this::d, this.ag());
   private final emj U = new emj();
   final Set<brg> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final cly f;
   private final ObjectLinkedOpenHashSet<cyz> X = new ObjectLinkedOpenHashSet();
   private final List<cyz> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<czh> aa;
   @Nullable
   private dtt ab;
   final Int2ObjectMap<cfn> ac = new Int2ObjectOpenHashMap();
   private final dan ad;
   private final egh ae;
   private final boolean af;
   private final box ag;

   public aqe(
      MinecraftServer $$0,
      Executor $$1,
      enq.c $$2,
      env $$3,
      ake<czu> $$4,
      dtr $$5,
      aqn $$6,
      boolean $$7,
      long $$8,
      List<czh> $$9,
      boolean $$10,
      @Nullable box $$11
   ) {
      super($$3, $$4, $$0.bd(), $$5.a(), $$0::aU, false, $$7, $$8, $$0.bl());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      drv $$12 = $$5.b();
      boolean $$13 = $$0.ba();
      DataFixer $$14 = $$0.aD();
      dub<bql> $$15 = new dtc(new dtm(new dtk($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, azc.s), this, $$0);
      this.N = new duj<>(bql.class, new aqe.a(), $$15);
      this.I = new aqc(this, $$2, $$14, $$0.bb(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new emp(this);
      this.T();
      this.W();
      this.C_().a($$0.ax());
      this.f = this.u().a(cly.a(this), cly.a(this.ad()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bc().y().b();
      this.ae = new egh(this.I.m(), this.H_(), $$0.bb(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ad = new dan(this, $$0.bc().y(), this.ae);
      if (this.ae() == czu.j && this.ad().a(dto.c)) {
         this.ab = new dtt(this, $$16, $$0.bc().C());
      } else {
         this.ab = null;
      }

      this.P = new aue();
      this.O = new dus(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(box.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dtt $$0) {
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
   public iv<dat> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dan a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      ble $$1 = this.af();
      this.Z = true;
      bpb $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.at();
      }

      int $$4 = this.aa().c(czq.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.aa().b(czq.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.aa().b(czq.v) && this.ac()) {
            this.g();
         }
      }

      this.T();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ah() && $$3) {
         long $$6 = this.Y();
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
         this.av();
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
            if (!$$2x.dI()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dz();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dp().a())) {
                     bql $$3x = $$2x.da();
                     if ($$3x != null) {
                        if (!$$3x.dI() && $$3x.x($$2x)) {
                           return;
                        }

                        $$2x.ac();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.S();
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
         if (this.A.o().b(czq.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (czh $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bql $$0) {
      return this.J.ab() || !($$0 instanceof cct) && !($$0 instanceof cdv) ? !this.J.ac() && $$0 instanceof cjx : true;
   }

   private void ar() {
      this.P.a();
      this.H.stream().filter(bre::fJ).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dse $$0, int $$1) {
      czb $$2 = $$0.f();
      boolean $$3 = this.ac();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      ble $$6 = this.af();
      $$6.a("thunder");
      if ($$3 && this.ab() && this.z.a(100000) == 0) {
         im $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            boo $$8 = this.d_($$7);
            boolean $$9 = this.aa().b(czq.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dcx.ss);
            if ($$9) {
               cfd $$10 = bqr.aN.a((czu)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            brd $$11 = bqr.al.a((czu)this);
            if ($$11 != null) {
               $$11.e(etf.c($$7));
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
         dsf[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dsf $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = jo.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  im $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dpy $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  elr $$21 = $$20.u();
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
   public void a(im $$0) {
      im $$1 = this.a(dvq.a.e, $$0);
      im $$2 = $$1.d();
      dat $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dcx.dO.n());
      }

      if (this.ac()) {
         int $$4 = this.aa().c(czq.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dpy $$5 = this.a_($$1);
            if ($$5.a(dcx.dN)) {
               int $$6 = $$5.c(dke.c);
               if ($$6 < Math.min($$4, 8)) {
                  dpy $$7 = $$5.a(dke.c, Integer.valueOf($$6 + 1));
                  dcv.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dcx.dN.n());
            }
         }

         dat.c $$8 = $$3.a($$2);
         if ($$8 != dat.c.a) {
            dpy $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<im> E(im $$0) {
      Optional<im> $$1 = this.y().e($$0x -> $$0x.a(ccl.t), $$0x -> $$0x.v() == this.a(dvq.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cch.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected im b(im $$0) {
      im $$1 = this.a(dvq.a.e, $$0);
      Optional<im> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         eta $$3 = eta.a($$1, new im($$1.h(this.al()))).g(3.0);
         List<bre> $$4 = this.a(bre.class, $$3, $$0x -> $$0x != null && $$0x.bB() && this.h($$0x.dn()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dn();
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
      return this.aa().c(czq.P) <= 100;
   }

   private void as() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.aa().c(czq.P);
            ws $$1;
            if (this.P.a($$0)) {
               $$1 = ws.c("sleep.skipping_night");
            } else {
               $$1 = ws.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (aqf $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.P.a(this.H)) {
         this.as();
      }
   }

   public akw f() {
      return this.J.aK();
   }

   private void at() {
      boolean $$0 = this.ac();
      if (this.D_().g()) {
         if (this.aa().b(czq.v)) {
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

         this.y = axw.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = axw.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new acr(acr.i, this.w), this.ae());
      }

      if (this.x != this.y) {
         this.J.ah().a(new acr(acr.j, this.y), this.ae());
      }

      if ($$0 != this.ac()) {
         if ($$0) {
            this.J.ah().a(new acr(acr.d, 0.0F));
         } else {
            this.J.ah().a(new acr(acr.c, 0.0F));
         }

         this.J.ah().a(new acr(acr.i, this.w));
         this.J.ah().a(new acr(acr.j, this.y));
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

   private void a(im $$0, elq $$1) {
      elr $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((czu)this, $$0);
      }
   }

   private void d(im $$0, dcv $$1) {
      dpy $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bql $$0) {
      $$0.bs();
      ble $$1 = this.af();
      $$0.ai++;
      this.af().a(() -> lc.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.af().c();

      for (bql $$2 : $$0.cQ()) {
         this.a($$0, $$2);
      }
   }

   private void a(bql $$0, bql $$1) {
      if ($$1.dI() || $$1.da() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof ckl || this.M.c($$1)) {
         $$1.bs();
         $$1.ai++;
         ble $$2 = this.af();
         $$2.a(() -> lc.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bql $$3 : $$1.cQ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(ckl $$0, im $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable ayc $$0, boolean $$1, boolean $$2) {
      aqc $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(ws.c("menu.savingLevel"));
         }

         this.au();
         if ($$0 != null) {
            $$0.c(ws.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.N.c();
         } else {
            this.N.b();
         }
      }
   }

   private void au() {
      if (this.ab != null) {
         this.J.bc().a(this.ab.b());
      }

      this.l().k().a();
   }

   public <T extends bql> List<? extends T> a(duf<bql, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bql> void a(duf<bql, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bql> void a(duf<bql, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return awj.a.b;
            }
         }

         return awj.a.a;
      });
   }

   public List<? extends cfp> i() {
      return this.a(bqr.F, bre::bB);
   }

   public List<aqf> a(Predicate<? super aqf> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aqf> a(Predicate<? super aqf> $$0, int $$1) {
      List<aqf> $$2 = Lists.newArrayList();

      for (aqf $$3 : this.H) {
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
   public aqf j() {
      List<aqf> $$0 = this.a(bre::bB);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bql $$0) {
      return this.j($$0);
   }

   public boolean c(bql $$0) {
      return this.j($$0);
   }

   public void d(bql $$0) {
      this.j($$0);
   }

   public void a(aqf $$0) {
      this.e($$0);
   }

   public void b(aqf $$0) {
      this.e($$0);
   }

   public void c(aqf $$0) {
      this.e($$0);
   }

   public void d(aqf $$0) {
      this.e($$0);
   }

   private void e(aqf $$0) {
      bql $$1 = this.G().a($$0.cx());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cx());
         $$1.ag();
         this.a((aqf)$$1, bql.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bql $$0) {
      if ($$0.dI()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bqr.a($$0.ai()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bql $$0) {
      if ($$0.cS().map(bql::cx).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dse $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(aqf $$0, bql.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, im $$1, int $$2) {
      for (aqf $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dN() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.ds();
            double $$5 = (double)$$1.v() - $$3.du();
            double $$6 = (double)$$1.w() - $$3.dy();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.d.b(new abq($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable ckl $$0, double $$1, double $$2, double $$3, iv<auy> $$4, ava $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ae(), new afe($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable ckl $$0, bql $$1, iv<auy> $$2, ava $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.ds(), $$1.du(), $$1.dy(), (double)$$2.a().a($$4), this.ae(), new afd($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, im $$1, int $$2) {
      if (this.aa().b(czq.W)) {
         this.J.ah().a(new acx($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable ckl $$0, int $$1, im $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ae(), new acx($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(iv<dur> $$0, etf $$1, dur.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(im $$0, dpy $$1, dpy $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      ety $$5 = $$1.k(this, $$0);
      ety $$6 = $$2.k(this, $$0);
      if (etv.c($$5, $$6, etj.g)) {
         List<cap> $$7 = new ObjectArrayList();

         for (brg $$8 : this.V) {
            cap $$9 = $$8.K();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (cap $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(im $$0, dcv $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(im $$0, dcv $$1, ir $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(im $$0, dcv $$1, im $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dpy $$0, im $$1, dcv $$2, im $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bql $$0, byte $$1) {
      this.l().a($$0, new aco($$0, $$1));
   }

   @Override
   public void a(bql $$0, bpj $$1) {
      this.l().a($$0, new ack($$0, $$1));
   }

   public aqc l() {
      return this.I;
   }

   @Override
   public czm a(
      @Nullable bql $$0,
      @Nullable bpj $$1,
      @Nullable czn $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      czu.a $$8,
      ku $$9,
      ku $$10,
      iv<auy> $$11
   ) {
      czm $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (aqf $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.d.b(new acp($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(im $$0, dcv $$1, int $$2, int $$3) {
      this.X.add(new cyz($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         cyz $$0 = (cyz)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ae(), new abs($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(cyz $$0) {
      dpy $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eut<dcv> m() {
      return this.S;
   }

   public eut<elq> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public emp p() {
      return this.R;
   }

   public ekh q() {
      return this.J.bb();
   }

   public <T extends ku> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      acy $$9 = new acy($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         aqf $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends ku> boolean a(aqf $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      yz<?> $$11 = new acy($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aqf $$0, boolean $$1, double $$2, double $$3, double $$4, yz<?> $$5) {
      if ($$0.dN() != this) {
         return false;
      } else {
         im $$6 = $$0.dn();
         if ($$6.a(new etf($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.d.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bql a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bql b(int $$0) {
      bql $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bql)this.ac.get($$0);
   }

   @Nullable
   public bql a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public im a(awd<egg> $$0, im $$1, int $$2, boolean $$3) {
      if (!this.J.bc().y().c()) {
         return null;
      } else {
         Optional<iz.c<egg>> $$4 = this.H_().d(ld.aI).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<im, iv<egg>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (im)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<im, iv<dat>> a(Predicate<iv<dat>> $$0, im $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cwj r() {
      return this.J.aJ();
   }

   @Override
   public bpb s() {
      return this.J.aR();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public enk u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public ene a(enc $$0) {
      return this.o().I().u().b(ene.a(), $$0.a());
   }

   @Override
   public void a(enc $$0, ene $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public enc v() {
      return this.o().I().u().a(end.a(), "idcounts").b();
   }

   public void a(im $$0, float $$1) {
      im $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new aem($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(aqj.a, new czb($$2), this.L, ayy.a);
      }

      int $$4 = this.aa().c(czq.Z) + 1;
      if ($$4 > 1) {
         this.l().a(aqj.a, new czb($$0), $$4, ayy.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      czp $$0 = this.u().b(czp.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      czp $$3 = this.u().a(czp.a(), "chunks");
      czb $$4 = new czb($$0, $$1);
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
   public List<aqf> x() {
      return this.H;
   }

   @Override
   public void a(im $$0, dpy $$1, dpy $$2) {
      Optional<iv<cck>> $$3 = ccl.a($$1);
      Optional<iv<cck>> $$4 = ccl.a($$2);
      if (!Objects.equals($$3, $$4)) {
         im $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               afu.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               afu.a(this, $$5);
            }));
      }
   }

   public cch y() {
      return this.l().l();
   }

   public boolean c(im $$0) {
      return this.a($$0, 1);
   }

   public boolean a(jo $$0) {
      return this.c($$0.q());
   }

   public boolean a(im $$0, int $$1) {
      return $$1 > 6 ? false : this.b(jo.a($$0)) <= $$1;
   }

   public int b(jo $$0) {
      return this.y().a($$0);
   }

   public cly z() {
      return this.f;
   }

   @Nullable
   public clw d(im $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(im $$0) {
      return this.d($$0) != null;
   }

   public void a(cce $$0, bql $$1, brs $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      apn $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         daf.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<brh> $$4 = (Entry<brh>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((brh)$$4.getKey()).a(), $$4.getIntValue()));
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
         $$6.write($$5.e());
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

   private static void a(Writer $$0, Iterable<bql> $$1) throws IOException {
      aww $$2 = aww.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bql $$3 : $$1) {
         ws $$4 = $$3.af();
         ws $$5 = $$3.O_();
         $$2.a($$3.ds(), $$3.du(), $$3.dy(), $$3.cx(), lc.g.b($$3.ai()), $$3.bB(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      aww $$1 = aww.a().a("x").a("y").a("z").a("type").a($$0);

      for (dov $$2 : this.r) {
         im $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(efy $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(im $$0, dcv $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ir $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bql> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.e() + "]";
   }

   public boolean B() {
      return this.J.bc().z();
   }

   @Override
   public long C() {
      return this.J.bc().y().b();
   }

   @Nullable
   public dtt D() {
      return this.ab;
   }

   @Override
   public aqe E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> lc.g.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dov::d),
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

   public static void a(aqe $$0) {
      im $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      im.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dcx.a.n()));
      im.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dcx.co.n()));
   }

   @Override
   protected duh<bql> G() {
      return this.N.d();
   }

   public void a(Stream<bql> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bql> $$0) {
      this.N.b($$0);
   }

   public void b(dse $$0) {
      $$0.c(this.A_().c());
   }

   public void a(dru $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public emj H() {
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

   public boolean f(im $$0) {
      return this.N.a($$0) && this.I.a.j().c(czb.a($$0));
   }

   public boolean g(im $$0) {
      return this.N.a($$0);
   }

   public boolean a(czb $$0) {
      return this.N.a($$0);
   }

   @Override
   public cmy J() {
      return this.J.bc().K();
   }

   public ayd a(akf $$0) {
      return this.ag.a($$0);
   }

   public box K() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dug<bql> {
      public void a(bql $$0) {
      }

      public void b(bql $$0) {
         aqe.this.f().a($$0);
      }

      public void c(bql $$0) {
         aqe.this.M.a($$0);
      }

      public void d(bql $$0) {
         aqe.this.M.b($$0);
      }

      public void e(bql $$0) {
         aqe.this.l().b($$0);
         if ($$0 instanceof aqf $$1) {
            aqe.this.H.add($$1);
            aqe.this.e();
         }

         if ($$0 instanceof brg $$2) {
            if (aqe.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqe.this.V.add($$2);
         }

         if ($$0 instanceof cfp $$4) {
            for (cfn $$5 : $$4.gl()) {
               aqe.this.ac.put($$5.aj(), $$5);
            }
         }

         $$0.a(duo::a);
      }

      public void f(bql $$0) {
         aqe.this.l().a($$0);
         if ($$0 instanceof aqf $$1) {
            aqe.this.H.remove($$1);
            aqe.this.e();
         }

         if ($$0 instanceof brg $$2) {
            if (aqe.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqe.this.V.remove($$2);
         }

         if ($$0 instanceof cfp $$4) {
            for (cfn $$5 : $$4.gl()) {
               aqe.this.ac.remove($$5.aj());
            }
         }

         $$0.a(duo::b);
      }

      public void g(bql $$0) {
         $$0.a(duo::c);
      }
   }
}
