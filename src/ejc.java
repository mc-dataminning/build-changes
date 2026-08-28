import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ejc extends ejh {
   private final jk<dno> e;
   public static final MapCodec<ejc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jv.a(mi.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, ejc::new)
   );

   public ejc(kb $$0, jk<dno> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(ebq $$0) {
      return $$0.a(this.e);
   }

   @Override
   public eix<?> a() {
      return eix.a;
   }
}
