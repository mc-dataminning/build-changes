import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doj extends dms implements dod {
   public static final MapCodec<doj> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dod.a.e.fieldOf("weathering_state").forGetter(dfz::c), dsb.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, doj::new)
   );
   private final dod.a J;

   @Override
   public MapCodec<doj> a() {
      return I;
   }

   public doj(dod.a $$0, dsb $$1, dsa.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsb $$0) {
      return dod.c($$0.b()).isPresent();
   }

   public dod.a m() {
      return this.J;
   }
}
