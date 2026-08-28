import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dts extends dnc {
   public static final MapCodec<dts> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecf.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dts::new)
   );
   public static final ech d = ecg.A;

   @Override
   public MapCodec<dts> a() {
      return c;
   }

   protected dts(ecf $$0, ebp.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(ebq $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected ebq a(ebq $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dkj $$0, iw $$1) {
      Class<? extends bxe> $$2 = switch (this.b.f()) {
         case a -> bxe.class;
         case b -> byf.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(d);
   }
}
