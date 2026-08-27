import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcm extends cwe {
   public static final MapCodec<dcm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djw.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dcm::new)
   );
   public static final djy f = djx.w;

   @Override
   public MapCodec<dcm> a() {
      return e;
   }

   protected dcm(djw $$0, djg.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(djh $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected djh a(djh $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(ctp $$0, hx $$1) {
      Class<? extends blv> $$2 = switch (this.d.f()) {
         case a -> blv.class;
         case b -> bml.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(f);
   }
}
