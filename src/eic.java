import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eic implements ehz {
   private final ka e;
   private final jb f;
   public static final MapCodec<eic> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.v(16).optionalFieldOf("offset", ka.i).forGetter($$0x -> $$0x.e), jb.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, eic::new)
   );

   public eic(ka $$0, jb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dkl $$0, iv $$1) {
      iv $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public eia<?> a() {
      return eia.d;
   }
}
