import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqd implements dpq {
   public static final Codec<dqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.v(16).optionalFieldOf("offset", jb.g).forGetter($$0x -> $$0x.e), dja.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dqd::new)
   );
   private final jb e;
   private final dja f;

   protected dqd(jb $$0, dja $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cud $$0, hx $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dpr<?> a() {
      return dpr.g;
   }
}
