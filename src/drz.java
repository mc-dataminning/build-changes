import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drz implements drv {
   public static final Codec<drz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.v(16).optionalFieldOf("offset", hz.c).forGetter($$0x -> $$0x.e)).apply($$0, drz::new)
   );
   private final jd e;

   public drz(jd $$0) {
      this.e = $$0;
   }

   public boolean a(cwi $$0, hz $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public drw<?> a() {
      return drw.h;
   }
}
