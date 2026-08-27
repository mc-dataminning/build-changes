import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dxf implements dwx {
   public static final Codec<dxf> a = RecordCodecBuilder.create($$0 -> $$0.group(dwx.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dxf::new));
   private final dwx e;

   public dxf(dwx $$0) {
      this.e = $$0;
   }

   public boolean a(dap $$0, im $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dwy<?> a() {
      return dwy.k;
   }
}
