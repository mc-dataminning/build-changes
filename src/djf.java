import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djf implements djn {
   public static final Codec<djf> a = RecordCodecBuilder.create($$0 -> $$0.group(gu.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, djf::new));
   final gu c;

   public djf(gu $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<ehd> a(cpl $$0) {
      return Optional.of(ehd.b(this.c));
   }

   @Override
   public djo<?> a() {
      return djo.a;
   }

   public static class a implements djo<djf> {
      public djf a(si $$0) {
         return new djf($$0.e());
      }

      public void a(si $$0, djf $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<djf> a() {
         return djf.a;
      }
   }
}
