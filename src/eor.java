import javax.annotation.Nullable;

public interface eor extends eow {
   @Nullable
   dvd a(jt var1);

   int b(ir var1);

   public static record a(int c) implements eor {
      public static final eor.a a = new eor.a(0);
      public static final eor.a b = new eor.a(15);

      @Nullable
      @Override
      public dvd a(jt $$0) {
         return null;
      }

      @Override
      public int b(ir $$0) {
         return this.c;
      }

      @Override
      public void a(ir $$0) {
      }

      @Override
      public boolean L_() {
         return false;
      }

      @Override
      public int a() {
         return 0;
      }

      @Override
      public void a(jt $$0, boolean $$1) {
      }

      @Override
      public void a(dbh $$0, boolean $$1) {
      }

      @Override
      public void b(dbh $$0) {
      }
   }
}
