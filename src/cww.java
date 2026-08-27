import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cww extends cup {
   public static final MapCodec<cww> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwu.a.forGetter($$0x -> $$0x.e), u()).apply($$0, cww::new));
   private final cvf e;
   protected static final float b = 6.0F;
   protected static final eks c = cvf.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cww> a() {
      return a;
   }

   protected cww(cvf $$0, dhm.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      this.a($$0, (csg)$$1, $$2);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.a && !$$0.a($$3, $$4)) {
         return cvh.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, ecy.c, ecy.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }
}
