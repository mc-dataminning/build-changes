import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkt extends dij {
   public static final MapCodec<dkt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brm.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dkt::new)
   );
   private final brm b;

   @Override
   public MapCodec<? extends dkt> a() {
      return a;
   }

   public dkt(brm $$0, dvn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, cwf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
