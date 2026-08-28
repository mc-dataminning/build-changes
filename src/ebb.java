import com.google.common.annotations.VisibleForTesting;

public interface ebb {
   default azn a(jf $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default azn a(ale $$0) {
      return this.a($$0.toString());
   }

   azn a(String var1);

   azn a(long var1);

   azn a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
