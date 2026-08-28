import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiy implements eik {
   public static final MapCodec<eiy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.v(16).optionalFieldOf("offset", ka.i).forGetter($$0x -> $$0x.e), ebe.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eiy::new)
   );
   private final ka e;
   private final ebe f;

   protected eiy(ka $$0, ebe $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dkw $$0, iv $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eil<?> a() {
      return eil.g;
   }
}
