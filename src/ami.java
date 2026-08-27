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

public class ami extends csf implements csz {
   public static final hx a = new hx(100, 50, 0);
   public static final big b = bim.a(12000, 180000);
   public static final big c = bim.a(12000, 24000);
   private static final big D = bim.a(12000, 180000);
   public static final big d = bim.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<amj> H = Lists.newArrayList();
   private final amg I;
   private final MinecraftServer J;
   private final eex K;
   final dlk L = new dlk();
   private final dlp<bkv> M;
   private final dly N;
   public boolean e;
   private final aqb O;
   private int P;
   private final edt Q;
   private final eli<cvf> R = new eli<>(this::d, this.af());
   private final eli<ecw> S = new eli<>(this::d, this.af());
   final Set<bln> T = new ObjectOpenHashSet();
   volatile boolean U;
   protected final cfi f;
   private final ObjectLinkedOpenHashSet<crk> V = new ObjectLinkedOpenHashSet();
   private final List<crk> W = new ArrayList<>(64);
   private boolean X;
   private final List<crs> Y;
   @Nullable
   private dkz Z;
   final Int2ObjectMap<bzk> aa = new Int2ObjectOpenHashMap();
   private final csx ab;
   private final dxn ac;
   private final boolean ad;
   private final bjh ae;

