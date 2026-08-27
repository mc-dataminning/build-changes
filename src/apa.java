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

public class apa extends cwe implements cwz {
   public static final ib a = new ib(100, 50, 0);
   public static final blq b = blw.a(12000, 180000);
   public static final blq c = blw.a(12000, 24000);
   private static final blq D = blw.a(12000, 180000);
   public static final blq d = blw.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<apb> H = Lists.newArrayList();
   private final aoy I;
   private final MinecraftServer J;
   private final ejt K;
   private int L;
   final dqe M = new dqe();
   private final dqj<bof> N;
   private final dqs O;
   public boolean e;
   private final asv P;
   private int Q;
   private final ein R;
   private final eqj<czf> S = new eqj<>(this::d, this.af());
   private final eqj<ehq> T = new eqj<>(this::d, this.af());
   final Set<boz> U = new ObjectOpenHashSet();
   volatile boolean V;
   protected final cjl f;
   private final ObjectLinkedOpenHashSet<cvj> W = new ObjectLinkedOpenHashSet();
   private final List<cvj> X = new ArrayList<>(64);
   private boolean Y;
   private final List<cvr> Z;
   @Nullable
   private dpt aa;
   final Int2ObjectMap<cdd> ab = new Int2ObjectOpenHashMap();
   private final cwx ac;
   private final ech ad;
   private final boolean ae;
   private final bms af;

