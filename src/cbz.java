import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbz extends cci {
   private final cfm a;
   @Nullable
   private btk b;
   private final ceb c = ceb.a().a(64.0);

   public cbz(cfm $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(cai.a.d));
   }

   @Override
   public boolean a() {
      evh $$0 = this.a.cK().c(10.0, 8.0, 10.0);
      List<? extends btk> $$1 = this.a.dP().a(cmf.class, this.c, this.a, $$0);
      List<cms> $$2 = this.a.dP().a(this.c, this.a, $$0);

      for (btk $$3 : $$1) {
         cmf $$4 = (cmf)$$3;

         for (cms $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cms) || !this.b.N_() && !((cms)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
