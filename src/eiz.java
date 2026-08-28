import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiz implements eiw {
   private final kb e;
   private final jc f;
   public static final MapCodec<eiz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.v(16).optionalFieldOf("offset", kb.i).forGetter($$0x -> $$0x.e), jc.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, eiz::new)
   );

   public eiz(kb $$0, jc $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dli $$0, iw $$1) {
      iw $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public eix<?> a() {
      return eix.d;
   }
}
