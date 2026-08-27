import com.mojang.serialization.MapCodec;

public class diz extends dfc implements dmr {
   public static final MapCodec<diz> a = b(diz::new);
   private static final exn b = dfc.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public diz(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(dts.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(dts.C);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(dts.C)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(dts.C) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
