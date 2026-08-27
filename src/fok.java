import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fok {
   private final fop a = new fop();
   private final SortedMap<fom, elk> b = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0 -> {
      $$0.put(fot.h(), this.a.a(fom.c()));
      $$0.put(fot.i(), this.a.a(fom.e()));
      $$0.put(fot.a(), this.a.a(fom.d()));
      $$0.put(fot.k(), this.a.a(fom.f()));
      a($$0, fot.b());
      a($$0, fot.c());
      a($$0, fot.d());
      a($$0, fot.e());
      a($$0, fot.f());
      a($$0, fot.g());
      a($$0, fom.h());
      a($$0, fom.k());
      a($$0, fom.l());
      a($$0, fom.n());
      a($$0, fom.o());
      a($$0, fom.m());
      a($$0, fom.p());
      a($$0, fom.q());
      a($$0, fom.j());
      gbk.l.forEach($$1 -> a($$0, $$1));
   });
   private final foe.a c = foe.a(this.b, new elk(256));
   private final foe.a d = foe.a(new elk(256));
   private final fof e = new fof(this.c);

   private static void a(Object2ObjectLinkedOpenHashMap<fom, elk> $$0, fom $$1) {
      $$0.put($$1, new elk($$1.H()));
   }

   public fop a() {
      return this.a;
   }

   public foe.a b() {
      return this.c;
   }

   public foe.a c() {
      return this.d;
   }

   public fof d() {
      return this.e;
   }
}
