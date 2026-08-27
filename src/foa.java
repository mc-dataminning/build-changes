import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class foa {
   private final fof a = new fof();
   private final SortedMap<foc, ela> b = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0 -> {
      $$0.put(foi.h(), this.a.a(foc.c()));
      $$0.put(foi.i(), this.a.a(foc.e()));
      $$0.put(foi.a(), this.a.a(foc.d()));
      $$0.put(foi.k(), this.a.a(foc.f()));
      a($$0, foi.b());
      a($$0, foi.c());
      a($$0, foi.d());
      a($$0, foi.e());
      a($$0, foi.f());
      a($$0, foi.g());
      a($$0, foc.h());
      a($$0, foc.k());
      a($$0, foc.l());
      a($$0, foc.n());
      a($$0, foc.o());
      a($$0, foc.m());
      a($$0, foc.p());
      a($$0, foc.q());
      a($$0, foc.j());
      gba.l.forEach($$1 -> a($$0, $$1));
   });
   private final fnu.a c = fnu.a(this.b, new ela(256));
   private final fnu.a d = fnu.a(new ela(256));
   private final fnv e = new fnv(this.c);

   private static void a(Object2ObjectLinkedOpenHashMap<foc, ela> $$0, foc $$1) {
      $$0.put($$1, new ela($$1.H()));
   }

   public fof a() {
      return this.a;
   }

   public fnu.a b() {
      return this.c;
   }

   public fnu.a c() {
      return this.d;
   }

   public fnv d() {
      return this.e;
   }
}
