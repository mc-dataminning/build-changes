import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ein implements eik {
   private final ka e;
   private final jb f;
   public static final MapCodec<ein> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.v(16).optionalFieldOf("offset", ka.i).forGetter($$0x -> $$0x.e), jb.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, ein::new)
   );

   public ein(ka $$0, jb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dkw $$0, iv $$1) {
      iv $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public eil<?> a() {
      return eil.d;
   }
}
