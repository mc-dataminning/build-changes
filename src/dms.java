import com.google.common.annotations.VisibleForTesting;

public interface dms {
   default ato a(ht $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default ato a(agg $$0) {
      return this.a($$0.toString());
   }

   ato a(String var1);

   ato a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
