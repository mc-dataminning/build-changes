import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dik extends dat implements dij {
   public static final MapCodec<dik> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dij.a.e.fieldOf("weathering_state").forGetter(dik::i), u()).apply($$0, dik::new)
   );
   private final dij.a e;

   @Override
   protected MapCodec<dik> a() {
      return d;
   }

   public dik(dij.a $$0, dmd.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dme $$0) {
      return dij.c($$0.b()).isPresent();
   }

   public dij.a i() {
      return this.e;
   }
}
