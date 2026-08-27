import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dlg {
   final dlf a;
   private final hh<dzp.a> b;
   private final dky c;
   private final crc.f d;
   private final dlk e;
   private final dlf f;
   private final dlf g;
   private final Map<aew<dzp.a>, dzp> h;
   private final Map<aex, dlf> i;

   public static dlg a(hh.a $$0, aew<dkx> $$1, long $$2) {
      return a($$0.b(je.aw).b($$1).a(), $$0.b(je.ax), $$2);
   }

   public static dlg a(dkx $$0, hh<dzp.a> $$1, long $$2) {
      return new dlg($$0, $$1, $$2);
   }

   private dlg(dkx $$0, hh<dzp.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aex("aquifer")).e();
      this.g = this.a.a(new aex("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dlk(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dkl.f {
         private final Map<dkl, dkl> d = new HashMap<>();

         private asc a(long $$0) {
            return new dkt($$2 + $$0);
         }

         @Override
         public dkl.c a(dkl.c $$0) {
            hg<dzp.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dlb.a)) {
                  dzp $$2 = dzp.a(this.a(0L), new dzp.a(-7, 1.0, 1.0));
                  return new dkl.c($$1, $$2);
               }

               if ($$1.a(dlb.b)) {
                  dzp $$3 = dzp.a(this.a(1L), new dzp.a(-7, 1.0, 1.0));
                  return new dkl.c($$1, $$3);
               }

               if ($$1.a(dlb.j)) {
                  dzp $$4 = dzp.b(dlg.this.a.a(dlb.j.a()), new dzp.a(0, 0.0));
                  return new dkl.c($$1, $$4);
               }
            }

            dzp $$5 = dlg.this.a($$1.e().orElseThrow());
            return new dkl.c($$1, $$5);
         }

         private dkl a(dkl $$0) {
            if ($$0 instanceof dzm $$1) {
               asc $$2 = $$3 ? this.a(0L) : dlg.this.a.a(new aex("terrain"));
               return $$1.a($$2);
            } else {
               return (dkl)($$0 instanceof dkm.i ? new dkm.i($$2) : $$0);
            }
         }

         @Override
         public dkl apply(dkl $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dkl.f $$4 = new dkl.f() {
         private final Map<dkl, dkl> b = new HashMap<>();

         private dkl a(dkl $$0) {
            if ($$0 instanceof dkm.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dkm.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dkl apply(dkl $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new crc.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public dzp a(aew<dzp.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dlb.a(this.b, this.a, $$0));
   }

   public dlf a(aex $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dky a() {
      return this.c;
   }

   public crc.f b() {
      return this.d;
   }

   public dlk c() {
      return this.e;
   }

   public dlf d() {
      return this.f;
   }

   public dlf e() {
      return this.g;
   }
}
