import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfs extends dec implements dfm {
   public static final MapCodec<dfs> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfm.a.e.fieldOf("weathering_state").forGetter(cxk::c), dja.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dfs::new)
   );
   private final dfm.a J;

   @Override
   public MapCodec<dfs> a() {
      return I;
   }

   public dfs(dfm.a $$0, dja $$1, diz.d $$2) {
      super($$1, $$2);
      this.J = $$0;
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
      return this.J;
   }
}
