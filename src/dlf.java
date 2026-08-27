import com.google.common.annotations.VisibleForTesting;

public interface dlf {
   default asc a(gw $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default asc a(aex $$0) {
      return this.a($$0.toString());
   }

   asc a(String var1);

   asc a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
