public class etg extends esi {
   private final erv a;
   private final te b;
   private final te c;

   public etg(int $$0, int $$1, int $$2, int $$3, te $$4, esi.c $$5, erv $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, o);
      this.a = $$6;
      this.b = $$4;
      this.c = tg.a($$4.e(), ua.a.c(true));
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      te $$4 = this.n() ? this.c : this.b;
      $$0.b(this.a, $$4, this.p(), this.r(), 16777215 | aro.f(this.k * 255.0F) << 24);
   }
}
