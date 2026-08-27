import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfq extends dfl implements dfm {
   public static final MapCodec<dfq> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfm.a.e.fieldOf("weathering_state").forGetter(dfq::g), u()).apply($$0, dfq::new)
   );
   private final dfm.a f;

   @Override
   protected MapCodec<dfq> a() {
      return e;
   }

   protected dfq(dfm.a $$0, diz.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dja $$0) {
      return dfm.c($$0.b()).isPresent();
   }

   public dfm.a g() {
      return this.f;
   }
}
