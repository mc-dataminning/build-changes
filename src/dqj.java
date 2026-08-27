import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqj implements dqf {
   public static final Codec<dqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.v(16).optionalFieldOf("offset", hx.b).forGetter($$0x -> $$0x.e)).apply($$0, dqj::new)
   );
   private final jb e;

   public dqj(jb $$0) {
      this.e = $$0;
   }

   public boolean a(cus $$0, hx $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dqg<?> a() {
      return dqg.h;
   }
}
