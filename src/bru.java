import javax.annotation.Nullable;

public class bru extends bre {
   public static final float i = 0.001F;
   protected final float j;

   public bru(bjv $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bru(bjv $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected ehh h() {
      if (this.b.ba()) {
         ehh $$0 = buf.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ef().i() >= this.j ? buf.a(this.b, 10, 7) : super.h();
      }
   }
}
