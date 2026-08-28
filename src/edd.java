import com.google.common.annotations.VisibleForTesting;

public interface edd {
   default azg a(ji $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default azg a(aku $$0) {
      return this.a($$0.toString());
   }

   azg a(String var1);

   azg a(long var1);

   azg a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
