import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaf implements eab {
   public static final Codec<eaf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jv.v(16).optionalFieldOf("offset", ir.c).forGetter($$0x -> $$0x.e)).apply($$0, eaf::new)
   );
   private final jv e;

   public eaf(jv $$0) {
      this.e = $$0;
   }

   public boolean a(dcv $$0, ir $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public eac<?> a() {
      return eac.h;
   }
}
