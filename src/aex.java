import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aex<T> {
   private static final ConcurrentMap<aex.a, aex<?>> a = new MapMaker().weakValues().makeMap();
   private final aey b;
   private final aey c;

   public static <T> Codec<aex<T>> a(aex<? extends ht<T>> $$0) {
      return aey.a.xmap($$1 -> a($$0, $$1), aex::a);
   }

   public static <T> aex<T> a(aex<? extends ht<T>> $$0, aey $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aex<ht<T>> a(aey $$0) {
      return a(jd.a, $$0);
   }

   private static <T> aex<T> a(aey $$0, aey $$1) {
      return (aex<T>)a.computeIfAbsent(new aex.a($$0, $$1), $$0x -> new aex($$0x.a, $$0x.b));
   }

   private aex(aey $$0, aey $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(aex<? extends ht<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aex<E>> c(aex<? extends ht<E>> $$0) {
      return this.b($$0) ? Optional.of((aex<E>)this) : Optional.empty();
   }

   public aey a() {
      return this.c;
   }

   public aey b() {
      return this.b;
   }

   static record a(aey a, aey b) {
   }
}
