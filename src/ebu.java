import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebu implements ebr {
   private final ki e;
   private final jj f;
   public static final MapCodec<ebu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.v(16).optionalFieldOf("offset", ki.g).forGetter($$0x -> $$0x.e), jj.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, ebu::new)
   );

   public ebu(ki $$0, jj $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dfd $$0, je $$1) {
      je $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public ebs<?> a() {
      return ebs.d;
   }
}
