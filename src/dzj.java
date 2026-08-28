import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dzj {
   final dzi a;
   private final jn<eob.a> b;
   private final dzb c;
   private final ded.f d;
   private final dzn e;
   private final dzi f;
   private final dzi g;
   private final Map<akp<eob.a>, eob> h;
   private final Map<akq, dzi> i;

   public static dzj a(jn.a $$0, akp<dza> $$1, long $$2) {
      return a($$0.b(lu.aO).b($$1).a(), $$0.b(lu.aP), $$2);
   }

   public static dzj a(dza $$0, jn<eob.a> $$1, long $$2) {
      return new dzj($$0, $$1, $$2);
   }

   private dzj(dza $$0, jn<eob.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(akq.b("aquifer")).e();
      this.g = this.a.a(akq.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dzn(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements dyo.f {
         private final Map<dyo, dyo> d = new HashMap<>();

         private ayv a(long $$0) {
            return new dyw($$2 + $$0);
         }

         @Override
         public dyo.c a(dyo.c $$0) {
            jm<eob.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dze.a)) {
                  eob $$2 = eob.a(this.a(0L), new eob.a(-7, 1.0, 1.0));
                  return new dyo.c($$1, $$2);
               }

               if ($$1.a(dze.b)) {
                  eob $$3 = eob.a(this.a(1L), new eob.a(-7, 1.0, 1.0));
                  return new dyo.c($$1, $$3);
               }

               if ($$1.a(dze.j)) {
                  eob $$4 = eob.b(dzj.this.a.a(dze.j.a()), new eob.a(0, 0.0));
                  return new dyo.c($$1, $$4);
               }
            }

            eob $$5 = dzj.this.a($$1.e().orElseThrow());
            return new dyo.c($$1, $$5);
         }

         private dyo a(dyo $$0) {
            if ($$0 instanceof eny $$1) {
               ayv $$2 = $$3 ? this.a(0L) : dzj.this.a.a(akq.b("terrain"));
               return $$1.a($$2);
            } else {
               return (dyo)($$0 instanceof dyp.i ? new dyp.i($$2) : $$0);
            }
         }

         @Override
         public dyo apply(dyo $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      dyo.f $$4 = new dyo.f() {
         private final Map<dyo, dyo> a = new HashMap<>();

         private dyo a(dyo $$0) {
            if ($$0 instanceof dyp.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dyp.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public dyo apply(dyo $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new ded.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public eob a(akp<eob.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dze.a(this.b, this.a, $$0));
   }

   public dzi a(akq $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dzb a() {
      return this.c;
   }

   public ded.f b() {
      return this.d;
   }

   public dzn c() {
      return this.e;
   }

   public dzi d() {
      return this.f;
   }

   public dzi e() {
      return this.g;
   }
}
