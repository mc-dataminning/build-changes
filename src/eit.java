import java.util.Arrays;

public class eit {
   private final char[] a;
   private int b;
   private final Runnable c;

   public eit(char[] $$0, Runnable $$1) {
      this.c = $$1;
      if ($$0.length < 1) {
         throw new IllegalArgumentException("Must have at least one char");
      } else {
         this.a = $$0;
      }
   }

   public eit(char[] $$0) {
      this($$0, () -> {
      });
   }

   public boolean a(char $$0) {
      if ($$0 == this.a[this.b++]) {
         if (this.b == this.a.length) {
            this.a();
            this.c.run();
            return true;
         }
      } else {
         this.a();
      }

      return false;
   }

   public void a() {
      this.b = 0;
   }

   @Override
   public String toString() {
      return "KeyCombo{chars=" + Arrays.toString(this.a) + ", matchIndex=" + this.b + "}";
   }
}
