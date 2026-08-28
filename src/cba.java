import javax.annotation.Nullable;

public class cba extends cbm {
   private static final int i = 10;
   private static final int j = 7;

   public cba(bua $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      arf $$0 = (arf)this.b.dP();
      iz $$1 = this.b.dp();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected evt h() {
      arf $$0 = (arf)this.b.dP();
      iz $$1 = this.b.dp();
      kb $$2 = kb.a($$1);
      kb $$3 = bvm.a($$0, $$2, 2);
      return $$3 != $$2 ? cem.a(this.b, 10, 7, evt.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
