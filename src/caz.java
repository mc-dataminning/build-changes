import javax.annotation.Nullable;

public class caz extends caj {
   public static final float i = 0.001F;
   protected final float j;

   public caz(bsx $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public caz(bsx $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected euk h() {
      if (this.b.bh()) {
         euk $$0 = cdm.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.el().i() >= this.j ? cdm.a(this.b, 10, 7) : super.h();
      }
   }
}
