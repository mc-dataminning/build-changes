import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fqn {
   private final fqs a = new fqs();
   private final fqt b;
   private final fqh.a c;
   private final fqh.a d;
   private final fqi e;

   public fqn(int $$0) {
      this.b = fqt.a($$0);
      SortedMap<fqp, enf> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fqw.h(), this.a.a(fqp.c()));
         $$0x.put(fqw.i(), this.a.a(fqp.e()));
         $$0x.put(fqw.a(), this.a.a(fqp.d()));
         $$0x.put(fqw.k(), this.a.a(fqp.f()));
         a($$0x, fqw.b());
         a($$0x, fqw.c());
         a($$0x, fqw.d());
         a($$0x, fqw.e());
         a($$0x, fqw.f());
         $$0x.put(fqw.g(), new enf(786432));
         a($$0x, fqp.j());
         a($$0x, fqp.k());
         a($$0x, fqp.m());
         a($$0x, fqp.n());
         a($$0x, fqp.l());
         a($$0x, fqp.o());
         a($$0x, fqp.p());
         a($$0x, fqp.i());
         gdn.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fqh.a(new enf(1536));
      this.c = fqh.a($$1, new enf(786432));
      this.e = new fqi(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fqp, enf> $$0, fqp $$1) {
      $$0.put($$1, new enf($$1.G()));
   }

   public fqs a() {
      return this.a;
   }

   public fqt b() {
      return this.b;
   }

   public fqh.a c() {
      return this.c;
   }

   public fqh.a d() {
      return this.d;
   }

   public fqi e() {
      return this.e;
   }
}
