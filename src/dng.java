import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dng implements dno {
   public static final Codec<dng> a = RecordCodecBuilder.create($$0 -> $$0.group(hx.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dng::new));
   final hx c;

   public dng(hx $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<elm> a(cti $$0) {
      return Optional.of(elm.b(this.c));
   }

   @Override
   public dnp<?> a() {
      return dnp.a;
   }

   public static class a implements dnp<dng> {
      public dng a(ug $$0) {
         return new dng($$0.e());
      }

      public void a(ug $$0, dng $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dng> a() {
         return dng.a;
      }
   }
}
