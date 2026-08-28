import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dti extends dms {
   public static final MapCodec<dti> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebv.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dti::new)
   );
   public static final ebx d = ebw.A;

   @Override
   public MapCodec<dti> a() {
      return c;
   }

   protected dti(ebv $$0, ebf.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(ebg $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected ebg a(ebg $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(djz $$0, iw $$1) {
      Class<? extends bwv> $$2 = switch (this.b.f()) {
         case a -> bwv.class;
         case b -> bxw.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(d);
   }
}
