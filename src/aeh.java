import javax.annotation.Nullable;

public class aeh implements zk<abz> {
   public static final zb<wa, aeh> a = zk.a(aeh::a, aeh::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final ff.a f;
   private final ff.a g;
   private final boolean h;

   public aeh(ff.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aeh(ff.a $$0, btj $$1, ff.a $$2) {
      this.f = $$0;
      this.e = $$1.ap();
      this.g = $$2;
      eye $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private aeh(wa $$0) {
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

   private void a(wa $$0) {
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
   public zm<aeh> a() {
      return ago.ah;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public ff.a b() {
      return this.f;
   }

   @Nullable
   public eye a(dds $$0) {
      if (this.h) {
         btj $$1 = $$0.a(this.e);
         return $$1 == null ? new eye(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new eye(this.b, this.c, this.d);
      }
   }
}
