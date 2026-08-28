import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record evu<T>(aku<ke<T>> d, Codec<T> e, evu.a<T> f) {
   public static final evu<ezb> a = new evu<>(mc.bi, ezb.e, e());
   public static final evu<exg> b = new evu<>(mc.bh, exi.c, e());
   public static final evu<evx> c = new evu<>(mc.bg, evx.d, f());

   public void a(evy $$0, aku<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<evu<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends evt> evu.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static evu.a<evx> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public aku<ke<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public evu.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(evy var1, aku<T> var2, T var3);
   }
}
