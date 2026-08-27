public class ett extends euq {
   private static final sw a = sw.c("gui.toMenu");
   private static final sw b = sw.c("gui.toTitle");
   private final euq c;
   private final sw k;
   private final sw l;
   private final esf m = new esf();

   public ett(euq $$0, sw $$1, sw $$2) {
      this($$0, $$1, $$2, a);
   }

   public ett(euq $$0, sw $$1, sw $$2, sw $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void b() {
      this.m.b().b().a(10);
      esf.b $$0 = this.m.d(1);
      $$0.a(new eqk(this.e, this.i));
      $$0.a(new eqa(this.k, this.i).i(this.g - 50).b(true));
      epi $$1;
      if (this.f.C()) {
         $$1 = epi.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$1 = epi.a(b, $$0x -> this.f.a(new euw())).a();
      }

      $$0.a($$1);
      this.m.c();
      this.m.a(this::d);
      this.aG_();
   }

   @Override
   protected void aG_() {
      ese.a(this.m, this.s());
   }

   @Override
   public sw au_() {
      return sv.a(this.e, this.k);
   }

   @Override
   public boolean av_() {
      return false;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
   }
}
