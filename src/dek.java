import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dek extends cyc {
   public static final MapCodec<dek> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlu.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dek::new)
   );
   public static final dlw f = dlv.w;

   @Override
   public MapCodec<dek> a() {
      return e;
   }

   protected dek(dlu $$0, dle.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dlf $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dlf a(dlf $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cvn $$0, hz $$1) {
      Class<? extends bno> $$2 = switch (this.d.f()) {
         case a -> bno.class;
         case b -> bog.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f);
   }
}
