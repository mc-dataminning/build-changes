import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpo extends dja {
   public static final MapCodec<dpo> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxm.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dpo::new)
   );
   public static final dxo f = dxn.B;

   @Override
   public MapCodec<dpo> a() {
      return e;
   }

   protected dpo(dxm $$0, dww.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dwx $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dwx a(dwx $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dgi $$0, ji $$1) {
      Class<? extends bul> $$2 = switch (this.d.f()) {
         case a -> bul.class;
         case b -> bvh.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f);
   }
}
