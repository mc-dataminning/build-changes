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

public class arn extends dfb implements dfy {
   public static final jh a = new jh(100, 50, 0);
   public static final bri b = bro.a(12000, 180000);
   public static final bri c = bro.a(12000, 24000);
   private static final bri E = bro.a(12000, 180000);
   public static final bri d = bro.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<aro> I = Lists.newArrayList();
   private final arl J;
   private final MinecraftServer K;
   private final etv L;
   private int M;
   final dzt N = new dzt();
   private final dzy<bue> O;
   private final eah P;
   public boolean e;
   private final avr Q;
   private int R;
   private final esj S;
   private final fbc<die> T = new fbc<>(this::d);
   private final fbc<erj> U = new fbc<>(this::d);
   private final esc V = new esc();
   final Set<bvc> W = new ObjectOpenHashSet();
   volatile boolean X;
   protected final cqc f;
   private final ObjectLinkedOpenHashSet<def> Y = new ObjectLinkedOpenHashSet();
   private final List<def> Z = new ArrayList<>(64);
   private boolean aa;
   private final List<den> ab;
   @Nullable
   private dzi ac;
   final Int2ObjectMap<cjl> ad = new Int2ObjectOpenHashMap();
   private final dfw ae;
   private final ely af;
   private final boolean ag;
   private final bsi ah;

