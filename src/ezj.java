public class ezj extends fah {
   private static final ur a = ur.c("gui.toMenu");
   private static final ur b = ur.c("gui.toTitle");
   private final fah c;
   private final ur k;
   private final ur l;
   private final eya m = eya.d();

   public ezj(fah $$0, ur $$1, ur $$2) {
      this($$0, $$1, $$2, a);
   }

   public ezj(fah $$0, ur $$1, ur $$2, ur $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aO_() {
      this.m.c().b().a(10);
      this.m.a(new evt(this.e, this.i));
      this.m.a(new evg(this.k, this.i).j(this.g - 50).b(true));
      eum $$0;
      if (this.f.C()) {
         $$0 = eum.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = eum.a(b, $$0x -> this.f.a(new fam())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      exu.a(this.m, this.s());
   }

   @Override
   public ur h() {
      return uq.a(this.e, this.k);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
