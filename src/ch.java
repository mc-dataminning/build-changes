import com.mojang.serialization.Codec;
import java.util.Optional;

public record ch(je<cwp> c) implements di<cwr> {
   public static final Codec<ch> a = jp.a(li.Y).xmap(ch::new, ch::b);

   @Override
   public kd<cwr> a() {
      return ke.E;
   }

   public boolean a(cuh $$0, cwr $$1) {
      Optional<ja<cwp>> $$2 = $$1.f();
      return !$$2.isEmpty() && this.c.a($$2.get());
   }

   public static cj a(je<cwp> $$0) {
      return new ch($$0);
   }

   public je<cwp> b() {
      return this.c;
   }
}
