import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dyl(jn<dyk> e, dwl f) {
   public static final Codec<dyl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyk.k.fieldOf("type").forGetter(dyl::a), dwl.a.fieldOf("generator").forGetter(dyl::b)).apply($$0, $$0.stable(dyl::new))
   );
   public static final alb<dyl> b = alb.a(lv.bc, alc.b("overworld"));
   public static final alb<dyl> c = alb.a(lv.bc, alc.b("the_nether"));
   public static final alb<dyl> d = alb.a(lv.bc, alc.b("the_end"));

   public jn<dyk> a() {
      return this.e;
   }

   public dwl b() {
      return this.f;
   }
}
