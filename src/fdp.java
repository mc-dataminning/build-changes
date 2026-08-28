import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdp(fds b) implements fds {
   public static final MapCodec<fdp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fds.e.fieldOf("term").forGetter(fdp::c)).apply($$0, fdp::new));

   @Override
   public fdt b() {
      return fdu.a;
   }

   public boolean a(faj $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(fap $$0) {
      fds.super.a($$0);
      this.b.a($$0);
   }

   public static fds.a a(fds.a $$0) {
      fdp $$1 = new fdp($$0.build());
      return () -> $$1;
   }

   public fds c() {
      return this.b;
   }
}
