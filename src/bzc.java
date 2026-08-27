import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bzc extends bzl {
   private final ccp a;
   @Nullable
   private bqo b;
   private final cbe c = cbe.a().a(64.0);

   public bzc(ccp $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bxl.a.d));
   }

   @Override
   public boolean a() {
      erv $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bqo> $$1 = this.a.dM().a(cjg.class, this.c, this.a, $$0);
      List<cjt> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (bqo $$3 : $$1) {
         cjg $$4 = (cjg)$$3;

         for (cjt $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cjt) || !this.b.N_() && !((cjt)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
