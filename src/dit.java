import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dit(hg<dis> e, dhg f) {
   public static final Codec<dit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dis.j.fieldOf("type").forGetter(dit::a), dhg.a.fieldOf("generator").forGetter(dit::b)).apply($$0, $$0.stable(dit::new))
   );
   public static final aew<dit> b = aew.a(je.aI, new aex("overworld"));
   public static final aew<dit> c = aew.a(je.aI, new aex("the_nether"));
   public static final aew<dit> d = aew.a(je.aI, new aex("the_end"));

   public hg<dis> a() {
      return this.e;
   }

   public dhg b() {
      return this.f;
   }
}
