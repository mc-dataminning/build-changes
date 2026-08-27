import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class cfy extends cfg implements cey, cgm {
   private static final aii<Boolean> d = ail.a(cfy.class, aik.k);
   private static final int e = 40;
   private static final int bV = 1;
   private static final float bW = 0.6F;
   private static final int bX = 6;
   private static final float bY = 0.5F;
   private static final int bZ = 40;
   private static final int ca = 15;
   private static final int cb = 200;
   private static final float cc = 0.3F;
   private static final float cd = 0.4F;
   private int ce;
   protected static final ImmutableList<? extends bzh<? extends bzg<? super cfy>>> b = ImmutableList.of(bzh.c, bzh.d);
   protected static final ImmutableList<? extends bya<?>> c = ImmutableList.of(bya.g, bya.h, bya.k, bya.l, bya.n, bya.m, bya.E, bya.t, bya.o, bya.p);

   public cfy(bol<? extends cfy> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 5;
   }

   @Override
   protected bpy.b<cfy> dN() {
      return bpy.a(c, b);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      bpy<cfy> $$1 = this.dN().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cjn.a));
      $$1.b(cjn.b);
      $$1.f();
      return $$1;
   }

   private static void a(bpy<cfy> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new brv(45, 90), new brz()));
   }

   private static void b(bpy<cfy> $$0) {
      $$0.a(
         cjn.b,
         10,
         ImmutableList.of(
            btb.a(cfy::gn),
            bsp.a(8.0F, blw.a(30, 60)),
            new bsm(ImmutableList.of(Pair.of(bsh.a(0.4F), 2), Pair.of(bsw.a(0.4F, 3), 2), Pair.of(new bqz(30, 60), 1)))
         )
      );
   }

   private static void c(bpy<cfy> $$0) {
      $$0.a(cjn.k, 10, ImmutableList.of(bsu.a(1.0F), buc.a(cfy::w, brw.a(40)), buc.a(cfy::o_, brw.a(15)), bte.a()), bya.o);
   }

   private Optional<? extends box> gn() {
      return this.dM().c(bya.h).orElse(byc.a()).a(this::j);
   }

   private boolean j(box $$0) {
      bol<?> $$1 = $$0.ai();
      return $$1 != bol.br && $$1 != bol.w && bzg.c(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, false);
   }

   @Override
   public void a(aii<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.k_();
      }
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.n, 40.0).a(bqe.o, 0.3F).a(bqe.k, 0.6F).a(bqe.d, 1.0).a(bqe.c, 6.0);
   }

   public boolean w() {
      return !this.o_();
   }

   @Override
   public boolean B(bof $$0) {
      if (!($$0 instanceof box)) {
         return false;
      } else {
         this.ce = 10;
         this.dJ().a(this, (byte)4);
         this.b(atp.CB);
         return cgm.a(this, (box)$$0);
      }
   }

   @Override
   public boolean a(cia $$0) {
      return !this.fZ();
   }

   @Override
   protected void e(box $$0) {
      if (!this.o_()) {
         cgm.b(this, $$0);
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dJ().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof box) {
         box $$3 = (box)$$0.d();
         if (this.c($$3) && !bqr.a(this, $$3, 4.0)) {
            this.k($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void k(box $$0) {
      this.bA.b(bya.E);
      this.bA.a(bya.o, $$0, 200L);
   }

   @Override
   public bpy<cfy> dM() {
      return (bpy<cfy>)super.dM();
   }

   protected void A() {
      cjn $$0 = this.bA.g().orElse(null);
      this.bA.a(ImmutableList.of(cjn.k, cjn.b));
      cjn $$1 = this.bA.g().orElse(null);
      if ($$1 == cjn.k && $$0 != cjn.k) {
         this.gm();
      }

      this.v(this.bA.a(bya.o));
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("zoglinBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      this.A();
   }

   @Override
   public void a(boolean $$0) {
      this.an().b(d, $$0);
      if (!this.dJ().B && $$0) {
         this.f(bqe.c).a(0.5);
      }
   }

   @Override
   public boolean o_() {
      return this.an().b(d);
   }

   @Override
   public void d_() {
      if (this.ce > 0) {
         this.ce--;
      }

      super.d_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ce = 10;
         this.b(atp.CB);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gl() {
      return this.ce;
   }

   @Override
   protected ato y() {
      if (this.dJ().B) {
         return null;
      } else {
         return this.bA.a(bya.o) ? atp.CA : atp.Cz;
      }
   }

   @Override
   protected ato d(bne $$0) {
      return atp.CD;
   }

   @Override
   protected ato n_() {
      return atp.CC;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.CE, 0.15F, 1.0F);
   }

   protected void gm() {
      this.b(atp.CA);
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.o_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
