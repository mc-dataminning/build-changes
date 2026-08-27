import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqj implements dpw {
   public static final Codec<dqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.v(16).optionalFieldOf("offset", jb.g).forGetter($$0x -> $$0x.e), djg.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dqj::new)
   );
   private final jb e;
   private final djg f;

   protected dqj(jb $$0, djg $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cuj $$0, hx $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dpx<?> a() {
      return dpx.g;
   }
}
