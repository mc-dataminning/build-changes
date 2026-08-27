import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqa implements dpw {
   public static final Codec<dqa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.v(16).optionalFieldOf("offset", hx.b).forGetter($$0x -> $$0x.e)).apply($$0, dqa::new)
   );
   private final jb e;

   public dqa(jb $$0) {
      this.e = $$0;
   }

   public boolean a(cuj $$0, hx $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dpx<?> a() {
      return dpx.h;
   }
}
