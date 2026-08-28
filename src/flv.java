import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class flv extends fnb {
   private static final xo a = xo.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fkp c = new fkp(this);
   private final fnb d;
   private final Consumer<ji<dcv>> r;
   final jv<dcv> s;
   private flv.a u;
   ji<dcv> v;
   private fhc w;

   public flv(fnb $$0, fry $$1, Consumer<ji<dcv>> $$2) {
      super(xo.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.r = $$2;
      this.s = $$1.a().d(lq.az);
      ji<dcv> $$3 = this.s.b(ddc.b).or(() -> this.s.h().findAny()).orElseThrow();
      this.v = $$1.d().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aM_() {
      fkt $$0 = this.c.a(fkt.d().a(8));
      $$0.c().b();
      $$0.a(new fij(this.n(), this.p));
      $$0.a(new fij(a, this.p));
      this.u = this.c.c(new flv.a());
      fkt $$1 = this.c.b(fkt.e().a(8));
      this.w = $$1.a(fhc.a(xn.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(fhc.a(xn.e, $$0x -> this.d()).a());
      this.u.a(this.u.aE_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
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

   class a extends fhy<flv.a.a> {
      a() {
         super(flv.this.m, flv.this.n, flv.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         flv.this.s.h().map($$0x -> new flv.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable flv.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            flv.this.v = $$0.b;
         }

         flv.this.m();
      }

      class a extends fhy.a<flv.a.a> {
         final ji.c<dcv> b;
         final xo c;

         public a(final ji.c<dcv> $$0) {
            this.b = $$0;
            ale $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (um.a().b($$2)) {
               this.c = xo.c($$2);
            } else {
               this.c = xo.b($$1.toString());
            }
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.c);
         }

         @Override
         public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(flv.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
