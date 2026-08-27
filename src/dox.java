import com.mojang.serialization.MapCodec;

public class dox extends dkw implements dmr {
   public static final MapCodec<dox> a = b(dox::new);
   public static final dtt j = dts.C;

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   protected dox(dtb.d $$0) {
      super(0.3125F, $$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
            .a(j, Boolean.valueOf(false))
      );
   }

   @Override
   public dtc a(cyd $$0) {
      return dno.a($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(j)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      boolean $$6 = $$2.a(this) || $$2.a(dfe.lr);
      return $$0.a(h.get($$1), Boolean.valueOf($$6));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d, e, f, g, j);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(j) ? epf.c.a(false) : super.b_($$0);
   }
}
