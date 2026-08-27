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
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
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
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aqt extends dca implements dcv {
   public static final ir a = new ir(100, 50, 0);
   public static final bpf b = bpl.a(12000, 180000);
   public static final bpf c = bpl.a(12000, 24000);
   private static final bpf E = bpl.a(12000, 180000);
   public static final bpf d = bpl.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<aqu> I = Lists.newArrayList();
   private final aqr J;
   private final MinecraftServer K;
   private final erk L;
   private int M;
   final dxi N = new dxi();
   private final dxn<brv> O;
   private final dxw P;
   public boolean e;
   private final aut Q;
   private int R;
   private final eqc S;
   private final eyi<dfc> T = new eyi<>(this::d, this.ah());
   private final eyi<epd> U = new eyi<>(this::d, this.ah());
   private final epw V = new epw();
   final Set<bsq> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final cno f;
   private final ObjectLinkedOpenHashSet<dbf> Y = new ObjectLinkedOpenHashSet();
   private final List<dbf> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<dbn> ab;
   @Nullable
   private dwx ac;
   final Int2ObjectMap<cgy> ad = new Int2ObjectOpenHashMap();
   private final dct ae;
   private final eju af;
   private final boolean ag;
   private final bqh ah;
   final Object2ObjectMap<UUID, cpa> ai = new Object2ObjectOpenHashMap();

   public aqt(
      MinecraftServer $$0,
      Executor $$1,
      erf.c $$2,
      erk $$3,
      aks<dca> $$4,
      dwv $$5,
      arc $$6,
      boolean $$7,
      long $$8,
      List<dbn> $$9,
      boolean $$10,
      @Nullable bqh $$11
   ) {
      super($$3, $$4, $$0.bc(), $$5.a(), $$0::aT, false, $$7, $$8, $$0.bl());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      duz $$12 = $$5.b();
      boolean $$13 = $$0.aZ();
      DataFixer $$14 = $$0.aD();
      dxf<brv> $$15 = new dwg(new dwq(new dwo($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, azs.s), this, $$0);
      this.O = new dxn<>(brv.class, new aqt.b(), $$15);
      this.J = new aqr(this, $$2, $$14, $$0.ba(), $$1, $$12, $$0.ah().p(), $$0.ah().q(), $$13, $$6, this.O::a, () -> $$0.I().u());
      this.J.h().b();
      this.S = new eqc(this);
      this.U();
      this.X();
      this.D_().a($$0.ax());
      this.f = this.u().a(cno.a(this), cno.a(this.ae()));
      if (!$$0.T()) {
         $$3.a($$0.u_());
      }

      long $$16 = $$0.bb().y().b();
      this.af = new eju(this.J.m(), this.I_(), $$0.ba(), $$4, $$12, this.J.i(), this, $$12.c(), $$16, $$14);
      this.ae = new dct(this, $$0.bb().y(), this.af);
      if (this.af() == dca.j && this.ae().a(dws.c)) {
         this.ac = new dwx(this, $$16, $$0.bb().C());
      } else {
         this.ac = null;
      }

      this.Q = new aut();
      this.P = new dxw(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.u().a(bqh.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dwx $$0) {
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
   public ja<dcz> a(int $$0, int $$1, int $$2) {
      return this.l().g().c().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dct a() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bmo $$1 = this.ag();
      this.aa = true;
      bql $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.D_().s();
         $$1.b("weather");
         this.au();
      }

      int $$4 = this.ab().c(dbw.Q);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.ab().b(dbw.l)) {
            long $$5 = this.B.d() + 24000L;
            this.o().I().b($$5 - $$5 % 24000L);
         }

         this.as();
         if (this.ab().b(dbw.v) && this.ad()) {
            this.o().I().g();
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
      this.l().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.aw();
      }

      this.aa = false;
      $$1.c();
      boolean $$7 = !this.I.isEmpty() || !this.w().isEmpty();
      if ($$7) {
         this.h();
      }

      if ($$7 || this.R++ < 300) {
         $$1.a("entities");
         if (this.ac != null && $$3) {
            $$1.a("dragonFight");
            this.ac.c();
            $$1.c();
         }

         for (cpa $$8 : List.copyOf(this.ai.values())) {
            this.a($$8.d(), $$2, $$1);
         }

         this.N.a($$2x -> this.a($$2x, $$2, $$1));
         $$1.c();
         this.T();
      }

      $$1.a("entityManagement");
      this.O.a();
      $$1.c();
   }

   private void a(brv $$0, bql $$1, bmo $$2) {
      if (!$$0.dP()) {
         if (this.i($$0)) {
            $$0.ao();
         } else if (!$$1.a($$0)) {
            $$2.a("checkDespawn");
            $$0.dG();
            $$2.c();
            if (this.J.a.j().c($$0.dw().a())) {
               brv $$3 = $$0.dh();
               if ($$3 != null) {
                  if (!$$3.dP() && $$3.x($$0)) {
                     return;
                  }

                  $$0.ae();
               }

               $$2.a("tick");
               this.a(this::a, $$0);
               $$2.c();
            }
         }
      }
   }

   @Override
   public boolean a(long $$0) {
      return this.J.a.j().d($$0);
   }

   protected void b() {
      if (this.ag) {
         long $$0 = this.B.c() + 1L;
         this.L.a($$0);
         this.L.s().a(this.K, $$0);
         if (this.B.o().b(dbw.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dbn $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private boolean i(brv $$0) {
      return this.K.ab() || !($$0 instanceof cee) && !($$0 instanceof cfg) ? !this.K.ac() && $$0 instanceof clk : true;
   }

   private void as() {
      this.Q.a();
      this.I.stream().filter(bso::fU).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dvi $$0, int $$1) {
      dbh $$2 = $$0.g();
      boolean $$3 = this.ad();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bmo $$6 = this.ag();
      $$6.a("thunder");
      if ($$3 && this.ac() && this.A.a(100000) == 0) {
         ir $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bpy $$8 = this.d_($$7);
            boolean $$9 = this.ab().b(dbw.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.d()).a(dfe.tD);
            if ($$9) {
               cgo $$10 = bsb.aQ.a((dca)this);
               if ($$10 != null) {
                  $$10.w(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            bsn $$11 = bsb.an.a((dca)this);
            if ($$11 != null) {
               $$11.e(ewu.c($$7));
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
         dvj[] $$13 = $$0.e();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dvj $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.g($$14);
               int $$17 = jt.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  ir $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dtc $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.v()) {
                     $$20.b(this, $$19, this.A);
                  }

                  epe $$21 = $$20.u();
                  if ($$21.f()) {
                     $$21.b(this, $$19, this.A);
                  }

                  $$6.c();
               }
            }
         }
      }

      $$6.c();
   }

   @VisibleForTesting
   public void a(ir $$0) {
      ir $$1 = this.a(dyu.a.e, $$0);
      ir $$2 = $$1.d();
      dcz $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dfe.eC.n());
      }

      if (this.ad()) {
         int $$4 = this.ab().c(dbw.U);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dtc $$5 = this.a_($$1);
            if ($$5.a(dfe.eB)) {
               int $$6 = $$5.c(dmz.c);
               if ($$6 < Math.min($$4, 8)) {
                  dtc $$7 = $$5.a(dmz.c, Integer.valueOf($$6 + 1));
                  dfc.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dfe.eB.n());
            }
         }

         dcz.c $$8 = $$3.a($$2);
         if ($$8 != dcz.c.a) {
            dtc $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<ir> E(ir $$0) {
      Optional<ir> $$1 = this.y().e($$0x -> $$0x.a(cdv.t), $$0x -> $$0x.v() == this.a(dyu.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cdr.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected ir b(ir $$0) {
      ir $$1 = this.a(dyu.a.e, $$0);
      Optional<ir> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ewp $$3 = ewp.a($$1, new ir($$1.h(this.am()))).g(3.0);
         List<bso> $$4 = this.a(bso.class, $$3, $$0x -> $$0x != null && $$0x.bI() && this.h($$0x.du()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).du();
         } else {
            if ($$1.v() == this.J_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean c() {
      return this.aa;
   }

   public boolean d() {
      return this.ab().c(dbw.Q) <= 100;
   }

   private void at() {
      if (this.d()) {
         if (!this.o().T() || this.o().r()) {
            int $$0 = this.ab().c(dbw.Q);
            xe $$1;
            if (this.Q.a($$0)) {
               $$1 = xe.c("sleep.skipping_night");
            } else {
               $$1 = xe.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (aqu $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.at();
      }
   }

   public all f() {
      return this.K.aK();
   }

   private void au() {
      boolean $$0 = this.ad();
      if (this.E_().g()) {
         if (this.ab().b(dbw.v)) {
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

         this.z = aym.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = aym.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ah().a(new ade(ade.i, this.x), this.af());
      }

      if (this.y != this.z) {
         this.K.ah().a(new ade(ade.j, this.z), this.af());
      }

      if ($$0 != this.ad()) {
         if ($$0) {
            this.K.ah().a(new ade(ade.d, 0.0F));
         } else {
            this.K.ah().a(new ade(ade.c, 0.0F));
         }

         this.K.ah().a(new ade(ade.i, this.x));
         this.K.ah().a(new ade(ade.j, this.z));
      }
   }

   @VisibleForTesting
   public void g() {
      this.L.c(0);
      this.L.b(false);
      this.L.b(0);
      this.L.a(false);
   }

   public void h() {
      this.R = 0;
   }

   private void a(ir $$0, epd $$1) {
      epe $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((dca)this, $$0);
      }
   }

   private void d(ir $$0, dfc $$1) {
      dtc $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(brv $$0) {
      $$0.bz();
      bmo $$1 = this.ag();
      $$0.am++;
      this.ag().a(() -> lh.g.b($$0.ak()).toString());
      $$1.d("tickNonPassenger");
      $$0.l();
      this.ag().c();

      for (brv $$2 : $$0.cX()) {
         this.a($$0, $$2);
      }
   }

   private void a(brv $$0, brv $$1) {
      if ($$1.dP() || $$1.dh() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cly || this.N.c($$1)) {
         $$1.bz();
         $$1.am++;
         bmo $$2 = this.ag();
         $$2.a(() -> lh.g.b($$1.ak()).toString());
         $$2.d("tickPassenger");
         $$1.v();
         $$2.c();

         for (brv $$3 : $$1.cX()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(cly $$0, ir $$1) {
      return !this.K.a(this, $$1, $$0) && this.D_().a($$1);
   }

   public void a(@Nullable ays $$0, boolean $$1, boolean $$2) {
      aqr $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xe.c("menu.savingLevel"));
         }

         this.av();
         if ($$0 != null) {
            $$0.c(xe.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.O.c();
         } else {
            this.O.b();
         }
      }
   }

   private void av() {
      if (this.ac != null) {
         this.K.bb().a(this.ac.b());
      }

      this.l().k().a();
   }

   public <T extends brv> List<? extends T> a(dxj<brv, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends brv> void a(dxj<brv, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends brv> void a(dxj<brv, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return awz.a.b;
            }
         }

         return awz.a.a;
      });
   }

   public List<? extends cha> i() {
      return this.a(bsb.H, bso::bI);
   }

   public List<aqu> a(Predicate<? super aqu> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aqu> a(Predicate<? super aqu> $$0, int $$1) {
      List<aqu> $$2 = Lists.newArrayList();

      for (aqu $$3 : this.I) {
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
   public aqu j() {
      List<aqu> $$0 = this.a(bso::bI);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(brv $$0) {
      return this.j($$0);
   }

   public boolean c(brv $$0) {
      return this.j($$0);
   }

   public void d(brv $$0) {
      this.j($$0);
   }

   public void a(aqu $$0) {
      this.e($$0);
   }

   public void b(aqu $$0) {
      this.e($$0);
   }

   public void c(aqu $$0) {
      this.e($$0);
   }

   public void d(aqu $$0) {
      this.e($$0);
   }

   private void e(aqu $$0) {
      brv $$1 = this.G().a($$0.cE());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cE());
         $$1.ai();
         this.a((aqu)$$1, brv.d.b);
      }

      this.O.a($$0);
   }

   private boolean j(brv $$0) {
      if ($$0.dP()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bsb.a($$0.ak()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(brv $$0) {
      if ($$0.cZ().map(brv::cE).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dvi $$0) {
      $$0.J();
      $$0.b(this);
   }

   public void a(aqu $$0, brv.d $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, ir $$1, int $$2) {
      for (aqu $$3 : this.K.ah().t()) {
         if ($$3 != null && $$3.dU() == this && $$3.al() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dz();
            double $$5 = (double)$$1.v() - $$3.dB();
            double $$6 = (double)$$1.w() - $$3.dF();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.d.b(new acd($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, ja<avn> $$4, avq $$5, float $$6, float $$7, long $$8) {
      this.K.ah().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.af(), new afr($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable cly $$0, brv $$1, ja<avn> $$2, avq $$3, float $$4, float $$5, long $$6) {
      this.K.ah().a($$0, $$1.dz(), $$1.dB(), $$1.dF(), (double)$$2.a().a($$4), this.af(), new afq($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, avn $$4, avq $$5, float $$6, float $$7) {
      this.a($$1, $$2, $$3, $$5x -> $$5x.waitThenPlay($$0, $$4, $$5, $$6, $$7));
   }

   @Override
   public void a(final double $$0, final double $$1, final double $$2, Consumer<avp> $$3) {
      class a implements avp {
         private int e = 0;
         final List<afs.a> f = new ArrayList<>();
         float g = 0.0F;

         @Override
         public void waitThenPlay(int $$0x, avn $$1x, avq $$2x, float $$3, float $$4) {
            this.e += $$0;
            long $$5 = 0L;
            this.f.add(new afs.a(this.e, new afr(ja.a($$1), $$2, $$0, $$1, $$2, $$3, $$4, 0L)));
            this.g = Math.max(this.g, $$1.a($$3));
         }
      }

      a $$4 = new a();
      $$3.accept($$4);
      this.K.ah().a(null, $$0, $$1, $$2, (double)$$4.g, this.af(), new afs($$4.f));
   }

   @Override
   public void b(int $$0, ir $$1, int $$2) {
      if (this.ab().b(dbw.X)) {
         this.K.ah().a(new adk($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable cly $$0, int $$1, ir $$2, int $$3) {
      this.K.ah().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.af(), new adk($$1, $$2, $$3, false));
   }

   public int k() {
      return this.E_().p();
   }

   @Override
   public void a(ja<dxv> $$0, ewu $$1, dxv.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(ir $$0, dtc $$1, dtc $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ad.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.V.a($$0);
      exn $$5 = $$1.k(this, $$0);
      exn $$6 = $$2.k(this, $$0);
      if (exk.c($$5, $$6, ewy.g)) {
         List<cbz> $$7 = new ObjectArrayList();

         for (bsq $$8 : this.W) {
            cbz $$9 = $$8.J();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cbz $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(ir $$0, dfc $$1) {
      this.t.a($$0, $$1, null);
   }

   @Override
   public void a(ir $$0, dfc $$1, iw $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(ir $$0, dfc $$1, ir $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dtc $$0, ir $$1, dfc $$2, ir $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(brv $$0, byte $$1) {
      this.l().a($$0, new adb($$0, $$1));
   }

   @Override
   public void a(brv $$0, bqt $$1) {
      this.l().a($$0, new acx($$0, $$1));
   }

   public aqr l() {
      return this.J;
   }

   @Override
   public dbs a(
      @Nullable brv $$0,
      @Nullable bqt $$1,
      @Nullable dbt $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dca.a $$8,
      kz $$9,
      kz $$10,
      ja<avn> $$11
   ) {
      dbs $$12 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, $$9, $$10, $$11);
      if (!$$12.d()) {
         $$12.h();
      }

      for (aqu $$13 : this.I) {
         if ($$13.i($$3, $$4, $$5) < 4096.0) {
            $$13.d.b(new adc($$3, $$4, $$5, $$6, $$12.i(), $$12.e().get($$13), $$12.j(), $$12.k(), $$12.l(), $$12.m()));
         }
      }

      return $$12;
   }

   @Override
   public void a(ir $$0, dfc $$1, int $$2, int $$3) {
      this.Y.add(new dbf($$0, $$1, $$2, $$3));
   }

   private void aw() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         dbf $$0 = (dbf)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ah().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.af(), new acf($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(dbf $$0) {
      dtc $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public eyi<dfc> m() {
      return this.T;
   }

   public eyi<epd> n() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.K;
   }

   public eqc p() {
      return this.S;
   }

   public enu q() {
      return this.K.ba();
   }

   public <T extends kz> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      adl $$9 = new adl($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.I.size(); $$11++) {
         aqu $$12 = this.I.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends kz> boolean a(aqu $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zl<?> $$11 = new adl($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aqu $$0, boolean $$1, double $$2, double $$3, double $$4, zl<?> $$5) {
      if ($$0.dU() != this) {
         return false;
      } else {
         ir $$6 = $$0.du();
         if ($$6.a(new ewu($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.d.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public brv a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public brv b(int $$0) {
      brv $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (brv)this.ad.get($$0);
   }

   @Nullable
   public brv a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public ir a(awt<ejt> $$0, ir $$1, int $$2, boolean $$3) {
      if (!this.K.bb().y().c()) {
         return null;
      } else {
         Optional<je.c<ejt>> $$4 = this.I_().d(li.aJ).b($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<ir, ja<ejt>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (ir)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<ir, ja<dcz>> a(Predicate<ja<dcz>> $$0, ir $$1, int $$2, int $$3, int $$4) {
      return this.l().g().c().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public czd r() {
      return this.K.aJ();
   }

   @Override
   public bql s() {
      return this.K.aQ();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public eqz u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public eqt a(eqr $$0) {
      return this.o().I().u().b(eqt.a(), $$0.a());
   }

   @Override
   public void a(eqr $$0, eqt $$1) {
      this.o().I().u().a($$0.a(), $$1);
   }

   @Override
   public eqr v() {
      return this.o().I().u().a(eqs.a(), "idcounts").b();
   }

   public void a(ir $$0, float $$1) {
      ir $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.o().ah().a(new aez($$0, $$1));
      }

      if (this.M > 1) {
         this.l().b(aqy.a, new dbh($$2), this.M, azo.a);
      }

      int $$4 = this.ab().c(dbw.aa) + 1;
      if ($$4 > 1) {
         this.l().a(aqy.a, new dbh($$0), $$4, azo.a);
      }

      this.M = $$4;
   }

   public LongSet w() {
      dbv $$0 = this.u().b(dbv.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dbv $$3 = this.u().a(dbv.a(), "chunks");
      dbh $$4 = new dbh($$0, $$1);
      long $$5 = $$4.a();
      boolean $$6;
      if ($$2) {
         $$6 = $$3.b().add($$5);
         if ($$6) {
            this.c($$0, $$1);
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
   public List<aqu> x() {
      return this.I;
   }

   @Override
   public void a(ir $$0, dtc $$1, dtc $$2) {
      Optional<ja<cdu>> $$3 = cdv.a($$1);
      Optional<ja<cdu>> $$4 = cdv.a($$2);
      if (!Objects.equals($$3, $$4)) {
         ir $$5 = $$0.i();
         $$3.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5);
               agi.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.o().execute(() -> {
               this.y().a($$5, $$1x);
               agi.a(this, $$5);
            }));
      }
   }

   public cdr y() {
      return this.l().l();
   }

   public boolean c(ir $$0) {
      return this.a($$0, 1);
   }

   public boolean a(jt $$0) {
      return this.c($$0.q());
   }

   public boolean a(ir $$0, int $$1) {
      return $$1 > 6 ? false : this.b(jt.a($$0)) <= $$1;
   }

   public int b(jt $$0) {
      return this.y().a($$0);
   }

   public cno z() {
      return this.f;
   }

   @Nullable
   public cnm d(ir $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(ir $$0) {
      return this.d($$0) != null;
   }

   public void a(cdo $$0, brv $$1, btc $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqc $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dcl.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bsr> $$4 = (Entry<bsr>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bsr)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.O.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.s.size()));
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
         this.O.a($$10);
      }

      Path $$11 = $$0.resolve("entities.csv");

      try (Writer $$12 = Files.newBufferedWriter($$11)) {
         a($$12, this.G().b());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<brv> $$1) throws IOException {
      axm $$2 = axm.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (brv $$3 : $$1) {
         xe $$4 = $$3.ah();
         xe $$5 = $$3.P_();
         $$2.a($$3.dz(), $$3.dB(), $$3.dF(), $$3.cE(), lh.g.b($$3.ak()), $$3.bI(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      axm $$1 = axm.a().a("x").a("y").a("z").a("type").a($$0);

      for (drz $$2 : this.s) {
         ir $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(ejl $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(ir $$0, dfc $$1) {
      if (!this.ai()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(iw $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<brv> A() {
      return this.G().b();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.L.e() + "]";
   }

   public boolean B() {
      return this.K.bb().z();
   }

   @Override
   public long C() {
      return this.K.bb().y().b();
   }

   @Nullable
   public dwx D() {
      return this.ac;
   }

   @Override
   public aqt E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().b(), $$0 -> lh.g.b($$0.ak()).toString()),
         this.s.size(),
         a(this.s, drz::d),
         this.m().a(),
         this.n().a(),
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

   public static void a(aqt $$0) {
      ir $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      ir.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dfe.a.n()));
      ir.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, dfe.cZ.n()));
   }

   @Override
   protected dxl<brv> G() {
      return this.O.d();
   }

   @Override
   public Iterable<? extends cpa> H() {
      return this.ai.values();
   }

   @Nullable
   @Override
   public cpa b(UUID $$0) {
      return (cpa)this.ai.get($$0);
   }

   public void a(Stream<brv> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<brv> $$0) {
      this.O.b($$0);
   }

   public void b(dvi $$0) {
      $$0.c(this.B_().c());
   }

   public void a(duy $$0) {
      this.K.execute(() -> this.af.a($$0.g(), $$0.h()));
   }

   public epw I() {
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

   public boolean f(ir $$0) {
      return this.O.a($$0) && this.J.a.j().c(dbh.a($$0));
   }

   public boolean g(ir $$0) {
      return this.O.a($$0);
   }

   public boolean a(dbh $$0) {
      return this.O.a($$0);
   }

   @Override
   public cop K() {
      return this.K.bb().K();
   }

   public ayt a(akt $$0) {
      return this.ah.a($$0);
   }

   public bqh L() {
      return this.ah;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.O.f()));
      return $$1;
   }

   final class b implements dxk<brv> {
      public void a(brv $$0) {
      }

      public void b(brv $$0) {
         aqt.this.f().a($$0);
      }

      public void c(brv $$0) {
         if (!($$0 instanceof coz)) {
            aqt.this.N.a($$0);
         }
      }

      public void d(brv $$0) {
         aqt.this.N.b($$0);
      }

      public void e(brv $$0) {
         aqt.this.l().b($$0);
         if ($$0 instanceof aqu $$1) {
            aqt.this.I.add($$1);
            aqt.this.e();
         }

         if ($$0 instanceof bsq $$2) {
            if (aqt.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqt.this.W.add($$2);
         }

         if ($$0 instanceof cha $$4) {
            for (cgy $$5 : $$4.gu()) {
               aqt.this.ad.put($$5.al(), $$5);
            }
         }

         if ($$0 instanceof coz $$6) {
            aqt.this.ai.put($$6.cE(), $$6.r());
         }

         $$0.a(dxs::a);
      }

      public void f(brv $$0) {
         aqt.this.l().a($$0);
         if ($$0 instanceof aqu $$1) {
            aqt.this.I.remove($$1);
            aqt.this.e();
         }

         if ($$0 instanceof bsq $$2) {
            if (aqt.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aqt.this.W.remove($$2);
         }

         if ($$0 instanceof cha $$4) {
            for (cgy $$5 : $$4.gu()) {
               aqt.this.ad.remove($$5.al());
            }
         }

         if ($$0 instanceof coz $$6) {
            aqt.this.ai.remove($$6.cE(), $$6.r());
         }

         $$0.a(dxs::b);
      }

      public void g(brv $$0) {
         $$0.a(dxs::c);
      }
   }
}
