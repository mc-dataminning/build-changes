import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dob extends dha implements dnz {
   public static final MapCodec<dob> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsm.a.fieldOf("block_set_type").forGetter(dha::b), dnz.a.e.fieldOf("weathering_state").forGetter(dob::m), u()).apply($$0, dob::new)
   );
   private final dnz.a m;

   @Override
   public MapCodec<dob> a() {
      return l;
   }

   protected dob(dsm $$0, dnz.a $$1, drw.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(dha.f) == dst.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(drx $$0) {
      return dnz.c($$0.b()).isPresent();
   }

   public dnz.a m() {
      return this.m;
   }
}
