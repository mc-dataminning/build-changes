import javax.annotation.Nullable;

public class cfa extends cek {
   public static final float i = 0.001F;
   protected final float j;

   public cfa(bwz $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public cfa(bwz $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected fcu h() {
      if (this.b.bj()) {
         fcu $$0 = chn.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dY().i() >= this.j ? chn.a(this.b, 10, 7) : super.h();
      }
   }
}
