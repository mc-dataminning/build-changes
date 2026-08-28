import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awt<T> implements Iterable<awr<T>> {
   private final kf<T> a;
   private final Map<T, awr<T>> b = new IdentityHashMap<>();
   private final wv c;
   private final yt<wg, awr<T>> d;

   public awt(kf<T> $$0, wv $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = yr.a($$0.g()).a(this::b, awr::b);
   }

   public yt<wg, awr<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awr<T> a(T $$0, aws $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awr<>(this, (T)$$1x, $$1));
   }

   public kf<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awr<T>> iterator() {
      return this.b.values().iterator();
   }

   public awr<T> b(T $$0) {
      return this.a($$0, aws.b);
   }

   public wv c() {
      return this.c;
   }
}
