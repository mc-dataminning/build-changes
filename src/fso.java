import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fso {
   private final fst a = new fst();
   private final fsu b;
   private final fsi.a c;
   private final fsi.a d;
   private final fsj e;

   public fso(int $$0) {
      this.b = fsu.a($$0);
      SortedMap<fsq, eoy> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fsx.h(), this.a.a(fsq.c()));
         $$0x.put(fsx.i(), this.a.a(fsq.e()));
         $$0x.put(fsx.a(), this.a.a(fsq.d()));
         $$0x.put(fsx.k(), this.a.a(fsq.f()));
         a($$0x, fsx.b());
         a($$0x, fsx.c());
         a($$0x, fsx.d());
         a($$0x, fsx.e());
         a($$0x, fsx.f());
         $$0x.put(fsx.g(), new eoy(786432));
         a($$0x, fsq.j());
         a($$0x, fsq.k());
         a($$0x, fsq.m());
         a($$0x, fsq.n());
         a($$0x, fsq.l());
         a($$0x, fsq.o());
         a($$0x, fsq.p());
         a($$0x, fsq.i());
         gfu.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fsi.a(new eoy(1536));
      this.c = fsi.a($$1, new eoy(786432));
      this.e = new fsj(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fsq, eoy> $$0, fsq $$1) {
      $$0.put($$1, new eoy($$1.G()));
   }

   public fst a() {
      return this.a;
   }

   public fsu b() {
      return this.b;
   }

   public fsi.a c() {
      return this.c;
   }

   public fsi.a d() {
      return this.d;
   }

   public fsj e() {
      return this.e;
   }
}
