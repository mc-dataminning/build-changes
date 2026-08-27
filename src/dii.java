import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dii(hf<dih> e, dgv f) {
   public static final Codec<dii> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dih.j.fieldOf("type").forGetter(dii::a), dgv.a.fieldOf("generator").forGetter(dii::b)).apply($$0, $$0.stable(dii::new))
   );
   public static final aeo<dii> b = aeo.a(jd.aI, new aep("overworld"));
   public static final aeo<dii> c = aeo.a(jd.aI, new aep("the_nether"));
   public static final aeo<dii> d = aeo.a(jd.aI, new aep("the_end"));

   public hf<dih> a() {
      return this.e;
   }

   public dgv b() {
      return this.f;
   }
}