   public apa(
      MinecraftServer $$0,
      Executor $$1,
      ejo.c $$2,
      ejt $$3,
      ajb<cwe> $$4,
      dpr $$5,
      apj $$6,
      boolean $$7,
      long $$8,
      List<cvr> $$9,
      boolean $$10,
      @Nullable bms $$11
   ) {
      super($$3, $$4, $$0.bd(), $$5.a(), $$0::aU, false, $$7, $$8, $$0.bl());
      this.ae = $$10;
      this.J = $$0;
      this.Z = $$9;
      this.K = $$3;
      dob $$12 = $$5.b();
      boolean $$13 = $$0.ba();
      DataFixer $$14 = $$0.aD();
      dqb<bof> $$15 = new dpd(new dpm($$2.a($$4).resolve("entities"), $$14, $$13, "entities", axs.s), this, $$0);
      this.N = new dqj<>(bof.class, new apa.a(), $$15);
      this.I = new aoy(this, $$2, $$14, $$0.bb(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new ein(this);
      this.S();
      this.V();
      this.D_().a($$0.ax());
      this.f = this.u().a(cjl.a(this), cjl.a(this.ac()));
      if (!$$0.T()) {
         $$3.a($$0.v_());
      }

      long $$16 = $$0.bc().y().b();
      this.ad = new ech(this.I.m(), this.I_(), $$0.bb(), $$4, $$12, this.I.i(), this, $$12.c(), $$16, $$14);
      this.ac = new cwx(this, $$0.bc().y(), this.ad);
      if (this.ad() == cwe.j && this.ac().a(dpo.c)) {
         this.aa = new dpt(this, $$16, $$0.bc().C());
      } else {
         this.aa = null;
      }

      this.P = new asv();
      this.O = new dqs(this);
      this.af = Objects.requireNonNullElseGet($$11, () -> this.u().a(bms.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dpt $$0) {
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
   public il<cxd> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public cwx a() {
      return this.ac;
   }

   public void a(BooleanSupplier $$0) {
      bjc $$1 = this.ae();
      this.Y = true;
      bmw $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.D_().s();
         $$1.b("weather");
         this.as();
      }

      int $$4 = this.Z().c(cwa.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.Z().b(cwa.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.aq();
         if (this.Z().b(cwa.v) && this.ab()) {
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
            if (!$$2x.dE()) {
               if (this.i($$2x)) {
                  $$2x.am();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dv();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dl().a())) {
                     bof $$3x = $$2x.cW();
                     if ($$3x != null) {
                        if (!$$3x.dE() && $$3x.w($$2x)) {
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
         if (this.A.o().b(cwa.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (cvr $$2 : this.Z) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bof $$0) {
      return this.J.ab() || !($$0 instanceof cam) && !($$0 instanceof cbo) ? !this.J.ac() && $$0 instanceof chm : true;
   }

   private void aq() {
      this.P.a();
      this.H.stream().filter(box::fF).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dol $$0, int $$1) {
      cvl $$2 = $$0.f();
      boolean $$3 = this.ab();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bjc $$6 = this.ae();
      $$6.a("thunder");
      if ($$3 && this.aa() && this.z.a(100000) == 0) {
         ib $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bmj $$8 = this.d_($$7);
            boolean $$9 = this.Z().b(cwa.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(czh.ss);
            if ($$9) {
               ccu $$10 = bol.aM.a((cwe)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bow $$11 = bol.ak.a((cwe)this);
            if ($$11 != null) {
               $$11.e(eov.c($$7));
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
         dom[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dom $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = jd.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ib $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dme $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  ehr $$21 = $$20.u();
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
      ib $$1 = this.a(drq.a.e, $$0);
      ib $$2 = $$1.d();
      cxd $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, czh.dO.o());
      }

      if (this.ab()) {
         int $$4 = this.Z().c(cwa.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dme $$5 = this.a_($$1);
            if ($$5.a(czh.dN)) {
               int $$6 = $$5.c(dgn.c);
               if ($$6 < Math.min($$4, 8)) {
                  dme $$7 = $$5.a(dgn.c, Integer.valueOf($$6 + 1));
                  czf.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, czh.dN.o());
            }
         }

         cxd.c $$8 = $$3.a($$2);
         if ($$8 != cxd.c.a) {
            dme $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<ib> E(ib $$0) {
      Optional<ib> $$1 = this.y().e($$0x -> $$0x.a(cae.t), $$0x -> $$0x.v() == this.a(drq.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, caa.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ib b(ib $$0) {
      ib $$1 = this.a(drq.a.e, $$0);
      Optional<ib> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         eoq $$3 = eoq.a($$1, new ib($$1.h(this.ak()))).g(3.0);
         List<box> $$4 = this.a(box.class, $$3, $$0x -> $$0x != null && $$0x.bx() && this.h($$0x.dj()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dj();
         } else {
            if ($$1.v() == this.J_() - 1) {
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
      return this.Z().c(cwa.P) <= 100;
   }

   private void ar() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.Z().c(cwa.P);
            vs $$1;
            if (this.P.a($$0)) {
               $$1 = vs.c("sleep.skipping_night");
            } else {
               $$1 = vs.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (apb $$3 : this.H) {
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

   public ajt f() {
      return this.J.aK();
   }

   private void as() {
      boolean $$0 = this.ab();
      if (this.E_().g()) {
         if (this.Z().b(cwa.v)) {
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

         this.y = awm.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = awm.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new abp(abp.i, this.w), this.ad());
      }

      if (this.x != this.y) {
         this.J.ah().a(new abp(abp.j, this.y), this.ad());
      }

      if ($$0 != this.ab()) {
         if ($$0) {
            this.J.ah().a(new abp(abp.d, 0.0F));
         } else {
            this.J.ah().a(new abp(abp.c, 0.0F));
         }

         this.J.ah().a(new abp(abp.i, this.w));
         this.J.ah().a(new abp(abp.j, this.y));
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

   private void a(ib $$0, ehq $$1) {
      ehr $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cwe)this, $$0);
      }
   }

   private void d(ib $$0, czf $$1) {
      dme $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bof $$0) {
      $$0.bp();
      bjc $$1 = this.ae();
      $$0.ag++;
      this.ae().a(() -> kh.g.b($$0.ai()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ae().c();

      for (bof $$2 : $$0.cM()) {
         this.a($$0, $$2);
      }
   }

   private void a(bof $$0, bof $$1) {
      if ($$1.dE() || $$1.cW() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cia || this.M.c($$1)) {
         $$1.bp();
         $$1.ag++;
         bjc $$2 = this.ae();
         $$2.a(() -> kh.g.b($$1.ai()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bof $$3 : $$1.cM()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cia $$0, ib $$1) {
      return !this.J.a(this, $$1, $$0) && this.D_().a($$1);
   }

   public void a(@Nullable aws $$0, boolean $$1, boolean $$2) {
      aoy $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(vs.c("menu.savingLevel"));
         }

         this.at();
         if ($$0 != null) {
            $$0.c(vs.c("menu.savingChunks"));
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

   public <T extends bof> List<? extends T> a(dqf<bof, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bof> void a(dqf<bof, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bof> void a(dqf<bof, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return ava.a.b;
            }
         }

         return ava.a.a;
      });
   }

   public List<? extends cdf> i() {
      return this.a(bol.E, box::bx);
   }

   public List<apb> a(Predicate<? super apb> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<apb> a(Predicate<? super apb> $$0, int $$1) {
      List<apb> $$2 = Lists.newArrayList();

      for (apb $$3 : this.H) {
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
   public apb j() {
      List<apb> $$0 = this.a(box::bx);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bof $$0) {
      return this.j($$0);
   }

   public boolean c(bof $$0) {
      return this.j($$0);
   }

   public void d(bof $$0) {
      this.j($$0);
   }

   public void a(apb $$0) {
      this.e($$0);
   }

   public void b(apb $$0) {
      this.e($$0);
   }

   public void c(apb $$0) {
      this.e($$0);
   }

   public void d(apb $$0) {
      this.e($$0);
   }

   private void e(apb $$0) {
      bof $$1 = this.G().a($$0.ct());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.ct());
         $$1.ag();
         this.a((apb)$$1, bof.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bof $$0) {
      if ($$0.dE()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bol.a($$0.ai()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bof $$0) {
      if ($$0.cO().map(bof::ct).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dol $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(apb $$0, bof.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ib $$1, int $$2) {
      for (apb $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dJ() == this && $$3.aj() != $$0) {
            double $$4 = (double)$$1.u() - $$3.do();
            double $$5 = (double)$$1.v() - $$3.dq();
            double $$6 = (double)$$1.w() - $$3.du();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.d.b(new aao($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cia $$0, double $$1, double $$2, double $$3, il<ato> $$4, atq $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ad(), new aec($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cia $$0, bof $$1, il<ato> $$2, atq $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.do(), $$1.dq(), $$1.du(), (double)$$2.a().a($$4), this.ad(), new aeb($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ib $$1, int $$2) {
      if (this.Z().b(cwa.W)) {
         this.J.ah().a(new abv($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cia $$0, int $$1, ib $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ad(), new abv($$1, $$2, $$3, false));
   }

   public int k() {
      return this.E_().p();
   }

   @Override
   public void a(il<dqr> $$0, eov $$1, dqr.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(ib $$0, dme $$1, dme $$2, int $$3) {
      if (this.V) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      epo $$5 = $$1.k(this, $$0);
      epo $$6 = $$2.k(this, $$0);
      if (epl.c($$5, $$6, eoz.g)) {
         List<byi> $$7 = new ObjectArrayList();

         for (boz $$8 : this.U) {
            byi $$9 = $$8.N();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.V = true;

            for (byi $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.V = false;
         }
      }
   }

   @Override
   public void a(ib $$0, czf $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(ib $$0, czf $$1, ih $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(ib $$0, czf $$1, ib $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dme $$0, ib $$1, czf $$2, ib $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bof $$0, byte $$1) {
      this.l().a($$0, new abm($$0, $$1));
   }

   @Override
   public void a(bof $$0, bne $$1) {
      this.l().a($$0, new abi($$0, $$1));
   }

   public aoy l() {
      return this.I;
   }

   @Override
   public cvw a(
      @Nullable bof $$0,
      @Nullable bne $$1,
      @Nullable cvx $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cwe.a $$8,
      jz $$9,
      jz $$10,
      il<ato> $$11
   ) {
      cvw $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (apb $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.d.b(new abn($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(ib $$0, czf $$1, int $$2, int $$3) {
      this.W.add(new cvj($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.X.clear();

      while (!this.W.isEmpty()) {
         cvj $$0 = (cvj)this.W.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ad(), new aaq($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.X.add($$0);
         }
      }

      this.W.addAll(this.X);
   }

   private boolean a(cvj $$0) {
      dme $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eqj<czf> m() {
      return this.S;
   }

   public eqj<ehq> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public ein p() {
      return this.R;
   }

   public egh q() {
      return this.J.bb();
   }

   public <T extends jz> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      abw $$9 = new abw($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         apb $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends jz> boolean a(apb $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      xz<?> $$11 = new abw($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(apb $$0, boolean $$1, double $$2, double $$3, double $$4, xz<?> $$5) {
      if ($$0.dJ() != this) {
         return false;
      } else {
         ib $$6 = $$0.dj();
         if ($$6.a(new eov($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.d.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bof a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bof b(int $$0) {
      bof $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bof)this.ab.get($$0);
   }

   @Nullable
   public bof a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public ib a(aut<ecg> $$0, ib $$1, int $$2, boolean $$3) {
      if (!this.J.bc().y().c()) {
         return null;
      } else {
         Optional<ip.c<ecg>> $$4 = this.I_().d(ki.aE).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ib, il<ecg>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ib)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ib, il<cxd>> a(Predicate<il<cxd>> $$0, ib $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public csv r() {
      return this.J.aJ();
   }

   @Override
   public bmw s() {
      return this.J.aR();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public eji u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public ejc a(eja $$0) {
      return this.o().I().u().b(ejc.a(), $$0.a());
   }

   @Override
   public void a(eja $$0, ejc $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public eja v() {
      return this.o().I().u().a(ejb.a(), "idcounts").b();
   }

   public void a(ib $$0, float $$1) {
      ib $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new adk($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(apf.a, new cvl($$2), this.L, axo.a);
      }

      int $$4 = this.Z().c(cwa.Z) + 1;
      if ($$4 > 1) {
         this.l().a(apf.a, new cvl($$0), $$4, axo.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      cvz $$0 = this.u().b(cvz.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cvz $$3 = this.u().a(cvz.a(), "chunks");
      cvl $$4 = new cvl($$0, $$1);
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
   public List<apb> x() {
      return this.H;
   }

   @Override
   public void a(ib $$0, dme $$1, dme $$2) {
      Optional<il<cad>> $$3 = cae.a($$1);
      Optional<il<cad>> $$4 = cae.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ib $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               aes.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               aes.a(this, $$5);
            }));
      }
   }

   public caa y() {
      return this.l().l();
   }

   public boolean c(ib $$0) {
      return this.a($$0, 1);
   }

   public boolean a(jd $$0) {
      return this.c($$0.q());
   }

   public boolean a(ib $$0, int $$1) {
      return $$1 > 6 ? false : this.b(jd.a($$0)) <= $$1;
   }

   public int b(jd $$0) {
      return this.y().a($$0);
   }

   public cjl z() {
      return this.f;
   }

   @Nullable
   public cjj d(ib $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(ib $$0) {
      return this.d($$0) != null;
   }

   public void a(bzx $$0, bof $$1, bpl $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aok $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         cwp.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bpa> $$4 = (Entry<bpa>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bpa)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bof> $$1) throws IOException {
      avm $$2 = avm.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bof $$3 : $$1) {
         vs $$4 = $$3.af();
         vs $$5 = $$3.Q_();
         $$2.a($$3.do(), $$3.dq(), $$3.du(), $$3.ct(), kh.g.b($$3.ai()), $$3.bx(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      avm $$1 = avm.a().a("x").a("y").a("z").a("type").a($$0);

      for (dlc $$2 : this.r) {
         ib $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eby $$0) {
      this.W.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ib $$0, czf $$1) {
      if (!this.ag()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(ih $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bof> A() {
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
   public dpt D() {
      return this.aa;
   }

   @Override
   public apa E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> kh.g.b($$0.ai()).toString()),
         this.r.size(),
         a(this.r, dlc::d),
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

   public static void a(apa $$0) {
      ib $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      ib.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, czh.a.o()));
      ib.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, czh.co.o()));
   }

   @Override
   protected dqh<bof> G() {
      return this.N.d();
   }

   public void a(Stream<bof> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bof> $$0) {
      this.N.b($$0);
   }

   public void b(dol $$0) {
      $$0.c(this.B_().c());
   }

   public void a(doa $$0) {
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
      return this.N.a($$0) && this.I.a.j().c(cvl.a($$0));
   }

   public boolean g(ib $$0) {
      return this.N.a($$0);
   }

   public boolean a(cvl $$0) {
      return this.N.a($$0);
   }

   @Override
   public ckl I() {
      return this.J.bc().K();
   }

   public awt a(ajc $$0) {
      return this.af.a($$0);
   }

   public bms J() {
      return this.af;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dqg<bof> {
      public void a(bof $$0) {
      }

      public void b(bof $$0) {
         apa.this.f().a($$0);
      }

      public void c(bof $$0) {
         apa.this.M.a($$0);
      }

      public void d(bof $$0) {
         apa.this.M.b($$0);
      }

      public void e(bof $$0) {
         apa.this.l().b($$0);
         if ($$0 instanceof apb $$1) {
            apa.this.H.add($$1);
            apa.this.e();
         }

         if ($$0 instanceof boz $$2) {
            if (apa.this.V) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            apa.this.U.add($$2);
         }

         if ($$0 instanceof cdf $$4) {
            for (cdd $$5 : $$4.gh()) {
               apa.this.ab.put($$5.aj(), $$5);
            }
         }

         $$0.a(dqo::a);
      }

      public void f(bof $$0) {
         apa.this.l().a($$0);
         if ($$0 instanceof apb $$1) {
            apa.this.H.remove($$1);
            apa.this.e();
         }

         if ($$0 instanceof boz $$2) {
            if (apa.this.V) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            apa.this.U.remove($$2);
         }

         if ($$0 instanceof cdf $$4) {
            for (cdd $$5 : $$4.gh()) {
               apa.this.ab.remove($$5.aj());
            }
         }

         $$0.a(dqo::b);
      }

      public void g(bof $$0) {
         $$0.a(dqo::c);
      }
   }
}
