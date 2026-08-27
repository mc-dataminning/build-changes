import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfn extends cxx implements dfm {
   public static final MapCodec<dfn> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfm.a.e.fieldOf("weathering_state").forGetter(dfn::g), u()).apply($$0, dfn::new)
   );
   private final dfm.a e;

   @Override
   protected MapCodec<dfn> a() {
      return d;
   }

   public dfn(dfm.a $$0, diz.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
