import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccg extends ccp {
   private final cft a;
   @Nullable
   private btr b;
   private final cei c = cei.a().a(64.0);

   public ccg(cft $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cap.a.d));
   }

   @Override
   public boolean a() {
      evo $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends btr> $$1 = this.a.dP().a(cmm.class, this.c, this.a, $$0);
      List<cmz> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (btr $$3 : $$1) {
         cmm $$4 = (cmm)$$3;

         for (cmz $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmz) || !this.b.N_() && !((cmz)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
