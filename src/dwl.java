import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwl implements dwh {
   public static final Codec<dwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.v(16).optionalFieldOf("offset", id.c).forGetter($$0x -> $$0x.e)).apply($$0, dwl::new)
   );
   private final ji e;

   public dwl(ji $$0) {
      this.e = $$0;
   }

   public boolean a(dab $$0, id $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dwi<?> a() {
      return dwi.h;
   }
}
