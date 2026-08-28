import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdk(boolean b) implements fdq {
   public static final MapCodec<fdk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fdk::e)).apply($$0, fdk::new));

   public boolean a(fah $$0) {
      return $$0.b(fdb.l) == this.b;
   }

   @Override
   public fdr b() {
      return fds.s;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.l);
   }

   public static fdq.a c() {
      return () -> new fdk(true);
   }

   public static fdq.a d() {
      return () -> new fdk(false);
   }

   public boolean e() {
      return this.b;
   }
}
