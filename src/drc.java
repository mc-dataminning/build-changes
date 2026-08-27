import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class drc {
   final drb a;
   private final ik<efs.a> b;
   private final dqu c;
   private final cwv.f d;
   private final drg e;
   private final drb f;
   private final drb g;
   private final Map<aix<efs.a>, efs> h;
   private final Map<aiy, drb> i;

   public static drc a(ik.a $$0, aix<dqt> $$1, long $$2) {
      return a($$0.b(kg.aA).b($$1).a(), $$0.b(kg.aB), $$2);
   }

   public static drc a(dqt $$0, ik<efs.a> $$1, long $$2) {
      return new drc($$0, $$1, $$2);
   }

   private drc(dqt $$0, ik<efs.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new aiy("aquifer")).e();
      this.g = this.a.a(new aiy("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new drg(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dqh.f {
         private final Map<dqh, dqh> d = new HashMap<>();

         private awo a(long $$0) {
            return new dqp($$2 + $$0);
         }

         @Override
         public dqh.c a(dqh.c $$0) {
            ij<efs.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dqx.a)) {
                  efs $$2 = efs.a(this.a(0L), new efs.a(-7, 1.0, 1.0));
                  return new dqh.c($$1, $$2);
               }

               if ($$1.a(dqx.b)) {
                  efs $$3 = efs.a(this.a(1L), new efs.a(-7, 1.0, 1.0));
                  return new dqh.c($$1, $$3);
               }

               if ($$1.a(dqx.j)) {
                  efs $$4 = efs.b(drc.this.a.a(dqx.j.a()), new efs.a(0, 0.0));
                  return new dqh.c($$1, $$4);
               }
            }

            efs $$5 = drc.this.a($$1.e().orElseThrow());
            return new dqh.c($$1, $$5);
         }

         private dqh a(dqh $$0) {
            if ($$0 instanceof efp $$1) {
               awo $$2 = $$3 ? this.a(0L) : drc.this.a.a(new aiy("terrain"));
               return $$1.a($$2);
            } else {
               return (dqh)($$0 instanceof dqi.i ? new dqi.i($$2) : $$0);
            }
         }

         @Override
         public dqh apply(dqh $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dqh.f $$4 = new dqh.f() {
         private final Map<dqh, dqh> b = new HashMap<>();

         private dqh a(dqh $$0) {
            if ($$0 instanceof dqi.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dqi.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dqh apply(dqh $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cwv.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public efs a(aix<efs.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dqx.a(this.b, this.a, $$0));
   }

   public drb a(aiy $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dqu a() {
      return this.c;
   }

   public cwv.f b() {
      return this.d;
   }

   public drg c() {
      return this.e;
   }

   public drb d() {
      return this.f;
   }

   public drb e() {
      return this.g;
   }
}
