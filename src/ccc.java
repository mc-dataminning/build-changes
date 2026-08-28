import javax.annotation.Nullable;

public class ccc extends cbm {
   public static final float i = 0.001F;
   protected final float j;

   public ccc(bua $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public ccc(bua $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected evt h() {
      if (this.b.bh()) {
         evt $$0 = cep.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.el().i() >= this.j ? cep.a(this.b, 10, 7) : super.h();
      }
   }
}
