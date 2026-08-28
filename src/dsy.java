import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsy extends dlb implements dsx {
   public static final MapCodec<dsy> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsx.a.e.fieldOf("weathering_state").forGetter(dsy::q), t()).apply($$0, dsy::new)
   );
   private final dsx.a e;

   @Override
   protected MapCodec<dsy> a() {
      return d;
   }

   public dsy(dsx.a $$0, dwx.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwy $$0) {
      return dsx.c($$0.b()).isPresent();
   }

   public dsx.a q() {
      return this.e;
   }
}
