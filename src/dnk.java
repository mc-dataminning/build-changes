import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnk extends dml implements dnd {
   public static final MapCodec<dnk> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drq.a.fieldOf("block_set_type").forGetter(dml::l), dnd.a.e.fieldOf("weathering_state").forGetter(dnk::s), u()).apply($$0, dnk::new)
   );
   private final dnd.a n;

   @Override
   public MapCodec<dnk> a() {
      return m;
   }

   protected dnk(drq $$0, dnd.a $$1, dra.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drb $$0) {
      return dnd.c($$0.b()).isPresent();
   }

   public dnd.a s() {
      return this.n;
   }
}
