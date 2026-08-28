import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eui<T>(alk<kd<T>> d, Codec<T> e, eui.a<T> f) {
   public static final eui<exr> a = new eui<>(ma.bf, exr.e, e());
   public static final eui<evu> b = new eui<>(ma.be, evw.c, e());
   public static final eui<eul> c = new eui<>(ma.bd, eul.d, f());

   public void a(eum $$0, alk<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<eui<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends euh> eui.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eui.a<eul> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alk<kd<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public eui.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eum var1, alk<T> var2, T var3);
   }
}
