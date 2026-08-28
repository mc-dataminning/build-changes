import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlb extends dit {
   public static final MapCodec<dlb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dla.a.forGetter($$0x -> $$0x.c), t()).apply($$0, dlb::new));
   private final djl c;

   @Override
   public MapCodec<dlb> a() {
      return b;
   }

   protected dlb(djl $$0, dwv.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.c.m().b(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return djn.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(d)) {
            $$2.a($$3, esz.c, esz.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
