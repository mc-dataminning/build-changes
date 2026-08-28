import javax.annotation.Nullable;

public class aen implements zo<acf> {
   public static final ze<vy, aen> a = zo.a(aen::a, aen::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final ew.a f;
   private final ew.a g;
   private final boolean h;

   public aen(ew.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aen(ew.a $$0, bxe $$1, ew.a $$2) {
      this.f = $$0;
      this.e = $$1.ao();
      this.g = $$2;
      fgc $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private aen(vy $$0) {
      this.f = $$0.b(ew.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(ew.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vy $$0) {
      $$0.a(this.f);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.h);
      if (this.h) {
         $$0.c(this.e);
         $$0.a(this.g);
      }
   }

   @Override
   public zq<aen> a() {
      return agy.ah;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public ew.a b() {
      return this.f;
   }

   @Nullable
   public fgc a(dkj $$0) {
      if (this.h) {
         bxe $$1 = $$0.a(this.e);
         return $$1 == null ? new fgc(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new fgc(this.b, this.c, this.d);
      }
   }
}
