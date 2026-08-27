import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dju extends dfc implements dmr {
   public static final MapCodec<dju> a = b(dju::new);
   public static final int b = 15;
   public static final duc c = dts.aP;
   public static final dtt d = dts.C;
   public static final ToIntFunction<dtc> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(15)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if (!$$1.C && $$3.gK()) {
         $$1.a($$2, $$0.a(c), 2);
         return bqa.a;
      } else {
         return bqa.b;
      }
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return $$3.a(cuk.iQ) ? exk.b() : exk.a();
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return true;
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.a;
   }

   @Override
   protected float d(dtc $$0, dbg $$1, ir $$2) {
      return 1.0F;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(d) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return a(super.a($$0, $$1, $$2), $$2.c(c));
   }

   public static cuh a(cuh $$0, int $$1) {
      if ($$1 != 15) {
         $$0.b(ke.aa, cxb.a.a(c, $$1));
      }

      return $$0;
   }
}
