import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbn extends cbw {
   private final cfa a;
   @Nullable
   private bsy b;
   private final cdp c = cdp.a().a(64.0);

   public cbn(cfa $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bzw.a.d));
   }

   @Override
   public boolean a() {
      evu $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends bsy> $$1 = this.a.dP().a(clu.class, this.c, this.a, $$0);
      List<cmh> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (bsy $$3 : $$1) {
         clu $$4 = (clu)$$3;

         for (cmh $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmh) || !this.b.N_() && !((cmh)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
