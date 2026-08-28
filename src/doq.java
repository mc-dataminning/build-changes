import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doq extends dmf {
   public static final MapCodec<doq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bti.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, doq::new)
   );
   private final bti b;

   @Override
   public MapCodec<? extends doq> a() {
      return a;
   }

   public doq(bti $$0, eag.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, czd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
