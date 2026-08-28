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

public class arx extends dgz implements arw, dhx {
   public static final jh a = new jh(100, 50, 0);
   public static final bsf b = bsl.a(12000, 180000);
   public static final bsf c = bsl.a(12000, 24000);
   private static final bsf E = bsl.a(12000, 180000);
   public static final bsf d = bsl.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<ary> I = Lists.newArrayList();
   private final aru J;
   private final MinecraftServer K;
   private final ewb L;
   private int M;
   final ebx N = new ebx();
   private final ecc<bvb> O;
   private final ecl P;
   public boolean e;
   private final awb Q;
   private int R;
   private final euo S;
   private final fdg<dkd> T = new fdg<>(this::d);
   private final fdg<etp> U = new fdg<>(this::d);
   private final eui V = new eui();
   final Set<bvz> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final crd f;
   private final ObjectLinkedOpenHashSet<dgd> Y = new ObjectLinkedOpenHashSet();
   private final List<dgd> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dgl> ab;
   @Nullable
   private ebm ac;
   final Int2ObjectMap<cki> ad = new Int2ObjectOpenHashMap();
   private final dhv ae;
   private final eoe af;
   private final boolean ag;
   private final btf ah;

   public arx(
      MinecraftServer $$0,
      Executor $$1,
      evw.c $$2,
      ewb $$3,
      alo<dgz> $$4,
      ebk $$5,
      ash $$6,
      boolean $$7,
      long $$8,
      List<dgl> $$9,
      boolean $$10,
      @Nullable btf $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dzk $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      ebu<bvb> $$15 = new eau(new ebf(new ebc($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bbi.s), this, $$0);
      this.O = new ecc<>(bvb.class, new arx.a(), $$15);
      this.J = new aru(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().w());
      this.J.h().b();
      this.S = new euo(this);
      this.Y();
      this.ab();
      this.F_().a($$0.aw());
      this.f = this.w().a(crd.a(this), crd.a(this.ah()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new eoe(this.J.m(), this.K_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dhv(this, $$0.aZ().y(), this.af);
      if (this.ai() == dgz.k && this.ah().a(ebh.c)) {
         this.ac = new ebm(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new awb();
      this.P = new ecl(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.w().a(btf.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable ebm $$0) {
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
   public jq<dib> a(int $$0, int $$1, int $$2) {
      return this.m().g().d().getNoiseBiome($$0, $$1, $$2, this.m().i().b());
   }

   public dhv b() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bpj $$1 = bpi.a();
      this.aa = true;
      btj $$2 = this.u();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.F_().s();
         $$1.b("weather");
         this.av();
         $$1.c();
      }

      int $$4 = this.O().c(dgv.Q);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.O().b(dgv.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.at();
         if (this.O().b(dgv.w) && this.ag()) {
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
            if (!$$2x.dR()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dI();
                  $$1.c();
                  if ($$2x instanceof ary || this.J.a.j().c($$2x.dy().a())) {
                     bvb $$3x = $$2x.dl();
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
         bpi.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bpi.a().c();
         if (this.L.o().b(dgv.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dgl $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void at() {
      this.Q.a();
      this.I.stream().filter(bvx::fR).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dzt $$0, int $$1) {
      dgf $$2 = $$0.f();
      boolean $$3 = this.ag();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bpj $$6 = bpi.a();
      $$6.a("thunder");
      if ($$3 && this.af() && this.A.a(100000) == 0) {
         jh $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bsy $$8 = this.d_($$7);
            boolean $$9 = this.O().b(dgv.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dkf.sU);
            if ($$9) {
               cjy $$10 = bvi.bg.a(this, bvh.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bvw $$11 = bvi.ax.a(this, bvh.h);
            if ($$11 != null) {
               $$11.e(fbr.c($$7));
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
         dzu[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dzu $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kj.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jh $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dxo $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  etq $$21 = $$20.y();
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
      jh $$1 = this.a(edj.a.e, $$0);
      jh $$2 = $$1.e();
      dib $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dkf.eb.m());
      }

      if (this.ag()) {
         int $$4 = this.O().c(dgv.U);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dxo $$5 = this.a_($$1);
            if ($$5.a(dkf.ea)) {
               int $$6 = $$5.c(drr.c);
               if ($$6 < Math.min($$4, 8)) {
                  dxo $$7 = $$5.b(drr.c, Integer.valueOf($$6 + 1));
                  dkd.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dkf.ea.m());
            }
         }

         dib.c $$8 = $$3.a($$2, this.P());
         if ($$8 != dib.c.a) {
            dxo $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jh> E(jh $$0) {
      Optional<jh> $$1 = this.A().e($$0x -> $$0x.a(chf.t), $$0x -> $$0x.v() == this.a(edj.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, chb.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jh b(jh $$0) {
      jh $$1 = this.a(edj.a.e, $$0);
      Optional<jh> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         fbm $$3 = fbm.a($$1, $$1.h(this.an() + 1)).g(3.0);
         List<bvx> $$4 = this.a(bvx.class, $$3, $$0x -> $$0x != null && $$0x.bL() && this.h($$0x.dw()));
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
      return this.O().c(dgv.Q) <= 100;
   }

   private void au() {
      if (this.e()) {
         if (!this.p().U() || this.p().r()) {
            int $$0 = this.O().c(dgv.Q);
            xk $$1;
            if (this.Q.a($$0)) {
               $$1 = xk.c("sleep.skipping_night");
            } else {
               $$1 = xk.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (ary $$3 : this.I) {
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

   public ami g() {
      return this.K.aJ();
   }

   private void av() {
      boolean $$0 = this.ag();
      if (this.G_().g()) {
         if (this.O().b(dgv.w)) {
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

         this.z = azu.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = azu.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new ado(ado.i, this.x), this.ai());
      }

      if (this.y != this.z) {
         this.K.ag().a(new ado(ado.j, this.z), this.ai());
      }

      if ($$0 != this.ag()) {
         if ($$0) {
            this.K.ag().a(new ado(ado.d, 0.0F));
         } else {
            this.K.ag().a(new ado(ado.c, 0.0F));
         }

         this.K.ag().a(new ado(ado.i, this.x));
         this.K.ag().a(new ado(ado.j, this.z));
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

   private void a(jh $$0, etp $$1) {
      dxo $$2 = this.a_($$0);
      etq $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jh $$0, dkd $$1) {
      dxo $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bvb $$0) {
      $$0.bz();
      bpj $$1 = bpi.a();
      $$0.af++;
      $$1.a(() -> ma.f.b($$0.aq()).toString());
      $$1.f("tickNonPassenger");
      $$0.h();
      $$1.c();

      for (bvb $$2 : $$0.cZ()) {
         this.a($$0, $$2);
      }
   }

   private void a(bvb $$0, bvb $$1) {
      if ($$1.dR() || $$1.dl() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cpo || this.N.c($$1)) {
         $$1.bz();
         $$1.af++;
         bpj $$2 = bpi.a();
         $$2.a(() -> ma.f.b($$1.aq()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bvb $$3 : $$1.cZ()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cpo $$0, jh $$1) {
      return !this.K.a(this, $$1, $$0) && this.F_().a($$1);
   }

   public void a(@Nullable bab $$0, boolean $$1, boolean $$2) {
      aru $$3 = this.m();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xk.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xk.c("menu.savingChunks"));
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

      evq $$1 = this.m().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bvb> List<? extends T> a(eby<bvb, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bvb> void a(eby<bvb, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bvb> void a(eby<bvb, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.H().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return ayg.a.b;
            }
         }

         return ayg.a.a;
      });
   }

   public List<? extends ckl> j() {
      return this.a(bvi.Q, bvx::bL);
   }

   public List<ary> a(Predicate<? super ary> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<ary> a(Predicate<? super ary> $$0, int $$1) {
      List<ary> $$2 = Lists.newArrayList();

      for (ary $$3 : this.I) {
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
   public ary k() {
      List<ary> $$0 = this.a(bvx::bL);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bvb $$0) {
      return this.i($$0);
   }

   public boolean c(bvb $$0) {
      return this.i($$0);
   }

   public void d(bvb $$0) {
      if ($$0 instanceof ary $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(ary $$0) {
      this.c($$0);
   }

   public void b(ary $$0) {
      this.c($$0);
   }

   private void c(ary $$0) {
      bvb $$1 = this.H().a($$0.cG());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cG());
         $$1.ao();
         this.a((ary)$$1, bvb.d.b);
      }

      this.O.a($$0);
   }

   private boolean i(bvb $$0) {
      if ($$0.dR()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bvi.a($$0.aq()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bvb $$0) {
      if ($$0.db().map(bvb::cG).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dzt $$0) {
      $$0.J();
      $$0.c(this);
   }

   public void a(ary $$0, bvb.d $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jh $$1, int $$2) {
      for (ary $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dW() == this && $$3.ar() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dB();
            double $$5 = (double)$$1.v() - $$3.dD();
            double $$6 = (double)$$1.w() - $$3.dH();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.f.b(new acm($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cpo $$0, double $$1, double $$2, double $$3, jq<awu> $$4, aww $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ai(), new agi($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cpo $$0, bvb $$1, jq<awu> $$2, aww $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dB(), $$1.dD(), $$1.dH(), (double)$$2.a().a($$4), this.ai(), new agh($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jh $$1, int $$2) {
      if (this.O().b(dgv.X)) {
         this.K.ag().t().forEach($$3 -> {
            fbr $$5;
            if ($$3.dW() == this) {
               fbr $$4 = fbr.b($$1);
               if ($$3.f($$4) < (double)azu.h(32)) {
                  $$5 = $$4;
               } else {
                  fbr $$6 = $$4.d($$3.du()).d();
                  $$5 = $$3.du().e($$6.c(32.0));
               }
            } else {
               $$5 = $$3.du();
            }

            $$3.f.b(new adu($$0, jh.a((ka)$$5), $$2, true));
         });
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cpo $$0, int $$1, jh $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ai(), new adu($$1, $$2, $$3, false));
   }

   public int l() {
      return this.G_().p();
   }

   @Override
   public void a(jq<eck> $$0, fbr $$1, eck.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jh $$0, dxo $$1, dxo $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ae.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.m().a($$0);
      this.V.a($$0);
      fcl $$5 = $$1.g(this, $$0);
      fcl $$6 = $$2.g(this, $$0);
      if (fci.c($$5, $$6, fbv.g)) {
         List<cfj> $$7 = new ObjectArrayList();

         for (bvz $$8 : this.W) {
            cfj $$9 = $$8.L();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cfj $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jh $$0, dkd $$1) {
      this.a($$0, $$1, euu.a(this, null, null));
   }

   @Override
   public void a(jh $$0, dkd $$1, @Nullable euy $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jh $$0, dkd $$1, jm $$2, @Nullable euy $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jh $$0, dkd $$1, @Nullable euy $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dxo $$0, jh $$1, dkd $$2, @Nullable euy $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bvb $$0, byte $$1) {
      this.m().a($$0, new adk($$0, $$1));
   }

   @Override
   public void a(bvb $$0, btr $$1) {
      this.m().a($$0, new adg($$0, $$1));
   }

   public aru m() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bvb $$0,
      @Nullable btr $$1,
      @Nullable dgs $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dgz.a $$8,
      lq $$9,
      lq $$10,
      jq<awu> $$11
   ) {
      dgr.a $$12 = switch ($$8) {
         case a -> dgr.a.a;
         case b -> this.a(dgv.R);
         case c -> this.O().b(dgv.c) ? this.a(dgv.S) : dgr.a.a;
         case d -> this.a(dgv.T);
         case e -> dgr.a.d;
      };
      fbr $$13 = new fbr($$3, $$4, $$5);
      dhp $$14 = new dhp(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      lq $$15 = $$14.l() ? $$9 : $$10;

      for (ary $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<fbr> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.f.b(new adm($$13, $$17, $$15, $$11));
         }
      }
   }

   private dgr.a a(dgv.e<dgv.a> $$0) {
      return this.O().b($$0) ? dgr.a.c : dgr.a.b;
   }

   @Override
   public void a(jh $$0, dkd $$1, int $$2, int $$3) {
      this.Y.add(new dgd($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dgd $$0 = (dgd)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ai(), new aco($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(dgd $$0) {
      dxo $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fdg<dkd> n() {
      return this.T;
   }

   public fdg<etp> o() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer p() {
      return this.K;
   }

   public euo q() {
      return this.S;
   }

   public esg r() {
      return this.K.aY();
   }

   public <T extends lq> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      return this.a($$0, false, false, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public <T extends lq> int a(T $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      adv $$11 = new adv($$0, $$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      int $$12 = 0;

      for (int $$13 = 0; $$13 < this.I.size(); $$13++) {
         ary $$14 = this.I.get($$13);
         if (this.a($$14, $$1, $$3, $$4, $$5, $$11)) {
            $$12++;
         }
      }

      return $$12;
   }

   public <T extends lq> boolean a(
      ary $$0, T $$1, boolean $$2, boolean $$3, double $$4, double $$5, double $$6, int $$7, double $$8, double $$9, double $$10, double $$11
   ) {
      zr<?> $$12 = new adv($$1, $$2, $$3, $$4, $$5, $$6, (float)$$8, (float)$$9, (float)$$10, (float)$$11, $$7);
      return this.a($$0, $$2, $$4, $$5, $$6, $$12);
   }

   private boolean a(ary $$0, boolean $$1, double $$2, double $$3, double $$4, zr<?> $$5) {
      if ($$0.dW() != this) {
         return false;
      } else {
         jh $$6 = $$0.dw();
         if ($$6.a(new fbr($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.f.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bvb a(int $$0) {
      return this.H().a($$0);
   }

   @Nullable
   public bvb a(UUID $$0) {
      return this.H().a($$0);
   }

   @Deprecated
   @Nullable
   public bvb b(int $$0) {
      bvb $$1 = this.H().a($$0);
      return $$1 != null ? $$1 : (bvb)this.ad.get($$0);
   }

   @Override
   public Collection<cki> s() {
      return this.ad.values();
   }

   @Nullable
   public jh a(aya<eod> $$0, jh $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<ju.c<eod>> $$4 = this.K_().e(mb.aU).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jh, jq<eod>> $$5 = this.m().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jh)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jh, jq<dib>> a(Predicate<jq<dib>> $$0, jh $$1, int $$2, int $$3, int $$4) {
      return this.m().g().d().a($$1, $$2, $$3, $$4, $$0, this.m().i().b(), this);
   }

   public dcc t() {
      return this.K.aI();
   }

   @Override
   public btj u() {
      return this.K.aP();
   }

   @Override
   public boolean v() {
      return this.e;
   }

   public evq w() {
      return this.m().k();
   }

   @Nullable
   @Override
   public evk a(evi $$0) {
      return this.p().J().w().b(evk.a(), $$0.a());
   }

   @Override
   public void a(evi $$0, evk $$1) {
      this.p().J().w().a($$0.a(), $$1);
   }

   @Override
   public evi x() {
      return this.p().J().w().a(evj.a(), "idcounts").b();
   }

   public void a(jh $$0, float $$1) {
      jh $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.p().ag().a(new afo($$0, $$1));
      }

      if (this.M > 1) {
         this.m().b(asd.a, new dgf($$2), this.M, bba.a);
      }

      int $$4 = this.O().c(dgv.ab) + 1;
      if ($$4 > 1) {
         this.m().a(asd.a, new dgf($$0), $$4, bba.a);
      }

      this.M = $$4;
   }

   public LongSet y() {
      dgu $$0 = this.w().b(dgu.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dgu $$3 = this.w().a(dgu.a(), "chunks");
      dgf $$4 = new dgf($$0, $$1);
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
   public List<ary> z() {
      return this.I;
   }

   @Override
   public void a(jh $$0, dxo $$1, dxo $$2) {
      Optional<jq<che>> $$3 = chf.a($$1);
      Optional<jq<che>> $$4 = chf.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jh $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5);
               agy.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.p().execute(() -> {
               this.A().a($$5, $$1x);
               agy.a(this, $$5);
            }));
      }
   }

   public chb A() {
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
      return this.A().a($$0);
   }

   public crd B() {
      return this.f;
   }

   @Nullable
   public crb d(jh $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jh $$0) {
      return this.d($$0) != null;
   }

   public void a(cgy $$0, bvb $$1, bwm $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      arc $$1 = this.m().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dhk.d $$3 = this.m().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bwa> $$4 = (Entry<bwa>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bwa)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bvb> $$1) throws IOException {
      ayu $$2 = ayu.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bvb $$3 : $$1) {
         xk $$4 = $$3.an();
         xk $$5 = $$3.p_();
         $$2.a($$3.dB(), $$3.dD(), $$3.dH(), $$3.cG(), ma.f.b($$3.aq()), $$3.bL(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ayu $$1 = ayu.a().a("x").a("y").a("z").a("type").a($$0);

      for (dwl $$2 : this.s) {
         jh $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(env $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jh $$0, dkd $$1) {
      if (!this.aj()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bvb> C() {
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
   public ebm F() {
      return this.ac;
   }

   @Override
   public arx a() {
      return this;
   }

   @VisibleForTesting
   public String G() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> ma.f.b($$0.aq()).toString()),
         this.s.size(),
         a(this.s, dwl::d),
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
   protected eca<bvb> H() {
      return this.O.d();
   }

   public void a(Stream<bvb> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bvb> $$0) {
      this.O.b($$0);
   }

   public void b(dzt $$0) {
      $$0.d(this.D_().c());
   }

   public void a(dzj $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public eui I() {
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

   public boolean f(jh $$0) {
      return this.O.a($$0) && this.J.a.j().c(dgf.a($$0));
   }

   public boolean g(jh $$0) {
      return this.O.a($$0);
   }

   public boolean a(dgf $$0) {
      return this.O.a($$0);
   }

   @Override
   public csk K() {
      return this.K.aZ().K();
   }

   @Override
   public cze L() {
      return this.K.bn();
   }

   @Override
   public dvo M() {
      return this.K.bo();
   }

   public bac a(alp $$0) {
      return this.ah.a($$0);
   }

   public btf N() {
      return this.ah;
   }

   public dgv O() {
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

   final class a implements ebz<bvb> {
      public void a(bvb $$0) {
      }

      public void b(bvb $$0) {
         arx.this.g().a($$0);
      }

      public void c(bvb $$0) {
         arx.this.N.a($$0);
      }

      public void d(bvb $$0) {
         arx.this.N.b($$0);
      }

      public void e(bvb $$0) {
         arx.this.m().b($$0);
         if ($$0 instanceof ary $$1) {
            arx.this.I.add($$1);
            arx.this.f();
         }

         if ($$0 instanceof bvz $$2) {
            if (arx.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arx.this.W.add($$2);
         }

         if ($$0 instanceof ckl $$4) {
            for (cki $$5 : $$4.x()) {
               arx.this.ad.put($$5.ar(), $$5);
            }
         }

         $$0.a(ech::a);
      }

      public void f(bvb $$0) {
         arx.this.m().a($$0);
         if ($$0 instanceof ary $$1) {
            arx.this.I.remove($$1);
            arx.this.f();
         }

         if ($$0 instanceof bvz $$2) {
            if (arx.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arx.this.W.remove($$2);
         }

         if ($$0 instanceof ckl $$4) {
            for (cki $$5 : $$4.x()) {
               arx.this.ad.remove($$5.ar());
            }
         }

         $$0.a(ech::b);
      }

      public void g(bvb $$0) {
         $$0.a(ech::c);
      }
   }
}
