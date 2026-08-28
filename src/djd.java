import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djd extends dgw {
   public static final MapCodec<djd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djb.a.forGetter($$0x -> $$0x.e), t()).apply($$0, djd::new));
   private final dhm e;
   protected static final float b = 6.0F;
   protected static final ezq c = dhm.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   protected djd(dhm $$0, dur.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      this.a($$0, (dek)$$1, $$2);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.e.n().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.a && !$$0.a($$3, $$4)) {
         return dho.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, equ.c, equ.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }
}
