import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcw(boolean b) implements fdc {
   public static final MapCodec<fcw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fcw::e)).apply($$0, fcw::new));

   public boolean a(ezt $$0) {
      return $$0.b(fcn.l) == this.b;
   }

   @Override
   public fdd b() {
      return fde.s;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.l);
   }

   public static fdc.a c() {
      return () -> new fcw(true);
   }

   public static fdc.a d() {
      return () -> new fcw(false);
   }

   public boolean e() {
      return this.b;
   }
}
