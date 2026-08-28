import javax.annotation.Nullable;

public class dcw extends dcy {
   private final iu b;
   protected boolean a = true;

   public dcw(crc $$0, buc $$1, czd $$2, fem $$3) {
      this($$0.dV(), $$0, $$1, $$2, $$3);
   }

   public dcw(dcy $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected dcw(dja $$0, @Nullable crc $$1, buc $$2, czd $$3, fem $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static dcw a(dcw $$0, iu $$1, ja $$2) {
      return new dcw(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new fem(
            new feq((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5),
            $$2,
            $$1,
            false
         )
      );
   }

   @Override
   public iu a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public ja d() {
      return ja.a(this.o())[0];
   }

   public ja e() {
      return ja.a(this.o(), ja.a.b);
   }

   public ja[] f() {
      ja[] $$0 = ja.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         ja $$1 = this.k();
         int $$2 = 0;

         while ($$2 < $$0.length && $$0[$$2] != $$1.g()) {
            $$2++;
         }

         if ($$2 > 0) {
            System.arraycopy($$0, 0, $$0, 1, $$2);
            $$0[0] = $$1.g();
         }

         return $$0;
      }
   }
}
