import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtr extends dtm implements dtn {
   public static final MapCodec<dtr> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtn.a.e.fieldOf("weathering_state").forGetter(dtr::q), t()).apply($$0, dtr::new)
   );
   private final dtn.a f;

   @Override
   protected MapCodec<dtr> a() {
      return e;
   }

   protected dtr(dtn.a $$0, dxn.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxo $$0) {
      return dtn.c($$0.b()).isPresent();
   }

   public dtn.a q() {
      return this.f;
   }
}
