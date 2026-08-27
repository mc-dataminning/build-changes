import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkg(ib<dkf> e, dit f) {
   public static final Codec<dkg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkf.j.fieldOf("type").forGetter(dkg::a), dit.a.fieldOf("generator").forGetter(dkg::b)).apply($$0, $$0.stable(dkg::new))
   );
   public static final agf<dkg> b = agf.a(jz.aK, new agg("overworld"));
   public static final agf<dkg> c = agf.a(jz.aK, new agg("the_nether"));
   public static final agf<dkg> d = agf.a(jz.aK, new agg("the_end"));

   public ib<dkf> a() {
      return this.e;
   }

   public dit b() {
      return this.f;
   }
}
