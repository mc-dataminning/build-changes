import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class dox {
   final dow a;
   private final ii<edn.a> b;
   private final dop c;
   private final cuq.f d;
   private final dpb e;
   private final dow f;
   private final dow g;
   private final Map<ahc<edn.a>, edn> h;
   private final Map<ahd, dow> i;

   public static dox a(ii.a $$0, ahc<doo> $$1, long $$2) {
      return a($$0.b(ke.aA).b($$1).a(), $$0.b(ke.aB), $$2);
   }

   public static dox a(doo $$0, ii<edn.a> $$1, long $$2) {
      return new dox($$0, $$1, $$2);
   }

   private dox(doo $$0, ii<edn.a> $$1, final long $$2) {
      this.a = $$0.d().a($$2).e();
      this.b = $$1;
      this.f = this.a.a(new ahd("aquifer")).e();
      this.g = this.a.a(new ahd("ore")).e();
      this.h = new ConcurrentHashMap<>();
      this.i = new ConcurrentHashMap<>();
      this.e = new dpb(this, $$0.g(), $$0.l(), this.a);
      final boolean $$3 = $$0.n();

      class a implements doc.f {
         private final Map<doc, doc> d = new HashMap<>();

         private aup a(long $$0) {
            return new dok($$2 + $$0);
         }

         @Override
         public doc.c a(doc.c $$0) {
            ih<edn.a> $$1 = $$0.b();
            if ($$3) {
               if ($$1.a(dos.a)) {
                  edn $$2 = edn.a(this.a(0L), new edn.a(-7, 1.0, 1.0));
                  return new doc.c($$1, $$2);
               }

               if ($$1.a(dos.b)) {
                  edn $$3 = edn.a(this.a(1L), new edn.a(-7, 1.0, 1.0));
                  return new doc.c($$1, $$3);
               }

               if ($$1.a(dos.j)) {
                  edn $$4 = edn.b(dox.this.a.a(dos.j.a()), new edn.a(0, 0.0));
                  return new doc.c($$1, $$4);
               }
            }

            edn $$5 = dox.this.a($$1.e().orElseThrow());
            return new doc.c($$1, $$5);
         }

         private doc a(doc $$0) {
            if ($$0 instanceof edk $$1) {
               aup $$2 = $$3 ? this.a(0L) : dox.this.a.a(new ahd("terrain"));
               return $$1.a($$2);
            } else {
               return (doc)($$0 instanceof dod.i ? new dod.i($$2) : $$0);
            }
         }

         @Override
         public doc apply(doc $$0) {
            return this.d.computeIfAbsent($$0, this::a);
         }
      }

      this.c = $$0.i().a(new a());
      doc.f $$4 = new doc.f() {
         private final Map<doc, doc> b = new HashMap<>();

         private doc a(doc $$0) {
            if ($$0 instanceof dod.j $$1) {
               return $$1.j().a();
            } else {
               return $$0 instanceof dod.l $$2 ? $$2.k() : $$0;
            }
         }

         @Override
         public doc apply(doc $$0) {
            return this.b.computeIfAbsent($$0, this::a);
         }
      };
      this.d = new cuq.f(this.c.e().a($$4), this.c.f().a($$4), this.c.g().a($$4), this.c.h().a($$4), this.c.i().a($$4), this.c.j().a($$4), $$0.k());
   }

   public edn a(ahc<edn.a> $$0) {
      return this.h.computeIfAbsent($$0, $$1 -> dos.a(this.b, this.a, $$0));
   }

   public dow a(ahd $$0) {
      return this.i.computeIfAbsent($$0, $$1 -> this.a.a($$0).e());
   }

   public dop a() {
      return this.c;
   }

   public cuq.f b() {
      return this.d;
   }

   public dpb c() {
      return this.e;
   }

   public dow d() {
      return this.f;
   }

   public dow e() {
      return this.g;
   }
}
