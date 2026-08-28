import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dzm {
   final dzl a;
   private final jn<eof.a> b;
   private final dze c;
   private final def.f d;
   private final dzq e;
   private final dzl f;
   private final dzl g;
   private final Map<akq<eof.a>, eof> h;
   private final Map<akr, dzl> i;

   public static dzm a(jn.a $$0, akq<dzd> $$1, long $$2) {
      return a($$0.b(lu.aO).b($$1).a(), $$0.b(lu.aP), $$2);
   }

   public static dzm a(dzd $$0, jn<eof.a> $$1, long $$2) {
      return new dzm($$0, $$1, $$2);
   }

   private dzm(dzd $$0, jn<eof.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(akr.b("aquifer")).e();
      this.g = this.a.a(akr.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dzq(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dyr.f {
         private final Map<dyr, dyr> d = new HashMap<>();

         private ayw a(long $$0) {
            return new dyz($$2 + $$0);
         }

         @Override
         public dyr.c a(dyr.c $$0) {
            jm<eof.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dzh.a)) {
                  eof $$2 = eof.a(this.a(0L), new eof.a(-7, 1.0, 1.0));
                  return new dyr.c($$1, $$2);
               }

               if ($$1.a(dzh.b)) {
                  eof $$3 = eof.a(this.a(1L), new eof.a(-7, 1.0, 1.0));
                  return new dyr.c($$1, $$3);
               }

               if ($$1.a(dzh.j)) {
                  eof $$4 = eof.b(dzm.this.a.a(dzh.j.a()), new eof.a(0, 0.0));
                  return new dyr.c($$1, $$4);
               }
            }

            eof $$5 = dzm.this.a($$1.e().orElseThrow());
            return new dyr.c($$1, $$5);
         }

         private dyr a(dyr $$0) {
            if ($$0 instanceof eoc $$1) {
               ayw $$2 = $$3 ? this.a(0L) : dzm.this.a.a(akr.b("terrain"));
               return $$1.a($$2);
            } else {
               return (dyr)($$0 instanceof dys.i ? new dys.i($$2) : $$0);
            }
         }

         @Override
         public dyr apply(dyr $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dyr.f $$4 = new dyr.f() {
         private final Map<dyr, dyr> a = new HashMap<>();

         private dyr a(dyr $$0) {
            if ($$0 instanceof dys.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dys.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dyr apply(dyr $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new def.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eof a(akq<eof.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dzh.a(this.b, this.a, $$0));
   }

   public dzl a(akr $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dze a() {
      return this.c;
   }

   public def.f b() {
      return this.d;
   }

   public dzq c() {
      return this.e;
   }

   public dzl d() {
      return this.f;
   }

   public dzl e() {
      return this.g;
   }
}
