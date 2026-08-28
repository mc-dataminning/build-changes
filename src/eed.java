import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eed {
   final eec a;
   private final jr<esz.a> b;
   private final edv c;
   private final dis.f d;
   private final eeh e;
   private final eec f;
   private final eec g;
   private final Map<aly<esz.a>, esz> h;
   private final Map<alz, eec> i;

   public static eed a(jr.a $$0, aly<edu> $$1, long $$2) {
      return a($$0.b(mb.aR).b($$1).a(), $$0.b(mb.aS), $$2);
   }

   public static eed a(edu $$0, jr<esz.a> $$1, long $$2) {
      return new eed($$0, $$1, $$2);
   }

   private eed(edu $$0, jr<esz.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alz.b("aquifer")).e();
      this.g = this.a.a(alz.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new eeh(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements edi.f {
         private final Map<edi, edi> d = new HashMap<>();

         private bam a(long $$0) {
            return new edq($$2 + $$0);
         }

         @Override
         public edi.c a(edi.c $$0) {
            jq<esz.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(edy.a)) {
                  esz $$2 = esz.a(this.a(0L), new esz.a(-7, 1.0, 1.0));
                  return new edi.c($$1, $$2);
               }

               if ($$1.a(edy.b)) {
                  esz $$3 = esz.a(this.a(1L), new esz.a(-7, 1.0, 1.0));
                  return new edi.c($$1, $$3);
               }

               if ($$1.a(edy.j)) {
                  esz $$4 = esz.b(eed.this.a.a(edy.j.a()), new esz.a(0, 0.0));
                  return new edi.c($$1, $$4);
               }
            }

            esz $$5 = eed.this.a($$1.e().orElseThrow());
            return new edi.c($$1, $$5);
         }

         private edi a(edi $$0) {
            if ($$0 instanceof esw $$1) {
               bam $$2 = $$3 ? this.a(0L) : eed.this.a.a(alz.b("terrain"));
               return $$1.a($$2);
            } else {
               return (edi)($$0 instanceof edj.i ? new edj.i($$2) : $$0);
            }
         }

         @Override
         public edi apply(edi $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      edi.f $$4 = new edi.f() {
         private final Map<edi, edi> a = new HashMap<>();

         private edi a(edi $$0) {
            if ($$0 instanceof edj.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof edj.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public edi apply(edi $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dis.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public esz a(aly<esz.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> edy.a(this.b, this.a, $$0));
   }

   public eec a(alz $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public edv a() {
      return this.c;
   }

   public dis.f b() {
      return this.d;
   }

   public eeh c() {
      return this.e;
   }

   public eec d() {
      return this.f;
   }

   public eec e() {
      return this.g;
   }
}
