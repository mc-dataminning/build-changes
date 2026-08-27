import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dit(he<dis> e, dhg f) {
   public static final Codec<dit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dis.j.fieldOf("type").forGetter(dit::a), dhg.a.fieldOf("generator").forGetter(dit::b)).apply($$0, $$0.stable(dit::new))
   );
   public static final aev<dit> b = aev.a(jc.aI, new aew("overworld"));
   public static final aev<dit> c = aev.a(jc.aI, new aew("the_nether"));
   public static final aev<dit> d = aev.a(jc.aI, new aew("the_end"));

   public he<dis> a() {
      return this.e;
   }

   public dhg b() {
      return this.f;
   }
}
