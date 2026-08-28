import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eaj extends ean {
   private final jq<eox> e;
   public static final MapCodec<eaj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kb.a(lu.D).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, eaj::new)
   );

   public eaj(kh $$0, jq<eox> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dta $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public ead<?> a() {
      return ead.c;
   }
}
