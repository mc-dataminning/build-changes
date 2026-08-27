import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxj implements dxg {
   private final jr e;
   private final is f;
   public static final Codec<dxj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jr.v(16).optionalFieldOf("offset", jr.g).forGetter($$0x -> $$0x.e), is.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dxj::new)
   );

   public dxj(jr $$0, is $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(day $$0, in $$1) {
      in $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dxh<?> a() {
      return dxh.d;
   }
}
