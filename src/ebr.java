import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebr implements ebd {
   public static final MapCodec<ebr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.v(16).optionalFieldOf("offset", ki.g).forGetter($$0x -> $$0x.e), dua.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, ebr::new)
   );
   private final ki e;
   private final dua f;

   protected ebr(ki $$0, dua $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dep $$0, je $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ebe<?> a() {
      return ebe.g;
   }
}
