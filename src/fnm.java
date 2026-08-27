import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fnm {
   private final fnr a = new fnr();
   private final SortedMap<fno, elc> b = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0 -> {
      $$0.put(fnu.i(), this.a.a(fno.c()));
      $$0.put(fnu.j(), this.a.a(fno.e()));
      $$0.put(fnu.a(), this.a.a(fno.d()));
      $$0.put(fnu.l(), this.a.a(fno.f()));
      a($$0, fnu.b());
      a($$0, fnu.c());
      a($$0, fnu.d());
      a($$0, fnu.e());
      a($$0, fnu.f());
      a($$0, fnu.g());
      a($$0, fno.h());
      a($$0, fno.k());
      a($$0, fno.l());
      a($$0, fno.n());
      a($$0, fno.o());
      a($$0, fno.m());
      a($$0, fno.p());
      a($$0, fno.q());
      a($$0, fno.j());
      gam.l.forEach($$1 -> a($$0, $$1));
   });
   private final fng.a c = fng.a(this.b, new elc(256));
   private final fng.a d = fng.a(new elc(256));
   private final fnh e = new fnh(this.c);

   private static void a(Object2ObjectLinkedOpenHashMap<fno, elc> $$0, fno $$1) {
      $$0.put($$1, new elc($$1.H()));
   }

   public fnr a() {
      return this.a;
   }

   public fng.a b() {
      return this.c;
   }

   public fng.a c() {
      return this.d;
   }

   public fnh d() {
      return this.e;
   }
}
