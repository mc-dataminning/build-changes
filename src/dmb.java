import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmb implements dlo {
   public static final Codec<dmb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ia.v(16).optionalFieldOf("offset", ia.g).forGetter($$0x -> $$0x.e), dey.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dmb::new)
   );
   private final ia e;
   private final dey f;

   protected dmb(ia $$0, dey $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cqe $$0, gv $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dlp<?> a() {
      return dlp.g;
   }
}
