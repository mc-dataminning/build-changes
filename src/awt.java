import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

public class awt<T> implements Iterable<awr<T>> {
   private final kc<T> a;
   private final Map<T, awr<T>> b = new IdentityHashMap<>();
   private final xh c;
   private final zf<ws, awr<T>> d;

   public awt(kc<T> $$0, xh $$1) {
      this.a = $$0;
      this.c = $$1;
      this.d = zd.a($$0.g()).a(this::b, awr::b);
   }

   public zf<ws, awr<T>> a() {
      return this.d;
   }

   public boolean a(T $$0) {
      return this.b.containsKey($$0);
   }

   public awr<T> a(T $$0, aws $$1) {
      return this.b.computeIfAbsent($$0, $$1x -> new awr<>(this, (T)$$1x, $$1));
   }

   public kc<T> b() {
      return this.a;
   }

   @Override
   public Iterator<awr<T>> iterator() {
      return this.b.values().iterator();
   }

   public awr<T> b(T $$0) {
      return this.a($$0, aws.b);
   }

   public xh c() {
      return this.c;
   }
}
