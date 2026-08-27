import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doc implements dny {
   public static final Codec<doc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", ht.b).forGetter($$0x -> $$0x.e)).apply($$0, doc::new)
   );
   private final iw e;

   public doc(iw $$0) {
      this.e = $$0;
   }

   public boolean a(csu $$0, ht $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dnz<?> a() {
      return dnz.h;
   }
}
