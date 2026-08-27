import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dld extends ddm implements dlc {
   public static final MapCodec<dld> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlc.a.e.fieldOf("weathering_state").forGetter(dld::k), u()).apply($$0, dld::new)
   );
   private final dlc.a e;

   @Override
   protected MapCodec<dld> a() {
      return d;
   }

   public dld(dlc.a $$0, doy.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
