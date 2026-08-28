import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class don extends dno implements dog {
   public static final MapCodec<don> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dst.a.fieldOf("block_set_type").forGetter(dno::m), dog.a.e.fieldOf("weathering_state").forGetter(don::n), u()).apply($$0, don::new)
   );
   private final dog.a n;

   @Override
   public MapCodec<don> a() {
      return m;
   }

   protected don(dst $$0, dog.a $$1, dsd.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dse $$0) {
      return dog.c($$0.b()).isPresent();
   }

   public dog.a n() {
      return this.n;
   }
}
