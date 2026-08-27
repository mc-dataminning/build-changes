import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfr extends ddl implements dfm {
   public static final MapCodec<dfr> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfm.a.e.fieldOf("weathering_state").forGetter(cxk::c), u()).apply($$0, dfr::new)
   );
   private final dfm.a g;

   @Override
   public MapCodec<dfr> a() {
      return f;
   }

   public dfr(dfm.a $$0, diz.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
