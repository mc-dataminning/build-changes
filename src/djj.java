import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djj implements djr {
   public static final Codec<djj> a = RecordCodecBuilder.create($$0 -> $$0.group(gw.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, djj::new));
   final gw c;

   public djj(gw $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<ehh> a(cqb $$0) {
      return Optional.of(ehh.b(this.c));
   }

   @Override
   public djs<?> a() {
      return djs.a;
   }

   public static class a implements djs<djj> {
      public djj a(so $$0) {
         return new djj($$0.e());
      }

      public void a(so $$0, djj $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<djj> a() {
         return djj.a;
      }
   }
}
