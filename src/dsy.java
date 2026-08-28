import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsy extends dlt implements dsw {
   public static final MapCodec<dsy> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxm.a.fieldOf("block_set_type").forGetter(dlt::b), dsw.a.e.fieldOf("weathering_state").forGetter(dsy::q), t()).apply($$0, dsy::new)
   );
   private final dsw.a m;

   @Override
   public MapCodec<dsy> a() {
      return l;
   }

   protected dsy(dxm $$0, dsw.a $$1, dww.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$0.c(dlt.f) == dxs.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dwx $$0) {
      return dsw.c($$0.b()).isPresent();
   }

   public dsw.a q() {
      return this.m;
   }
}
