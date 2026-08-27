import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class ftl {
   private final ftq a = new ftq();
   private final ftr b;
   private final ftf.a c;
   private final ftf.a d;
   private final ftg e;

   public ftl(int $$0) {
      this.b = ftr.a($$0);
      SortedMap<ftn, epu> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(ftu.h(), this.a.a(ftn.c()));
         $$0x.put(ftu.i(), this.a.a(ftn.e()));
         $$0x.put(ftu.a(), this.a.a(ftn.d()));
         $$0x.put(ftu.k(), this.a.a(ftn.f()));
         a($$0x, ftu.b());
         a($$0x, ftu.c());
         a($$0x, ftu.d());
         a($$0x, ftu.e());
         a($$0x, ftu.f());
         $$0x.put(ftu.g(), new epu(786432));
         a($$0x, ftn.j());
         a($$0x, ftn.k());
         a($$0x, ftn.m());
         a($$0x, ftn.n());
         a($$0x, ftn.l());
         a($$0x, ftn.o());
         a($$0x, ftn.p());
         a($$0x, ftn.i());
         ggq.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = ftf.a(new epu(1536));
      this.c = ftf.a($$1, new epu(786432));
      this.e = new ftg(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<ftn, epu> $$0, ftn $$1) {
      $$0.put($$1, new epu($$1.G()));
   }

   public ftq a() {
      return this.a;
   }

   public ftr b() {
      return this.b;
   }

   public ftf.a c() {
      return this.c;
   }

   public ftf.a d() {
      return this.d;
   }

   public ftg e() {
      return this.e;
   }
}
