import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class byc extends byl {
   private final cbp a;
   @Nullable
   private bpo b;
   private final cae c = cae.a().a(64.0);

   public byc(cbp $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bwl.a.d));
   }

   @Override
   public boolean a() {
      epm $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bpo> $$1 = this.a.dM().a(cif.class, this.c, this.a, $$0);
      List<cis> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (bpo $$3 : $$1) {
         cif $$4 = (cif)$$3;

         for (cis $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cis) || !this.b.N_() && !((cis)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
