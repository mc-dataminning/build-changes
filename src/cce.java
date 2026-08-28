import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cce extends ccn {
   private final cfr a;
   @Nullable
   private btp b;
   private final ceg c = ceg.a().a(64.0);

   public cce(cfr $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(can.a.d));
   }

   @Override
   public boolean a() {
      evm $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends btp> $$1 = this.a.dP().a(cmk.class, this.c, this.a, $$0);
      List<cmx> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (btp $$3 : $$1) {
         cmk $$4 = (cmk)$$3;

         for (cmx $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmx) || !this.b.N_() && !((cmx)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
