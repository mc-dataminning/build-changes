public class bnv extends bnr {
   private final bns c;
   private final bnu d;

   public bnv(int $$0, bns $$1, bnu $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bnv(int $$0, bns $$1, bnu $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new adh((long[])this.b.clone(), this.d));
   }
}
