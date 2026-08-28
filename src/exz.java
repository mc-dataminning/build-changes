import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exz extends exc {
   static final MapCodec<exz> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ezv.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, exz::new));
   private final ezu b;

   private exz(List<eyy> $$0, ezu $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.a();
   }

   @Override
   public exe<exz> b() {
      return exf.Q;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      int $$2 = ayy.a(this.b.a($$1), 0, 4);
      $$0.b(kv.aa, new czl($$2));
      return $$0;
   }

   public ezu c() {
      return this.b;
   }

   public static exc.a<?> a(ezu $$0) {
      return a($$1 -> new exz($$1, $$0));
   }
}
