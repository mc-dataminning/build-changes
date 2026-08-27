import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dwp implements dwh {
   public static final Codec<dwp> a = RecordCodecBuilder.create($$0 -> $$0.group(dwh.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dwp::new));
   private final dwh e;

   public dwp(dwh $$0) {
      this.e = $$0;
   }

   public boolean a(dab $$0, id $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dwi<?> a() {
      return dwi.k;
   }
}
