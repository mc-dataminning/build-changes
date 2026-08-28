import javax.annotation.Nullable;

public class aec implements zf<abu> {
   public static final yw<vu, aec> a = zf.a(aec::a, aec::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final ev.a f;
   private final ev.a g;
   private final boolean h;

   public aec(ev.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public aec(ev.a $$0, bwi $$1, ev.a $$2) {
      this.f = $$0;
      this.e = $$1.ao();
      this.g = $$2;
      ffc $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private aec(vu $$0) {
      this.f = $$0.b(ev.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(ev.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(vu $$0) {
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
   public zh<aec> a() {
      return agn.ah;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public ev.a b() {
      return this.f;
   }

   @Nullable
   public ffc a(djm $$0) {
      if (this.h) {
         bwi $$1 = $$0.a(this.e);
         return $$1 == null ? new ffc(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new ffc(this.b, this.c, this.d);
      }
   }
}
