import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaj implements eaf {
   public static final MapCodec<eaj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.v(16).optionalFieldOf("offset", jd.c).forGetter($$0x -> $$0x.e)).apply($$0, eaj::new)
   );
   private final kh e;

   public eaj(kh $$0) {
      this.e = $$0;
   }

   public boolean a(dds $$0, jd $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eag<?> a() {
      return eag.h;
   }
}
