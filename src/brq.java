import javax.annotation.Nullable;

public class brq extends bra {
   public static final float i = 0.001F;
   protected final float j;

   public brq(bjr $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public brq(bjr $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ehp h() {
      if (this.b.ba()) {
         ehp $$0 = bub.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ef().i() >= this.j ? bub.a(this.b, 10, 7) : super.h();
      }
   }
}
