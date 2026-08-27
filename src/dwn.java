import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dwn {
   final dwm a;
   private final ix<eld.a> b;
   private final dwf c;
   private final dbl.f d;
   private final dwr e;
   private final dwm f;
   private final dwm g;
   private final Map<akg<eld.a>, eld> h;
   private final Map<akh, dwm> i;

   public static dwn a(ix.a $$0, akg<dwe> $$1, long $$2) {
      return a($$0.b(le.aG).b($$1).a(), $$0.b(le.aH), $$2);
   }

   public static dwn a(dwe $$0, ix<eld.a> $$1, long $$2) {
      return new dwn($$0, $$1, $$2);
   }

   private dwn(dwe $$0, ix<eld.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new akh("aquifer")).e();
      this.g = this.a.a(new akh("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dwr(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dvs.f {
         private final Map<dvs, dvs> d = new HashMap<>();

         private ayg a(long $$0) {
            return new dwa($$2 + $$0);
         }

         @Override
         public dvs.c a(dvs.c $$0) {
            iw<eld.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dwi.a)) {
                  eld $$2 = eld.a(this.a(0L), new eld.a(-7, 1.0, 1.0));
                  return new dvs.c($$1, $$2);
               }

               if ($$1.a(dwi.b)) {
                  eld $$3 = eld.a(this.a(1L), new eld.a(-7, 1.0, 1.0));
                  return new dvs.c($$1, $$3);
               }

               if ($$1.a(dwi.j)) {
                  eld $$4 = eld.b(dwn.this.a.a(dwi.j.a()), new eld.a(0, 0.0));
                  return new dvs.c($$1, $$4);
               }
            }

            eld $$5 = dwn.this.a($$1.e().orElseThrow());
            return new dvs.c($$1, $$5);
         }

         private dvs a(dvs $$0) {
            if ($$0 instanceof ela $$1) {
               ayg $$2 = $$3 ? this.a(0L) : dwn.this.a.a(new akh("terrain"));
               return $$1.a($$2);
            } else {
               return (dvs)($$0 instanceof dvt.i ? new dvt.i($$2) : $$0);
            }
         }

         @Override
         public dvs apply(dvs $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dvs.f $$4 = new dvs.f() {
         private final Map<dvs, dvs> b = new HashMap<>();

         private dvs a(dvs $$0) {
            if ($$0 instanceof dvt.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dvt.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dvs apply(dvs $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dbl.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eld a(akg<eld.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dwi.a(this.b, this.a, $$0));
   }

   public dwm a(akh $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dwf a() {
      return this.c;
   }

   public dbl.f b() {
      return this.d;
   }

   public dwr c() {
      return this.e;
   }

   public dwm d() {
      return this.f;
   }

   public dwm e() {
      return this.g;
   }
}
