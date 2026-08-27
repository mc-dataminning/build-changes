public class ftd<T extends byo> extends ftg<T, fck<T>> {
   private final fcf a;

   public ftd(fqt<T, fck<T>> $$0, fea $$1) {
      super($$0);
      this.a = new fcf($$1.a(fed.aA));
   }

   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      qr $$9 = $$8 ? $$3.ge() : $$3.gf();
      bfn.a($$9.l("id")).filter($$0x -> $$0x == bfn.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bU() ? -1.3F : -1.5F, 0.0F);
         bsb.b $$11 = bsb.b.a($$9.h("Variant"));
         ein $$12 = $$1.getBuffer(this.a.a(fqk.a($$11)));
         this.a.a($$0, $$12, $$2, fum.d, $$4, $$5, $$6, $$7, $$3.ag);
         $$0.b();
      });
   }
}
