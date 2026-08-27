import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djr implements djz {
   public static final Codec<djr> a = RecordCodecBuilder.create($$0 -> $$0.group(gw.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, djr::new));
   final gw c;

   public djr(gw $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<ehp> a(cpx $$0) {
      return Optional.of(ehp.b(this.c));
   }

   @Override
   public dka<?> a() {
      return dka.a;
   }

   public static class a implements dka<djr> {
      public djr a(sq $$0) {
         return new djr($$0.e());
      }

      public void a(sq $$0, djr $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<djr> a() {
         return djr.a;
      }
   }
}
