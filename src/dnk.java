import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnk extends dha {
   public static final MapCodec<dnk> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvh.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dnk::new)
   );
   public static final dvj f = dvi.w;

   @Override
   public MapCodec<dnk> a() {
      return e;
   }

   protected dnk(dvh $$0, dur.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dus $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dus a(dus $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dej $$0, jf $$1) {
      Class<? extends btr> $$2 = switch (this.d.f()) {
         case a -> btr.class;
         case b -> bun.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f);
   }
}
