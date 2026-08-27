import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dec extends cwo implements deb {
   public static final MapCodec<dec> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deb.a.e.fieldOf("weathering_state").forGetter(dec::g), u()).apply($$0, dec::new)
   );
   private final deb.a e;

   @Override
   protected MapCodec<dec> a() {
      return d;
   }

   public dec(deb.a $$0, dhh.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dhi $$0) {
      return deb.c($$0.b()).isPresent();
   }

   public deb.a g() {
      return this.e;
   }
}
