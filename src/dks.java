import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dks(ib<dkr> e, djf f) {
   public static final Codec<dks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dkr.j.fieldOf("type").forGetter(dks::a), djf.a.fieldOf("generator").forGetter(dks::b)).apply($$0, $$0.stable(dks::new))
   );
   public static final agh<dks> b = agh.a(jz.aK, new agi("overworld"));
   public static final agh<dks> c = agh.a(jz.aK, new agi("the_nether"));
   public static final agh<dks> d = agh.a(jz.aK, new agi("the_end"));

   public ib<dkr> a() {
      return this.e;
   }

   public djf b() {
      return this.f;
   }
}
