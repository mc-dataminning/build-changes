import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhl extends dfb {
   public static final MapCodec<dhl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqb.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dhl::new)
   );
   private final bqb b;

   @Override
   public MapCodec<? extends dhl> a() {
      return a;
   }

   public dhl(bqb $$0, dsd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, cur $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
