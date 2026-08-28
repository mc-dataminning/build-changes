import javax.annotation.Nullable;

public class aeg implements zj<aby> {
   public static final za<vy, aeg> a = zj.a(aeg::a, aeg::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final ew.a f;
   private final ew.a g;
   private final boolean h;

   public aeg(ew.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aeg(ew.a $$0, bwv $$1, ew.a $$2) {
      this.f = $$0;
      this.e = $$1.ao();
      this.g = $$2;
      ffs $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private aeg(vy $$0) {
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
   public zl<aeg> a() {
      return agr.ah;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public ew.a b() {
      return this.f;
   }

   @Nullable
   public ffs a(djz $$0) {
      if (this.h) {
         bwv $$1 = $$0.a(this.e);
         return $$1 == null ? new ffs(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new ffs(this.b, this.c, this.d);
      }
   }
}
