import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfo extends dde {
   public static final MapCodec<dfo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bor.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), u()).apply($$0, dfo::new)
   );
   private final bor b;

   @Override
   public MapCodec<? extends dfo> a() {
      return a;
   }

   public dfo(bor $$0, dqg.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, csz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
