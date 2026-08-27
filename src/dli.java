import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dli extends djr implements dlc {
   public static final MapCodec<dli> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlc.a.e.fieldOf("weathering_state").forGetter(dcz::c), doz.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dli::new)
   );
   private final dlc.a J;

   @Override
   public MapCodec<dli> a() {
      return I;
   }

   public dli(dlc.a $$0, doz $$1, doy.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean e_(doz $$0) {
      return dlc.c($$0.b()).isPresent();
   }

   public dlc.a k() {
      return this.J;
   }
}
