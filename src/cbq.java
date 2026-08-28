import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbq extends cbz {
   private final cfd a;
   @Nullable
   private btb b;
   private final cds c = cds.a().a(64.0);

   public cbq(cfd $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bzz.a.d));
   }

   @Override
   public boolean a() {
      ewa $$0 = this.a.cL().c(10.0, 8.0, 10.0);
      List<? extends btb> $$1 = this.a.dQ().a(clx.class, this.c, this.a, $$0);
      List<cmk> $$2 = this.a.dQ().a(this.c, this.a, $$0);

      for (btb $$3 : $$1) {
         clx $$4 = (clx)$$3;

         for (cmk $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cmk) || !this.b.N_() && !((cmk)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
