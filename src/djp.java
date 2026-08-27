import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djp implements djx {
   public static final Codec<djp> a = RecordCodecBuilder.create($$0 -> $$0.group(gw.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, djp::new));
   final gw c;

   public djp(gw $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<ehn> a(cpv $$0) {
      return Optional.of(ehn.b(this.c));
   }

   @Override
   public djy<?> a() {
      return djy.a;
   }

   public static class a implements djy<djp> {
      public djp a(so $$0) {
         return new djp($$0.e());
      }

      public void a(so $$0, djp $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<djp> a() {
         return djp.a;
      }
   }
}
