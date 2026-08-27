import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class ftz {
   private final fue a = new fue();
   private final fuf b;
   private final ftt.a c;
   private final ftt.a d;
   private final ftu e;

   public ftz(int $$0) {
      this.b = fuf.a($$0);
      SortedMap<fub, eqf> $$1 = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0x -> {
         $$0x.put(fui.h(), this.a.a(fub.c()));
         $$0x.put(fui.i(), this.a.a(fub.e()));
         $$0x.put(fui.a(), this.a.a(fub.d()));
         $$0x.put(fui.k(), this.a.a(fub.f()));
         a($$0x, fui.b());
         a($$0x, fui.c());
         a($$0x, fui.d());
         a($$0x, fui.e());
         a($$0x, fui.f());
         $$0x.put(fui.g(), new eqf(786432));
         a($$0x, fub.j());
         a($$0x, fub.k());
         a($$0x, fub.m());
         a($$0x, fub.n());
         a($$0x, fub.l());
         a($$0x, fub.o());
         a($$0x, fub.p());
         a($$0x, fub.i());
         ghg.l.forEach($$1x -> a($$0x, $$1x));
      });
      this.d = ftt.a(new eqf(1536));
      this.c = ftt.a($$1, new eqf(786432));
      this.e = new ftu(this.c);
   }

   private static void a(Object2ObjectLinkedOpenHashMap<fub, eqf> $$0, fub $$1) {
      $$0.put($$1, new eqf($$1.G()));
   }

   public fue a() {
      return this.a;
   }

   public fuf b() {
      return this.b;
   }

   public ftt.a c() {
      return this.c;
   }

   public ftt.a d() {
      return this.d;
   }

   public ftu e() {
      return this.e;
   }
}
