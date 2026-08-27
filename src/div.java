import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record div(hg<diu> e, dhi f) {
   public static final Codec<div> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(diu.j.fieldOf("type").forGetter(div::a), dhi.a.fieldOf("generator").forGetter(div::b)).apply($$0, $$0.stable(div::new))
   );
   public static final aex<div> b = aex.a(je.aI, new aey("overworld"));
   public static final aex<div> c = aex.a(je.aI, new aey("the_nether"));
   public static final aex<div> d = aex.a(je.aI, new aey("the_end"));

   public hg<diu> a() {
      return this.e;
   }

   public dhi b() {
      return this.f;
   }
}
