import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class drj {
   final dri a;
   private final ik<efz.a> b;
   private final drb c;
   private final cwz.f d;
   private final drn e;
   private final dri f;
   private final dri g;
   private final Map<aix<efz.a>, efz> h;
   private final Map<aiy, dri> i;

   public static drj a(ik.a $$0, aix<dra> $$1, long $$2) {
      return a($$0.b(kg.aA).b($$1).a(), $$0.b(kg.aB), $$2);
   }

   public static drj a(dra $$0, ik<efz.a> $$1, long $$2) {
      return new drj($$0, $$1, $$2);
   }

   private drj(dra $$0, ik<efz.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aiy("aquifer")).e();
      this.g = this.a.a(new aiy("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new drn(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dqo.f {
         private final Map<dqo, dqo> d = new HashMap<>();

         private awp a(long $$0) {
            return new dqw($$2 + $$0);
         }

         @Override
         public dqo.c a(dqo.c $$0) {
            ij<efz.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dre.a)) {
                  efz $$2 = efz.a(this.a(0L), new efz.a(-7, 1.0, 1.0));
                  return new dqo.c($$1, $$2);
               }

               if ($$1.a(dre.b)) {
                  efz $$3 = efz.a(this.a(1L), new efz.a(-7, 1.0, 1.0));
                  return new dqo.c($$1, $$3);
               }

               if ($$1.a(dre.j)) {
                  efz $$4 = efz.b(drj.this.a.a(dre.j.a()), new efz.a(0, 0.0));
                  return new dqo.c($$1, $$4);
               }
            }

            efz $$5 = drj.this.a($$1.e().orElseThrow());
            return new dqo.c($$1, $$5);
         }

         private dqo a(dqo $$0) {
            if ($$0 instanceof efw $$1) {
               awp $$2 = $$3 ? this.a(0L) : drj.this.a.a(new aiy("terrain"));
               return $$1.a($$2);
            } else {
               return (dqo)($$0 instanceof dqp.i ? new dqp.i($$2) : $$0);
            }
         }

         @Override
         public dqo apply(dqo $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dqo.f $$4 = new dqo.f() {
         private final Map<dqo, dqo> b = new HashMap<>();

         private dqo a(dqo $$0) {
            if ($$0 instanceof dqp.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dqp.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dqo apply(dqo $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cwz.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public efz a(aix<efz.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dre.a(this.b, this.a, $$0));
   }

   public dri a(aiy $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public drb a() {
      return this.c;
   }

   public cwz.f b() {
      return this.d;
   }

   public drn c() {
      return this.e;
   }

   public dri d() {
      return this.f;
   }

   public dri e() {
      return this.g;
   }
}
