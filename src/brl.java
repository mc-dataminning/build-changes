import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class brl extends bru {
   private final buw a;
   @Nullable
   private biy b;
   private final btl c = btl.a().a(64.0);

   public brl(buw $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bpu.a.d));
   }

   @Override
   public boolean a() {
      egz $$0 = this.a.cG().c(10.0, 8.0, 10.0);
      List<? extends biy> $$1 = this.a.dK().a(cba.class, this.c, this.a, $$0);
      List<cbn> $$2 = this.a.dK().a(this.c, this.a, $$0);

      for (biy $$3 : $$1) {
         cba $$4 = (cba)$$3;

         for (cbn $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cbn) || !this.b.G_() && !((cbn)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
