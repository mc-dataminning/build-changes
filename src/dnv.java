import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnv implements dod {
   public static final Codec<dnv> a = RecordCodecBuilder.create($$0 -> $$0.group(hx.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dnv::new));
   final hx c;

   public dnv(hx $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<emc> a(ctx $$0) {
      return Optional.of(emc.b(this.c));
   }

   @Override
   public doe<?> a() {
      return doe.a;
   }

   public static class a implements doe<dnv> {
      public dnv a(uj $$0) {
         return new dnv($$0.e());
      }

      public void a(uj $$0, dnv $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dnv> a() {
         return dnv.a;
      }
   }
}
