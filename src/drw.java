import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drw extends dli {
   public static final MapCodec<drw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ead.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, drw::new)
   );
   public static final eaf d = eae.A;

   @Override
   public MapCodec<drw> a() {
      return c;
   }

   protected drw(ead $$0, dzn.d $$1) {
      super($$1, $$0);
      this.l(this.B.b().b(d, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dzo $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dzo a(dzo $$0, int $$1) {
      return $$0.b(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dip $$0, iu $$1) {
      Class<? extends bwa> $$2 = switch (this.b.f()) {
         case a -> bwa.class;
         case b -> bwz.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(d);
   }
}
