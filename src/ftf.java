import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class ftf {
   private final ftk a = new ftk();
   private final ftl b;
   private final fsz.a c;
   private final fsz.a d;
   private final fta e;

   public ftf(int $$0) {
      this.b = ftl.a($$0);
      SortedMap<fth, epo> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fto.h(), this.a.a(fth.c()));
         $$0x.put(fto.i(), this.a.a(fth.e()));
         $$0x.put(fto.a(), this.a.a(fth.d()));
         $$0x.put(fto.k(), this.a.a(fth.f()));
         a($$0x, fto.b());
         a($$0x, fto.c());
         a($$0x, fto.d());
         a($$0x, fto.e());
         a($$0x, fto.f());
         $$0x.put(fto.g(), new epo(786432));
         a($$0x, fth.j());
         a($$0x, fth.k());
         a($$0x, fth.m());
         a($$0x, fth.n());
         a($$0x, fth.l());
         a($$0x, fth.o());
         a($$0x, fth.p());
         a($$0x, fth.i());
         ggl.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fsz.a(new epo(1536));
      this.c = fsz.a($$1, new epo(786432));
      this.e = new fta(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fth, epo> $$0, fth $$1) {
      $$0.put($$1, new epo($$1.G()));
   }

   public ftk a() {
      return this.a;
   }

   public ftl b() {
      return this.b;
   }

   public fsz.a c() {
      return this.c;
   }

   public fsz.a d() {
      return this.d;
   }

   public fta e() {
      return this.e;
   }
}
