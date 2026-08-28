import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class don extends die {
   public static final MapCodec<don> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, don::new)
   );
   public static final dwm f = dwl.w;

   @Override
   public MapCodec<don> a() {
      return e;
   }

   protected don(dwk $$0, dvu.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dvv $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dvv a(dvv $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dfm $$0, jh $$1) {
      Class<? extends bul> $$2 = switch (this.d.f()) {
         case a -> bul.class;
         case b -> bvh.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(f);
   }
}
