import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwu extends dvt implements dwn {
   public static final MapCodec<dwu> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebi.a.fieldOf("block_set_type").forGetter(dvt::q), dwn.a.e.fieldOf("weathering_state").forGetter(dwu::r), t()).apply($$0, dwu::new)
   );
   private final dwn.a h;

   @Override
   public MapCodec<dwu> a() {
      return g;
   }

   protected dwu(ebi $$0, dwn.a $$1, eas.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eat $$0) {
      return dwn.c($$0.b()).isPresent();
   }

   public dwn.a r() {
      return this.h;
   }
}
