import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class aey<T> {
   private static final ConcurrentMap<aey.a, aey<?>> a = new MapMaker().weakValues().makeMap();
   private final aez b;
   private final aez c;

   public static <T> Codec<aey<T>> a(aey<? extends hq<T>> $$0) {
      return aez.a.xmap($$1 -> a($$0, $$1), aey::a);
   }

   public static <T> aey<T> a(aey<? extends hq<T>> $$0, aez $$1) {
      return a($$0.c, $$1);
   }

   public static <T> aey<hq<T>> a(aez $$0) {
      return a(jb.a, $$0);
   }

   private static <T> aey<T> a(aez $$0, aez $$1) {
      return (aey<T>)a.computeIfAbsent(new aey.a($$0, $$1), $$0x -> new aey($$0x.a, $$0x.b));
   }

   private aey(aez $$0, aez $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.b + " / " + this.c + "]";
   }

   public boolean b(aey<? extends hq<?>> $$0) {
      return this.b.equals($$0.a());
   }

   public <E> Optional<aey<E>> c(aey<? extends hq<E>> $$0) {
      return this.b($$0) ? Optional.of((aey<E>)this) : Optional.empty();
   }

   public aez a() {
      return this.c;
   }

   public aez b() {
      return this.b;
   }

   static record a(aez a, aez b) {
   }
}
