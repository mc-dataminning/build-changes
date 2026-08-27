import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class agl<T> {
   private static final ConcurrentMap<agl.a, agl<?>> a = new MapMaker().weakValues().makeMap();
   private final agm b;
   private final agm c;

   public static <T> Codec<agl<T>> a(agl<? extends is<T>> $$0) {
      return agm.a.xmap($$1 -> a($$0, $$1), agl::a);
   }

   public static <T> agl<T> a(agl<? extends is<T>> $$0, agm $$1) {
      return a($$0.c, $$1);
   }

   public static <T> agl<is<T>> a(agm $$0) {
      return a(kc.a, $$0);
   }

   private static <T> agl<T> a(agm $$0, agm $$1) {
      return (agl<T>)a.computeIfAbsent(new agl.a($$0, $$1), $$0x -> new agl($$0x.a, $$0x.b));
   }

   private agl(agm $$0, agm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(agl<? extends is<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<agl<E>> c(agl<? extends is<E>> $$0) {
      return this.b($$0) ? Optional.of((agl<E>)this) : Optional.empty();
   }

   public agm a() {
      return this.c;
   }

   public agm b() {
      return this.b;
   }

   static record a(agm a, agm b) {
   }
}
