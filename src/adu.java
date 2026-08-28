import javax.annotation.Nullable;

public class adu implements zb<abn> {
   public static final ys<vr, adu> a = zb.a(adu::a, adu::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final fc.a f;
   private final fc.a g;
   private final boolean h;

   public adu(fc.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public adu(fc.a $$0, bsg $$1, fc.a $$2) {
      this.f = $$0;
      this.e = $$1.am();
      this.g = $$2;
      ewf $$3 = $$2.a($$1);
      this.b = $$3.c;
      this.c = $$3.d;
      this.d = $$3.e;
      this.h = true;
   }

   private adu(vr $$0) {
      this.f = $$0.b(fc.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(fc.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vr $$0) {
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
   public zd<adu> a() {
      return afz.ag;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public fc.a b() {
      return this.f;
   }

   @Nullable
   public ewf a(dcf $$0) {
      if (this.h) {
         bsg $$1 = $$0.a(this.e);
         return $$1 == null ? new ewf(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new ewf(this.b, this.c, this.d);
      }
   }
}
