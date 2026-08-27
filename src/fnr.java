import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SortedMap;

public class fnr {
   private final fnw a = new fnw();
   private final SortedMap<fnt, elb> b = ac.a(new Object2ObjectLinkedOpenHashMap(), $$0 -> {
      $$0.put(fnz.i(), this.a.a(fnt.c()));
      $$0.put(fnz.j(), this.a.a(fnt.e()));
      $$0.put(fnz.a(), this.a.a(fnt.d()));
      $$0.put(fnz.l(), this.a.a(fnt.f()));
      a($$0, fnz.b());
      a($$0, fnz.c());
      a($$0, fnz.d());
      a($$0, fnz.e());
      a($$0, fnz.f());
      a($$0, fnz.g());
      a($$0, fnt.h());
      a($$0, fnt.k());
      a($$0, fnt.l());
      a($$0, fnt.n());
      a($$0, fnt.o());
      a($$0, fnt.m());
      a($$0, fnt.p());
      a($$0, fnt.q());
      a($$0, fnt.j());
      gar.l.forEach($$1 -> a($$0, $$1));
   });
   private final fnl.a c = fnl.a(this.b, new elb(256));
   private final fnl.a d = fnl.a(new elb(256));
   private final fnm e = new fnm(this.c);

   private static void a(Object2ObjectLinkedOpenHashMap<fnt, elb> $$0, fnt $$1) {
      $$0.put($$1, new elb($$1.H()));
   }

   public fnw a() {
      return this.a;
   }

   public fnl.a b() {
      return this.c;
   }

   public fnl.a c() {
      return this.d;
   }

   public fnm d() {
      return this.e;
   }
}
