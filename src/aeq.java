import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aeq<T> {
   private static final ConcurrentMap<aeq.a, aeq<?>> a = new MapMaker().weakValues().makeMap();
   private final aer b;
   private final aer c;

   public static <T> Codec<aeq<T>> a(aeq<? extends hr<T>> $$0) {
      return aer.a.xmap($$1 -> a($$0, $$1), aeq::a);
   }

   public static <T> aeq<T> a(aeq<? extends hr<T>> $$0, aer $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aeq<hr<T>> a(aer $$0) {
      return a(jb.a, $$0);
   }

   private static <T> aeq<T> a(aer $$0, aer $$1) {
      return (aeq<T>)a.computeIfAbsent(new aeq.a($$0, $$1), $$0x -> new aeq($$0x.a, $$0x.b));
   }

   private aeq(aer $$0, aer $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(aeq<? extends hr<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aeq<E>> c(aeq<? extends hr<E>> $$0) {
      return this.b($$0) ? Optional.of((aeq<E>)this) : Optional.empty();
   }

   public aer a() {
      return this.c;
   }

   public aer b() {
      return this.b;
   }

   static record a(aer a, aer b) {
   }
}
