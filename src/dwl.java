import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwl implements dvy {
   public static final Codec<dwl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jg.v(16).optionalFieldOf("offset", jg.g).forGetter($$0x -> $$0x.e), doz.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dwl::new)
   );
   private final jg e;
   private final doz f;

   protected dwl(jg $$0, doz $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(czs $$0, ib $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dvz<?> a() {
      return dvz.g;
   }
}
