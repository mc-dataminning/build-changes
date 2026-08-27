import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fra {
   private final frf a = new frf();
   private final frg b;
   private final fqu.a c;
   private final fqu.a d;
   private final fqv e;

   public fra(int $$0) {
      this.b = frg.a($$0);
      SortedMap<frc, enr> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(frj.h(), this.a.a(frc.c()));
         $$0x.put(frj.i(), this.a.a(frc.e()));
         $$0x.put(frj.a(), this.a.a(frc.d()));
         $$0x.put(frj.k(), this.a.a(frc.f()));
         a($$0x, frj.b());
         a($$0x, frj.c());
         a($$0x, frj.d());
         a($$0x, frj.e());
         a($$0x, frj.f());
         $$0x.put(frj.g(), new enr(786432));
         a($$0x, frc.j());
         a($$0x, frc.k());
         a($$0x, frc.m());
         a($$0x, frc.n());
         a($$0x, frc.l());
         a($$0x, frc.o());
         a($$0x, frc.p());
         a($$0x, frc.i());
         gea.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = fqu.a(new enr(1536));
      this.c = fqu.a($$1, new enr(786432));
      this.e = new fqv(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<frc, enr> $$0, frc $$1) {
      $$0.put($$1, new enr($$1.G()));
   }

   public frf a() {
      return this.a;
   }

   public frg b() {
      return this.b;
   }

   public fqu.a c() {
      return this.c;
   }

   public fqu.a d() {
      return this.d;
   }

   public fqv e() {
      return this.e;
   }
}
