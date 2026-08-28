import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ewj<T>(aly<kd<T>> d, Codec<T> e, ewj.a<T> f) {
   public static final ewj<ezs> a = new ewj<>(mb.bh, ezs.e, e());
   public static final ewj<exv> b = new ewj<>(mb.bg, exx.c, e());
   public static final ewj<ewm> c = new ewj<>(mb.bf, ewm.d, f());

   public void a(ewn $$0, aly<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ewj<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends ewi> ewj.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ewj.a<ewm> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public aly<kd<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ewj.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ewn var1, aly<T> var2, T var3);
   }
}
