import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlc implements dlk {
   public static final Codec<dlc> a = RecordCodecBuilder.create($$0 -> $$0.group(ht.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dlc::new));
   final ht c;

   public dlc(ht $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<eji> a(crs $$0) {
      return Optional.of(eji.b(this.c));
   }

   @Override
   public dll<?> a() {
      return dll.a;
   }

   public static class a implements dll<dlc> {
      public dlc a(tu $$0) {
         return new dlc($$0.e());
      }

      public void a(tu $$0, dlc $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dlc> a() {
         return dlc.a;
      }
   }
}
