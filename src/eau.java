import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eau(jr<eat> e, dyu f) {
   public static final Codec<eau> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eat.l.fieldOf("type").forGetter(eau::a), dyu.a.fieldOf("generator").forGetter(eau::b)).apply($$0, $$0.stable(eau::new))
   );
   public static final aku<eau> b = aku.a(mc.bf, akv.b("overworld"));
   public static final aku<eau> c = aku.a(mc.bf, akv.b("the_nether"));
   public static final aku<eau> d = aku.a(mc.bf, akv.b("the_end"));

   public jr<eat> a() {
      return this.e;
   }

   public dyu b() {
      return this.f;
   }
}
