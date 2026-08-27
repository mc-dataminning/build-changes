import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwr extends cuk {
   public static final MapCodec<cwr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwp.a.forGetter($$0x -> $$0x.e), u()).apply($$0, cwr::new));
   private final cva e;
   protected static final float b = 6.0F;
   protected static final ekn c = cva.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cwr> a() {
      return a;
   }

   protected cwr(cva $$0, dhh.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      this.a($$0, (csb)$$1, $$2);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.o().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !$$0.a($$3, $$4)) {
         return cvc.a.o();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c;
   }
}
