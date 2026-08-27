import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djv extends ddm {
   public static final MapCodec<djv> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, djv::new)
   );
   public static final drs f = drr.w;

   @Override
   public MapCodec<djv> a() {
      return e;
   }

   protected djv(drq $$0, dra.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(drb $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected drb a(drb $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dax $$0, io $$1) {
      Class<? extends bru> $$2 = switch (this.d.f()) {
         case a -> bru.class;
         case b -> bso.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f);
   }
}
