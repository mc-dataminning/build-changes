import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmy extends dkm {
   public static final MapCodec<dmy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bso.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dmy::new)
   );
   private final bso b;

   @Override
   public MapCodec<? extends dmy> a() {
      return a;
   }

   public dmy(bso $$0, dxu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, cxp $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
