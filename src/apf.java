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

public class apf extends cxb implements cxw {
   public static final ib a = new ib(100, 50, 0);
   public static final bmi b = bmo.a(12000, 180000);
   public static final bmi c = bmo.a(12000, 24000);
   private static final bmi D = bmo.a(12000, 180000);
   public static final bmi d = bmo.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<apg> H = Lists.newArrayList();
   private final apd I;
   private final MinecraftServer J;
   private final ekr K;
   private int L;
   final drc M = new drc();
   private final drh<box> N;
   private final drq O;
   public boolean e;
   private final ate P;
   private int Q;
   private final ejl R;
   private final erh<dac> S = new erh<>(this::d, this.af());
   private final erh<eio> T = new erh<>(this::d, this.af());
   final Set<bpr> U = new ObjectOpenHashSet();
   volatile boolean V;
   protected final ckh f;
   private final ObjectLinkedOpenHashSet<cwg> W = new ObjectLinkedOpenHashSet();
   private final List<cwg> X = new ArrayList<>(64);
   private boolean Y;
   private final List<cwo> Z;
   @Nullable
   private dqr aa;
   final Int2ObjectMap<cdw> ab = new Int2ObjectOpenHashMap();
   private final cxu ac;
   private final edf ad;
   private final boolean ae;
   private final bnk af;

