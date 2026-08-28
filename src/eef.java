import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eef(je<eee> e, ecf f) {
   public static final Codec<eef> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eee.l.fieldOf("type").forGetter(eef::a), ecf.a.fieldOf("generator").forGetter(eef::b)).apply($$0, $$0.stable(eef::new))
   );
   public static final alf<eef> b = alf.a(mg.bp, alg.b("overworld"));
   public static final alf<eef> c = alf.a(mg.bp, alg.b("the_nether"));
   public static final alf<eef> d = alf.a(mg.bp, alg.b("the_end"));

   public je<eee> a() {
      return this.e;
   }

   public ecf b() {
      return this.f;
   }
}
