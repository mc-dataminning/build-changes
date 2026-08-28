import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ezj<T>(alf<jr<T>> d, Codec<T> e, ezj.a<T> f) {
   public static final ezj<fcq> a = new ezj<>(mg.bs, fcq.e, e());
   public static final ezj<fav> b = new ezj<>(mg.br, fax.c, e());
   public static final ezj<ezm> c = new ezj<>(mg.bq, ezm.d, f());

   public void a(ezn $$0, alf<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ezj<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends ezi> ezj.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ezj.a<ezm> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alf<jr<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ezj.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ezn var1, alf<T> var2, T var3);
   }
}
