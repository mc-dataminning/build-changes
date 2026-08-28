import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhp extends dfi {
   public static final MapCodec<dhp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhn.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dhp::new));
   private final dfy e;
   protected static final float b = 6.0F;
   protected static final exv c = dfy.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   protected dhp(dfy $$0, dtb.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      this.a($$0, (dcx)$$1, $$2);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.a && !$$0.a($$3, $$4)) {
         return dga.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, epf.c, epf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return c;
   }
}
