import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyx extends csq {
   public static final MapCodec<cyx> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, cyx::new)
   );
   public static final dfu f = dft.w;

   @Override
   public MapCodec<cyx> a() {
      return e;
   }

   protected cyx(dfs $$0, dfc.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dfd $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dfd a(dfd $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cqb $$0, gw $$1) {
      Class<? extends biw> $$2 = switch (this.d.e()) {
         case a -> biw.class;
         case b -> bjm.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f);
   }
}
