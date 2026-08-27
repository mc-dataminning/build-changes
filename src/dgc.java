public class dgc extends dfs {
   public dgc(hv $$0, dip $$1) {
      super(dgf.C, $$0, $$1, cpq.c);
   }

   @Override
   protected vb l() {
      return vb.c("container.blast_furnace");
   }

   @Override
   protected int a(cmh $$0) {
      return super.a($$0) / 2;
   }

   @Override
   protected chk a(int $$0, ceq $$1) {
      return new cho($$0, $$1, this, this.n);
   }
}
