import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deg extends dcc implements deb {
   public static final MapCodec<deg> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deb.a.e.fieldOf("weathering_state").forGetter(cwb::c), u()).apply($$0, deg::new)
   );
   private final deb.a g;

   @Override
   public MapCodec<deg> a() {
      return f;
   }

   public deg(deb.a $$0, dhh.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dhi $$0) {
      return deb.c($$0.b()).isPresent();
   }

   public deb.a g() {
      return this.g;
   }
}
