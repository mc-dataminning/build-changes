import javax.annotation.Nullable;

public class ccu extends cce {
   public static final float i = 0.001F;
   protected final float j;

   public ccu(bus $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public ccu(bus $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected eys h() {
      if (this.b.bl()) {
         eys $$0 = cfh.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dV().i() >= this.j ? cfh.a(this.b, 10, 7) : super.h();
      }
   }
}
