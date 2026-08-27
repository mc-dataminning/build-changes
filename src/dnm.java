import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnm implements dnu {
   public static final Codec<dnm> a = RecordCodecBuilder.create($$0 -> $$0.group(hx.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dnm::new));
   final hx c;

   public dnm(hx $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<els> a(cto $$0) {
      return Optional.of(els.b(this.c));
   }

   @Override
   public dnv<?> a() {
      return dnv.a;
   }

   public static class a implements dnv<dnm> {
      public dnm a(ui $$0) {
         return new dnm($$0.e());
      }

      public void a(ui $$0, dnm $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dnm> a() {
         return dnm.a;
      }
   }
}
