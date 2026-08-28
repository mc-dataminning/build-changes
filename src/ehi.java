import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehi implements egu {
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jz.v(16).optionalFieldOf("offset", jz.i).forGetter($$0x -> $$0x.e), dzo.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, ehi::new)
   );
   private final jz e;
   private final dzo f;

   protected ehi(jz $$0, dzo $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(djo $$0, iu $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public egv<?> a() {
      return egv.g;
   }
}
