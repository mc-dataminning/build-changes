public class bpe extends bpa {
   private final bpb c;
   private final bpd d;

   public bpe(int $$0, bpb $$1, bpd $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bpe(int $$0, bpb $$1, bpd $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acw((long[])this.b.clone(), this.d));
   }
}
