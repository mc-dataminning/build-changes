import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dik(he<dij> e, dgx f) {
   public static final Codec<dik> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dij.j.fieldOf("type").forGetter(dik::a), dgx.a.fieldOf("generator").forGetter(dik::b)).apply($$0, $$0.stable(dik::new))
   );
   public static final aeq<dik> b = aeq.a(jc.aI, new aer("overworld"));
   public static final aeq<dik> c = aeq.a(jc.aI, new aer("the_nether"));
   public static final aeq<dik> d = aeq.a(jc.aI, new aer("the_end"));

   public he<dij> a() {
      return this.e;
   }

   public dgx b() {
      return this.f;
   }
}
