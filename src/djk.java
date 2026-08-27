import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djk implements djs {
   public static final Codec<djk> a = RecordCodecBuilder.create($$0 -> $$0.group(gw.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, djk::new));
   final gw c;

   public djk(gw $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<ehi> a(cpq $$0) {
      return Optional.of(ehi.b(this.c));
   }

   @Override
   public djt<?> a() {
      return djt.a;
   }

   public static class a implements djt<djk> {
      public djk a(sl $$0) {
         return new djk($$0.e());
      }

      public void a(sl $$0, djk $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<djk> a() {
         return djk.a;
      }
   }
}
