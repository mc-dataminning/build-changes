import javax.annotation.Nullable;

public class aea implements zd<abs> {
   public static final yu<vs, aea> a = zd.a(aea::a, aea::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final eu.a f;
   private final eu.a g;
   private final boolean h;

   public aea(eu.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aea(eu.a $$0, bwa $$1, eu.a $$2) {
      this.f = $$0;
      this.e = $$1.ar();
      this.g = $$2;
      fdw $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private aea(vs $$0) {
      this.f = $$0.b(eu.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(eu.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vs $$0) {
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
   public zf<aea> a() {
      return agl.ah;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public eu.a b() {
      return this.f;
   }

   @Nullable
   public fdw a(dip $$0) {
      if (this.h) {
         bwa $$1 = $$0.a(this.e);
         return $$1 == null ? new fdw(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new fdw(this.b, this.c, this.d);
      }
   }
}
