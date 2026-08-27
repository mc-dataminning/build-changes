public class eti extends esk {
   private final erx a;
   private final tl b;
   private final tl c;

   public eti(int $$0, int $$1, int $$2, int $$3, tl $$4, esk.c $$5, erx $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, o);
      this.a = $$6;
      this.b = $$4;
      this.c = to.a($$4.f(), ui.a.c(true));
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      tl $$4 = this.o() ? this.c : this.b;
      $$0.b(this.a, $$4, this.r(), this.t(), 16777215 | asb.f(this.k * 255.0F) << 24);
   }
}
