import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class ftm {
   private final ftr a = new ftr();
   private final fts b;
   private final ftg.a c;
   private final ftg.a d;
   private final fth e;

   public ftm(int $$0) {
      this.b = fts.a($$0);
      SortedMap<fto, epv> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(ftv.h(), this.a.a(fto.c()));
         $$0x.put(ftv.i(), this.a.a(fto.e()));
         $$0x.put(ftv.a(), this.a.a(fto.d()));
         $$0x.put(ftv.k(), this.a.a(fto.f()));
         a($$0x, ftv.b());
         a($$0x, ftv.c());
         a($$0x, ftv.d());
         a($$0x, ftv.e());
         a($$0x, ftv.f());
         $$0x.put(ftv.g(), new epv(786432));
         a($$0x, fto.j());
         a($$0x, fto.k());
         a($$0x, fto.m());
         a($$0x, fto.n());
         a($$0x, fto.l());
         a($$0x, fto.o());
         a($$0x, fto.p());
         a($$0x, fto.i());
         ggr.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = ftg.a(new epv(1536));
      this.c = ftg.a($$1, new epv(786432));
      this.e = new fth(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fto, epv> $$0, fto $$1) {
      $$0.put($$1, new epv($$1.G()));
   }

   public ftr a() {
      return this.a;
   }

   public fts b() {
      return this.b;
   }

   public ftg.a c() {
      return this.c;
   }

   public ftg.a d() {
      return this.d;
   }

   public fth e() {
      return this.e;
   }
}
