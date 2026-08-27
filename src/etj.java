public class etj extends esl {
   private final ery a;
   private final ti b;
   private final ti c;

   public etj(int $$0, int $$1, int $$2, int $$3, ti $$4, esl.c $$5, ery $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, o);
      this.a = $$6;
      this.b = $$4;
      this.c = tk.a($$4.e(), ue.a.c(true));
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      ti $$4 = this.o() ? this.c : this.b;
      $$0.b(this.a, $$4, this.r(), this.t(), 16777215 | ars.f(this.k * 255.0F) << 24);
   }
}
