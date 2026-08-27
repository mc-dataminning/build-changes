import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class frf {
   private final frk a = new frk();
   private final frl b;
   private final fqz.a c;
   private final fqz.a d;
   private final fra e;

   public frf(int $$0) {
      this.b = frl.a($$0);
      SortedMap<frh, enw> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fro.h(), this.a.a(frh.c()));
         $$0x.put(fro.i(), this.a.a(frh.e()));
         $$0x.put(fro.a(), this.a.a(frh.d()));
         $$0x.put(fro.k(), this.a.a(frh.f()));
         a($$0x, fro.b());
         a($$0x, fro.c());
         a($$0x, fro.d());
         a($$0x, fro.e());
         a($$0x, fro.f());
         $$0x.put(fro.g(), new enw(786432));
         a($$0x, frh.j());
         a($$0x, frh.k());
         a($$0x, frh.m());
         a($$0x, frh.n());
         a($$0x, frh.l());
         a($$0x, frh.o());
         a($$0x, frh.p());
         a($$0x, frh.i());
         gef.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fqz.a(new enw(1536));
      this.c = fqz.a($$1, new enw(786432));
      this.e = new fra(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<frh, enw> $$0, frh $$1) {
      $$0.put($$1, new enw($$1.G()));
   }

   public frk a() {
      return this.a;
   }

   public frl b() {
      return this.b;
   }

   public fqz.a c() {
      return this.c;
   }

   public fqz.a d() {
      return this.d;
   }

   public fra e() {
      return this.e;
   }
}
