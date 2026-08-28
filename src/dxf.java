import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxf extends dwe implements dwy {
   public static final MapCodec<dxf> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebt.a.fieldOf("block_set_type").forGetter(dwe::q), dwy.a.e.fieldOf("weathering_state").forGetter(dxf::r), t()).apply($$0, dxf::new)
   );
   private final dwy.a h;

   @Override
   public MapCodec<dxf> a() {
      return g;
   }

   protected dxf(ebt $$0, dwy.a $$1, ebd.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(ebe $$0) {
      return dwy.c($$0.b()).isPresent();
   }

   public dwy.a r() {
      return this.h;
   }
}
