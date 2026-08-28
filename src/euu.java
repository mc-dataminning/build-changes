import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euu(boolean b) implements eva {
   public static final MapCodec<euu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(euu::e)).apply($$0, euu::new));

   public boolean a(erp $$0) {
      return $$0.b(eul.l) == this.b;
   }

   @Override
   public evb b() {
      return evc.s;
   }

   @Override
   public Set<eui<?>> a() {
      return Set.of(eul.l);
   }

   public static eva.a c() {
      return () -> new euu(true);
   }

   public static eva.a d() {
      return () -> new euu(false);
   }

   public boolean e() {
      return this.b;
   }
}
