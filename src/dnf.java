import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dnf {
   final dne a;
   private final ic<ebv.a> b;
   private final dmx c;
   private final cth.f d;
   private final dnj e;
   private final dne f;
   private final dne g;
   private final Map<agh<ebv.a>, ebv> h;
   private final Map<agi, dne> i;

   public static dnf a(ic.a $$0, agh<dmw> $$1, long $$2) {
      return a($$0.b(jz.ay).b($$1).a(), $$0.b(jz.az), $$2);
   }

   public static dnf a(dmw $$0, ic<ebv.a> $$1, long $$2) {
      return new dnf($$0, $$1, $$2);
   }

   private dnf(dmw $$0, ic<ebv.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new agi("aquifer")).e();
      this.g = this.a.a(new agi("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dnj(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dmk.f {
         private final Map<dmk, dmk> d = new HashMap<>();

         private ats a(long $$0) {
            return new dms($$2 + $$0);
         }

         @Override
         public dmk.c a(dmk.c $$0) {
            ib<ebv.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dna.a)) {
                  ebv $$2 = ebv.a(this.a(0L), new ebv.a(-7, 1.0, 1.0));
                  return new dmk.c($$1, $$2);
               }

               if ($$1.a(dna.b)) {
                  ebv $$3 = ebv.a(this.a(1L), new ebv.a(-7, 1.0, 1.0));
                  return new dmk.c($$1, $$3);
               }

               if ($$1.a(dna.j)) {
                  ebv $$4 = ebv.b(dnf.this.a.a(dna.j.a()), new ebv.a(0, 0.0));
                  return new dmk.c($$1, $$4);
               }
            }

            ebv $$5 = dnf.this.a($$1.e().orElseThrow());
            return new dmk.c($$1, $$5);
         }

         private dmk a(dmk $$0) {
            if ($$0 instanceof ebs $$1) {
               ats $$2 = $$3 ? this.a(0L) : dnf.this.a.a(new agi("terrain"));
               return $$1.a($$2);
            } else {
               return (dmk)($$0 instanceof dml.i ? new dml.i($$2) : $$0);
            }
         }

         @Override
         public dmk apply(dmk $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dmk.f $$4 = new dmk.f() {
         private final Map<dmk, dmk> b = new HashMap<>();

         private dmk a(dmk $$0) {
            if ($$0 instanceof dml.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dml.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dmk apply(dmk $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cth.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ebv a(agh<ebv.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dna.a(this.b, this.a, $$0));
   }

   public dne a(agi $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dmx a() {
      return this.c;
   }

   public cth.f b() {
      return this.d;
   }

   public dnj c() {
      return this.e;
   }

   public dne d() {
      return this.f;
   }

   public dne e() {
      return this.g;
   }
}
