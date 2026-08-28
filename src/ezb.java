import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ezb<T>(alf<jr<T>> d, Codec<T> e, ezb.a<T> f) {
   public static final ezb<fci> a = new ezb<>(mg.br, fci.e, e());
   public static final ezb<fan> b = new ezb<>(mg.bq, fap.c, e());
   public static final ezb<eze> c = new ezb<>(mg.bp, eze.d, f());

   public void a(ezf $$0, alf<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ezb<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eza> ezb.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ezb.a<eze> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alf<jr<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ezb.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ezf var1, alf<T> var2, T var3);
   }
}
