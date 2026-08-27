import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class acp<T> {
   private static final ConcurrentMap<acp.a, acp<?>> a = new MapMaker().weakValues().makeMap();
   private final acq b;
   private final acq c;

   public static <T> Codec<acp<T>> a(acp<? extends hr<T>> $$0) {
      return acq.a.xmap($$1 -> a($$0, $$1), acp::a);
   }

   public static <T> acp<T> a(acp<? extends hr<T>> $$0, acq $$1) {
      return a($$0.c, $$1);
   }

   public static <T> acp<hr<T>> a(acq $$0) {
      return a(jb.a, $$0);
   }

   private static <T> acp<T> a(acq $$0, acq $$1) {
      return (acp<T>)a.computeIfAbsent(new acp.a($$0, $$1), $$0x -> new acp($$0x.a, $$0x.b));
   }

   private acp(acq $$0, acq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(acp<? extends hr<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<acp<E>> c(acp<? extends hr<E>> $$0) {
      return this.b($$0) ? Optional.of((acp<E>)this) : Optional.empty();
   }

   public acq a() {
      return this.c;
   }

   public acq b() {
      return this.b;
   }

   static record a(acq a, acq b) {
   }
}
