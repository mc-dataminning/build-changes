import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbd(fbq b, exk c) implements fau {
   public static final MapCodec<fbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbr.a.fieldOf("value").forGetter(fbd::c), exk.a.fieldOf("range").forGetter(fbd::d)).apply($$0, fbd::new)
   );

   @Override
   public fav b() {
      return faw.r;
   }

   @Override
   public Set<bat<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(exl $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static fau.a a(fbq $$0, exk $$1) {
      return () -> new fbd($$0, $$1);
   }

   public fbq c() {
      return this.b;
   }

   public exk d() {
      return this.c;
   }
}
