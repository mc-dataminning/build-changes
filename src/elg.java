import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class elg extends gan {
   static final sw b = sw.c("mco.warning");
   static final sw c = sw.c("mco.info");
   private final elg.a G;
   private final sw H;
   private final sw I;
   protected final BooleanConsumer a;
   private final boolean J;

   public elg(BooleanConsumer $$0, elg.a $$1, sw $$2, sw $$3, boolean $$4) {
      super(enf.a);
      this.a = $$0;
      this.G = $$1;
      this.H = $$2;
      this.I = $$3;
      this.J = $$4;
   }

   @Override
   public void b() {
      if (this.J) {
         this.d(epi.a(sv.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(epi.a(sv.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(epi.a(sv.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public sw au_() {
      return sv.b(this.G.d, this.H, this.I);
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
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.G.d, this.g / 2, h(2), this.G.c);
      $$0.a(this.i, this.H, this.g / 2, h(4), 16777215);
      $$0.a(this.i, this.I, this.g / 2, h(6), 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   public static enum a {
      a(elg.b, 16711680),
      b(elg.c, 8226750);

      public final int c;
      public final sw d;

      private a(sw $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
