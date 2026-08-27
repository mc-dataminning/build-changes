import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcu extends cwm {
   public static final MapCodec<dcu> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dke.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dcu::new)
   );
   public static final dkg f = dkf.w;

   @Override
   public MapCodec<dcu> a() {
      return e;
   }

   protected dcu(dke $$0, djo.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(djp $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected djp a(djp $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(ctx $$0, hx $$1) {
      Class<? extends blw> $$2 = switch (this.d.f()) {
         case a -> blw.class;
         case b -> bmo.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(f);
   }
}
