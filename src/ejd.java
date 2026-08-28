import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ejd extends ejh {
   private final jk<exz> e;
   public static final MapCodec<ejd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jv.a(mi.F).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, ejd::new)
   );

   public ejd(kb $$0, jk<exz> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(ebq $$0) {
      return $$0.y().a(this.e);
   }

   @Override
   public eix<?> a() {
      return eix.c;
   }
}
