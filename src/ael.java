import javax.annotation.Nullable;

public class ael implements zo<acd> {
   public static final zf<we, ael> a = zo.a(ael::a, ael::new);
   private final double b;
   private final double c;
   private final double d;
   private final int e;
   private final fh.a f;
   private final fh.a g;
   private final boolean h;

   public ael(fh.a $$0, double $$1, double $$2, double $$3) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = 0;
      this.h = false;
      this.g = null;
   }

   public ael(fh.a $$0, btz $$1, fh.a $$2) {
      this.f = $$0;
      this.e = $$1.ar();
      this.g = $$2;
      ezh $$3 = $$2.a($$1);
      this.b = $$3.d;
      this.c = $$3.e;
      this.d = $$3.f;
      this.h = true;
   }

   private ael(we $$0) {
      this.f = $$0.b(fh.a.class);
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.h = $$0.readBoolean();
      if (this.h) {
         this.e = $$0.l();
         this.g = $$0.b(fh.a.class);
      } else {
         this.e = 0;
         this.g = null;
      }
   }

   private void a(we $$0) {
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
   public zq<ael> a() {
      return ags.ah;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public fh.a b() {
      return this.f;
   }

   @Nullable
   public ezh a(dev $$0) {
      if (this.h) {
         btz $$1 = $$0.a(this.e);
         return $$1 == null ? new ezh(this.b, this.c, this.d) : this.g.a($$1);
      } else {
         return new ezh(this.b, this.c, this.d);
      }
   }
}
