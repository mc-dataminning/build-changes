import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmv implements dnd {
   public static final Codec<dmv> a = RecordCodecBuilder.create($$0 -> $$0.group(hv.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dmv::new));
   final hv c;

   public dmv(hv $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<elb> a(csy $$0) {
      return Optional.of(elb.b(this.c));
   }

   @Override
   public dne<?> a() {
      return dne.a;
   }

   public static class a implements dne<dmv> {
      public dmv a(ue $$0) {
         return new dmv($$0.e());
      }

      public void a(ue $$0, dmv $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dmv> a() {
         return dmv.a;
      }
   }
}
