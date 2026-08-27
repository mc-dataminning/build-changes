import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class buy extends bvh {
   private final byk a;
   @Nullable
   private bml b;
   private final bwz c = bwz.a().a(64.0);

   public buy(byk $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bth.a.d));
   }

   @Override
   public boolean a() {
      elo $$0 = this.a.cH().c(10.0, 8.0, 10.0);
      List<? extends bml> $$1 = this.a.dM().a(cev.class, this.c, this.a, $$0);
      List<cfi> $$2 = this.a.dM().a(this.c, this.a, $$0);

      for (bml $$3 : $$1) {
         cev $$4 = (cev)$$3;

         for (cfi $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cfi) || !this.b.P_() && !((cfi)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
