import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eog extends gew {
   static final ti b = ti.c("mco.warning");
   static final ti c = ti.c("mco.info");
   private final eog.a y;
   private final ti z;
   private final ti A;
   protected final BooleanConsumer a;
   private final boolean B;

   public eog(BooleanConsumer $$0, eog.a $$1, ti $$2, ti $$3, boolean $$4) {
      super(eqi.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aD_() {
      if (this.B) {
         this.d(esl.a(th.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(esl.a(th.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(esl.a(th.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public ti g() {
      return th.b(this.y.d, this.z, this.A);
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
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.y.d, this.g / 2, h(2), this.y.c);
      $$0.a(this.i, this.z, this.g / 2, h(4), -1);
      $$0.a(this.i, this.A, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(eog.b, -65536),
      b(eog.c, 8226750);

      public final int c;
      public final ti d;

      private a(ti $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
