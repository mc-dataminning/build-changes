import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ezq<T>(alf<js<T>> d, Codec<T> e, ezq.a<T> f) {
   public static final ezq<fcx> a = new ezq<>(mh.bs, fcx.e, e());
   public static final ezq<fbc> b = new ezq<>(mh.br, fbe.c, e());
   public static final ezq<ezt> c = new ezq<>(mh.bq, ezt.d, f());

   public void a(ezu $$0, alf<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ezq<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends ezp> ezq.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ezq.a<ezt> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alf<js<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ezq.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ezu var1, alf<T> var2, T var3);
   }
}
