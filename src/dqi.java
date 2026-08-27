import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqi implements dqf {
   private final jb e;
   private final ic f;
   public static final Codec<dqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.v(16).optionalFieldOf("offset", jb.g).forGetter($$0x -> $$0x.e), ic.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dqi::new)
   );

   public dqi(jb $$0, ic $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cus $$0, hx $$1) {
      hx $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dqg<?> a() {
      return dqg.d;
   }
}
