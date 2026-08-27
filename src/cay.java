import javax.annotation.Nullable;

public class cay extends cai {
   public static final float i = 0.001F;
   protected final float j;

   public cay(bsw $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cay(bsw $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ewu h() {
      if (this.b.bl()) {
         ewu $$0 = cdl.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.et().i() >= this.j ? cdl.a(this.b, 10, 7) : super.h();
      }
   }
}
