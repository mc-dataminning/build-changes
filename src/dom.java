import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dom extends dnn implements dof {
   public static final MapCodec<dom> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dss.a.fieldOf("block_set_type").forGetter(dnn::m), dof.a.e.fieldOf("weathering_state").forGetter(dom::n), u()).apply($$0, dom::new)
   );
   private final dof.a n;

   @Override
   public MapCodec<dom> a() {
      return m;
   }

   protected dom(dss $$0, dof.a $$1, dsc.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsd $$0) {
      return dof.c($$0.b()).isPresent();
   }

   public dof.a n() {
      return this.n;
   }
}
