import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnn implements dnv {
   public static final Codec<dnn> a = RecordCodecBuilder.create($$0 -> $$0.group(hx.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dnn::new));
   final hx c;

   public dnn(hx $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<elt> a(ctp $$0) {
      return Optional.of(elt.b(this.c));
   }

   @Override
   public dnw<?> a() {
      return dnw.a;
   }

   public static class a implements dnw<dnn> {
      public dnn a(ui $$0) {
         return new dnn($$0.e());
      }

      public void a(ui $$0, dnn $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dnn> a() {
         return dnn.a;
      }
   }
}
