import com.google.common.annotations.VisibleForTesting;

public interface dlx {
   default ate a(ht $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default ate a(afw $$0) {
      return this.a($$0.toString());
   }

   ate a(String var1);

   ate a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
