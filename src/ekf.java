import javax.annotation.Nullable;

public interface ekf extends ekk {
   @Nullable
   dra a(je var1);

   int b(ib var1);

   public static enum a implements ekf {
      a;

      @Nullable
      @Override
      public dra a(je $$0) {
         return null;
      }

      @Override
      public int b(ib $$0) {
         return 0;
      }

      @Override
      public void a(ib $$0) {
      }

      @Override
      public boolean K_() {
         return false;
      }

      @Override
      public int a() {
         return 0;
      }

      @Override
      public void a(je $$0, boolean $$1) {
      }

      @Override
      public void a(cye $$0, boolean $$1) {
      }

      @Override
      public void b(cye $$0) {
      }
   }
}
