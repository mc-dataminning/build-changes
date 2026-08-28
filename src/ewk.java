import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ewk<T>(alo<kd<T>> d, Codec<T> e, ewk.a<T> f) {
   public static final ewk<ezr> a = new ewk<>(mb.bi, ezr.e, e());
   public static final ewk<exw> b = new ewk<>(mb.bh, exy.c, e());
   public static final ewk<ewn> c = new ewk<>(mb.bg, ewn.d, f());

   public void a(ewo $$0, alo<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ewk<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends ewj> ewk.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ewk.a<ewn> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alo<kd<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ewk.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ewo var1, alo<T> var2, T var3);
   }
}
