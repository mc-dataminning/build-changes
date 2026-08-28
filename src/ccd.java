import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ccd extends ccm {
   private final cfq a;
   @Nullable
   private bto b;
   private final cef c = cef.a().a(64.0);

   public ccd(cfq $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cam.a.d));
   }

   @Override
   public boolean a() {
      evl $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends bto> $$1 = this.a.dP().a(cmj.class, this.c, this.a, $$0);
      List<cmw> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (bto $$3 : $$1) {
         cmj $$4 = (cmj)$$3;

         for (cmw $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmw) || !this.b.N_() && !((cmw)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
