import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmt extends dgj {
   public static final MapCodec<dmt> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dup.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dmt::new)
   );
   public static final dur f = duq.w;

   @Override
   public MapCodec<dmt> a() {
      return e;
   }

   protected dmt(dup $$0, dtz.d $$1) {
      super($$1, $$0);
      this.l(this.E.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dua $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dua a(dua $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dds $$0, je $$1) {
      Class<? extends btj> $$2 = switch (this.d.f()) {
         case a -> btj.class;
         case b -> buf.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f);
   }
}
