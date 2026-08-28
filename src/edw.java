import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class edw {
   final edv a;
   private final jr<ess.a> b;
   private final edo c;
   private final dil.f d;
   private final eea e;
   private final edv f;
   private final edv g;
   private final Map<aly<ess.a>, ess> h;
   private final Map<alz, edv> i;

   public static edw a(jr.a $$0, aly<edn> $$1, long $$2) {
      return a($$0.b(mb.aQ).b($$1).a(), $$0.b(mb.aR), $$2);
   }

   public static edw a(edn $$0, jr<ess.a> $$1, long $$2) {
      return new edw($$0, $$1, $$2);
   }

   private edw(edn $$0, jr<ess.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alz.b("aquifer")).e();
      this.g = this.a.a(alz.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eea(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements edb.f {
         private final Map<edb, edb> d = new HashMap<>();

         private bam a(long $$0) {
            return new edj($$2 + $$0);
         }

         @Override
         public edb.c a(edb.c $$0) {
            jq<ess.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(edr.a)) {
                  ess $$2 = ess.a(this.a(0L), new ess.a(-7, 1.0, 1.0));
                  return new edb.c($$1, $$2);
               }

               if ($$1.a(edr.b)) {
                  ess $$3 = ess.a(this.a(1L), new ess.a(-7, 1.0, 1.0));
                  return new edb.c($$1, $$3);
               }

               if ($$1.a(edr.j)) {
                  ess $$4 = ess.b(edw.this.a.a(edr.j.a()), new ess.a(0, 0.0));
                  return new edb.c($$1, $$4);
               }
            }

            ess $$5 = edw.this.a($$1.e().orElseThrow());
            return new edb.c($$1, $$5);
         }

         private edb a(edb $$0) {
            if ($$0 instanceof esp $$1) {
               bam $$2 = $$3 ? this.a(0L) : edw.this.a.a(alz.b("terrain"));
               return $$1.a($$2);
            } else {
               return (edb)($$0 instanceof edc.i ? new edc.i($$2) : $$0);
            }
         }

         @Override
         public edb apply(edb $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      edb.f $$4 = new edb.f() {
         private final Map<edb, edb> a = new HashMap<>();

         private edb a(edb $$0) {
            if ($$0 instanceof edc.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof edc.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public edb apply(edb $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dil.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public ess a(aly<ess.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> edr.a(this.b, this.a, $$0));
   }

   public edv a(alz $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public edo a() {
      return this.c;
   }

   public dil.f b() {
      return this.d;
   }

   public eea c() {
      return this.e;
   }

   public edv d() {
      return this.f;
   }

   public edv e() {
      return this.g;
   }
}
