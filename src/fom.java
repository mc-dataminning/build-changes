import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fom {
   private final fos a = new fos();
   private final SortedMap<foo, elm> b = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0 -> {
      $$0.put(fov.h(), this.a.a(foo.c()));
      $$0.put(fov.i(), this.a.a(foo.e()));
      $$0.put(fov.a(), this.a.a(foo.d()));
      $$0.put(fov.k(), this.a.a(foo.f()));
      a($$0, fov.b());
      a($$0, fov.c());
      a($$0, fov.d());
      a($$0, fov.e());
      a($$0, fov.f());
      a($$0, fov.g());
      a($$0, foo.h());
      a($$0, foo.k());
      a($$0, foo.l());
      a($$0, foo.n());
      a($$0, foo.o());
      a($$0, foo.m());
      a($$0, foo.p());
      a($$0, foo.q());
      a($$0, foo.j());
      gbm.l.forEach($$1 -> a($$0, $$1));
   });
   private final fog.a c = fog.a(this.b, new elm(256));
   private final fog.a d = fog.a(new elm(256));
   private final foh e = new foh(this.c);

   private static void a(Object2ObjectLinkedOpenHashMap<foo, elm> $$0, foo $$1) {
      $$0.put($$1, new elm($$1.H()));
   }

   public fos a() {
      return this.a;
   }

   public fog.a b() {
      return this.c;
   }

   public fog.a c() {
      return this.d;
   }

   public foh d() {
      return this.e;
   }
}
