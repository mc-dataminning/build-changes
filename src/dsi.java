import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsi implements drv {
   public static final Codec<dsi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.v(16).optionalFieldOf("offset", jd.g).forGetter($$0x -> $$0x.e), dlf.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dsi::new)
   );
   private final jd e;
   private final dlf f;

   protected dsi(jd $$0, dlf $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cwi $$0, hz $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public drw<?> a() {
      return drw.g;
   }
}