   public arn(
      MinecraftServer $$0,
      Executor $$1,
      etq.c $$2,
      etv $$3,
      alh<dfb> $$4,
      dzg $$5,
      arx $$6,
      boolean $$7,
      long $$8,
      List<den> $$9,
      boolean $$10,
      @Nullable bsi $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ag = $$10;
      this.K = $$0;
      this.ab = $$9;
      this.L = $$3;
      dxg $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      dzq<bue> $$15 = new dyq(new dzb(new dyy($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bat.s), this, $$0);
      this.O = new dzy<>(bue.class, new arn.a(), $$15);
      this.J = new arl(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.O::a, () -> $$0.J().u());
      this.J.h().b();
      this.S = new esj(this);
      this.V();
      this.Y();
      this.C_().a($$0.aw());
      this.f = this.u().a(cqc.a(this), cqc.a(this.af()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.af = new ely(this.J.m(), this.H_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.ae = new dfw(this, $$0.aZ().y(), this.af);
      if (this.ag() == dfb.k && this.af().a(dzd.c)) {
         this.ac = new dzi(this, $$16, $$0.aZ().C());
      } else {
         this.ac = null;
      }

      this.Q = new avr();
      this.P = new eah(this);
      this.ah = Objects.requireNonNullElseGet($$11, () -> this.u().a(bsi.a($$16), "random_sequences"));
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable dzi $$0) {
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
   public jq<dgc> a(int $$0, int $$1, int $$2) {
      return this.l().g().d().getNoiseBiome($$0, $$1, $$2, this.l().i().b());
   }

   public dfw a() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      bon $$1 = bom.a();
      this.aa = true;
      bsm $$2 = this.s();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.C_().s();
         $$1.b("weather");
         this.at();
         $$1.c();
      }

      int $$4 = this.ac().c(dex.P);
      if (this.Q.a($$4) && this.Q.a($$4, this.I)) {
         if (this.ac().b(dex.l)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.ar();
         if (this.ac().b(dex.v) && this.ae()) {
            this.g();
         }
      }

      this.V();
      if ($$3) {
         this.b();
      }

      $$1.a("tickPending");
      if (!this.ah() && $$3) {
         long $$6 = this.aa();
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
         this.au();
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

         this.N.a($$2x -> {
            if (!$$2x.dS()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dJ();
                  $$1.c();
                  if ($$2x instanceof aro || this.J.a.j().c($$2x.dz().a())) {
                     bue $$3x = $$2x.dl();
                     if ($$3x != null) {
                        if (!$$3x.dS() && $$3x.y($$2x)) {
                           return;
                        }

                        $$2x.af();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.U();
      }

      $$1.a("entityManagement");
      this.O.a();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.J.a.j().d($$0);
   }

   protected void b() {
      if (this.ag) {
         long $$0 = this.B.c() + 1L;
         this.L.a($$0);
         bom.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bom.a().c();
         if (this.B.o().b(dex.l)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (den $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void ar() {
      this.Q.a();
      this.I.stream().filter(bva::fT).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(dxp $$0, int $$1) {
      deh $$2 = $$0.f();
      boolean $$3 = this.ae();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      bon $$6 = bom.a();
      $$6.a("thunder");
      if ($$3 && this.ad() && this.A.a(100000) == 0) {
         jh $$7 = this.b(this.a($$4, 0, $$5, 15));
         if (this.r($$7)) {
            bsb $$8 = this.d_($$7);
            boolean $$9 = this.ac().b(dex.e) && this.A.j() < (double)$$8.b() * 0.01 && !this.a_($$7.e()).a(dig.ss);
            if ($$9) {
               cjb $$10 = bul.aO.a(this, buk.h);
               if ($$10 != null) {
                  $$10.x(true);
                  $$10.c_(0);
                  $$10.a_((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
                  this.b($$10);
               }
            }

            buz $$11 = bul.am.a(this, buk.h);
            if ($$11 != null) {
               $$11.e(ezn.c($$7));
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
         dxq[] $$13 = $$0.d();

         for (int $$14 = 0; $$14 < $$13.length; $$14++) {
            dxq $$15 = $$13[$$14];
            if ($$15.d()) {
               int $$16 = $$0.h($$14);
               int $$17 = kj.c($$16);

               for (int $$18 = 0; $$18 < $$1; $$18++) {
                  jh $$19 = this.a($$4, $$17, $$5, 15);
                  $$6.a("randomTick");
                  dvj $$20 = $$15.a($$19.u() - $$4, $$19.v() - $$17, $$19.w() - $$5);
                  if ($$20.z()) {
                     $$20.b(this, $$19, this.A);
                  }

                  erk $$21 = $$20.y();
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
   public void a(jh $$0) {
      jh $$1 = this.a(ebf.a.e, $$0);
      jh $$2 = $$1.e();
      dgc $$3 = this.t($$1).a();
      if ($$3.a(this, $$2)) {
         this.b($$2, dig.dO.m());
      }

      if (this.ae()) {
         int $$4 = this.ac().c(dex.T);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            dvj $$5 = this.a_($$1);
            if ($$5.a(dig.dN)) {
               int $$6 = $$5.c(dpn.c);
               if ($$6 < Math.min($$4, 8)) {
                  dvj $$7 = $$5.b(dpn.c, Integer.valueOf($$6 + 1));
                  die.a($$5, $$7, this, $$1);
                  this.b($$1, $$7);
               }
            } else {
               this.b($$1, dig.dN.m());
            }
         }

         dgc.c $$8 = $$3.a($$2, this.N());
         if ($$8 != dgc.c.a) {
            dvj $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jh> E(jh $$0) {
      Optional<jh> $$1 = this.y().e($$0x -> $$0x.a(cgi.t), $$0x -> $$0x.v() == this.a(ebf.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, cge.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jh b(jh $$0) {
      jh $$1 = this.a(ebf.a.e, $$0);
      Optional<jh> $$2 = this.E($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         ezi $$3 = ezi.a($$1, $$1.h(this.al() + 1)).g(3.0);
         List<bva> $$4 = this.a(bva.class, $$3, $$0x -> $$0x != null && $$0x.bM() && this.h($$0x.dx()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dx();
         } else {
            if ($$1.v() == this.I_() - 1) {
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
      return this.ac().c(dex.P) <= 100;
   }

   private void as() {
      if (this.d()) {
         if (!this.o().U() || this.o().r()) {
            int $$0 = this.ac().c(dex.P);
            xi $$1;
            if (this.Q.a($$0)) {
               $$1 = xi.c("sleep.skipping_night");
            } else {
               $$1 = xi.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for (aro $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void e() {
      if (!this.I.isEmpty() && this.Q.a(this.I)) {
         this.as();
      }
   }

   public amb f() {
      return this.K.aJ();
   }

   private void at() {
      boolean $$0 = this.ae();
      if (this.D_().g()) {
         if (this.ac().b(dex.v)) {
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

         this.z = azk.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = azk.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new adl(adl.i, this.x), this.ag());
      }

      if (this.y != this.z) {
         this.K.ag().a(new adl(adl.j, this.z), this.ag());
      }

      if ($$0 != this.ae()) {
         if ($$0) {
            this.K.ag().a(new adl(adl.d, 0.0F));
         } else {
            this.K.ag().a(new adl(adl.c, 0.0F));
         }

         this.K.ag().a(new adl(adl.i, this.x));
         this.K.ag().a(new adl(adl.j, this.z));
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

   private void a(jh $$0, erj $$1) {
      dvj $$2 = this.a_($$0);
      erk $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void d(jh $$0, die $$1) {
      dvj $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bue $$0) {
      $$0.bA();
      bon $$1 = bom.a();
      $$0.ag++;
      $$1.a(() -> ly.f.b($$0.ar()).toString());
      $$1.f("tickNonPassenger");
      $$0.l();
      $$1.c();

      for (bue $$2 : $$0.da()) {
         this.a($$0, $$2);
      }
   }

   private void a(bue $$0, bue $$1) {
      if ($$1.dS() || $$1.dl() != $$0) {
         $$1.af();
      } else if ($$1 instanceof com || this.N.c($$1)) {
         $$1.bA();
         $$1.ag++;
         bon $$2 = bom.a();
         $$2.a(() -> ly.f.b($$1.ar()).toString());
         $$2.f("tickPassenger");
         $$1.u();
         $$2.c();

         for (bue $$3 : $$1.da()) {
            this.a($$1, $$3);
         }
      }
   }

   @Override
   public boolean a(com $$0, jh $$1) {
      return !this.K.a(this, $$1, $$0) && this.C_().a($$1);
   }

   public void a(@Nullable azr $$0, boolean $$1, boolean $$2) {
      arl $$3 = this.l();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xi.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xi.c("menu.savingChunks"));
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

      etk $$1 = this.l().k();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bue> List<? extends T> a(dzu<bue, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bue> void a(dzu<bue, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bue> void a(dzu<bue, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.G().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return axw.a.b;
            }
         }

         return axw.a.a;
      });
   }

   public List<? extends cjo> i() {
      return this.a(bul.F, bva::bM);
   }

   public List<aro> a(Predicate<? super aro> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<aro> a(Predicate<? super aro> $$0, int $$1) {
      List<aro> $$2 = Lists.newArrayList();

      for (aro $$3 : this.I) {
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
   public aro j() {
      List<aro> $$0 = this.a(bva::bM);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bue $$0) {
      return this.i($$0);
   }

   public boolean c(bue $$0) {
      return this.i($$0);
   }

   public void d(bue $$0) {
      if ($$0 instanceof aro $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(aro $$0) {
      this.c($$0);
   }

   public void b(aro $$0) {
      this.c($$0);
   }

   private void c(aro $$0) {
      bue $$1 = this.G().a($$0.cH());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cH());
         $$1.ap();
         this.a((aro)$$1, bue.c.b);
      }

      this.O.a($$0);
   }

   private boolean i(bue $$0) {
      if ($$0.dS()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bul.a($$0.ar()));
         return false;
      } else {
         return this.O.a($$0);
      }
   }

   public boolean e(bue $$0) {
      if ($$0.dc().map(bue::cH).anyMatch(this.O::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(dxp $$0) {
      $$0.H();
      $$0.b(this);
   }

   public void a(aro $$0, bue.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jh $$1, int $$2) {
      for (aro $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.dX() == this && $$3.as() != $$0) {
            double $$4 = (double)$$1.u() - $$3.dC();
            double $$5 = (double)$$1.v() - $$3.dE();
            double $$6 = (double)$$1.w() - $$3.dI();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.g.b(new ack($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable com $$0, double $$1, double $$2, double $$3, jq<awk> $$4, awm $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0, $$1, $$2, $$3, (double)$$4.a().a($$6), this.ag(), new agc($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable com $$0, bue $$1, jq<awk> $$2, awm $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0, $$1.dC(), $$1.dE(), $$1.dI(), (double)$$2.a().a($$4), this.ag(), new agb($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jh $$1, int $$2) {
      if (this.ac().b(dex.W)) {
         this.K.ag().a(new adr($$0, $$1, $$2, true));
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable com $$0, int $$1, jh $$2, int $$3) {
      this.K.ag().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ag(), new adr($$1, $$2, $$3, false));
   }

   public int k() {
      return this.D_().p();
   }

   @Override
   public void a(jq<eag> $$0, ezn $$1, eag.a $$2) {
      this.P.a($$0, $$1, $$2);
   }

   @Override
   public void a(jh $$0, dvj $$1, dvj $$2, int $$3) {
      if (this.X) {
         String $$4 = "recursive call to sendBlockUpdated";
         ae.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.l().a($$0);
      this.V.a($$0);
      fah $$5 = $$1.g(this, $$0);
      fah $$6 = $$2.g(this, $$0);
      if (fae.c($$5, $$6, ezr.g)) {
         List<cem> $$7 = new ObjectArrayList();

         for (bvc $$8 : this.W) {
            cem $$9 = $$8.P();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.X = true;

            for (cem $$10 : $$7) {
               $$10.j();
            }
         } finally {
            this.X = false;
         }
      }
   }

   @Override
   public void a(jh $$0, die $$1) {
      this.a($$0, $$1, eso.a(this, null, null));
   }

   @Override
   public void a(jh $$0, die $$1, @Nullable ess $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jh $$0, die $$1, jm $$2, @Nullable ess $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jh $$0, die $$1, @Nullable ess $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(dvj $$0, jh $$1, die $$2, @Nullable ess $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bue $$0, byte $$1) {
      this.l().a($$0, new adi($$0, $$1));
   }

   @Override
   public void a(bue $$0, bsu $$1) {
      this.l().a($$0, new ade($$0, $$1));
   }

   public arl l() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bue $$0,
      @Nullable bsu $$1,
      @Nullable deu $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dfb.a $$8,
      lp $$9,
      lp $$10,
      jq<awk> $$11
   ) {
      det.a $$12 = switch ($$8) {
         case a -> det.a.a;
         case b -> this.a(dex.Q);
         case c -> this.ac().b(dex.c) ? this.a(dex.R) : det.a.a;
         case d -> this.a(dex.S);
         case e -> det.a.d;
      };
      ezn $$13 = new ezn($$3, $$4, $$5);
      dfq $$14 = new dfq(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.h();
      lp $$15 = $$14.j() ? $$9 : $$10;

      for (aro $$16 : this.I) {
         if ($$16.f($$13) < 4096.0) {
            Optional<ezn> $$17 = Optional.ofNullable($$14.i().get($$16));
            $$16.g.b(new adj($$13, $$17, $$15, $$11));
         }
      }
   }

   private det.a a(dex.e<dex.a> $$0) {
      return this.ac().b($$0) ? det.a.c : det.a.b;
   }

   @Override
   public void a(jh $$0, die $$1, int $$2, int $$3) {
      this.Y.add(new def($$0, $$1, $$2, $$3));
   }

   private void au() {
      this.Z.clear();

      while (!this.Y.isEmpty()) {
         def $$0 = (def)this.Y.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ag(), new acm($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Z.add($$0);
         }
      }

      this.Y.addAll(this.Z);
   }

   private boolean a(def $$0) {
      dvj $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fbc<die> m() {
      return this.T;
   }

   public fbc<erj> n() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer o() {
      return this.K;
   }

   public esj p() {
      return this.S;
   }

   public eqa q() {
      return this.K.aY();
   }

   public <T extends lp> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      ads $$9 = new ads($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for (int $$11 = 0; $$11 < this.I.size(); $$11++) {
         aro $$12 = this.I.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            $$10++;
         }
      }

      return $$10;
   }

   public <T extends lp> boolean a(aro $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      zp<?> $$11 = new ads($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(aro $$0, boolean $$1, double $$2, double $$3, double $$4, zp<?> $$5) {
      if ($$0.dX() != this) {
         return false;
      } else {
         jh $$6 = $$0.dx();
         if ($$6.a(new ezn($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.g.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bue a(int $$0) {
      return this.G().a($$0);
   }

   @Deprecated
   @Nullable
   public bue b(int $$0) {
      bue $$1 = this.G().a($$0);
      return $$1 != null ? $$1 : (bue)this.ad.get($$0);
   }

   @Nullable
   public bue a(UUID $$0) {
      return this.G().a($$0);
   }

   @Nullable
   public jh a(axq<elx> $$0, jh $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<ju.c<elx>> $$4 = this.H_().e(lz.aS).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jh, jq<elx>> $$5 = this.l().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jh)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jh, jq<dgc>> a(Predicate<jq<dgc>> $$0, jh $$1, int $$2, int $$3, int $$4) {
      return this.l().g().d().a($$1, $$2, $$3, $$4, $$0, this.l().i().b(), this);
   }

   @Override
   public dat r() {
      return this.K.aI();
   }

   @Override
   public bsm s() {
      return this.K.aP();
   }

   @Override
   public boolean t() {
      return this.e;
   }

   public etk u() {
      return this.l().k();
   }

   @Nullable
   @Override
   public ete a(etc $$0) {
      return this.o().J().u().b(ete.a(), $$0.a());
   }

   @Override
   public void a(etc $$0, ete $$1) {
      this.o().J().u().a($$0.a(), $$1);
   }

   @Override
   public etc v() {
      return this.o().J().u().a(etd.a(), "idcounts").b();
   }

   public void a(jh $$0, float $$1) {
      jh $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.o().ag().a(new afi($$0, $$1));
      }

      if (this.M > 1) {
         this.l().b(art.a, new deh($$2), this.M, bap.a);
      }

      int $$4 = this.ac().c(dex.aa) + 1;
      if ($$4 > 1) {
         this.l().a(art.a, new deh($$0), $$4, bap.a);
      }

      this.M = $$4;
   }

   public LongSet w() {
      dew $$0 = this.u().b(dew.a(), "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.b()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      dew $$3 = this.u().a(dew.a(), "chunks");
      deh $$4 = new deh($$0, $$1);
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
   public List<aro> x() {
      return this.I;
   }

   @Override
   public void a(jh $$0, dvj $$1, dvj $$2) {
      Optional<jq<cgh>> $$3 = cgi.a($$1);
      Optional<jq<cgh>> $$4 = cgi.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jh $$5 = $$0.j();
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

   public cge y() {
      return this.l().l();
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
      return this.y().a($$0);
   }

   public cqc z() {
      return this.f;
   }

   @Nullable
   public cqa d(jh $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jh $$0) {
      return this.d($$0) != null;
   }

   public void a(cgb $$0, bue $$1, bvp $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aqt $$1 = this.l().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().b()));
         dfm.d $$3 = this.l().n();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<bvd> $$4 = (Entry<bvd>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bvd)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.O.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.s.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.m().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.n().a()));
         $$2.write("distance_manager: " + $$1.j().d() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.l().f()));
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

   private static void a(Writer $$0, Iterable<bue> $$1) throws IOException {
      ayk $$2 = ayk.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bue $$3 : $$1) {
         xi $$4 = $$3.ao();
         xi $$5 = $$3.S_();
         $$2.a($$3.dC(), $$3.dE(), $$3.dI(), $$3.cH(), ly.f.b($$3.ar()), $$3.bM(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      ayk $$1 = ayk.a().a("x").a("y").a("z").a("type").a($$0);

      for (dug $$2 : this.s) {
         jh $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(elp $$0) {
      this.Y.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(jh $$0, die $$1) {
      if (!this.ah()) {
         this.a($$0, $$1);
      }
   }

   @Override
   public float a(jm $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bue> A() {
      return this.G().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.L.e() + "]";
   }

   public boolean B() {
      return this.K.aZ().z();
   }

   @Override
   public long C() {
      return this.K.aZ().y().c();
   }

   @Nullable
   public dzi D() {
      return this.ac;
   }

   @Override
   public arn E() {
      return this;
   }

   @VisibleForTesting
   public String F() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.O.e(),
         a(this.O.d().a(), $$0 -> ly.f.b($$0.ar()).toString()),
         this.s.size(),
         a(this.s, dug::d),
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

   @Override
   protected dzw<bue> G() {
      return this.O.d();
   }

   public void a(Stream<bue> $$0) {
      this.O.a($$0);
   }

   public void b(Stream<bue> $$0) {
      this.O.b($$0);
   }

   public void b(dxp $$0) {
      $$0.d(this.A_().c());
   }

   public void a(dxf $$0) {
      this.K.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   public esc H() {
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
      return this.O.a($$0) && this.J.a.j().c(deh.a($$0));
   }

   public boolean g(jh $$0) {
      return this.O.a($$0);
   }

   public boolean a(deh $$0) {
      return this.O.a($$0);
   }

   @Override
   public crf J() {
      return this.K.aZ().K();
   }

   @Override
   public cxz K() {
      return this.K.bn();
   }

   @Override
   public dtj L() {
      return this.K.bo();
   }

   public azs a(ali $$0) {
      return this.ah.a($$0);
   }

   public bsi M() {
      return this.ah;
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.O.f()));
      return $$1;
   }

   @Override
   public int N() {
      return this.J.g().f();
   }

   final class a implements dzv<bue> {
      public void a(bue $$0) {
      }

      public void b(bue $$0) {
         arn.this.f().a($$0);
      }

      public void c(bue $$0) {
         arn.this.N.a($$0);
      }

      public void d(bue $$0) {
         arn.this.N.b($$0);
      }

      public void e(bue $$0) {
         arn.this.l().b($$0);
         if ($$0 instanceof aro $$1) {
            arn.this.I.add($$1);
            arn.this.e();
         }

         if ($$0 instanceof bvc $$2) {
            if (arn.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arn.this.W.add($$2);
         }

         if ($$0 instanceof cjo $$4) {
            for (cjl $$5 : $$4.gq()) {
               arn.this.ad.put($$5.as(), $$5);
            }
         }

         $$0.a(ead::a);
      }

      public void f(bue $$0) {
         arn.this.l().a($$0);
         if ($$0 instanceof aro $$1) {
            arn.this.I.remove($$1);
            arn.this.e();
         }

         if ($$0 instanceof bvc $$2) {
            if (arn.this.X) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ae.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            arn.this.W.remove($$2);
         }

         if ($$0 instanceof cjo $$4) {
            for (cjl $$5 : $$4.gq()) {
               arn.this.ad.remove($$5.as());
            }
         }

         $$0.a(ead::b);
      }

      public void g(bue $$0) {
         $$0.a(ead::c);
      }
   }
}
