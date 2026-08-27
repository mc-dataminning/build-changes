import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlr implements dlo {
   private final ia e;
   private final hb f;
   public static final Codec<dlr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ia.v(16).optionalFieldOf("offset", ia.g).forGetter($$0x -> $$0x.e), hb.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dlr::new)
   );

   public dlr(ia $$0, hb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqe $$0, gv $$1) {
      gv $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dlp<?> a() {
      return dlp.d;
   }
}
