import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fly extends fne {
   private static final xp a = xp.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fks c = new fks(this);
   private final fne d;
   private final Consumer<ji<dcy>> r;
   final jv<dcy> s;
   private fly.a u;
   ji<dcy> v;
   private fhf w;

   public fly(fne $$0, fsb $$1, Consumer<ji<dcy>> $$2) {
      super(xp.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.r = $$2;
      this.s = $$1.a().d(lq.az);
      ji<dcy> $$3 = this.s.b(ddf.b).or(() -> this.s.h().findAny()).orElseThrow();
      this.v = $$1.d().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aM_() {
      fkw $$0 = this.c.a(fkw.d().a(8));
      $$0.c().b();
      $$0.a(new fim(this.n(), this.p));
      $$0.a(new fim(a, this.p));
      this.u = this.c.c(new fly.a());
      fkw $$1 = this.c.b(fkw.e().a(8));
      this.w = $$1.a(fhf.a(xo.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(fhf.a(xo.e, $$0x -> this.d()).a());
      this.u.a(this.u.aD_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.u.a(this.n, this.c);
   }

   void m() {
      this.w.j = this.u.h() != null;
   }

   class a extends fib<fly.a.a> {
      a() {
         super(fly.this.m, fly.this.n, fly.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fly.this.s.h().map($$0x -> new fly.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fly.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fly.this.v = $$0.b;
         }

         fly.this.m();
      }

      class a extends fib.a<fly.a.a> {
         final ji.c<dcy> b;
         final xp c;

         public a(final ji.c<dcy> $$0) {
            this.b = $$0;
            alf $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (un.a().b($$2)) {
               this.c = xp.c($$2);
            } else {
               this.c = xp.b($$1.toString());
            }
         }

         @Override
         public xp a() {
            return xp.a("narrator.select", this.c);
         }

         @Override
         public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fly.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
