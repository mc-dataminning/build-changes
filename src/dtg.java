import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtg extends dmq {
   public static final MapCodec<dtg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebt.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dtg::new)
   );
   public static final ebv d = ebu.A;

   @Override
   public MapCodec<dtg> a() {
      return c;
   }

   protected dtg(ebt $$0, ebd.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(ebe $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected ebe a(ebe $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(djx $$0, iv $$1) {
      Class<? extends bwt> $$2 = switch (this.b.f()) {
         case a -> bwt.class;
         case b -> bxu.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(d);
   }
}
