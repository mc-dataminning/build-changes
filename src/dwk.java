import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwk implements dwh {
   private final ji e;
   private final ij f;
   public static final Codec<dwk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.v(16).optionalFieldOf("offset", ji.g).forGetter($$0x -> $$0x.e), ij.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dwk::new)
   );

   public dwk(ji $$0, ij $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dab $$0, id $$1) {
      id $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dwi<?> a() {
      return dwi.d;
   }
}
