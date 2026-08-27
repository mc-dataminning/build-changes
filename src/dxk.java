import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxk implements dxg {
   public static final Codec<dxk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jr.v(16).optionalFieldOf("offset", in.c).forGetter($$0x -> $$0x.e)).apply($$0, dxk::new)
   );
   private final jr e;

   public dxk(jr $$0) {
      this.e = $$0;
   }

   public boolean a(day $$0, in $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dxh<?> a() {
      return dxh.h;
   }
}
