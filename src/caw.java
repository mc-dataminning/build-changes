import javax.annotation.Nullable;

public class caw extends cbi {
   private static final int i = 10;
   private static final int j = 7;

   public caw(btw $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean a() {
      are $$0 = (are)this.b.dP();
      iz $$1 = this.b.dp();
      return $$0.c($$1) ? false : super.a();
   }

   @Nullable
   @Override
   protected evp h() {
      are $$0 = (are)this.b.dP();
      iz $$1 = this.b.dp();
      kb $$2 = kb.a($$1);
      kb $$3 = bvi.a($$0, $$2, 2);
      return $$3 != $$2 ? cei.a(this.b, 10, 7, evp.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
