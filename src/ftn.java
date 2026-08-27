import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class ftn {
   private final fts a = new fts();
   private final ftt b;
   private final fth.a c;
   private final fth.a d;
   private final fti e;

   public ftn(int $$0) {
      this.b = ftt.a($$0);
      SortedMap<ftp, epw> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(ftw.h(), this.a.a(ftp.c()));
         $$0x.put(ftw.i(), this.a.a(ftp.e()));
         $$0x.put(ftw.a(), this.a.a(ftp.d()));
         $$0x.put(ftw.k(), this.a.a(ftp.f()));
         a($$0x, ftw.b());
         a($$0x, ftw.c());
         a($$0x, ftw.d());
         a($$0x, ftw.e());
         a($$0x, ftw.f());
         $$0x.put(ftw.g(), new epw(786432));
         a($$0x, ftp.j());
         a($$0x, ftp.k());
         a($$0x, ftp.m());
         a($$0x, ftp.n());
         a($$0x, ftp.l());
         a($$0x, ftp.o());
         a($$0x, ftp.p());
         a($$0x, ftp.i());
         ggs.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fth.a(new epw(1536));
      this.c = fth.a($$1, new epw(786432));
      this.e = new fti(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<ftp, epw> $$0, ftp $$1) {
      $$0.put($$1, new epw($$1.G()));
   }

   public fts a() {
      return this.a;
   }

   public ftt b() {
      return this.b;
   }

   public fth.a c() {
      return this.c;
   }

   public fth.a d() {
      return this.d;
   }

   public fti e() {
      return this.e;
   }
}
