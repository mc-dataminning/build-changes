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

public class are extends dbw implements dcr {
   public static final iz a = new iz(100, 50, 0);
   public static final bpx b = bqd.a(12000, 180000);
   public static final bpx c = bqd.a(12000, 24000);
   private static final bpx D = bqd.a(12000, 180000);
   public static final bpx d = bqd.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<arf> H = Lists.newArrayList();
   private final arc I;
   private final MinecraftServer J;
   private final epz K;
   private int L;
   final dwg M = new dwg();
   private final dwl<bss> N;
   private final dwu O;
   public boolean e;
   private final avf P;
   private int Q;
   private final eor R;
   private final exd<dex> S = new exd<>(this::d, this.ah());
   private final exd<ens> T = new exd<>(this::d, this.ah());
   private final eol U = new eol();
   final Set<btp> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final coi f;
   private final ObjectLinkedOpenHashSet<dbb> X = new ObjectLinkedOpenHashSet();
   private final List<dbb> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<dbj> aa;
   @Nullable
   private dvv ab;
   final Int2ObjectMap<chx> ac = new Int2ObjectOpenHashMap();
   private final dcp ad;
   private final eij ae;
   private final boolean af;
   private final bqz ag;

   public are(
      MinecraftServer $$0,
      Executor $$1,
      epu.c $$2,
      epz $$3,
      ald<dbw> $$4,
      dvt $$5,
      arn $$6,
      boolean $$7,
      long $$8,
      List<dbj> $$9,
      boolean $$10,
      @Nullable bqz $$11
   ) {
      super($$3, $$4, $$0.bc(), $$5.a(), $$0::aT, false, $$7, $$8, $$0.bl());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      dtx $$12 = $$5.b();
      boolean $$13 = $$0.aZ();
      DataFixer $$14 = $$0.aD();
      dwd<bss> $$15 = new dve(new dvo(new dvm($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bae.s), this, $$0);
      this.N = new dwl<>(bss.class, new are.a(), $$15);
      this.I = new arc(this, $$2, $$14, $$0.ba(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new eor(this);
      this.U();
      this.X();
      this.C_().a($$0.ax());
      this.f = this.u().a(coi.a(this), coi.a(this.ae()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bb().y().b();
      this.ae = new eij(this.I.m(), this.H_(), $$0.ba(), $$4, $$12, this.I.i(), this, $$12.d(), $$16, $$14);
      this.ad = new dcp(this, $$0.bb().y(), this.ae);
      if (this.af() == dbw.j && this.ae().a(dvq.c)) {
         this.ab = new dvv(this, $$16, $$0.bb().C());
      } else {
         this.ab = null;
      }

      this.P = new avf();
      this.O = new dwu(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(bqz.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dvv $$0) {
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
   public ji<dcv> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dcp a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bng $$1 = this.ag();
      this.Z = true;
      brd $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.au();
      }

      int $$4 = this.ab().c(dbs.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.ab().b(dbs.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.ab().b(dbs.v) && this.ad()) {
            this.g();
         }
      }

      this.U();
      if ($$3) {
         this.b();
      }

      $$1.b("tickPending");
      if (!this.ai() && $$3) {
         long $$6 = this.Z();
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
            if (!$$2x.dK()) {
               if (this.i($$2x)) {
                  $$2x.ao();
               } else if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dB();
                  $$1.c();
                  if (this.I.a.j().c($$2x.dr().a())) {
                     bss $$3x = $$2x.dc();
                     if ($$3x != null) {
                        if (!$$3x.dK() && $$3x.x($$2x)) {
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
         this.T();
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
         if (this.A.o().b(dbs.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dbj $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bss $$0) {
      return this.J.ab() || !($$0 instanceof cfd) && !($$0 instanceof cgf) ? !this.J.ac() && $$0 instanceof cmh : true;
   }

   private void as() {
      this.P.a();
      this.H.stream().filter(btn::fL).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dug $$0, int $$1) {
      dbd $$2 = $$0.f();
      boolean $$3 = this.ad();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bng $$6 = this.ag();
      $$6.a("thunder");
      if ($$3 && this.ac() && this.z.a(100000) == 0) {
         iz $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bqq $$8 = this.d_($$7);
            boolean $$9 = this.ab().b(dbs.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dez.ss);
            if ($$9) {
               chn $$10 = bsy.aO.a((dbw)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            btm $$11 = bsy.am.a((dbw)this);
            if ($$11 != null) {
               $$11.e(evp.c($$7));
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
         duh[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            duh $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = kb.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  iz $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dsa $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  ent $$21 = $$20.u();
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
   public void a(iz $$0) {
      iz $$1 = this.a(dxs.a.e, $$0);
      iz $$2 = $$1.d();
      dcv $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dez.dO.o());
      }

      if (this.ad()) {
         int $$4 = this.ab().c(dbs.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dsa $$5 = this.a_($$1);
            if ($$5.a(dez.dN)) {
               int $$6 = $$5.c(dmg.c);
               if ($$6 < Math.min($$4, 8)) {
                  dsa $$7 = $$5.a(dmg.c, Integer.valueOf($$6 + 1));
                  dex.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dez.dN.o());
            }
         }

         dcv.c $$8 = $$3.a($$2);
         if ($$8 != dcv.c.a) {
            dsa $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<iz> E(iz $$0) {
      Optional<iz> $$1 = this.y().e($$0x -> $$0x.a(cev.t), $$0x -> $$0x.v() == this.a(dxs.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cer.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected iz b(iz $$0) {
      iz $$1 = this.a(dxs.a.e, $$0);
      Optional<iz> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         evk $$3 = evk.a($$1, new iz($$1.h(this.am()))).g(3.0);
         List<btn> $$4 = this.a(btn.class, $$3, $$0x -> $$0x != null && $$0x.bD() && this.h($$0x.dp()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.z.a($$4.size())).dp();
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
      return this.ab().c(dbs.P) <= 100;
   }

   private void at() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.ab().c(dbs.P);
            xo $$1;
            if (this.P.a($$0)) {
               $$1 = xo.c("sleep.skipping_night");
            } else {
               $$1 = xo.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (arf $$3 : this.H) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.H.isEmpty() && this.P.a(this.H)) {
         this.at();
      }
   }

   public alw f() {
      return this.J.aK();
   }

   private void au() {
      boolean $$0 = this.ad();
      if (this.D_().g()) {
         if (this.ab().b(dbs.v)) {
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

         this.y = ayx.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = ayx.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new ado(ado.i, this.w), this.af());
      }

      if (this.x != this.y) {
         this.J.ah().a(new ado(ado.j, this.y), this.af());
      }

      if ($$0 != this.ad()) {
         if ($$0) {
            this.J.ah().a(new ado(ado.d, 0.0F));
         } else {
            this.J.ah().a(new ado(ado.c, 0.0F));
         }

         this.J.ah().a(new ado(ado.i, this.w));
         this.J.ah().a(new ado(ado.j, this.y));
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

   private void a(iz $$0, ens $$1) {
      ent $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((dbw)this, $$0);
      }
   }

   private void d(iz $$0, dex $$1) {
      dsa $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bss $$0) {
      $$0.bu();
      bng $$1 = this.ag();
      $$0.ai++;
      this.ag().a(() -> lp.g.b($$0.ak()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ag().c();

      for (bss $$2 : $$0.cS()) {
         this.a($$0, $$2);
      }
   }

   private void a(bss $$0, bss $$1) {
      if ($$1.dK() || $$1.dc() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cmv || this.M.c($$1)) {
         $$1.bu();
         $$1.ai++;
         bng $$2 = this.ag();
         $$2.a(() -> lp.g.b($$1.ak()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bss $$3 : $$1.cS()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cmv $$0, iz $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable aze $$0, boolean $$1, boolean $$2) {
      arc $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xo.c("menu.savingLevel"));
         }

         this.av();
         if ($$0 != null) {
            $$0.c(xo.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.N.c();
         } else {
            this.N.b();
         }
      }
   }

   private void av() {
      if (this.ab != null) {
         this.J.bb().a(this.ab.b());
      }

      this.l().k().a();
   }

   public <T extends bss> List<? extends T> a(dwh<bss, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bss> void a(dwh<bss, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bss> void a(dwh<bss, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axk.a.b;
            }
         }

         return axk.a.a;
      });
   }

   public List<? extends chz> i() {
      return this.a(bsy.F, btn::bD);
   }

   public List<arf> a(Predicate<? super arf> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<arf> a(Predicate<? super arf> $$0, int $$1) {
      List<arf> $$2 = Lists.newArrayList();

      for (arf $$3 : this.H) {
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
   public arf j() {
      List<arf> $$0 = this.a(btn::bD);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bss $$0) {
      return this.j($$0);
   }

   public boolean c(bss $$0) {
      return this.j($$0);
   }

   public void d(bss $$0) {
      this.j($$0);
   }

   public void a(arf $$0) {
      this.e($$0);
   }

   public void b(arf $$0) {
      this.e($$0);
   }

   public void c(arf $$0) {
      this.e($$0);
   }

   public void d(arf $$0) {
      this.e($$0);
   }

   private void e(arf $$0) {
      bss $$1 = this.G().a($$0.cz());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cz());
         $$1.ai();
         this.a((arf)$$1, bss.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bss $$0) {
      if ($$0.dK()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bsy.a($$0.ak()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bss $$0) {
      if ($$0.cU().map(bss::cz).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dug $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(arf $$0, bss.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, iz $$1, int $$2) {
      for (arf $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dP() == this && $$3.al() != $$0) {
            double $$4 = (double)$$1.u() - $$3.du();
            double $$5 = (double)$$1.v() - $$3.dw();
            double $$6 = (double)$$1.w() - $$3.dA();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new acn($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cmv $$0, double $$1, double $$2, double $$3, ji<avy> $$4, awa $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.af(), new agc($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cmv $$0, bss $$1, ji<avy> $$2, awa $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.du(), $$1.dw(), $$1.dA(), (double)$$2.a().a($$4), this.af(), new agb($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, iz $$1, int $$2) {
      if (this.ab().b(dbs.W)) {
         this.J.ah().a(new adu($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cmv $$0, int $$1, iz $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.af(), new adu($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(ji<dwt> $$0, evp $$1, dwt.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(iz $$0, dsa $$1, dsa $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      ewi $$5 = $$1.k(this, $$0);
      ewi $$6 = $$2.k(this, $$0);
      if (ewf.c($$5, $$6, evt.g)) {
         List<ccz> $$7 = new ObjectArrayList();

         for (btp $$8 : this.V) {
            ccz $$9 = $$8.K();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (ccz $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(iz $$0, dex $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(iz $$0, dex $$1, je $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(iz $$0, dex $$1, iz $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dsa $$0, iz $$1, dex $$2, iz $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bss $$0, byte $$1) {
      this.l().a($$0, new adl($$0, $$1));
   }

   @Override
   public void a(bss $$0, brl $$1) {
      this.l().a($$0, new adh($$0, $$1));
   }

   public arc l() {
      return this.I;
   }

   @Override
   public dbo a(
      @Nullable bss $$0,
      @Nullable brl $$1,
      @Nullable dbp $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dbw.a $$8,
      lg $$9,
      lg $$10,
      ji<avy> $$11
   ) {
      dbo $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (arf $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new adm($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(iz $$0, dex $$1, int $$2, int $$3) {
      this.X.add(new dbb($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         dbb $$0 = (dbb)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.af(), new acp($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(dbb $$0) {
      dsa $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public exd<dex> m() {
      return this.S;
   }

   public exd<ens> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public eor p() {
      return this.R;
   }

   public emj q() {
      return this.J.ba();
   }

   public <T extends lg> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adv $$9 = new adv($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         arf $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lg> boolean a(arf $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zv<?> $$11 = new adv($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(arf $$0, boolean $$1, double $$2, double $$3, double $$4, zv<?> $$5) {
      if ($$0.dP() != this) {
         return false;
      } else {
         iz $$6 = $$0.dp();
         if ($$6.a(new evp($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bss a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bss b(int $$0) {
      bss $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bss)this.ac.get($$0);
   }

   @Nullable
   public bss a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public iz a(axe<eii> $$0, iz $$1, int $$2, boolean $$3) {
      if (!this.J.bb().y().c()) {
         return null;
      } else {
         Optional<jm.c<eii>> $$4 = this.H_().d(lq.aJ).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<iz, ji<eii>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (iz)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<iz, ji<dcv>> a(Predicate<ji<dcv>> $$0, iz $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cyw r() {
      return this.J.aJ();
   }

   @Override
   public brd s() {
      return this.J.aQ();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public epo u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public epi a(epg $$0) {
      return this.o().I().u().b(epi.a(), $$0.a());
   }

   @Override
   public void a(epg $$0, epi $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public epg v() {
      return this.o().I().u().a(eph.a(), "idcounts").b();
   }

   public void a(iz $$0, float $$1) {
      iz $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new afk($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(arj.a, new dbd($$2), this.L, baa.a);
      }

      int $$4 = this.ab().c(dbs.Z) + 1;
      if ($$4 > 1) {
         this.l().a(arj.a, new dbd($$0), $$4, baa.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      dbr $$0 = this.u().b(dbr.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dbr $$3 = this.u().a(dbr.a(), "chunks");
      dbd $$4 = new dbd($$0, $$1);
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
   public List<arf> x() {
      return this.H;
   }

   @Override
   public void a(iz $$0, dsa $$1, dsa $$2) {
      Optional<ji<ceu>> $$3 = cev.a($$1);
      Optional<ji<ceu>> $$4 = cev.a($$2);
      if (!Objects.equals($$3, $$4)) {
         iz $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               ags.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               ags.a(this, $$5);
            }));
      }
   }

   public cer y() {
      return this.l().l();
   }

   public boolean c(iz $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kb $$0) {
      return this.c($$0.q());
   }

   public boolean a(iz $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kb.a($$0)) <= $$1;
   }

   public int b(kb $$0) {
      return this.y().a($$0);
   }

   public coi z() {
      return this.f;
   }

   @Nullable
   public cog d(iz $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(iz $$0) {
      return this.d($$0) != null;
   }

   public void a(ceo $$0, bss $$1, buc $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqn $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dch.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<btq> $$4 = (Entry<btq>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((btq)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bss> $$1) throws IOException {
      axx $$2 = axx.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bss $$3 : $$1) {
         xo $$4 = $$3.ah();
         xo $$5 = $$3.O_();
         $$2.a($$3.du(), $$3.dw(), $$3.dA(), $$3.cz(), lp.g.b($$3.ak()), $$3.bD(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axx $$1 = axx.a().a("x").a("y").a("z").a("type").a($$0);

      for (dqx $$2 : this.r) {
         iz $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eia $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(iz $$0, dex $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(je $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bss> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.K.e() + "]";
   }

   public boolean B() {
      return this.J.bb().z();
   }

   @Override
   public long C() {
      return this.J.bb().y().b();
   }

   @Nullable
   public dvv D() {
      return this.ab;
   }

   @Override
   public are E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> lp.g.b($$0.ak()).toString()),
         this.r.size(),
         a(this.r, dqx::d),
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

   public static void a(are $$0) {
      iz $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      iz.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dez.a.o()));
      iz.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dez.co.o()));
   }

   @Override
   protected dwj<bss> G() {
      return this.N.d();
   }

   public void a(Stream<bss> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bss> $$0) {
      this.N.b($$0);
   }

   public void b(dug $$0) {
      $$0.c(this.A_().c());
   }

   public void a(dtw $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public eol H() {
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

   public boolean f(iz $$0) {
      return this.N.a($$0) && this.I.a.j().c(dbd.a($$0));
   }

   public boolean g(iz $$0) {
      return this.N.a($$0);
   }

   public boolean a(dbd $$0) {
      return this.N.a($$0);
   }

   @Override
   public cpj J() {
      return this.J.bb().K();
   }

   @Override
   public cwn K() {
      return this.J.bp();
   }

   public azf a(ale $$0) {
      return this.ag.a($$0);
   }

   public bqz L() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dwi<bss> {
      public void a(bss $$0) {
      }

      public void b(bss $$0) {
         are.this.f().a($$0);
      }

      public void c(bss $$0) {
         are.this.M.a($$0);
      }

      public void d(bss $$0) {
         are.this.M.b($$0);
      }

      public void e(bss $$0) {
         are.this.l().b($$0);
         if ($$0 instanceof arf $$1) {
            are.this.H.add($$1);
            are.this.e();
         }

         if ($$0 instanceof btp $$2) {
            if (are.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            are.this.V.add($$2);
         }

         if ($$0 instanceof chz $$4) {
            for (chx $$5 : $$4.gm()) {
               are.this.ac.put($$5.al(), $$5);
            }
         }

         $$0.a(dwq::a);
      }

      public void f(bss $$0) {
         are.this.l().a($$0);
         if ($$0 instanceof arf $$1) {
            are.this.H.remove($$1);
            are.this.e();
         }

         if ($$0 instanceof btp $$2) {
            if (are.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            are.this.V.remove($$2);
         }

         if ($$0 instanceof chz $$4) {
            for (chx $$5 : $$4.gm()) {
               are.this.ac.remove($$5.al());
            }
         }

         $$0.a(dwq::b);
      }

      public void g(bss $$0) {
         $$0.a(dwq::c);
      }
   }
}
