import javax.annotation.Nullable;

public class bro extends bqy {
   public static final float i = 0.001F;
   protected final float j;

   public bro(bjp $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bro(bjp $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ehn h() {
      if (this.b.bb()) {
         ehn $$0 = btz.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ef().i() >= this.j ? btz.a(this.b, 10, 7) : super.h();
      }
   }
}
