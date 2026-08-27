import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcf extends cvx {
   public static final MapCodec<dcf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dcf::new)
   );
   public static final djr f = djq.w;

   @Override
   public MapCodec<dcf> a() {
      return e;
   }

   protected dcf(djp $$0, diz.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dja $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dja a(dja $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cti $$0, hx $$1) {
      Class<? extends blp> $$2 = switch (this.d.f()) {
         case a -> blp.class;
         case b -> bmf.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f);
   }
}
