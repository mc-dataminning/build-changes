import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtr(iv<dtq> e, drv f) {
   public static final Codec<dtr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtq.j.fieldOf("type").forGetter(dtr::a), drv.a.fieldOf("generator").forGetter(dtr::b)).apply($$0, $$0.stable(dtr::new))
   );
   public static final ake<dtr> b = ake.a(ld.aS, new akf("overworld"));
   public static final ake<dtr> c = ake.a(ld.aS, new akf("the_nether"));
   public static final ake<dtr> d = ake.a(ld.aS, new akf("the_end"));

   public iv<dtq> a() {
      return this.e;
   }

   public drv b() {
      return this.f;
   }
}
