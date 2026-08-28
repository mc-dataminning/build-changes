import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duj extends dnb implements duh {
   public static final MapCodec<duj> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzb.a.fieldOf("block_set_type").forGetter(dnb::b), duh.a.e.fieldOf("weathering_state").forGetter(duj::q), t()).apply($$0, duj::new)
   );
   private final duh.a h;

   @Override
   public MapCodec<duj> a() {
      return g;
   }

   protected duj(dzb $$0, duh.a $$1, dyl.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(dnb.c) == dzi.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dym $$0) {
      return duh.c($$0.b()).isPresent();
   }

   public duh.a q() {
      return this.h;
   }
}
