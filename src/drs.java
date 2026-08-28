import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drs extends drn implements dro {
   public static final MapCodec<drs> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dro.a.e.fieldOf("weathering_state").forGetter(drs::q), t()).apply($$0, drs::new)
   );
   private final dro.a f;

   @Override
   protected MapCodec<drs> a() {
      return e;
   }

   protected drs(dro.a $$0, dvn.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvo $$0) {
      return dro.c($$0.b()).isPresent();
   }

   public dro.a q() {
      return this.f;
   }
}
