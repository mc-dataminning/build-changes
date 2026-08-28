import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drp extends djx implements dro {
   public static final MapCodec<drp> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dro.a.e.fieldOf("weathering_state").forGetter(drp::q), t()).apply($$0, drp::new)
   );
   private final dro.a e;

   @Override
   protected MapCodec<drp> a() {
      return d;
   }

   public drp(dro.a $$0, dvn.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
