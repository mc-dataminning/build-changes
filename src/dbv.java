import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbv extends cvn {
   public static final MapCodec<dbv> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dbv::new)
   );
   public static final djg f = djf.w;

   @Override
   public MapCodec<dbv> a() {
      return e;
   }

   protected dbv(dje $$0, dio.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dip $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dip a(dip $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(csy $$0, hv $$1) {
      Class<? extends blf> $$2 = switch (this.d.f()) {
         case a -> blf.class;
         case b -> blv.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f);
   }
}
