import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxa extends dpj implements dwy {
   public static final MapCodec<dxa> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebt.a.fieldOf("block_set_type").forGetter(dpj::b), dwy.a.e.fieldOf("weathering_state").forGetter(dxa::q), t()).apply($$0, dxa::new)
   );
   private final dwy.a h;

   @Override
   public MapCodec<dxa> a() {
      return g;
   }

   protected dxa(ebt $$0, dwy.a $$1, ebd.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(dpj.c) == eca.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(ebe $$0) {
      return dwy.c($$0.b()).isPresent();
   }

   public dwy.a q() {
      return this.h;
   }
}
