import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record edx(je<edw> e, ebx f) {
   public static final Codec<edx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edw.l.fieldOf("type").forGetter(edx::a), ebx.a.fieldOf("generator").forGetter(edx::b)).apply($$0, $$0.stable(edx::new))
   );
   public static final alf<edx> b = alf.a(mg.bo, alg.b("overworld"));
   public static final alf<edx> c = alf.a(mg.bo, alg.b("the_nether"));
   public static final alf<edx> d = alf.a(mg.bo, alg.b("the_end"));

   public je<edw> a() {
      return this.e;
   }

   public ebx b() {
      return this.f;
   }
}
