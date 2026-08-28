import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ewq<T>(aly<kd<T>> d, Codec<T> e, ewq.a<T> f) {
   public static final ewq<ezx> a = new ewq<>(mb.bi, ezx.e, e());
   public static final ewq<eyc> b = new ewq<>(mb.bh, eye.c, e());
   public static final ewq<ewt> c = new ewq<>(mb.bg, ewt.d, f());

   public void a(ewu $$0, aly<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ewq<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends ewp> ewq.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ewq.a<ewt> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public aly<kd<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ewq.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ewu var1, aly<T> var2, T var3);
   }
}
