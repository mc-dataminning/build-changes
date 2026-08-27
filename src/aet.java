import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aet<T> {
   private static final ConcurrentMap<aet.a, aet<?>> a = new MapMaker().weakValues().makeMap();
   private final aeu b;
   private final aeu c;

   public static <T> Codec<aet<T>> a(aet<? extends ht<T>> $$0) {
      return aeu.a.xmap($$1 -> a($$0, $$1), aet::a);
   }

   public static <T> aet<T> a(aet<? extends ht<T>> $$0, aeu $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aet<ht<T>> a(aeu $$0) {
      return a(jd.a, $$0);
   }

   private static <T> aet<T> a(aeu $$0, aeu $$1) {
      return (aet<T>)a.computeIfAbsent(new aet.a($$0, $$1), $$0x -> new aet($$0x.a, $$0x.b));
   }

   private aet(aeu $$0, aeu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(aet<? extends ht<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aet<E>> c(aet<? extends ht<E>> $$0) {
      return this.b($$0) ? Optional.of((aet<E>)this) : Optional.empty();
   }

   public aeu a() {
      return this.c;
   }

   public aeu b() {
      return this.b;
   }

   static record a(aeu a, aeu b) {
   }
}
