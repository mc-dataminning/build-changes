import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bui extends bur {
   private final bxu a;
   @Nullable
   private blv b;
   private final bwj c = bwj.a().a(64.0);

   public bui(bxu $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bsr.a.d));
   }

   @Override
   public boolean a() {
      ekw $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends blv> $$1 = this.a.dM().a(cee.class, this.c, this.a, $$0);
      List<cer> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (blv $$3 : $$1) {
         cee $$4 = (cee)$$3;

         for (cer $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cer) || !this.b.P_() && !((cer)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