   public ami(
      MinecraftServer $$0,
      Executor $$1,
      ees.c $$2,
      eex $$3,
      agl<csf> $$4,
      dkx $$5,
      amr $$6,
      boolean $$7,
      long $$8,
      List<crs> $$9,
      boolean $$10,
      @Nullable bjh $$11
   ) {
      super($$3, $$4, $$0.aZ(), $$5.a(), $$0::aR, false, $$7, $$8, $$0.bh());
      this.ad = $$10;
      this.J = $$0;
      this.Y = $$9;
      this.K = $$3;
      djk $$12 = $$5.b();
      boolean $$13 = $$0.aW();
      DataFixer $$14 = $$0.aA();
      dlh<bkv> $$15 = new dkm(this, $$2.a($$4).resolve("entities"), $$14, $$13, $$0);
      this.M = new dlp<>(bkv.class, new ami.a(), $$15);
      this.I = new amg(this, $$2, $$14, $$0.aX(), $$1, $$12, $$0.ae().p(), $$0.ae().q(), $$13, $$6, this.M::a, () -> $$0.F().t());
      this.I.h().b();
      this.Q = new edt(this);
      this.R();
      this.U();
      this.D_().a($$0.au());
      this.f = this.t().a(cfi.a(this), cfi.a(this.ac()));
      if (!$$0.Q()) {
         $$3.a($$0.v_());
      }

      long $$16 = $$0.aY().A().b();
      this.ac = new dxn(this.I.m(), this.I_(), $$0.aX(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ab = new csx(this, $$0.aY().A(), this.ac);
      if (this.ad() == csf.j && this.ac().a(dku.c)) {
         this.Z = new dkz(this, $$16, $$0.aY().E());
      } else {
         this.Z = null;
      }

      this.O = new aqb();
      this.N = new dly(this);
      this.ae = Objects.requireNonNullElseGet($$11, () -> this.t().a(bjh.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dkz $$0) {
      this.Z = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.K.a($$0);
      this.K.f($$1);
      this.K.e($$1);
      this.K.b($$2);
      this.K.a($$3);
   }

   @Override
   public ig<ctd> a(int $$0, int $$1, int $$2) {
      return this.k().g().c().getNoiseBiome($$0, $$1, $$2, this.k().i().b());
   }

   public csx a() {
      return this.ab;
   }

   public void a(BooleanSupplier $$0) {
      bfs $$1 = this.ae();
      this.X = true;
      bjl $$2 = this.r();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.D_().s();
         $$1.b("weather");
         this.as();
      }

      int $$4 = this.Y().c(csb.P);
      if (this.O.a($$4) && this.O.a($$4, this.H)) {
         if (this.Y().b(csb.l)) {
            long $$5 = this.A.f() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.aq();
         if (this.Y().b(csb.v) && this.aa()) {
            this.at();
         }
      }

      this.R();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ag() && $$3) {
         long $$6 = this.W();
         $$1.a("blockTicks");
         this.R.a($$6, 65536, this::d);
         $$1.b("fluidTicks");
         this.S.a($$6, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      if ($$3) {
         this.f.a();
      }

      $$1.b("chunkSource");
      this.k().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.av();
      }

      this.X = false;
      $$1.c();
      boolean $$7 = !this.H.isEmpty() || !this.v().isEmpty();
      if ($$7) {
         this.g();
      }

      if ($$7 || this.P++ < 300) {
         $$1.a("entities");
         if (this.Z != null) {
            $$1.a("dragonFight");
            this.Z.c();
            $$1.c();
         }

         this.L.a($$2x -> {
            if (!$$2x.dI()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dz();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dp().a())) {
                     bkv $$3x = $$2x.da();
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
         this.Q();
      }

      $$1.a("entityManagement");
      this.M.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.I.a.j().d($$0);
   }

   protected void b() {
      if (this.ad) {
         long $$0 = this.A.e() + 1L;
         this.K.a($$0);
         this.K.u().a(this.J, $$0);
         if (this.A.q().b(csb.l)) {
            this.b(this.A.f() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (crs $$2 : this.Y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bkv $$0) {
      return this.J.Y() || !($$0 instanceof bww) && !($$0 instanceof bxy) ? !this.J.Z() && $$0 instanceof cdl : true;
   }

   private void aq() {
      this.O.a();
      this.H.stream().filter(bll::fE).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dju $$0, int $$1) {
      crm $$2 = $$0.f();
      boolean $$3 = this.aa();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bfs $$6 = this.ae();
      $$6.a("thunder");
      if ($$3 && this.Z() && this.z.a(100000) == 0) {
         hx $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.q($$7)) {
            biz $$8 = this.d_($$7);
            boolean $$9 = this.Y().b(csb.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(cvh.ss);
            if ($$9) {
               bzb $$10 = bkz.aK.a((csf)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            blk $$11 = bkz.ai.a((csf)this);
            if ($$11 != null) {
               $$11.e(ejz.c($$7));
               $$11.a($$9);
               this.b($$11);
            }
         }
      }

      $$6.b("iceandsnow");

      for (int $$12 = 0; $$12 < $$1; $$12++) {
         if (this.z.a(48) == 0) {
            this.a($$3, this.a($$4, 0, $$5, 15));
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         djv[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            djv $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = iy.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  hx $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dhn $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  ecx $$21 = $$20.u();
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

   private void a(boolean $$0, hx $$1) {
      hx $$2 = this.a(dmw.a.e, $$1);
      hx $$3 = $$2.d();
      ctd $$4 = this.s($$2).a();
      if ($$4.a(this, $$3)) {
         this.b($$3, cvh.dO.o());
      }

      if ($$0) {
         int $$5 = this.Y().c(csb.T);
         if ($$5 > 0 && $$4.b(this, $$2)) {
            dhn $$6 = this.a_($$2);
            if ($$6.a(cvh.dN)) {
               int $$7 = $$6.c(dcn.c);
               if ($$7 < Math.min($$5, 8)) {
                  dhn $$8 = $$6.a(dcn.c, Integer.valueOf($$7 + 1));
                  cvf.a($$6, $$8, this, $$2);
                  this.b($$2, $$8);
               }
            } else {
               this.b($$2, cvh.dN.o());
            }
         }

         ctd.c $$9 = $$4.a($$3);
         if ($$9 != ctd.c.a) {
            dhn $$10 = this.a_($$3);
            $$10.b().a($$10, this, $$3, $$9);
         }
      }
   }

   private Optional<hx> D(hx $$0) {
      Optional<hx> $$1 = this.x().e($$0x -> $$0x.a(bwo.t), $$0x -> $$0x.v() == this.a(dmw.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bwk.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected hx a(hx $$0) {
      hx $$1 = this.a(dmw.a.e, $$0);
      Optional<hx> $$2 = this.D($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         eju $$3 = eju.a($$1, new hx($$1.h(this.ak()))).g(3.0);
         List<bll> $$4 = this.a(bll.class, $$3, $$0x -> $$0x != null && $$0x.bx() && this.g($$0x.dn()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dn();
         } else {
            if ($$1.v() == this.J_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean c() {
      return this.X;
   }

   public boolean d() {
      return this.Y().c(csb.P) <= 100;
   }

   private void ar() {
      if (this.d()) {
         if (!this.n().Q() || this.n().p()) {
            int $$0 = this.Y().c(csb.P);
            uv $$1;
            if (this.O.a($$0)) {
               $$1 = uv.c("sleep.skipping_night");
            } else {
               $$1 = uv.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
            }

            for (amj $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.O.a(this.H)) {
         this.ar();
      }
   }

   public ahd f() {
      return this.J.aH();
   }

   private void as() {
      boolean $$0 = this.aa();
      if (this.E_().g()) {
         if (this.Y().b(csb.v)) {
            int $$1 = this.K.h();
            int $$2 = this.K.j();
            int $$3 = this.K.l();
            boolean $$4 = this.A.i();
            boolean $$5 = this.A.k();
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

            this.K.e($$2);
            this.K.f($$3);
            this.K.a($$1);
            this.K.a($$4);
            this.K.b($$5);
         }

         this.x = this.y;
         if (this.A.i()) {
            this.y += 0.01F;
         } else {
            this.y -= 0.01F;
         }

         this.y = atq.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.k()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = atq.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ae().a(new zm(zm.h, this.w), this.ad());
      }

      if (this.x != this.y) {
         this.J.ae().a(new zm(zm.i, this.y), this.ad());
      }

      if ($$0 != this.aa()) {
         if ($$0) {
            this.J.ae().a(new zm(zm.c, 0.0F));
         } else {
            this.J.ae().a(new zm(zm.b, 0.0F));
         }

         this.J.ae().a(new zm(zm.h, this.w));
         this.J.ae().a(new zm(zm.i, this.y));
      }
   }

   private void at() {
      this.K.f(0);
      this.K.b(false);
      this.K.e(0);
      this.K.a(false);
   }

   public void g() {
      this.P = 0;
   }

   private void a(hx $$0, ecw $$1) {
      ecx $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((csf)this, $$0);
      }
   }

   private void d(hx $$0, cvf $$1) {
      dhn $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bkv $$0) {
      $$0.bp();
      bfs $$1 = this.ae();
      $$0.ah++;
      this.ae().a(() -> kc.h.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ae().c();

      for (bkv $$2 : $$0.cQ()) {
         this.a($$0, $$2);
      }
   }

   private void a(bkv $$0, bkv $$1) {
      if ($$1.dI() || $$1.da() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cdz || this.L.c($$1)) {
         $$1.bp();
         $$1.ah++;
         bfs $$2 = this.ae();
         $$2.a(() -> kc.h.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bkv $$3 : $$1.cQ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cdz $$0, hx $$1) {
      return !this.J.a(this, $$1, $$0) && this.D_().a($$1);
   }

   public void a(@Nullable atv $$0, boolean $$1, boolean $$2) {
      amg $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(uv.c("menu.savingLevel"));
         }

         this.au();
         if ($$0 != null) {
            $$0.c(uv.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.M.c();
         } else {
            this.M.b();
         }
      }
   }

   private void au() {
      if (this.Z != null) {
         this.J.aY().a(this.Z.b());
      }

      this.k().k().a();
   }

   public <T extends bkv> List<? extends T> a(dll<bkv, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bkv> void a(dll<bkv, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bkv> void a(dll<bkv, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.F().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return asf.a.b;
            }
         }

         return asf.a.a;
      });
   }

   public List<? extends bzm> h() {
      return this.a(bkz.C, bll::bx);
   }

   public List<amj> a(Predicate<? super amj> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<amj> a(Predicate<? super amj> $$0, int $$1) {
      List<amj> $$2 = Lists.newArrayList();

      for (amj $$3 : this.H) {
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
   public amj i() {
      List<amj> $$0 = this.a(bll::bx);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bkv $$0) {
      return this.j($$0);
   }

   public boolean c(bkv $$0) {
      return this.j($$0);
   }

   public void d(bkv $$0) {
      this.j($$0);
   }

   public void a(amj $$0) {
      this.e($$0);
   }

   public void b(amj $$0) {
      this.e($$0);
   }

   public void c(amj $$0) {
      this.e($$0);
   }

   public void d(amj $$0) {
      this.e($$0);
   }

   private void e(amj $$0) {
      bkv $$1 = this.F().a($$0.cw());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cw());
         $$1.ag();
         this.a((amj)$$1, bkv.c.b);
      }

      this.M.a($$0);
   }

   private boolean j(bkv $$0) {
      if ($$0.dI()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bkz.a($$0.ai()));
         return false;
      } else {
         return this.M.a($$0);
      }
   }

   public boolean e(bkv $$0) {
      if ($$0.cS().map(bkv::cw).anyMatch(this.M::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dju $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(amj $$0, bkv.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, hx $$1, int $$2) {
      for (amj $$3 : this.J.ae().t()) {
         if ($$3 != null && $$3.dN() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.ds();
            double $$5 = (double)$$1.v() - $$3.du();
            double $$6 = (double)$$1.w() - $$3.dy();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new yn($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cdz $$0, double $$1, double $$2, double $$3, ig<aqu> $$4, aqw $$5, float $$6, float $$7, long $$8) {
      this.J.ae().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ad(), new aby($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cdz $$0, bkv $$1, ig<aqu> $$2, aqw $$3, float $$4, float $$5, long $$6) {
      this.J.ae().a($$0, $$1.ds(), $$1.du(), $$1.dy(), (double)$$2.a().a($$4), this.ad(), new abx($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, hx $$1, int $$2) {
      if (this.Y().b(csb.W)) {
         this.J.ae().a(new zs($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cdz $$0, int $$1, hx $$2, int $$3) {
      this.J.ae().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ad(), new zs($$1, $$2, $$3, false));
   }

   public int j() {
      return this.E_().p();
   }

   @Override
   public void a(dlx $$0, ejz $$1, dlx.a $$2) {
      this.N.a($$0, $$1, $$2);
   }

   @Override
   public void a(hx $$0, dhn $$1, dhn $$2, int $$3) {
      if (this.U) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      eks $$5 = $$1.k(this, $$0);
      eks $$6 = $$2.k(this, $$0);
      if (ekp.c($$5, $$6, ekd.g)) {
         List<buu> $$7 = new ObjectArrayList();

         for (bln $$8 : this.T) {
            buu $$9 = $$8.N();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.U = true;

            for (buu $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.U = false;
         }
      }
   }

   @Override
   public void a(hx $$0, cvf $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(hx $$0, cvf $$1, ib $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(hx $$0, cvf $$1, hx $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dhn $$0, hx $$1, cvf $$2, hx $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bkv $$0, byte $$1) {
      this.k().a($$0, new zj($$0, $$1));
   }

   @Override
   public void a(bkv $$0, bjt $$1) {
      this.k().a($$0, new zg($$0, $$1));
   }

   public amg k() {
      return this.I;
   }

   @Override
   public crx a(@Nullable bkv $$0, @Nullable bjt $$1, @Nullable cry $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, csf.a $$8) {
      crx $$9 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false);
      if (!$$9.b()) {
         $$9.g();
      }

      for (amj $$10 : this.H) {
         if ($$10.i($$3, $$4, $$5) < 4096.0) {
            $$10.c.b(new zk($$3, $$4, $$5, $$6, $$9.h(), $$9.d().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(hx $$0, cvf $$1, int $$2, int $$3) {
      this.V.add(new crk($$0, $$1, $$2, $$3));
   }

   private void av() {
      this.W.clear();

      while (!this.V.isEmpty()) {
         crk $$0 = (crk)this.V.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.J.ae().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ad(), new yp($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.W.add($$0);
         }
      }

      this.V.addAll(this.W);
   }

   private boolean a(crk $$0) {
      dhn $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eli<cvf> l() {
      return this.R;
   }

   public eli<ecw> m() {
      return this.S;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.J;
   }

   public edt o() {
      return this.Q;
   }

   public ebn p() {
      return this.J.aX();
   }

   public <T extends ju> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      zt $$9 = new zt($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         amj $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends ju> boolean a(amj $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      wo<?> $$11 = new zt($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(amj $$0, boolean $$1, double $$2, double $$3, double $$4, wo<?> $$5) {
      if ($$0.dN() != this) {
         return false;
      } else {
         hx $$6 = $$0.dn();
         if ($$6.a(new ejz($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bkv a(int $$0) {
      return this.F().a($$0);
   }

   @Deprecated
   @Nullable
   public bkv b(int $$0) {
      bkv $$1 = this.F().a($$0);
      return $$1 != null ? $$1 : (bkv)this.aa.get($$0);
   }

   @Nullable
   public bkv a(UUID $$0) {
      return this.F().a($$0);
   }

   @Nullable
   public hx a(arz<dxm> $$0, hx $$1, int $$2, boolean $$3) {
      if (!this.J.aY().A().c()) {
         return null;
      } else {
         Optional<ik.c<dxm>> $$4 = this.I_().d(kd.aB).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<hx, ig<dxm>> $$5 = this.k().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (hx)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<hx, ig<ctd>> a(Predicate<ig<ctd>> $$0, hx $$1, int $$2, int $$3, int $$4) {
      return this.k().g().c().a($$1, $$2, $$3, $$4, $$0, this.k().i().b(), this);
   }

   @Override
   public cow q() {
      return this.J.aG();
   }

   @Override
   public bjl r() {
      return this.J.aO();
   }

   @Override
   public boolean s() {
      return this.e;
   }

   public een t() {
      return this.k().k();
   }

   @Nullable
   @Override
   public eeh a(String $$0) {
      return this.n().F().t().b(eeh.a(), $$0);
   }

   @Override
   public void a(String $$0, eeh $$1) {
      this.n().F().t().a($$0, $$1);
   }

   @Override
   public int u() {
      return this.n().F().t().a(eeg.a(), "idcounts").b();
   }

   public void a(hx $$0, float $$1) {
      crm $$2 = new crm(new hx(this.A.a(), 0, this.A.c()));
      this.A.a($$0, $$1);
      this.k().b(amn.a, $$2, 11, aus.a);
      this.k().a(amn.a, new crm($$0), 11, aus.a);
      this.n().ae().a(new abg($$0, $$1));
   }

   public LongSet v() {
      csa $$0 = this.t().b(csa.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      csa $$3 = this.t().a(csa.a(), "chunks");
      crm $$4 = new crm($$0, $$1);
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
         this.k().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<amj> w() {
      return this.H;
   }

   @Override
   public void a(hx $$0, dhn $$1, dhn $$2) {
      Optional<ig<bwn>> $$3 = bwo.a($$1);
      Optional<ig<bwn>> $$4 = bwo.a($$2);
      if (!Objects.equals($$3, $$4)) {
         hx $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.x().a($$5);
               aco.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.x().a($$5, $$1x);
               aco.a(this, $$5);
            }));
      }
   }

   public bwk x() {
      return this.k().l();
   }

   public boolean b(hx $$0) {
      return this.a($$0, 1);
   }

   public boolean a(iy $$0) {
      return this.b($$0.q());
   }

   public boolean a(hx $$0, int $$1) {
      return $$1 > 6 ? false : this.b(iy.a($$0)) <= $$1;
   }

   public int b(iy $$0) {
      return this.x().a($$0);
   }

   public cfi y() {
      return this.f;
   }

   @Nullable
   public cfg c(hx $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean d(hx $$0) {
      return this.c($$0) != null;
   }

   public void a(bwh $$0, bkv $$1, bma $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      als $$1 = this.k().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         csq.d $$3 = this.k().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<blo> $$4 = (Entry<blo>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((blo)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.M.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.r.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.l().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.m().a()));
         $$2.write("distance_manager: " + $$1.j().c() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.k().f()));
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
         this.M.a($$10);
      }

      Path $$11 = $$0.resolve("entities.csv");

      try (Writer $$12 = Files.newBufferedWriter($$11)) {
         a($$12, this.F().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<bkv> $$1) throws IOException {
      asr $$2 = asr.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bkv $$3 : $$1) {
         uv $$4 = $$3.af();
         uv $$5 = $$3.Q_();
         $$2.a($$3.ds(), $$3.du(), $$3.dy(), $$3.cw(), kc.h.b($$3.ai()), $$3.bx(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      asr $$1 = asr.a().a("x").a("y").a("z").a("type").a($$0);

      for (dgz $$2 : this.r) {
         hx $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(dxe $$0) {
      this.V.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(hx $$0, cvf $$1) {
      if (!this.ag()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ib $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bkv> z() {
      return this.F().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.g() + "]";
   }

   public boolean A() {
      return this.J.aY().B();
   }

   @Override
   public long B() {
      return this.J.aY().A().b();
   }

   @Nullable
   public dkz C() {
      return this.Z;
   }

   @Override
   public ami D() {
      return this;
   }

   @VisibleForTesting
   public String E() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.M.e(),
         a(this.M.d().a(), $$0 -> kc.h.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dgz::d),
         this.l().a(),
         this.m().a(),
         this.G()
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

   public static void a(ami $$0) {
      hx $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      hx.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cvh.a.o()));
      hx.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cvh.co.o()));
   }

   @Override
   protected dln<bkv> F() {
      return this.M.d();
   }

   public void a(Stream<bkv> $$0) {
      this.M.a($$0);
   }

   public void b(Stream<bkv> $$0) {
      this.M.b($$0);
   }

   public void b(dju $$0) {
      $$0.c(this.B_().e());
   }

   public void a(djj $$0) {
      this.J.execute(() -> this.ac.a($$0.f(), $$0.g()));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.M.close();
   }

   @Override
   public String G() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.M.e();
   }

   public boolean c(long $$0) {
      return this.M.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean e(hx $$0) {
      return this.M.a($$0) && this.I.a.j().c(crm.a($$0));
   }

   public boolean f(hx $$0) {
      return this.M.a($$0);
   }

   public boolean a(crm $$0) {
      return this.M.a($$0);
   }

   @Override
   public cgi H() {
      return this.J.aY().M();
   }

   public atw a(agm $$0) {
      return this.ae.a($$0);
   }

   public bjh I() {
      return this.ae;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.M.f()));
      return $$1;
   }

   final class a implements dlm<bkv> {
      public void a(bkv $$0) {
      }

      public void b(bkv $$0) {
         ami.this.f().a($$0);
      }

      public void c(bkv $$0) {
         ami.this.L.a($$0);
      }

      public void d(bkv $$0) {
         ami.this.L.b($$0);
      }

      public void e(bkv $$0) {
         ami.this.k().b($$0);
         if ($$0 instanceof amj $$1) {
            ami.this.H.add($$1);
            ami.this.e();
         }

         if ($$0 instanceof bln $$2) {
            if (ami.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ami.this.T.add($$2);
         }

         if ($$0 instanceof bzm $$4) {
            for (bzk $$5 : $$4.gb()) {
               ami.this.aa.put($$5.aj(), $$5);
            }
         }

         $$0.a(dlu::a);
      }

      public void f(bkv $$0) {
         ami.this.k().a($$0);
         if ($$0 instanceof amj $$1) {
            ami.this.H.remove($$1);
            ami.this.e();
         }

         if ($$0 instanceof bln $$2) {
            if (ami.this.U) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            ami.this.T.remove($$2);
         }

         if ($$0 instanceof bzm $$4) {
            for (bzk $$5 : $$4.gb()) {
               ami.this.aa.remove($$5.aj());
            }
         }

         $$0.a(dlu::b);
      }

      public void g(bkv $$0) {
         $$0.a(dlu::c);
      }
   }
}
