import com.google.common.annotations.VisibleForTesting;

public interface eic {
   default bai a(iw $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default bai a(alr $$0) {
      return this.a($$0.toString());
   }

   bai a(String var1);

   bai a(long var1);

   bai a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
