import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpd extends dol implements dna {
   public static final MapCodec<dpd> a = b(dpd::new);
   public static final dtt c = dts.C;

   @Override
   protected MapCodec<? extends dpd> a() {
      return a;
   }

   protected dpd(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(epf.c)));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }
}
