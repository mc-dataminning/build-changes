import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnh extends dgx {
   public static final MapCodec<dnh> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dnh::new)
   );
   public static final dvf f = dve.w;

   @Override
   public MapCodec<dnh> a() {
      return e;
   }

   protected dnh(dvd $$0, dun.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(duo $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected duo a(duo $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(deg $$0, je $$1) {
      Class<? extends bto> $$2 = switch (this.d.f()) {
         case a -> bto.class;
         case b -> buk.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f);
   }
}
