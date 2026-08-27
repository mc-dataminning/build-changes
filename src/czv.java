import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czv extends cto {
   public static final MapCodec<czv> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, czv::new)
   );
   public static final dgs f = dgr.w;

   @Override
   public MapCodec<czv> a() {
      return e;
   }

   protected czv(dgq $$0, dga.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dgb $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dgb a(dgb $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cqz $$0, ht $$1) {
      Class<? extends bjt> $$2 = switch (this.d.e()) {
         case a -> bjt.class;
         case b -> bkj.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f);
   }
}
