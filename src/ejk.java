import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejk implements eiw {
   public static final MapCodec<ejk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.v(16).optionalFieldOf("offset", kb.i).forGetter($$0x -> $$0x.e), ebq.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, ejk::new)
   );
   private final kb e;
   private final ebq f;

   protected ejk(kb $$0, ebq $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dli $$0, iw $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eix<?> a() {
      return eix.g;
   }
}
