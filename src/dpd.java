import com.google.common.annotations.VisibleForTesting;

public interface dpd {
   default auv a(hx $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   default auv a(ahg $$0) {
      return this.a($$0.toString());
   }

   auv a(String var1);

   auv a(int var1, int var2, int var3);

   @VisibleForTesting
   void a(StringBuilder var1);
}
