import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dgh implements dgp {
   public static final Codec<dgh> a = RecordCodecBuilder.create($$0 -> $$0.group(gu.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dgh::new));
   final gu c;

   public dgh(gu $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<eei> a(cmm $$0) {
      return Optional.of(eei.b(this.c));
   }

   @Override
   public dgq<?> a() {
      return dgq.a;
   }

   public static class a implements dgq<dgh> {
      public dgh a(sf $$0) {
         return new dgh($$0.f());
      }

      public void a(sf $$0, dgh $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dgh> a() {
         return dgh.a;
      }
   }
}
