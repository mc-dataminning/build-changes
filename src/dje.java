import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dje implements djm {
   public static final Codec<dje> a = RecordCodecBuilder.create($$0 -> $$0.group(gv.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dje::new));
   final gv c;

   public dje(gv $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<ehf> a(cpk $$0) {
      return Optional.of(ehf.b(this.c));
   }

   @Override
   public djn<?> a() {
      return djn.a;
   }

   public static class a implements djn<dje> {
      public dje a(sh $$0) {
         return new dje($$0.e());
      }

      public void a(sh $$0, dje $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dje> a() {
         return dje.a;
      }
   }
}
