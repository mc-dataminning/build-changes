import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dvo {
   final dvn a;
   private final io<eke.a> b;
   private final dvg c;
   private final dao.f d;
   private final dvs e;
   private final dvn f;
   private final dvn g;
   private final Map<aju<eke.a>, eke> h;
   private final Map<ajv, dvn> i;

   public static dvo a(io.a $$0, aju<dvf> $$1, long $$2) {
      return a($$0.b(ku.aD).b($$1).a(), $$0.b(ku.aE), $$2);
   }

   public static dvo a(dvf $$0, io<eke.a> $$1, long $$2) {
      return new dvo($$0, $$1, $$2);
   }

   private dvo(dvf $$0, io<eke.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ajv("aquifer")).e();
      this.g = this.a.a(new ajv("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dvs(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dut.f {
         private final Map<dut, dut> d = new HashMap<>();

         private axt a(long $$0) {
            return new dvb($$2 + $$0);
         }

         @Override
         public dut.c a(dut.c $$0) {
            in<eke.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dvj.a)) {
                  eke $$2 = eke.a(this.a(0L), new eke.a(-7, 1.0, 1.0));
                  return new dut.c($$1, $$2);
               }

               if ($$1.a(dvj.b)) {
                  eke $$3 = eke.a(this.a(1L), new eke.a(-7, 1.0, 1.0));
                  return new dut.c($$1, $$3);
               }

               if ($$1.a(dvj.j)) {
                  eke $$4 = eke.b(dvo.this.a.a(dvj.j.a()), new eke.a(0, 0.0));
                  return new dut.c($$1, $$4);
               }
            }

            eke $$5 = dvo.this.a($$1.e().orElseThrow());
            return new dut.c($$1, $$5);
         }

         private dut a(dut $$0) {
            if ($$0 instanceof ekb $$1) {
               axt $$2 = $$3 ? this.a(0L) : dvo.this.a.a(new ajv("terrain"));
               return $$1.a($$2);
            } else {
               return (dut)($$0 instanceof duu.i ? new duu.i($$2) : $$0);
            }
         }

         @Override
         public dut apply(dut $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dut.f $$4 = new dut.f() {
         private final Map<dut, dut> b = new HashMap<>();

         private dut a(dut $$0) {
            if ($$0 instanceof duu.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof duu.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dut apply(dut $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dao.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eke a(aju<eke.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dvj.a(this.b, this.a, $$0));
   }

   public dvn a(ajv $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dvg a() {
      return this.c;
   }

   public dao.f b() {
      return this.d;
   }

   public dvs c() {
      return this.e;
   }

   public dvn d() {
      return this.f;
   }

   public dvn e() {
      return this.g;
   }
}
