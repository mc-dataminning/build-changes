public class ews extends eyf {
   private static final int a = 90;
   private final ti b;
   private ete c = ete.a;
   private final Runnable k;
   private final ti l;
   private final boolean m;

   public ews(Runnable $$0, ti $$1, ti $$2) {
      this($$0, $$1, $$2, th.k, true);
   }

   public ews(Runnable $$0, ti $$1, ti $$2, ti $$3, boolean $$4) {
      super($$1);
      this.k = $$0;
      this.b = $$2;
      this.l = $$3;
      this.m = $$4;
   }

   @Override
   public ti g() {
      return th.a(super.g(), this.b);
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.c = ete.a(this.i, this.b, this.g - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = ars.a(90 + $$0 + 12, this.h / 6 + 96, this.h - 24);
      int $$2 = 150;
      this.d(esl.a(this.l, $$0x -> this.k.run()).a((this.g - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 70, 16777215);
      this.c.a($$0, this.g / 2, 90);
   }

   @Override
   public boolean at_() {
      return this.m;
   }
}
