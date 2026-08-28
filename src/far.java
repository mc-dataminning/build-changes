import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record far(fau b) implements fau {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fau.e.fieldOf("term").forGetter(far::c)).apply($$0, far::new));

   @Override
   public fav b() {
      return faw.a;
   }

   public boolean a(exl $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(exr $$0) {
      fau.super.a($$0);
      this.b.a($$0);
   }

   public static fau.a a(fau.a $$0) {
      far $$1 = new far($$0.build());
      return () -> $$1;
   }

   public fau c() {
      return this.b;
   }
}
