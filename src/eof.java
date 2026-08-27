import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eof extends gex {
   static final tl b = tl.c("mco.warning");
   static final tl c = tl.c("mco.info");
   private final eof.a y;
   private final tl z;
   private final tl A;
   protected final BooleanConsumer a;
   private final boolean B;

   public eof(BooleanConsumer $$0, eof.a $$1, tl $$2, tl $$3, boolean $$4) {
      super(eqh.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aH_() {
      if (this.B) {
         this.d(esk.a(tk.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(esk.a(tk.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(esk.a(tk.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public tl g() {
      return tk.b(this.y.d, this.z, this.A);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.a.accept(false);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.y.d, this.g / 2, h(2), this.y.c);
      $$0.a(this.i, this.z, this.g / 2, h(4), -1);
      $$0.a(this.i, this.A, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(eof.b, -65536),
      b(eof.c, 8226750);

      public final int c;
      public final tl d;

      private a(tl $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
