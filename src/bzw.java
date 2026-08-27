import javax.annotation.Nullable;

public class bzw extends cai {
   private static final int i = 10;
   private static final int j = 7;

   public bzw(bsw $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      aqt $$0 = (aqt)this.b.dU();
      ir $$1 = this.b.du();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected ewu h() {
      aqt $$0 = (aqt)this.b.dU();
      ir $$1 = this.b.du();
      jt $$2 = jt.a($$1);
      jt $$3 = bui.a($$0, $$2, 2);
      return $$3 != $$2 ? cdi.a(this.b, 10, 7, ewu.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
