public class fjq extends fkt {
   private ffn a;
   private final Runnable b;
   private final Runnable c;

   public fjq(Runnable $$0, Runnable $$1) {
      super(ws.c("datapackFailure.title"));
      this.a = ffn.a;
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.a = ffn.a(this.p, this.n(), this.n - 50);
      this.c(feu.a(ws.c("datapackFailure.safeMode"), $$0 -> this.c.run()).a(this.n / 2 - 155, this.o / 6 + 96, 150, 20).a());
      this.c(feu.a(wr.k, $$0 -> this.b.run()).a(this.n / 2 - 155 + 160, this.o / 6 + 96, 150, 20).a());
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a.a($$0, this.n / 2, 70);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
