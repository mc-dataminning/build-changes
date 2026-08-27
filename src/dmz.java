import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dmz(ih<dmy> e, dlm f) {
   public static final Codec<dmz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dmy.j.fieldOf("type").forGetter(dmz::a), dlm.a.fieldOf("generator").forGetter(dmz::b)).apply($$0, $$0.stable(dmz::new))
   );
   public static final ahg<dmz> b = ahg.a(ke.aN, new ahh("overworld"));
   public static final ahg<dmz> c = ahg.a(ke.aN, new ahh("the_nether"));
   public static final ahg<dmz> d = ahg.a(ke.aN, new ahh("the_end"));

   public ih<dmy> a() {
      return this.e;
   }

   public dlm b() {
      return this.f;
   }
}
