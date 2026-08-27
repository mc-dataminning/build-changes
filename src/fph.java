import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fph {
   private final fpm a = new fpm();
   private final SortedMap<fpj, emc> b = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0 -> {
      $$0.put(fpp.h(), this.a.a(fpj.c()));
      $$0.put(fpp.i(), this.a.a(fpj.e()));
      $$0.put(fpp.a(), this.a.a(fpj.d()));
      $$0.put(fpp.k(), this.a.a(fpj.f()));
      a($$0, fpp.b());
      a($$0, fpp.c());
      a($$0, fpp.d());
      a($$0, fpp.e());
      a($$0, fpp.f());
      a($$0, fpp.g());
      a($$0, fpj.h());
      a($$0, fpj.k());
      a($$0, fpj.l());
      a($$0, fpj.n());
      a($$0, fpj.o());
      a($$0, fpj.m());
      a($$0, fpj.p());
      a($$0, fpj.q());
      a($$0, fpj.j());
      gcg.l.forEach($$1 -> a($$0, $$1));
   });
   private final fpb.a c = fpb.a(this.b, new emc(256));
   private final fpb.a d = fpb.a(new emc(256));
   private final fpc e = new fpc(this.c);

   private static void a(Object2ObjectLinkedOpenHashMap<fpj, emc> $$0, fpj $$1) {
      $$0.put($$1, new emc($$1.H()));
   }

   public fpm a() {
      return this.a;
   }

   public fpb.a b() {
      return this.c;
   }

   public fpb.a c() {
      return this.d;
   }

   public fpc d() {
      return this.e;
   }
}
