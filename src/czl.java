public class czl<T extends bwv & bxt> extends czw {
   private final bxe<T> a;
   private final int b;

   public czl(bxe<T> $$0, int $$1, czw.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      if ($$0.C) {
         return but.e;
      } else {
         bwv $$4 = $$1.dl();
         if ($$1.bY() && $$4 instanceof bxt $$5 && $$4.an() == this.a && $$5.a()) {
            bxf $$6 = bxw.d($$2);
            daa $$7 = $$3.a(this.b, dae.sd, $$1, $$6);
            return but.b.a($$7);
         }

         $$1.b(axb.c.b(this));
         return but.e;
      }
   }
}
