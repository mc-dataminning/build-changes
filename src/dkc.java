import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkc extends dfc implements dmr {
   public static final MapCodec<dkc> a = b(dkc::new);
   public static final dtt b = dts.C;

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   protected dkc(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, iw $$2) {
      return $$1.a(dfe.aK) && $$2.o() == iw.a.b;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epf.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(b) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }
}
