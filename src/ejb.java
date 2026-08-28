import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejb extends ejh {
   final ayc<dno> a;
   public static final MapCodec<ejb> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ayc.a(mi.i).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ejb::new)
   );

   protected ejb(kb $$0, ayc<dno> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(ebq $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eix<?> a() {
      return eix.b;
   }
}
