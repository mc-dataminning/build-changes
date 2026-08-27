import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djg implements djo {
   public static final Codec<djg> a = RecordCodecBuilder.create($$0 -> $$0.group(gu.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, djg::new));
   final gu c;

   public djg(gu $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<ehe> a(cpm $$0) {
      return Optional.of(ehe.b(this.c));
   }

   @Override
   public djp<?> a() {
      return djp.a;
   }

   public static class a implements djp<djg> {
      public djg a(si $$0) {
         return new djg($$0.e());
      }

      public void a(si $$0, djg $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<djg> a() {
         return djg.a;
      }
   }
}
