import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bzh extends bzq {
   private final ccu a;
   @Nullable
   private bqt b;
   private final cbj c = cbj.a().a(64.0);

   public bzh(ccu $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bxq.a.d));
   }

   @Override
   public boolean a() {
      ese $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bqt> $$1 = this.a.dM().a(cjn.class, this.c, this.a, $$0);
      List<cka> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (bqt $$3 : $$1) {
         cjn $$4 = (cjn)$$3;

         for (cka $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cka) || !this.b.N_() && !((cka)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
