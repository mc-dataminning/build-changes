import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eat(jr<eas> e, dyt f) {
   public static final Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eas.k.fieldOf("type").forGetter(eat::a), dyt.a.fieldOf("generator").forGetter(eat::b)).apply($$0, $$0.stable(eat::new))
   );
   public static final akt<eat> b = akt.a(mc.bf, aku.b("overworld"));
   public static final akt<eat> c = akt.a(mc.bf, aku.b("the_nether"));
   public static final akt<eat> d = akt.a(mc.bf, aku.b("the_end"));

   public jr<eas> a() {
      return this.e;
   }

   public dyt b() {
      return this.f;
   }
}
