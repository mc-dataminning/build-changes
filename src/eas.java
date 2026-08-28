import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eas(jr<ear> e, dys f) {
   public static final Codec<eas> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ear.l.fieldOf("type").forGetter(eas::a), dys.a.fieldOf("generator").forGetter(eas::b)).apply($$0, $$0.stable(eas::new))
   );
   public static final aku<eas> b = aku.a(mc.bf, akv.b("overworld"));
   public static final aku<eas> c = aku.a(mc.bf, akv.b("the_nether"));
   public static final aku<eas> d = aku.a(mc.bf, akv.b("the_end"));

   public jr<ear> a() {
      return this.e;
   }

   public dys b() {
      return this.f;
   }
}
