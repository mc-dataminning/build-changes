import javax.annotation.Nullable;

public class fdg {
   private static final int a = 786432;
   private final fdb b;
   @Nullable
   private static fdg c;

   public static void a() {
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fdg();
      }
   }

   public static fdg b() {
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fdg(int $$0) {
      this.b = new fdb($$0);
   }

   public fdg() {
      this(786432);
   }

   public fcz a(fdj.c $$0, fdj $$1) {
      return new fcz(this.b, $$0, $$1);
   }

   public void c() {
      this.b.b();
   }
}
