import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eha extends ehf {
   private final ji<dlu> e;
   public static final MapCodec<eha> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jt.a(mg.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eha::new)
   );

   public eha(jz $$0, ji<dlu> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dzo $$0) {
      return $$0.a(this.e);
   }

   @Override
   public egv<?> a() {
      return egv.a;
   }
}
