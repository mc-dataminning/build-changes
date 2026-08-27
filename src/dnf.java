import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnf extends dge implements dnd {
   public static final MapCodec<dnf> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drq.a.fieldOf("block_set_type").forGetter(dge::b), dnd.a.e.fieldOf("weathering_state").forGetter(dnf::l), u()).apply($$0, dnf::new)
   );
   private final dnd.a m;

   @Override
   public MapCodec<dnf> a() {
      return l;
   }

   protected dnf(drq $$0, dnd.a $$1, dra.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(dge.f) == drx.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(drb $$0) {
      return dnd.c($$0.b()).isPresent();
   }

   public dnd.a l() {
      return this.m;
   }
}
