import javax.annotation.Nullable;

public class caz extends cbl {
   private static final int i = 10;
   private static final int j = 7;

   public caz(btz $$0, double $$1, boolean $$2) {
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
   protected evs h() {
      arf $$0 = (arf)this.b.dP();
      iz $$1 = this.b.dp();
      kb $$2 = kb.a($$1);
      kb $$3 = bvl.a($$0, $$2, 2);
      return $$3 != $$2 ? cel.a(this.b, 10, 7, evs.c($$3.q()), (float) (Math.PI / 2)) : null;
   }
}
