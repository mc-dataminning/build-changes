import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djl extends dim implements dje {
   public static final MapCodec<djl> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dno.a.fieldOf("block_set_type").forGetter(dim::i), dje.a.e.fieldOf("weathering_state").forGetter(djl::s), u()).apply($$0, djl::new)
   );
   private final dje.a n;

   @Override
   public MapCodec<djl> a() {
      return m;
   }

   protected djl(dno $$0, dje.a $$1, dmy.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dmz $$0) {
      return dje.c($$0.b()).isPresent();
   }

   public dje.a s() {
      return this.n;
   }
}
