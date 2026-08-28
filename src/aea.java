import javax.annotation.Nullable;

public class aea implements zf<abt> {
   public static final yw<vv, aea> a = zf.a(aea::a, aea::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final ff.a f;
   private final ff.a g;
   private final boolean h;

   public aea(ff.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aea(ff.a $$0, bsq $$1, ff.a $$2) {
      this.f = $$0;
      this.e = $$1.an();
      this.g = $$2;
      eww $$3 = $$2.a($$1);
      this.b = $$3.c;
      this.c = $$3.d;
      this.d = $$3.e;
      this.h = true;
   }

   private aea(vv $$0) {
      this.f = $$0.b(ff.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(ff.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vv $$0) {
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
   public zh<aea> a() {
      return agf.ag;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public ff.a b() {
      return this.f;
   }

   @Nullable
   public eww a(dcu $$0) {
      if (this.h) {
         bsq $$1 = $$0.a(this.e);
         return $$1 == null ? new eww(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new eww(this.b, this.c, this.d);
      }
   }
}
