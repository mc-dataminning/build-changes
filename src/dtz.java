import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtz implements dtv {
   public static final Codec<dtz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jg.v(16).optionalFieldOf("offset", ib.c).forGetter($$0x -> $$0x.e)).apply($$0, dtz::new)
   );
   private final jg e;

   public dtz(jg $$0) {
      this.e = $$0;
   }

   public boolean a(cxw $$0, ib $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dtw<?> a() {
      return dtw.h;
   }
}
