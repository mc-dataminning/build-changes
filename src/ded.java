import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ded extends cxg implements deb {
   public static final MapCodec<ded> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhx.a.fieldOf("block_set_type").forGetter(cxg::b), deb.a.e.fieldOf("weathering_state").forGetter(ded::g), u()).apply($$0, ded::new)
   );
   private final deb.a m;

   @Override
   public MapCodec<ded> a() {
      return l;
   }

   protected ded(dhx $$0, deb.a $$1, dhh.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(cxg.f) == die.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dhi $$0) {
      return deb.c($$0.b()).isPresent();
   }

   public deb.a g() {
      return this.m;
   }
}
