import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqs implements dqf {
   public static final Codec<dqs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.v(16).optionalFieldOf("offset", jb.g).forGetter($$0x -> $$0x.e), djp.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dqs::new)
   );
   private final jb e;
   private final djp f;

   protected dqs(jb $$0, djp $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cus $$0, hx $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dqg<?> a() {
      return dqg.g;
   }
}
