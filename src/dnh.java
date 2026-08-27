import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnh extends dgg implements dnf {
   public static final MapCodec<dnh> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drs.a.fieldOf("block_set_type").forGetter(dgg::b), dnf.a.e.fieldOf("weathering_state").forGetter(dnh::m), u()).apply($$0, dnh::new)
   );
   private final dnf.a m;

   @Override
   public MapCodec<dnh> a() {
      return l;
   }

   protected dnh(drs $$0, dnf.a $$1, drc.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(dgg.f) == drz.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(drd $$0) {
      return dnf.c($$0.b()).isPresent();
   }

   public dnf.a m() {
      return this.m;
   }
}
