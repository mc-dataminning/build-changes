import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsg implements dsc {
   public static final Codec<dsg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.v(16).optionalFieldOf("offset", hz.c).forGetter($$0x -> $$0x.e)).apply($$0, dsg::new)
   );
   private final jd e;

   public dsg(jd $$0) {
      this.e = $$0;
   }

   public boolean a(cwm $$0, hz $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dsd<?> a() {
      return dsd.h;
   }
}
