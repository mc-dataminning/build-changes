import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class eay {
   final eax a;
   private final jo<eps.a> b;
   private final eaq c;
   private final dfq.f d;
   private final ebc e;
   private final eax f;
   private final eax g;
   private final Map<alb<eps.a>, eps> h;
   private final Map<alc, eax> i;

   public static eay a(jo.a $$0, alb<eap> $$1, long $$2) {
      return a($$0.b(lv.aP).b($$1).a(), $$0.b(lv.aQ), $$2);
   }

   public static eay a(eap $$0, jo<eps.a> $$1, long $$2) {
      return new eay($$0, $$1, $$2);
   }

   private eay(eap $$0, jo<eps.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(alc.b("aquifer")).e();
      this.g = this.a.a(alc.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new ebc(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements ead.f {
         private final Map<ead, ead> d = new HashMap<>();

         private azl a(long $$0) {
            return new eal($$2 + $$0);
         }

         @Override
         public ead.c a(ead.c $$0) {
            jn<eps.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(eat.a)) {
                  eps $$2 = eps.a(this.a(0L), new eps.a(-7, 1.0, 1.0));
                  return new ead.c($$1, $$2);
               }

               if ($$1.a(eat.b)) {
                  eps $$3 = eps.a(this.a(1L), new eps.a(-7, 1.0, 1.0));
                  return new ead.c($$1, $$3);
               }

               if ($$1.a(eat.j)) {
                  eps $$4 = eps.b(eay.this.a.a(eat.j.a()), new eps.a(0, 0.0));
                  return new ead.c($$1, $$4);
               }
            }

            eps $$5 = eay.this.a($$1.e().orElseThrow());
            return new ead.c($$1, $$5);
         }

         private ead a(ead $$0) {
            if ($$0 instanceof epp $$1) {
               azl $$2 = $$3 ? this.a(0L) : eay.this.a.a(alc.b("terrain"));
               return $$1.a($$2);
            } else {
               return (ead)($$0 instanceof eae.i ? new eae.i($$2) : $$0);
            }
         }

         @Override
         public ead apply(ead $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      ead.f $$4 = new ead.f() {
         private final Map<ead, ead> a = new HashMap<>();

         private ead a(ead $$0) {
            if ($$0 instanceof eae.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof eae.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public ead apply(ead $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dfq.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eps a(alb<eps.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> eat.a(this.b, this.a, $$0));
   }

   public eax a(alc $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public eaq a() {
      return this.c;
   }

   public dfq.f b() {
      return this.d;
   }

   public ebc c() {
      return this.e;
   }

   public eax d() {
      return this.f;
   }

   public eax e() {
      return this.g;
   }
}
