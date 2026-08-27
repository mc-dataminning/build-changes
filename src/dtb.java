import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtb(in<dta> e, drf f) {
   public static final Codec<dtb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dta.j.fieldOf("type").forGetter(dtb::a), drf.a.fieldOf("generator").forGetter(dtb::b)).apply($$0, $$0.stable(dtb::new))
   );
   public static final aju<dtb> b = aju.a(ku.aQ, new ajv("overworld"));
   public static final aju<dtb> c = aju.a(ku.aQ, new ajv("the_nether"));
   public static final aju<dtb> d = aju.a(ku.aQ, new ajv("the_end"));

   public in<dta> a() {
      return this.e;
   }

   public drf b() {
      return this.f;
   }
}
