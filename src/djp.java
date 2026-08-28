import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djp extends dhi {
   public static final MapCodec<djp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djn.a.forGetter($$0x -> $$0x.e), t()).apply($$0, djp::new));
   private final dhy e;
   protected static final float b = 6.0F;
   protected static final fab c = dhy.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   protected djp(dhy $$0, dvc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      this.a($$0, (dew)$$1, $$2);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.e.m().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == jl.a && !$$0.a($$3, $$4)) {
         return dia.a.m();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, erf.c, erf.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }
}
