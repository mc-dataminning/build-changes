import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eck(js<ecj> e, eak f) {
   public static final Codec<eck> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecj.l.fieldOf("type").forGetter(eck::a), eak.a.fieldOf("generator").forGetter(eck::b)).apply($$0, $$0.stable(eck::new))
   );
   public static final alc<eck> b = alc.a(me.bm, ald.b("overworld"));
   public static final alc<eck> c = alc.a(me.bm, ald.b("the_nether"));
   public static final alc<eck> d = alc.a(me.bm, ald.b("the_end"));

   public js<ecj> a() {
      return this.e;
   }

   public eak b() {
      return this.f;
   }
}
