import com.google.common.annotations.VisibleForTesting;

public interface dvn {
   default axt a(id $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default axt a(ajv $$0) {
      return this.a($$0.toString());
   }

   axt a(String var1);

   axt a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
