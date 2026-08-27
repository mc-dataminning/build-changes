import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aew<T> {
   private static final ConcurrentMap<aew.a, aew<?>> a = new MapMaker().weakValues().makeMap();
   private final aex b;
   private final aex c;

   public static <T> Codec<aew<T>> a(aew<? extends ht<T>> $$0) {
      return aex.a.xmap($$1 -> a($$0, $$1), aew::a);
   }

   public static <T> aew<T> a(aew<? extends ht<T>> $$0, aex $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aew<ht<T>> a(aex $$0) {
      return a(jd.a, $$0);
   }

   private static <T> aew<T> a(aex $$0, aex $$1) {
      return (aew<T>)a.computeIfAbsent(new aew.a($$0, $$1), $$0x -> new aew($$0x.a, $$0x.b));
   }

   private aew(aex $$0, aex $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(aew<? extends ht<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aew<E>> c(aew<? extends ht<E>> $$0) {
      return this.b($$0) ? Optional.of((aew<E>)this) : Optional.empty();
   }

   public aex a() {
      return this.c;
   }

   public aex b() {
      return this.b;
   }

   static record a(aex a, aex b) {
   }
}
