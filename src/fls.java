import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fls extends fmy {
   private static final xl a = xl.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fkm c = new fkm(this);
   private final fmy d;
   private final Consumer<ji<dcs>> r;
   final jv<dcs> s;
   private fls.a u;
   ji<dcs> v;
   private fgz w;

   public fls(fmy $$0, frv $$1, Consumer<ji<dcs>> $$2) {
      super(xl.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.r = $$2;
      this.s = $$1.a().d(lq.az);
      ji<dcs> $$3 = this.s.b(dcz.b).or(() -> this.s.h().findAny()).orElseThrow();
      this.v = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aN_() {
      fkq $$0 = this.c.a(fkq.d().a(8));
      $$0.c().b();
      $$0.a(new fig(this.n(), this.p));
      $$0.a(new fig(a, this.p));
      this.u = this.c.c(new fls.a());
      fkq $$1 = this.c.b(fkq.e().a(8));
      this.w = $$1.a(fgz.a(xk.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(fgz.a(xk.e, $$0x -> this.d()).a());
      this.u.a(this.u.aF_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
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

   class a extends fhv<fls.a.a> {
      a() {
         super(fls.this.m, fls.this.n, fls.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fls.this.s.h().map($$0x -> new fls.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fls.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fls.this.v = $$0.b;
         }

         fls.this.m();
      }

      class a extends fhv.a<fls.a.a> {
         final ji.c<dcs> b;
         final xl c;

         public a(final ji.c<dcs> $$0) {
            this.b = $$0;
            alb $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (um.a().b($$2)) {
               this.c = xl.c($$2);
            } else {
               this.c = xl.b($$1.toString());
            }
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", this.c);
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fls.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
