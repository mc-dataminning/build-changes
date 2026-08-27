import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfy extends czq {
   public static final MapCodec<dfy> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dfy::new)
   );
   public static final dns f = dnr.w;

   @Override
   public MapCodec<dfy> a() {
      return e;
   }

   protected dfy(dnq $$0, dna.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dnb $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dnb a(dnb $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cxb $$0, ib $$1) {
      Class<? extends box> $$2 = switch (this.d.f()) {
         case a -> box.class;
         case b -> bpp.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(f);
   }
}
