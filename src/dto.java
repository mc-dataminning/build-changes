import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dto extends dmm implements dtm {
   public static final MapCodec<dto> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyc.a.fieldOf("block_set_type").forGetter(dmm::b), dtm.a.e.fieldOf("weathering_state").forGetter(dto::q), t()).apply($$0, dto::new)
   );
   private final dtm.a m;

   @Override
   public MapCodec<dto> a() {
      return l;
   }

   protected dto(dyc $$0, dtm.a $$1, dxm.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(dmm.f) == dyi.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxn $$0) {
      return dtm.c($$0.b()).isPresent();
   }

   public dtm.a q() {
      return this.m;
   }
}
