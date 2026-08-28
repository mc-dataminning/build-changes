public class bpg extends bpc {
   private final bpd c;
   private final bpf d;

   public bpg(int $$0, bpd $$1, bpf $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bpg(int $$0, bpd $$1, bpf $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acy((long[])this.b.clone(), this.d));
   }
}
