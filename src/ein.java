import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ein implements ehz {
   public static final MapCodec<ein> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.v(16).optionalFieldOf("offset", ka.i).forGetter($$0x -> $$0x.e), eat.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, ein::new)
   );
   private final ka e;
   private final eat f;

   protected ein(ka $$0, eat $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dkl $$0, iv $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eia<?> a() {
      return eia.g;
   }
}
