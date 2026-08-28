import javax.annotation.Nullable;

public class esu implements esv {
   private final dff b;

   public esu(dff $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jm $$0, dvo $$1, jh $$2, jh $$3, int $$4, int $$5) {
      esv.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(jh $$0, dij $$1, @Nullable esw $$2) {
      dvo $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(dvo $$0, jh $$1, dij $$2, @Nullable esw $$3, boolean $$4) {
      esv.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
