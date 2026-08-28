import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecf implements ebr {
   public static final MapCodec<ecf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.v(16).optionalFieldOf("offset", ki.g).forGetter($$0x -> $$0x.e), duo.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, ecf::new)
   );
   private final ki e;
   private final duo f;

   protected ecf(ki $$0, duo $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dfd $$0, je $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ebs<?> a() {
      return ebs.g;
   }
}
