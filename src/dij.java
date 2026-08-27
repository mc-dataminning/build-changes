import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dij(he<dii> e, dgw f) {
   public static final Codec<dij> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dii.j.fieldOf("type").forGetter(dij::a), dgw.a.fieldOf("generator").forGetter(dij::b)).apply($$0, $$0.stable(dij::new))
   );
   public static final aeq<dij> b = aeq.a(jc.aI, new aer("overworld"));
   public static final aeq<dij> c = aeq.a(jc.aI, new aer("the_nether"));
   public static final aeq<dij> d = aeq.a(jc.aI, new aer("the_end"));

   public he<dii> a() {
      return this.e;
   }

   public dgw b() {
      return this.f;
   }
}
