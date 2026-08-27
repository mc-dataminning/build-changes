import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bom extends bov {
   private final brx a;
   @Nullable
   private bfz b;
   private final bqm c = bqm.a().a(64.0);

   public bom(brx $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(bmv.a.d));
   }

   @Override
   public boolean a() {
      eed $$0 = this.a.cE().c(10.0, 8.0, 10.0);
      List<? extends bfz> $$1 = this.a.dI().a(byb.class, this.c, this.a, $$0);
      List<byo> $$2 = this.a.dI().a(this.c, this.a, $$0);

      for (bfz $$3 : $$1) {
         byb $$4 = (byb)$$3;

         for (byo $$5 : $$2) {
            int $$6 = $$4.g($$5);
            if ($$6 <= -100) {
               this.b = $$5;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof byo) || !this.b.G_() && !((byo)this.b).f();
   }

   @Override
   public void c() {
      this.a.h(this.b);
      super.c();
   }
}
