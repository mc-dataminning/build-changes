import java.util.EnumSet;

public class brp extends brs {
   private final bjs a;
   private biw b;
   private int c;

   public brp(bjs $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bps.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.p() && !this.a.fZ()) {
         biw $$0 = this.a.I_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ef();
            int $$1 = $$0.eg();
            return $$1 != this.c && this.a(this.b, btj.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      biw $$0 = this.a.I_();
      if ($$0 != null) {
         this.c = $$0.eg();
      }

      super.c();
   }
}
