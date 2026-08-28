import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpp extends djb {
   public static final MapCodec<dpp> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxn.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dpp::new)
   );
   public static final dxp f = dxo.B;

   @Override
   public MapCodec<dpp> a() {
      return e;
   }

   protected dpp(dxn $$0, dwx.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dwy $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dwy a(dwy $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dgj $$0, ji $$1) {
      Class<? extends bum> $$2 = switch (this.d.f()) {
         case a -> bum.class;
         case b -> bvi.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(f);
   }
}
