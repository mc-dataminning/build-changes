public class bnf implements bop {
   private final hx a;
   private final ejz b;

   public bnf(hx $$0) {
      this.a = $$0.i();
      this.b = ejz.b($$0);
   }

   public bnf(ejz $$0) {
      this.a = hx.a($$0);
      this.b = $$0;
   }

   @Override
   public ejz a() {
      return this.b;
   }

   @Override
   public hx b() {
      return this.a;
   }

   @Override
   public boolean a(bll $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
