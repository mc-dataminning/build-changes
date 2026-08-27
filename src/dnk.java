import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dnk {
   final dnj a;
   private final ih<eca.a> b;
   private final dnc c;
   private final ctm.f d;
   private final dno e;
   private final dnj f;
   private final dnj g;
   private final Map<agl<eca.a>, eca> h;
   private final Map<agm, dnj> i;

   public static dnk a(ih.a $$0, agl<dnb> $$1, long $$2) {
      return a($$0.b(kd.ay).b($$1).a(), $$0.b(kd.az), $$2);
   }

   public static dnk a(dnb $$0, ih<eca.a> $$1, long $$2) {
      return new dnk($$0, $$1, $$2);
   }

   private dnk(dnb $$0, ih<eca.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new agm("aquifer")).e();
      this.g = this.a.a(new agm("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dno(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dmp.f {
         private final Map<dmp, dmp> d = new HashMap<>();

         private atw a(long $$0) {
            return new dmx($$2 + $$0);
         }

         @Override
         public dmp.c a(dmp.c $$0) {
            ig<eca.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dnf.a)) {
                  eca $$2 = eca.a(this.a(0L), new eca.a(-7, 1.0, 1.0));
                  return new dmp.c($$1, $$2);
               }

               if ($$1.a(dnf.b)) {
                  eca $$3 = eca.a(this.a(1L), new eca.a(-7, 1.0, 1.0));
                  return new dmp.c($$1, $$3);
               }

               if ($$1.a(dnf.j)) {
                  eca $$4 = eca.b(dnk.this.a.a(dnf.j.a()), new eca.a(0, 0.0));
                  return new dmp.c($$1, $$4);
               }
            }

            eca $$5 = dnk.this.a($$1.e().orElseThrow());
            return new dmp.c($$1, $$5);
         }

         private dmp a(dmp $$0) {
            if ($$0 instanceof ebx $$1) {
               atw $$2 = $$3 ? this.a(0L) : dnk.this.a.a(new agm("terrain"));
               return $$1.a($$2);
            } else {
               return (dmp)($$0 instanceof dmq.i ? new dmq.i($$2) : $$0);
            }
         }

         @Override
         public dmp apply(dmp $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dmp.f $$4 = new dmp.f() {
         private final Map<dmp, dmp> b = new HashMap<>();

         private dmp a(dmp $$0) {
            if ($$0 instanceof dmq.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dmq.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dmp apply(dmp $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ctm.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eca a(agl<eca.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dnf.a(this.b, this.a, $$0));
   }

   public dnj a(agm $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dnc a() {
      return this.c;
   }

   public ctm.f b() {
      return this.d;
   }

   public dno c() {
      return this.e;
   }

   public dnj d() {
      return this.f;
   }

   public dnj e() {
      return this.g;
   }
}