   public apf(
      MinecraftServer $$0,
      Executor $$1,
      ekm.c $$2,
      ekr $$3,
      ajg<cxb> $$4,
      dqp $$5,
      apo $$6,
      boolean $$7,
      long $$8,
      List<cwo> $$9,
      boolean $$10,
      @Nullable bnk $$11
   ) {
      super($$3, $$4, $$0.bd(), $$5.a(), $$0::aU, false, $$7, $$8, $$0.bl());
      this.ae = $$10;
      this.J = $$0;
      this.Z = $$9;
      this.K = $$3;
      doy $$12 = $$5.b();
      boolean $$13 = $$0.ba();
      DataFixer $$14 = $$0.aD();
      dqz<box> $$15 = new dqa(new dqk(new dqi($$2.d(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, ayc.s), this, $$0);
      this.N = new drh<>(box.class, new apf.a(), $$15);
      this.I = new apd(this, $$2, $$14, $$0.bb(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new ejl(this);
      this.S();
      this.V();
      this.C_().a($$0.ax());
      this.f = this.u().a(ckh.a(this), ckh.a(this.ac()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bc().y().b();
      this.ad = new edf(this.I.m(), this.H_(), $$0.bb(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ac = new cxu(this, $$0.bc().y(), this.ad);
      if (this.ad() == cxb.j && this.ac().a(dqm.c)) {
         this.aa = new dqr(this, $$16, $$0.bc().C());
      } else {
         this.aa = null;
      }

      this.P = new ate();
      this.O = new drq(this);
      this.af = Objects.requireNonNullElseGet($$11, () -> this.u().a(bnk.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dqr $$0) {
      this.aa = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.K.a($$0);
      this.K.c($$1);
      this.K.b($$1);
      this.K.b($$2);
      this.K.a($$3);
   }

   @Override
   public il<cya> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public cxu a() {
      return this.ac;
   }

   public void a(BooleanSupplier $$0) {
      bjr $$1 = this.ae();
      this.Y = true;
      bno $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.as();
      }

      int $$4 = this.Z().c(cwx.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.Z().b(cwx.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.aq();
         if (this.Z().b(cwx.v) && this.ab()) {
            this.g();
         }
      }

      this.S();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ag() && $$3) {
         long $$6 = this.X();
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
         this.au();
      }

      this.Y = false;
      $$1.c();
      boolean $$7 = !this.H.isEmpty() || !this.w().isEmpty();
      if ($$7) {
         this.h();
      }

      if ($$7 || this.Q++ < 300) {
         $$1.a("entities");
         if (this.aa != null && $$3) {
            $$1.a("dragonFight");
            this.aa.c();
            $$1.c();
         }

         this.M.a($$2x -> {
            if (!$$2x.dH()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dy();
                  $$1.c();
                  if (this.I.a.j().c($$2x.do().a())) {
                     box $$3x = $$2x.cZ();
                     if ($$3x != null) {
                        if (!$$3x.dH() && $$3x.x($$2x)) {
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
         this.R();
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
      if (this.ae) {
         long $$0 = this.A.c() + 1L;
         this.K.a($$0);
         this.K.s().a(this.J, $$0);
         if (this.A.o().b(cwx.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (cwo $$2 : this.Z) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(box $$0) {
      return this.J.ab() || !($$0 instanceof cbe) && !($$0 instanceof ccg) ? !this.J.ac() && $$0 instanceof cig : true;
   }

   private void aq() {
      this.P.a();
      this.H.stream().filter(bpp::fI).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dpi $$0, int $$1) {
      cwi $$2 = $$0.f();
      boolean $$3 = this.ab();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bjr $$6 = this.ae();
      $$6.a("thunder");
      if ($$3 && this.aa() && this.z.a(100000) == 0) {
         ib $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bnb $$8 = this.d_($$7);
            boolean $$9 = this.Z().b(cwx.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dae.ss);
            if ($$9) {
               cdm $$10 = bpd.aO.a((cxb)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bpo $$11 = bpd.am.a((cxb)this);
            if ($$11 != null) {
               $$11.e(ept.c($$7));
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
         dpj[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dpj $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = je.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ib $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dnb $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eip $$21 = $$20.u();
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
   public void a(ib $$0) {
      ib $$1 = this.a(dso.a.e, $$0);
      ib $$2 = $$1.d();
      cya $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dae.dO.o());
      }

      if (this.ab()) {
         int $$4 = this.Z().c(cwx.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dnb $$5 = this.a_($$1);
            if ($$5.a(dae.dN)) {
               int $$6 = $$5.c(dhk.c);
               if ($$6 < Math.min($$4, 8)) {
                  dnb $$7 = $$5.a(dhk.c, Integer.valueOf($$6 + 1));
                  dac.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dae.dN.o());
            }
         }

         cya.c $$8 = $$3.a($$2);
         if ($$8 != cya.c.a) {
            dnb $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<ib> E(ib $$0) {
      Optional<ib> $$1 = this.y().e($$0x -> $$0x.a(caw.t), $$0x -> $$0x.v() == this.a(dso.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cas.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ib b(ib $$0) {
      ib $$1 = this.a(dso.a.e, $$0);
      Optional<ib> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         epo $$3 = epo.a($$1, new ib($$1.h(this.ak()))).g(3.0);
         List<bpp> $$4 = this.a(bpp.class, $$3, $$0x -> $$0x != null && $$0x.bA() && this.h($$0x.dm()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dm();
         } else {
            if ($$1.v() == this.I_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean c() {
      return this.Y;
   }

   public boolean d() {
      return this.Z().c(cwx.P) <= 100;
   }

   private void ar() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.Z().c(cwx.P);
            vu $$1;
            if (this.P.a($$0)) {
               $$1 = vu.c("sleep.skipping_night");
            } else {
               $$1 = vu.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (apg $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.P.a(this.H)) {
         this.ar();
      }
   }

   public ajy f() {
      return this.J.aK();
   }

   private void as() {
      boolean $$0 = this.ab();
      if (this.D_().g()) {
         if (this.Z().b(cwx.v)) {
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

         this.y = aww.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = aww.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new abt(abt.i, this.w), this.ad());
      }

      if (this.x != this.y) {
         this.J.ah().a(new abt(abt.j, this.y), this.ad());
      }

      if ($$0 != this.ab()) {
         if ($$0) {
            this.J.ah().a(new abt(abt.d, 0.0F));
         } else {
            this.J.ah().a(new abt(abt.c, 0.0F));
         }

         this.J.ah().a(new abt(abt.i, this.w));
         this.J.ah().a(new abt(abt.j, this.y));
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

   private void a(ib $$0, eio $$1) {
      eip $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cxb)this, $$0);
      }
   }

   private void d(ib $$0, dac $$1) {
      dnb $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(box $$0) {
      $$0.bs();
      bjr $$1 = this.ae();
      $$0.ah++;
      this.ae().a(() -> ki.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ae().c();

      for (box $$2 : $$0.cP()) {
         this.a($$0, $$2);
      }
   }

   private void a(box $$0, box $$1) {
      if ($$1.dH() || $$1.cZ() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof ciu || this.M.c($$1)) {
         $$1.bs();
         $$1.ah++;
         bjr $$2 = this.ae();
         $$2.a(() -> ki.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (box $$3 : $$1.cP()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(ciu $$0, ib $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable axc $$0, boolean $$1, boolean $$2) {
      apd $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(vu.c("menu.savingLevel"));
         }

         this.at();
         if ($$0 != null) {
            $$0.c(vu.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.N.c();
         } else {
            this.N.b();
         }
      }
   }

   private void at() {
      if (this.aa != null) {
         this.J.bc().a(this.aa.b());
      }

      this.l().k().a();
   }

   public <T extends box> List<? extends T> a(drd<box, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends box> void a(drd<box, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends box> void a(drd<box, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return avj.a.b;
            }
         }

         return avj.a.a;
      });
   }

   public List<? extends cdy> i() {
      return this.a(bpd.G, bpp::bA);
   }

   public List<apg> a(Predicate<? super apg> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<apg> a(Predicate<? super apg> $$0, int $$1) {
      List<apg> $$2 = Lists.newArrayList();

      for (apg $$3 : this.H) {
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
   public apg j() {
      List<apg> $$0 = this.a(bpp::bA);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(box $$0) {
      return this.j($$0);
   }

   public boolean c(box $$0) {
      return this.j($$0);
   }

   public void d(box $$0) {
      this.j($$0);
   }

   public void a(apg $$0) {
      this.e($$0);
   }

   public void b(apg $$0) {
      this.e($$0);
   }

   public void c(apg $$0) {
      this.e($$0);
   }

   public void d(apg $$0) {
      this.e($$0);
   }

   private void e(apg $$0) {
      box $$1 = this.G().a($$0.cw());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cw());
         $$1.ag();
         this.a((apg)$$1, box.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(box $$0) {
      if ($$0.dH()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bpd.a($$0.ai()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(box $$0) {
      if ($$0.cR().map(box::cw).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dpi $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(apg $$0, box.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ib $$1, int $$2) {
      for (apg $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dM() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dr();
            double $$5 = (double)$$1.v() - $$3.dt();
            double $$6 = (double)$$1.w() - $$3.dx();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.d.b(new aas($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable ciu $$0, double $$1, double $$2, double $$3, il<atx> $$4, atz $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ad(), new aeg($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable ciu $$0, box $$1, il<atx> $$2, atz $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.dr(), $$1.dt(), $$1.dx(), (double)$$2.a().a($$4), this.ad(), new aef($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ib $$1, int $$2) {
      if (this.Z().b(cwx.W)) {
         this.J.ah().a(new abz($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable ciu $$0, int $$1, ib $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ad(), new abz($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(il<drp> $$0, ept $$1, drp.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(ib $$0, dnb $$1, dnb $$2, int $$3) {
      if (this.V) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      eqm $$5 = $$1.k(this, $$0);
      eqm $$6 = $$2.k(this, $$0);
      if (eqj.c($$5, $$6, epx.g)) {
         List<bza> $$7 = new ObjectArrayList();

         for (bpr $$8 : this.U) {
            bza $$9 = $$8.K();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.V = true;

            for (bza $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.V = false;
         }
      }
   }

   @Override
   public void a(ib $$0, dac $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(ib $$0, dac $$1, ih $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(ib $$0, dac $$1, ib $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dnb $$0, ib $$1, dac $$2, ib $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(box $$0, byte $$1) {
      this.l().a($$0, new abq($$0, $$1));
   }

   @Override
   public void a(box $$0, bnw $$1) {
      this.l().a($$0, new abm($$0, $$1));
   }

   public apd l() {
      return this.I;
   }

   @Override
   public cwt a(
      @Nullable box $$0,
      @Nullable bnw $$1,
      @Nullable cwu $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cxb.a $$8,
      ka $$9,
      ka $$10,
      il<atx> $$11
   ) {
      cwt $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (apg $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.d.b(new abr($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(ib $$0, dac $$1, int $$2, int $$3) {
      this.W.add(new cwg($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.X.clear();

      while (!this.W.isEmpty()) {
         cwg $$0 = (cwg)this.W.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ad(), new aau($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.X.add($$0);
         }
      }

      this.W.addAll(this.X);
   }

   private boolean a(cwg $$0) {
      dnb $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public erh<dac> m() {
      return this.S;
   }

   public erh<eio> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public ejl p() {
      return this.R;
   }

   public ehf q() {
      return this.J.bb();
   }

   public <T extends ka> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      aca $$9 = new aca($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         apg $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends ka> boolean a(apg $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      yb<?> $$11 = new aca($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(apg $$0, boolean $$1, double $$2, double $$3, double $$4, yb<?> $$5) {
      if ($$0.dM() != this) {
         return false;
      } else {
         ib $$6 = $$0.dm();
         if ($$6.a(new ept($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.d.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public box a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public box b(int $$0) {
      box $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (box)this.ab.get($$0);
   }

   @Nullable
   public box a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public ib a(avd<ede> $$0, ib $$1, int $$2, boolean $$3) {
      if (!this.J.bc().y().c()) {
         return null;
      } else {
         Optional<ip.c<ede>> $$4 = this.H_().d(kj.aE).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ib, il<ede>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ib)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ib, il<cya>> a(Predicate<il<cya>> $$0, ib $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cts r() {
      return this.J.aJ();
   }

   @Override
   public bno s() {
      return this.J.aR();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public ekg u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public eka a(ejy $$0) {
      return this.o().I().u().b(eka.a(), $$0.a());
   }

   @Override
   public void a(ejy $$0, eka $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public ejy v() {
      return this.o().I().u().a(ejz.a(), "idcounts").b();
   }

   public void a(ib $$0, float $$1) {
      ib $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new ado($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(apk.a, new cwi($$2), this.L, axy.a);
      }

      int $$4 = this.Z().c(cwx.Z) + 1;
      if ($$4 > 1) {
         this.l().a(apk.a, new cwi($$0), $$4, axy.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      cww $$0 = this.u().b(cww.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cww $$3 = this.u().a(cww.a(), "chunks");
      cwi $$4 = new cwi($$0, $$1);
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
   public List<apg> x() {
      return this.H;
   }

   @Override
   public void a(ib $$0, dnb $$1, dnb $$2) {
      Optional<il<cav>> $$3 = caw.a($$1);
      Optional<il<cav>> $$4 = caw.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ib $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               aew.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               aew.a(this, $$5);
            }));
      }
   }

   public cas y() {
      return this.l().l();
   }

   public boolean c(ib $$0) {
      return this.a($$0, 1);
   }

   public boolean a(je $$0) {
      return this.c($$0.q());
   }

   public boolean a(ib $$0, int $$1) {
      return $$1 > 6 ? false : this.b(je.a($$0)) <= $$1;
   }

   public int b(je $$0) {
      return this.y().a($$0);
   }

   public ckh z() {
      return this.f;
   }

   @Nullable
   public ckf d(ib $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(ib $$0) {
      return this.d($$0) != null;
   }

   public void a(cap $$0, box $$1, bqd $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aop $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cxm.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bps> $$4 = (Entry<bps>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bps)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<box> $$1) throws IOException {
      avw $$2 = avw.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (box $$3 : $$1) {
         vu $$4 = $$3.af();
         vu $$5 = $$3.O_();
         $$2.a($$3.dr(), $$3.dt(), $$3.dx(), $$3.cw(), ki.g.b($$3.ai()), $$3.bA(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      avw $$1 = avw.a().a("x").a("y").a("z").a("type").a($$0);

      for (dlz $$2 : this.r) {
         ib $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(ecw $$0) {
      this.W.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ib $$0, dac $$1) {
      if (!this.ag()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ih $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<box> A() {
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
   public dqr D() {
      return this.aa;
   }

   @Override
   public apf E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> ki.g.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dlz::d),
         this.m().a(),
         this.n().a(),
         this.H()
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

   public static void a(apf $$0) {
      ib $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      ib.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dae.a.o()));
      ib.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dae.co.o()));
   }

   @Override
   protected drf<box> G() {
      return this.N.d();
   }

   public void a(Stream<box> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<box> $$0) {
      this.N.b($$0);
   }

   public void b(dpi $$0) {
      $$0.c(this.A_().c());
   }

   public void a(dox $$0) {
      this.J.execute(() -> this.ad.a($$0.f(), $$0.g()));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.N.close();
   }

   @Override
   public String H() {
      return "Chunks[S] W: " + this.I.e() + " E: " + this.N.e();
   }

   public boolean c(long $$0) {
      return this.N.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.I.a($$0);
   }

   public boolean f(ib $$0) {
      return this.N.a($$0) && this.I.a.j().c(cwi.a($$0));
   }

   public boolean g(ib $$0) {
      return this.N.a($$0);
   }

   public boolean a(cwi $$0) {
      return this.N.a($$0);
   }

   @Override
   public clh I() {
      return this.J.bc().K();
   }

   public axd a(ajh $$0) {
      return this.af.a($$0);
   }

   public bnk J() {
      return this.af;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dre<box> {
      public void a(box $$0) {
      }

      public void b(box $$0) {
         apf.this.f().a($$0);
      }

      public void c(box $$0) {
         apf.this.M.a($$0);
      }

      public void d(box $$0) {
         apf.this.M.b($$0);
      }

      public void e(box $$0) {
         apf.this.l().b($$0);
         if ($$0 instanceof apg $$1) {
            apf.this.H.add($$1);
            apf.this.e();
         }

         if ($$0 instanceof bpr $$2) {
            if (apf.this.V) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            apf.this.U.add($$2);
         }

         if ($$0 instanceof cdy $$4) {
            for (cdw $$5 : $$4.gj()) {
               apf.this.ab.put($$5.aj(), $$5);
            }
         }

         $$0.a(drm::a);
      }

      public void f(box $$0) {
         apf.this.l().a($$0);
         if ($$0 instanceof apg $$1) {
            apf.this.H.remove($$1);
            apf.this.e();
         }

         if ($$0 instanceof bpr $$2) {
            if (apf.this.V) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            apf.this.U.remove($$2);
         }

         if ($$0 instanceof cdy $$4) {
            for (cdw $$5 : $$4.gj()) {
               apf.this.ab.remove($$5.aj());
            }
         }

         $$0.a(drm::b);
      }

      public void g(box $$0) {
         $$0.a(drm::c);
      }
   }
}
