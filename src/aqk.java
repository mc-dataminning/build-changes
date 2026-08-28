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

public class aqk extends dcd implements dcz {
   public static final ja a = new ja(100, 50, 0);
   public static final bpi b = bpo.a(12000, 180000);
   public static final bpi c = bpo.a(12000, 24000);
   private static final bpi D = bpo.a(12000, 180000);
   public static final bpi d = bpo.a(3600, 15600);
   private static final Logger E = LogUtils.getLogger();
   private static final int F = 300;
   private static final int G = 65536;
   final List<aql> H = Lists.newArrayList();
   private final aqi I;
   private final MinecraftServer J;
   private final eqh K;
   private int L;
   final dwn M = new dwn();
   private final dws<bsd> N;
   private final dxb O;
   public boolean e;
   private final auk P;
   private int Q;
   private final eoz R;
   private final exn<dff> S = new exn<>(this::d, this.ah());
   private final exn<eoa> T = new exn<>(this::d, this.ah());
   private final eot U = new eot();
   final Set<bta> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final cnu f;
   private final ObjectLinkedOpenHashSet<dbi> X = new ObjectLinkedOpenHashSet();
   private final List<dbi> Y = new ArrayList<>(64);
   private boolean Z;
   private final List<dbq> aa;
   @Nullable
   private dwc ab;
   final Int2ObjectMap<chi> ac = new Int2ObjectOpenHashMap();
   private final dcx ad;
   private final eir ae;
   private final boolean af;
   private final bqk ag;

