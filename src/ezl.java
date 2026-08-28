import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezl(boolean b) implements ezr {
   public static final MapCodec<ezl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(ezl::e)).apply($$0, ezl::new));

   public boolean a(ewi $$0) {
      return $$0.b(ezc.l) == this.b;
   }

   @Override
   public ezs b() {
      return ezt.s;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.l);
   }

   public static ezr.a c() {
      return () -> new ezl(true);
   }

   public static ezr.a d() {
      return () -> new ezl(false);
   }

   public boolean e() {
      return this.b;
   }
}
