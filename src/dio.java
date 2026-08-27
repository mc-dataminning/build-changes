import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dio(hg<din> e, dhb f) {
   public static final Codec<dio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(din.j.fieldOf("type").forGetter(dio::a), dhb.a.fieldOf("generator").forGetter(dio::b)).apply($$0, $$0.stable(dio::new))
   );
   public static final aet<dio> b = aet.a(je.aI, new aeu("overworld"));
   public static final aet<dio> c = aet.a(je.aI, new aeu("the_nether"));
   public static final aet<dio> d = aet.a(je.aI, new aeu("the_end"));

   public hg<din> a() {
      return this.e;
   }

   public dhb b() {
      return this.f;
   }
}
