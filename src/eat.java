import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eat(jr<eas> e, dyt f) {
   public static final Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eas.l.fieldOf("type").forGetter(eat::a), dyt.a.fieldOf("generator").forGetter(eat::b)).apply($$0, $$0.stable(eat::new))
   );
   public static final aku<eat> b = aku.a(mc.bf, akv.b("overworld"));
   public static final aku<eat> c = aku.a(mc.bf, akv.b("the_nether"));
   public static final aku<eat> d = aku.a(mc.bf, akv.b("the_end"));

   public jr<eas> a() {
      return this.e;
   }

   public dyt b() {
      return this.f;
   }
}
