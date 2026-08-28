import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doi extends dmr implements doc {
   public static final MapCodec<doi> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(doc.a.e.fieldOf("weathering_state").forGetter(dfy::c), dsa.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, doi::new)
   );
   private final doc.a J;

   @Override
   public MapCodec<doi> a() {
      return I;
   }

   public doi(doc.a $$0, dsa $$1, drz.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsa $$0) {
      return doc.c($$0.b()).isPresent();
   }

   public doc.a m() {
      return this.J;
   }
}
