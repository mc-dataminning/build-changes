import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class ckv extends bye implements crj, egp {
   private static final kb e = new kb(1, 1, 1);
   private static final int bI = 5;
   private static final float bJ = 55.0F;
   private static final float bK = 15.0F;
   private static final int bL = 0;
   private static final int bM = 6000;
   private static final int bN = 3;
   public static final int a = 1024;
   private static final akn<Boolean> bO = akr.a(ckv.class, akp.k);
   private static final akn<Boolean> bP = akr.a(ckv.class, akp.k);
   protected static final ImmutableList<cif<? extends cie<? super ckv>>> b = ImmutableList.of(cif.c, cif.d, cif.f, cif.b);
   protected static final ImmutableList<cgy<?>> c = ImmutableList.of(
      cgy.u, cgy.o, cgy.h, cgy.n, cgy.F, cgy.y, cgy.M, cgy.aN, cgy.aO, cgy.aP, cgy.aQ, cgy.aa, new cgy[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final egd<egp.b> bQ;
   private egp.a bR;
   private final egp.d bS;
   private final egd<ckv.a> bT;
   private final bva bU = new bva(1);
   @Nullable
   private iw bV;
   private long bW = 0L;
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private float cb;

   public ckv(bxe<? extends ckv> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new cds(this, 20, true);
      this.a_(this.fN());
      this.bS = new ckv.b();
      this.bR = new egp.a();
      this.bQ = new egd<>(new egp.b(this));
      this.bT = new egd<>(new ckv.a(this.bS.b(), egg.E.a().a()));
   }

   @Override
   protected byw.b<ckv> ed() {
      return byw.a(c, b);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return ckw.a(this.ed().a($$0));
   }

   @Override
   public byw<ckv> ec() {
      return (byw<ckv>)super.ec();
   }

   public static bzb.a j() {
      return bxy.E().a(bzc.s, 20.0).a(bzc.l, 0.1F).a(bzc.v, 0.1F).a(bzc.c, 2.0);
   }

   @Override
   protected chg b(djz $$0) {
      che $$1 = new che(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bO, false);
      $$0.a(bP, true);
   }

   @Override
   public void a_(ffs $$0) {
      if (this.bi()) {
         this.a(0.02F, $$0);
         this.a(bya.a, this.dy());
         this.i(this.dy().c(0.8F));
      } else if (this.bv()) {
         this.a(0.02F, $$0);
         this.a(bya.a, this.dy());
         this.i(this.dy().c(0.5));
      } else {
         this.a(this.fo(), $$0);
         this.a(bya.a, this.dy());
         this.i(this.dy().c(0.91F));
      }
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      return this.b($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean t(bwv $$0) {
      return this.b($$0) || super.t($$0);
   }

   private boolean b(@Nullable bwv $$0) {
      if (!($$0 instanceof crz $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.ec().c(cgy.aN);
         return $$2.isPresent() && $$1.cG().equals($$2.get());
      }
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, ebg $$2, iw $$3) {
   }

   @Override
   protected awq u() {
      return this.d(bxf.a) ? awr.a : awr.b;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.d;
   }

   @Override
   protected awq l_() {
      return awr.c;
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("allayBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      ckw.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C && this.bJ() && this.af % 10 == 0) {
         this.c(1.0F);
      }

      if (this.q() && this.gw() && this.af % 20 == 0) {
         this.w(false);
         this.bV = null;
      }

      this.gx();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.bY = this.bX;
         if (this.m()) {
            this.bX = azq.a(this.bX + 1.0F, 0.0F, 5.0F);
         } else {
            this.bX = azq.a(this.bX - 1.0F, 0.0F, 5.0F);
         }

         if (this.q()) {
            this.bZ++;
            this.cb = this.ca;
            if (this.t()) {
               this.ca++;
            } else {
               this.ca--;
            }

            this.ca = azq.a(this.ca, 0.0F, 15.0F);
         } else {
            this.bZ = 0.0F;
            this.ca = 0.0F;
            this.cb = 0.0F;
         }
      } else {
         egp.c.a(this.dV(), this.bR, this.bS);
         if (this.gr()) {
            this.w(false);
         }
      }
   }

   @Override
   public boolean fN() {
      return !this.gv() && this.m();
   }

   public boolean m() {
      return !this.b(bus.a).f();
   }

   @Override
   protected boolean f(bxf $$0) {
      return false;
   }

   private boolean gv() {
      return this.ec().a(cgy.aQ, cgz.a);
   }

   @Override
   protected but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      daa $$3 = this.b(bus.a);
      if (this.q() && $$2.a(axo.X) && this.gA()) {
         this.gy();
         this.dV().a(this, (byte)18);
         this.dV().a($$0, this, awr.E, aws.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return but.a;
      } else if ($$3.f() && !$$2.f()) {
         daa $$4 = $$2.c(1);
         this.a(bus.a, $$4);
         this.a($$0, $$2);
         this.dV().a($$0, this, awr.e, aws.g, 2.0F, 1.0F);
         this.ec().a(cgy.aN, $$0.cG());
         return but.a;
      } else if (!$$3.f() && $$1 == bus.a && $$2.f()) {
         this.a(bxf.a, daa.k);
         this.dV().a($$0, this, awr.f, aws.g, 2.0F, 1.0F);
         this.a(bus.a);

         for (daa $$5 : this.n().f()) {
            bzp.a(this, $$5, this.dt());
         }

         this.ec().b(cgy.aN);
         $$0.h($$3);
         return but.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(iw $$0, boolean $$1) {
      if ($$1) {
         if (!this.q()) {
            this.bV = $$0;
            this.w(true);
         }
      } else if ($$0.equals(this.bV) || this.bV == null) {
         this.bV = null;
         this.w(false);
      }
   }

   @Override
   public bva n() {
      return this.bU;
   }

   @Override
   protected kb X() {
      return e;
   }

   @Override
   public boolean c(aru $$0, daa $$1) {
      daa $$2 = this.b(bus.a);
      return !$$2.f() && $$0.O().c(djv.d) && this.bU.c($$1) && this.c($$2, $$1);
   }

   private boolean c(daa $$0, daa $$1) {
      return daa.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(daa $$0, daa $$1) {
      dbw $$2 = $$0.a(kl.R);
      dbw $$3 = $$1.a(kl.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(aru $$0, coe $$1) {
      crj.a($$0, this, this, $$1);
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Override
   public boolean aZ() {
      return !this.aH();
   }

   @Override
   public void a(BiConsumer<egd<?>, aru> $$0) {
      if (this.dV() instanceof aru $$1) {
         $$0.accept(this.bQ, $$1);
         $$0.accept(this.bT, $$1);
      }
   }

   public boolean q() {
      return this.al.a(bO);
   }

   public void w(boolean $$0) {
      if (!this.dV().C && this.dj() && (!$$0 || !this.gr())) {
         this.al.a(bO, $$0);
      }
   }

   private boolean gw() {
      return this.bV == null || !this.bV.a(this.dt(), (double)egg.E.a().a()) || !this.dV().a_(this.bV).a(dng.ek);
   }

   public float J(float $$0) {
      return azq.h($$0, this.bY, this.bX) / 5.0F;
   }

   public boolean t() {
      float $$0 = this.bZ % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return azq.h($$0, this.cb, this.ca) / 15.0F;
   }

   @Override
   public boolean a(daa $$0, daa $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(aru $$0) {
      super.f($$0);
      this.bU.f().forEach($$1x -> this.a($$0, $$1x));
      daa $$1 = this.a(bxf.a);
      if (!$$1.f() && !dgp.a($$1, dgo.D)) {
         this.a($$0, $$1);
         this.a(bxf.a, daa.k);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.b($$0, this.dX());
      ali<va> $$1 = this.dX().a(uo.a);
      $$0.a("listener", egp.a.a, $$1, this.bR);
      $$0.a("DuplicationCooldown", this.bW);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0, this.dX());
      ali<va> $$1 = this.dX().a(uo.a);
      this.bR = $$0.<egp.a>a("listener", egp.a.a, $$1).orElseGet(egp.a::new);
      this.a((long)$$0.b("DuplicationCooldown", 0));
   }

   @Override
   protected boolean gs() {
      return false;
   }

   private void gx() {
      if (!this.dV().A_() && this.bW > 0L) {
         this.a(this.bW - 1L);
      }
   }

   private void a(long $$0) {
      this.bW = $$0;
      this.al.a(bP, $$0 == 0L);
   }

   private void gy() {
      ckv $$0 = bxe.d.a(this.dV(), bxd.e);
      if ($$0 != null) {
         $$0.f(this.dt());
         $$0.gc();
         $$0.gz();
         this.gz();
         this.dV().b($$0);
      }
   }

   private void gz() {
      this.a(6000L);
   }

   private boolean gA() {
      return this.al.a(bP);
   }

   private void a(crz $$0, daa $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)this.cS() * 0.6, (double)this.dq() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gB();
         }
      } else {
         super.b($$0);
      }
   }

   private void gB() {
      double $$0 = this.ae.k() * 0.02;
      double $$1 = this.ae.k() * 0.02;
      double $$2 = this.ae.k() * 0.02;
      this.dV().a(lz.S, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public egp.a x() {
      return this.bR;
   }

   @Override
   public egp.d gu() {
      return this.bS;
   }

   class a implements egi {
      private final egk b;
      private final int c;

      public a(final egk $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public egk a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aru $$0, jg<egg> $$1, egg.a $$2, ffs $$3) {
         if ($$1.a(egg.E)) {
            ckv.this.b(iw.a((jq)$$3), true);
            return true;
         } else if ($$1.a(egg.F)) {
            ckv.this.b(iw.a((jq)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements egp.d {
      private static final int b = 16;
      private final egk c = new ege(ckv.this, ckv.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public egk b() {
         return this.c;
      }

      @Override
      public boolean a(aru $$0, iw $$1, jg<egg> $$2, egg.a $$3) {
         if (ckv.this.gj()) {
            return false;
         } else {
            Optional<jf> $$4 = ckv.this.ec().c(cgy.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jf $$5 = $$4.get();
               return $$5.a($$0.aj(), ckv.this.dv(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aru $$0, iw $$1, jg<egg> $$2, @Nullable bwv $$3, @Nullable bwv $$4, float $$5) {
         if ($$2.a(egg.H)) {
            ckw.a(ckv.this, new iw($$1));
         }
      }

      @Override
      public axv<egg> c() {
         return axm.e;
      }
   }
}
