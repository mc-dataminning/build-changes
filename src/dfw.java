import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfw extends dfr implements dfs {
   public static final MapCodec<dfw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfs.a.e.fieldOf("weathering_state").forGetter(dfw::g), u()).apply($$0, dfw::new)
   );
   private final dfs.a f;

   @Override
   protected MapCodec<dfw> a() {
      return e;
   }

   protected dfw(dfs.a $$0, djf.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
