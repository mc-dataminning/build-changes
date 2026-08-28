import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ett(boolean b) implements etz {
   public static final MapCodec<ett> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(ett::e)).apply($$0, ett::new));

   public boolean a(eqo $$0) {
      return $$0.b(etk.l) != this.b;
   }

   @Override
   public eua b() {
      return eub.s;
   }

   @Override
   public Set<eth<?>> a() {
      return Set.of(etk.l);
   }

   public static etz.a c() {
      return () -> new ett(true);
   }

   public static etz.a d() {
      return () -> new ett(false);
   }

   public boolean e() {
      return this.b;
   }
}
