import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ede {
   final edd a;
   private final js<esa.a> b;
   private final ecw c;
   private final dhr.f d;
   private final edi e;
   private final edd f;
   private final edd g;
   private final Map<akt<esa.a>, esa> h;
   private final Map<aku, edd> i;

   public static ede a(js.a $$0, akt<ecv> $$1, long $$2) {
      return a($$0.b(mc.aR).b($$1).a(), $$0.b(mc.aS), $$2);
   }

   public static ede a(ecv $$0, js<esa.a> $$1, long $$2) {
      return new ede($$0, $$1, $$2);
   }

   private ede(ecv $$0, js<esa.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(aku.b("aquifer")).e();
      this.g = this.a.a(aku.b("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new edi(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements ecj.f {
         private final Map<ecj, ecj> d = new HashMap<>();

         private azg a(long $$0) {
            return new ecr($$2 + $$0);
         }

         @Override
         public ecj.c a(ecj.c $$0) {
            jr<esa.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(ecz.a)) {
                  esa $$2 = esa.a(this.a(0L), new esa.a(-7, 1.0, 1.0));
                  return new ecj.c($$1, $$2);
               }

               if ($$1.a(ecz.b)) {
                  esa $$3 = esa.a(this.a(1L), new esa.a(-7, 1.0, 1.0));
                  return new ecj.c($$1, $$3);
               }

               if ($$1.a(ecz.j)) {
                  esa $$4 = esa.b(ede.this.a.a(ecz.j.a()), new esa.a(0, 0.0));
                  return new ecj.c($$1, $$4);
               }
            }

            esa $$5 = ede.this.a($$1.e().orElseThrow());
            return new ecj.c($$1, $$5);
         }

         private ecj a(ecj $$0) {
            if ($$0 instanceof erx $$1) {
               azg $$2 = $$3 ? this.a(0L) : ede.this.a.a(aku.b("terrain"));
               return $$1.a($$2);
            } else {
               return (ecj)($$0 instanceof eck.i ? new eck.i($$2) : $$0);
            }
         }

         @Override
         public ecj apply(ecj $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      ecj.f $$4 = new ecj.f() {
         private final Map<ecj, ecj> a = new HashMap<>();

         private ecj a(ecj $$0) {
            if ($$0 instanceof eck.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof eck.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public ecj apply(ecj $$0) {
            return this.a.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new dhr.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public esa a(akt<esa.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> ecz.a(this.b, this.a, $$0));
   }

   public edd a(aku $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public ecw a() {
      return this.c;
   }

   public dhr.f b() {
      return this.d;
   }

   public edi c() {
      return this.e;
   }

   public edd d() {
      return this.f;
   }

   public edd e() {
      return this.g;
   }
}
