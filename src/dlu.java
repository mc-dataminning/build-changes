import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlu extends dfk {
   public static final MapCodec<dlu> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtp.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dlu::new)
   );
   public static final dtr f = dtq.w;

   @Override
   public MapCodec<dlu> a() {
      return e;
   }

   protected dlu(dtp $$0, dsz.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dta $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dta a(dta $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dcu $$0, jd $$1) {
      Class<? extends bsq> $$2 = switch (this.d.f()) {
         case a -> bsq.class;
         case b -> btl.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(f);
   }
}
