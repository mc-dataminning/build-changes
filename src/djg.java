import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djg extends dcg implements dje {
   public static final MapCodec<djg> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dno.a.fieldOf("block_set_type").forGetter(dcg::b), dje.a.e.fieldOf("weathering_state").forGetter(djg::i), u()).apply($$0, djg::new)
   );
   private final dje.a m;

   @Override
   public MapCodec<djg> a() {
      return l;
   }

   protected djg(dno $$0, dje.a $$1, dmy.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(dcg.f) == dnv.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dmz $$0) {
      return dje.c($$0.b()).isPresent();
   }

   public dje.a i() {
      return this.m;
   }
}
