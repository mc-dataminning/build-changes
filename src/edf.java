import com.google.common.annotations.VisibleForTesting;

public interface edf {
   default azh a(ji $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default azh a(akv $$0) {
      return this.a($$0.toString());
   }

   azh a(String var1);

   azh a(long var1);

   azh a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
