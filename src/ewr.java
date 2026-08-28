import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ewr<T>(aly<kd<T>> d, Codec<T> e, ewr.a<T> f) {
   public static final ewr<ezy> a = new ewr<>(mb.bi, ezy.e, e());
   public static final ewr<eyd> b = new ewr<>(mb.bh, eyf.c, e());
   public static final ewr<ewu> c = new ewr<>(mb.bg, ewu.d, f());

   public void a(ewv $$0, aly<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ewr<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends ewq> ewr.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ewr.a<ewu> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public aly<kd<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ewr.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ewv var1, aly<T> var2, T var3);
   }
}
