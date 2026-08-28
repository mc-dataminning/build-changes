import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eee {
   final eed a;
   private final jr<eta.a> b;
   private final edw c;
   private final dit.f d;
   private final eei e;
   private final eed f;
   private final eed g;
   private final Map<aly<eta.a>, eta> h;
   private final Map<alz, eed> i;

   public static eee a(jr.a $$0, aly<edv> $$1, long $$2) {
      return a($$0.b(mb.aR).b($$1).a(), $$0.b(mb.aS), $$2);
   }

   public static eee a(edv $$0, jr<eta.a> $$1, long $$2) {
      return new eee($$0, $$1, $$2);
   }

   private eee(edv $$0, jr<eta.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alz.b("aquifer")).e();
      this.g = this.a.a(alz.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eei(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements edj.f {
         private final Map<edj, edj> d = new HashMap<>();

         private bam a(long $$0) {
            return new edr($$2 + $$0);
         }

         @Override
         public edj.c a(edj.c $$0) {
            jq<eta.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(edz.a)) {
                  eta $$2 = eta.a(this.a(0L), new eta.a(-7, 1.0, 1.0));
                  return new edj.c($$1, $$2);
               }

               if ($$1.a(edz.b)) {
                  eta $$3 = eta.a(this.a(1L), new eta.a(-7, 1.0, 1.0));
                  return new edj.c($$1, $$3);
               }

               if ($$1.a(edz.j)) {
                  eta $$4 = eta.b(eee.this.a.a(edz.j.a()), new eta.a(0, 0.0));
                  return new edj.c($$1, $$4);
               }
            }

            eta $$5 = eee.this.a($$1.e().orElseThrow());
            return new edj.c($$1, $$5);
         }

         private edj a(edj $$0) {
            if ($$0 instanceof esx $$1) {
               bam $$2 = $$3 ? this.a(0L) : eee.this.a.a(alz.b("terrain"));
               return $$1.a($$2);
            } else {
               return (edj)($$0 instanceof edk.i ? new edk.i($$2) : $$0);
            }
         }

         @Override
         public edj apply(edj $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      edj.f $$4 = new edj.f() {
         private final Map<edj, edj> a = new HashMap<>();

         private edj a(edj $$0) {
            if ($$0 instanceof edk.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof edk.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public edj apply(edj $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dit.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eta a(aly<eta.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> edz.a(this.b, this.a, $$0));
   }

   public eed a(alz $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public edw a() {
      return this.c;
   }

   public dit.f b() {
      return this.d;
   }

   public eei c() {
      return this.e;
   }

   public eed d() {
      return this.f;
   }

   public eed e() {
      return this.g;
   }
}
