import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dua(iw<dtz> e, dse f) {
   public static final Codec<dua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dtz.j.fieldOf("type").forGetter(dua::a), dse.a.fieldOf("generator").forGetter(dua::b)).apply($$0, $$0.stable(dua::new))
   );
   public static final akg<dua> b = akg.a(le.aT, new akh("overworld"));
   public static final akg<dua> c = akg.a(le.aT, new akh("the_nether"));
   public static final akg<dua> d = akg.a(le.aT, new akh("the_end"));

   public iw<dtz> a() {
      return this.e;
   }

   public dse b() {
      return this.f;
   }
}
