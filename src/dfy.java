import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfy extends dei implements dfs {
   public static final MapCodec<dfy> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfs.a.e.fieldOf("weathering_state").forGetter(cxq::c), djg.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dfy::new)
   );
   private final dfs.a J;

   @Override
   public MapCodec<dfy> a() {
      return I;
   }

   public dfy(dfs.a $$0, djg $$1, djf.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(djg $$0) {
      return dfs.c($$0.b()).isPresent();
   }

   public dfs.a g() {
      return this.J;
   }
}
