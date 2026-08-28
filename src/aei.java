import javax.annotation.Nullable;

public class aei implements zl<aca> {
   public static final zc<wb, aei> a = zl.a(aei::a, aei::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final fg.a f;
   private final fg.a g;
   private final boolean h;

   public aei(fg.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aei(fg.a $$0, btr $$1, fg.a $$2) {
      this.f = $$0;
      this.e = $$1.ap();
      this.g = $$2;
      eyw $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private aei(wb $$0) {
      this.f = $$0.b(fg.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(fg.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(wb $$0) {
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
   public zn<aei> a() {
      return agp.ah;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public fg.a b() {
      return this.f;
   }

   @Nullable
   public eyw a(dej $$0) {
      if (this.h) {
         btr $$1 = $$0.a(this.e);
         return $$1 == null ? new eyw(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new eyw(this.b, this.c, this.d);
      }
   }
}
