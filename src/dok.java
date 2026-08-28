import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dok extends dnl implements dod {
   public static final MapCodec<dok> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsq.a.fieldOf("block_set_type").forGetter(dnl::m), dod.a.e.fieldOf("weathering_state").forGetter(dok::n), u()).apply($$0, dok::new)
   );
   private final dod.a n;

   @Override
   public MapCodec<dok> a() {
      return m;
   }

   protected dok(dsq $$0, dod.a $$1, dsa.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsb $$0) {
      return dod.c($$0.b()).isPresent();
   }

   public dod.a n() {
      return this.n;
   }
}