   public aqk(
      MinecraftServer $$0,
      Executor $$1,
      eqc.c $$2,
      eqh $$3,
      akj<dcd> $$4,
      dwa $$5,
      aqt $$6,
      boolean $$7,
      long $$8,
      List<dbq> $$9,
      boolean $$10,
      @Nullable bqk $$11
   ) {
      super($$3, $$4, $$0.bc(), $$5.a(), $$0::aT, false, $$7, $$8, $$0.bl());
      this.af = $$10;
      this.J = $$0;
      this.aa = $$9;
      this.K = $$3;
      due $$12 = $$5.b();
      boolean $$13 = $$0.aZ();
      DataFixer $$14 = $$0.aD();
      dwk<bsd> $$15 = new dvl(new dvv(new dvt($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, azl.s), this, $$0);
      this.N = new dws<>(bsd.class, new aqk.a(), $$15);
      this.I = new aqi(this, $$2, $$14, $$0.ba(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.N::a, () -> $$0.I().u());
      this.I.h().b();
      this.R = new eoz(this);
      this.U();
      this.X();
      this.C_().a($$0.ax());
      this.f = this.u().a(cnu.a(this), cnu.a(this.ae()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bb().y().b();
      this.ae = new eir(this.I.m(), this.H_(), $$0.ba(), $$4, $$12, this.I.i(), this, $$12.d(), $$16, $$14);
      this.ad = new dcx(this, $$0.bb().y(), this.ae);
      if (this.af() == dcd.j && this.ae().a(dvx.c)) {
         this.ab = new dwc(this, $$16, $$0.bb().C());
      } else {
         this.ab = null;
      }

      this.P = new auk();
      this.O = new dxb(this);
      this.ag = Objects.requireNonNullElseGet($$11, () -> this.u().a(bqk.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dwc $$0) {
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
   public jj<ddd> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dcx a() {
      return this.ad;
   }

   public void a(BooleanSupplier $$0) {
      bmr $$1 = this.ag();
      this.Z = true;
      bqo $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.au();
      }

      int $$4 = this.ab().c(dbz.P);
      if (this.P.a($$4) && this.P.a($$4, this.H)) {
         if (this.ab().b(dbz.l)) {
            long $$5 = this.A.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.ab().b(dbz.v) && this.ad()) {
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
                     bsd $$3x = $$2x.dc();
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
         if (this.A.o().b(dbz.l)) {
            this.b(this.A.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.K.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dbq $$2 : this.aa) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(bsd $$0) {
      return this.J.ab() || !($$0 instanceof ceo) && !($$0 instanceof cfq) ? !this.J.ac() && $$0 instanceof clt : true;
   }

   private void as() {
      this.P.a();
      this.H.stream().filter(bsy::fH).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dun $$0, int $$1) {
      dbk $$2 = $$0.f();
      boolean $$3 = this.ad();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bmr $$6 = this.ag();
      $$6.a("thunder");
      if ($$3 && this.ac() && this.z.a(100000) == 0) {
         ja $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bqb $$8 = this.d_($$7);
            boolean $$9 = this.ab().b(dbz.e) && this.z.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dfh.ss);
            if ($$9) {
               cgy $$10 = bsj.aO.a((dcd)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bsx $$11 = bsj.am.a((dcd)this);
            if ($$11 != null) {
               $$11.e(evz.c($$7));
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
         duo[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            duo $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = kc.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ja $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dsh $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.z);
                  }

                  eob $$21 = $$20.u();
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
   public void a(ja $$0) {
      ja $$1 = this.a(dxz.a.e, $$0);
      ja $$2 = $$1.d();
      ddd $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dfh.dO.o());
      }

      if (this.ad()) {
         int $$4 = this.ab().c(dbz.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dsh $$5 = this.a_($$1);
            if ($$5.a(dfh.dN)) {
               int $$6 = $$5.c(dmo.c);
               if ($$6 < Math.min($$4, 8)) {
                  dsh $$7 = $$5.a(dmo.c, Integer.valueOf($$6 + 1));
                  dff.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dfh.dN.o());
            }
         }

         ddd.c $$8 = $$3.a($$2);
         if ($$8 != ddd.c.a) {
            dsh $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<ja> E(ja $$0) {
      Optional<ja> $$1 = this.y().e($$0x -> $$0x.a(ceg.t), $$0x -> $$0x.v() == this.a(dxz.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cec.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ja b(ja $$0) {
      ja $$1 = this.a(dxz.a.e, $$0);
      Optional<ja> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         evu $$3 = evu.a($$1, new ja($$1.h(this.am()))).g(3.0);
         List<bsy> $$4 = this.a(bsy.class, $$3, $$0x -> $$0x != null && $$0x.bD() && this.h($$0x.dp()));
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
      return this.ab().c(dbz.P) <= 100;
   }

   private void at() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.ab().c(dbz.P);
            wu $$1;
            if (this.P.a($$0)) {
               $$1 = wu.c("sleep.skipping_night");
            } else {
               $$1 = wu.a("sleep.players_sleeping", this.P.b(), this.P.b($$0));
            }

            for (aql $$3 : this.H) {
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

   public alc f() {
      return this.J.aK();
   }

   private void au() {
      boolean $$0 = this.ad();
      if (this.D_().g()) {
         if (this.ab().b(dbz.v)) {
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

         this.y = aye.a(this.y, 0.0F, 1.0F);
         this.v = this.w;
         if (this.A.i()) {
            this.w += 0.01F;
         } else {
            this.w -= 0.01F;
         }

         this.w = aye.a(this.w, 0.0F, 1.0F);
      }

      if (this.v != this.w) {
         this.J.ah().a(new acu(acu.i, this.w), this.af());
      }

      if (this.x != this.y) {
         this.J.ah().a(new acu(acu.j, this.y), this.af());
      }

      if ($$0 != this.ad()) {
         if ($$0) {
            this.J.ah().a(new acu(acu.d, 0.0F));
         } else {
            this.J.ah().a(new acu(acu.c, 0.0F));
         }

         this.J.ah().a(new acu(acu.i, this.w));
         this.J.ah().a(new acu(acu.j, this.y));
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

   private void a(ja $$0, eoa $$1) {
      eob $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((dcd)this, $$0);
      }
   }

   private void d(ja $$0, dff $$1) {
      dsh $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.z);
      }
   }

   public void a(bsd $$0) {
      $$0.bu();
      bmr $$1 = this.ag();
      $$0.ai++;
      this.ag().a(() -> lq.f.b($$0.ak()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ag().c();

      for (bsd $$2 : $$0.cS()) {
         this.a($$0, $$2);
      }
   }

   private void a(bsd $$0, bsd $$1) {
      if ($$1.dK() || $$1.dc() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof cmh || this.M.c($$1)) {
         $$1.bu();
         $$1.ai++;
         bmr $$2 = this.ag();
         $$2.a(() -> lq.f.b($$1.ak()).toString());
         $$2.d("tickPassenger");
         $$1.t();
         $$2.c();

         for (bsd $$3 : $$1.cS()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cmh $$0, ja $$1) {
      return !this.J.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable ayl $$0, boolean $$1, boolean $$2) {
      aqi $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(wu.c("menu.savingLevel"));
         }

         this.av();
         if ($$0 != null) {
            $$0.c(wu.c("menu.savingChunks"));
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

   public <T extends bsd> List<? extends T> a(dwo<bsd, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bsd> void a(dwo<bsd, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bsd> void a(dwo<bsd, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return awq.a.b;
            }
         }

         return awq.a.a;
      });
   }

   public List<? extends chk> i() {
      return this.a(bsj.F, bsy::bD);
   }

   public List<aql> a(Predicate<? super aql> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aql> a(Predicate<? super aql> $$0, int $$1) {
      List<aql> $$2 = Lists.newArrayList();

      for (aql $$3 : this.H) {
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
   public aql j() {
      List<aql> $$0 = this.a(bsy::bD);
      return $$0.isEmpty() ? null : $$0.get(this.z.a($$0.size()));
   }

   @Override
   public boolean b(bsd $$0) {
      return this.j($$0);
   }

   public boolean c(bsd $$0) {
      return this.j($$0);
   }

   public void d(bsd $$0) {
      this.j($$0);
   }

   public void a(aql $$0) {
      this.e($$0);
   }

   public void b(aql $$0) {
      this.e($$0);
   }

   public void c(aql $$0) {
      this.e($$0);
   }

   public void d(aql $$0) {
      this.e($$0);
   }

   private void e(aql $$0) {
      bsd $$1 = this.G().a($$0.cz());
      if ($$1 != null) {
         E.warn("Force-added player with duplicate UUID {}", $$0.cz());
         $$1.ai();
         this.a((aql)$$1, bsd.c.b);
      }

      this.N.a($$0);
   }

   private boolean j(bsd $$0) {
      if ($$0.dK()) {
         E.warn("Tried to add entity {} but it was marked as removed already", bsj.a($$0.ak()));
         return false;
      } else {
         return this.N.a($$0);
      }
   }

   public boolean e(bsd $$0) {
      if ($$0.cU().map(bsd::cz).anyMatch(this.N::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dun $$0) {
      $$0.I();
      $$0.b(this);
   }

   public void a(aql $$0, bsd.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ja $$1, int $$2) {
      for (aql $$3 : this.J.ah().t()) {
         if ($$3 != null && $$3.dP() == this && $$3.al() != $$0) {
            double $$4 = (double)$$1.u() - $$3.du();
            double $$5 = (double)$$1.v() - $$3.dw();
            double $$6 = (double)$$1.w() - $$3.dA();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.c.b(new abt($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cmh $$0, double $$1, double $$2, double $$3, jj<ave> $$4, avg $$5, float $$6, float $$7, long $$8) {
      this.J.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.af(), new afi($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cmh $$0, bsd $$1, jj<ave> $$2, avg $$3, float $$4, float $$5, long $$6) {
      this.J.ah().a($$0, $$1.du(), $$1.dw(), $$1.dA(), (double)$$2.a().a($$4), this.af(), new afh($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, ja $$1, int $$2) {
      if (this.ab().b(dbz.W)) {
         this.J.ah().a(new ada($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cmh $$0, int $$1, ja $$2, int $$3) {
      this.J.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.af(), new ada($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(jj<dxa> $$0, evz $$1, dxa.a $$2) {
      this.O.a($$0, $$1, $$2);
   }

   @Override
   public void a(ja $$0, dsh $$1, dsh $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ac.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.U.a($$0);
      ews $$5 = $$1.k(this, $$0);
      ews $$6 = $$2.k(this, $$0);
      if (ewp.c($$5, $$6, ewd.g)) {
         List<cck> $$7 = new ObjectArrayList();

         for (bta $$8 : this.V) {
            cck $$9 = $$8.K();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for (cck $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }
      }
   }

   @Override
   public void a(ja $$0, dff $$1) {
      this.s.a($$0, $$1, null);
   }

   @Override
   public void a(ja $$0, dff $$1, jf $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(ja $$0, dff $$1, ja $$2) {
      this.s.a($$0, $$1, $$2);
   }

   @Override
   public void a(dsh $$0, ja $$1, dff $$2, ja $$3, boolean $$4) {
      this.s.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bsd $$0, byte $$1) {
      this.l().a($$0, new acr($$0, $$1));
   }

   @Override
   public void a(bsd $$0, bqw $$1) {
      this.l().a($$0, new acn($$0, $$1));
   }

   public aqi l() {
      return this.I;
   }

   @Override
   public dbv a(
      @Nullable bsd $$0,
      @Nullable bqw $$1,
      @Nullable dbw $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dcd.a $$8,
      lh $$9,
      lh $$10,
      jj<ave> $$11
   ) {
      dbv $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (aql $$13 : this.H) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.c.b(new acs($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(ja $$0, dff $$1, int $$2, int $$3) {
      this.X.add(new dbi($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Y.clear();

      while (!this.X.isEmpty()) {
         dbi $$0 = (dbi)this.X.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.J.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.af(), new abv($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(dbi $$0) {
      dsh $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public exn<dff> m() {
      return this.S;
   }

   public exn<eoa> n() {
      return this.T;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.J;
   }

   public eoz p() {
      return this.R;
   }

   public emr q() {
      return this.J.ba();
   }

   public <T extends lh> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adb $$9 = new adb($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.H.size(); $$11++) {
         aql $$12 = this.H.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lh> boolean a(aql $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zb<?> $$11 = new adb($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aql $$0, boolean $$1, double $$2, double $$3, double $$4, zb<?> $$5) {
      if ($$0.dP() != this) {
         return false;
      } else {
         ja $$6 = $$0.dp();
         if ($$6.a(new evz($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.c.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bsd a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bsd b(int $$0) {
      bsd $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bsd)this.ac.get($$0);
   }

   @Nullable
   public bsd a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public ja a(awk<eiq> $$0, ja $$1, int $$2, boolean $$3) {
      if (!this.J.bb().y().c()) {
         return null;
      } else {
         Optional<jn.c<eiq>> $$4 = this.H_().d(lr.aQ).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ja, jj<eiq>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ja)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ja, jj<ddd>> a(Predicate<jj<ddd>> $$0, ja $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public cyk r() {
      return this.J.aJ();
   }

   @Override
   public bqo s() {
      return this.J.aQ();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public epw u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public epq a(epo $$0) {
      return this.o().I().u().b(epq.a(), $$0.a());
   }

   @Override
   public void a(epo $$0, epq $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public epo v() {
      return this.o().I().u().a(epp.a(), "idcounts").b();
   }

   public void a(ja $$0, float $$1) {
      ja $$2 = this.A.a();
      float $$3 = this.A.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.A.a($$0, $$1);
         this.o().ah().a(new aeq($$0, $$1));
      }

      if (this.L > 1) {
         this.l().b(aqp.a, new dbk($$2), this.L, azh.a);
      }

      int $$4 = this.ab().c(dbz.Z) + 1;
      if ($$4 > 1) {
         this.l().a(aqp.a, new dbk($$0), $$4, azh.a);
      }

      this.L = $$4;
   }

   public LongSet w() {
      dby $$0 = this.u().b(dby.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dby $$3 = this.u().a(dby.a(), "chunks");
      dbk $$4 = new dbk($$0, $$1);
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
   public List<aql> x() {
      return this.H;
   }

   @Override
   public void a(ja $$0, dsh $$1, dsh $$2) {
      Optional<jj<cef>> $$3 = ceg.a($$1);
      Optional<jj<cef>> $$4 = ceg.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ja $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               afy.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               afy.a(this, $$5);
            }));
      }
   }

   public cec y() {
      return this.l().l();
   }

   public boolean c(ja $$0) {
      return this.a($$0, 1);
   }

   public boolean a(kc $$0) {
      return this.c($$0.q());
   }

   public boolean a(ja $$0, int $$1) {
      return $$1 > 6 ? false : this.b(kc.a($$0)) <= $$1;
   }

   public int b(kc $$0) {
      return this.y().a($$0);
   }

   public cnu z() {
      return this.f;
   }

   @Nullable
   public cns d(ja $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(ja $$0) {
      return this.d($$0) != null;
   }

   public void a(cdz $$0, bsd $$1, btn $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      apt $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dco.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<btb> $$4 = (Entry<btb>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((btb)$$4.getKey()).a(), $$4.getIntValue()));
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

   private static void a(Writer $$0, Iterable<bsd> $$1) throws IOException {
      axd $$2 = axd.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bsd $$3 : $$1) {
         wu $$4 = $$3.ah();
         wu $$5 = $$3.O_();
         $$2.a($$3.du(), $$3.dw(), $$3.dA(), $$3.cz(), lq.f.b($$3.ak()), $$3.bD(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axd $$1 = axd.a().a("x").a("y").a("z").a("type").a($$0);

      for (drf $$2 : this.r) {
         ja $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(eii $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ja $$0, dff $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jf $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bsd> A() {
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
   public dwc D() {
      return this.ab;
   }

   @Override
   public aqk E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.H.size(),
         this.N.e(),
         a(this.N.d().a(), $$0 -> lq.f.b($$0.ak()).toString()),
         this.r.size(),
         a(this.r, drf::d),
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

   public static void a(aqk $$0) {
      ja $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      ja.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dfh.a.o()));
      ja.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dfh.co.o()));
   }

   @Override
   protected dwq<bsd> G() {
      return this.N.d();
   }

   public void a(Stream<bsd> $$0) {
      this.N.a($$0);
   }

   public void b(Stream<bsd> $$0) {
      this.N.b($$0);
   }

   public void b(dun $$0) {
      $$0.c(this.A_().c());
   }

   public void a(dud $$0) {
      this.J.execute(() -> this.ae.a($$0.f(), $$0.g()));
   }

   public eot H() {
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

   public boolean f(ja $$0) {
      return this.N.a($$0) && this.I.a.j().c(dbk.a($$0));
   }

   public boolean g(ja $$0) {
      return this.N.a($$0);
   }

   public boolean a(dbk $$0) {
      return this.N.a($$0);
   }

   @Override
   public cov J() {
      return this.J.bb().K();
   }

   @Override
   public cwa K() {
      return this.J.bp();
   }

   public aym a(akk $$0) {
      return this.ag.a($$0);
   }

   public bqk L() {
      return this.ag;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.N.f()));
      return $$1;
   }

   final class a implements dwp<bsd> {
      public void a(bsd $$0) {
      }

      public void b(bsd $$0) {
         aqk.this.f().a($$0);
      }

      public void c(bsd $$0) {
         aqk.this.M.a($$0);
      }

      public void d(bsd $$0) {
         aqk.this.M.b($$0);
      }

      public void e(bsd $$0) {
         aqk.this.l().b($$0);
         if ($$0 instanceof aql $$1) {
            aqk.this.H.add($$1);
            aqk.this.e();
         }

         if ($$0 instanceof bta $$2) {
            if (aqk.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqk.this.V.add($$2);
         }

         if ($$0 instanceof chk $$4) {
            for (chi $$5 : $$4.gj()) {
               aqk.this.ac.put($$5.al(), $$5);
            }
         }

         $$0.a(dwx::a);
      }

      public void f(bsd $$0) {
         aqk.this.l().a($$0);
         if ($$0 instanceof aql $$1) {
            aqk.this.H.remove($$1);
            aqk.this.e();
         }

         if ($$0 instanceof bta $$2) {
            if (aqk.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ac.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqk.this.V.remove($$2);
         }

         if ($$0 instanceof chk $$4) {
            for (chi $$5 : $$4.gj()) {
               aqk.this.ac.remove($$5.al());
            }
         }

         $$0.a(dwx::b);
      }

      public void g(bsd $$0) {
         $$0.a(dwx::c);
      }
   }
}
