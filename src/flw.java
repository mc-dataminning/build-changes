import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class flw extends fnc {
   private static final xo a = xo.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fkq c = new fkq(this);
   private final fnc d;
   private final Consumer<ji<dcw>> r;
   final jv<dcw> s;
   private flw.a u;
   ji<dcw> v;
   private fhd w;

   public flw(fnc $$0, frz $$1, Consumer<ji<dcw>> $$2) {
      super(xo.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.r = $$2;
      this.s = $$1.a().d(lq.az);
      ji<dcw> $$3 = this.s.b(ddd.b).or(() -> this.s.h().findAny()).orElseThrow();
      this.v = $$1.d().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aM_() {
      fku $$0 = this.c.a(fku.d().a(8));
      $$0.c().b();
      $$0.a(new fik(this.n(), this.p));
      $$0.a(new fik(a, this.p));
      this.u = this.c.c(new flw.a());
      fku $$1 = this.c.b(fku.e().a(8));
      this.w = $$1.a(fhd.a(xn.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(fhd.a(xn.e, $$0x -> this.d()).a());
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

   class a extends fhz<flw.a.a> {
      a() {
         super(flw.this.m, flw.this.n, flw.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         flw.this.s.h().map($$0x -> new flw.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable flw.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            flw.this.v = $$0.b;
         }

         flw.this.m();
      }

      class a extends fhz.a<flw.a.a> {
         final ji.c<dcw> b;
         final xo c;

         public a(final ji.c<dcw> $$0) {
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
         public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(flw.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
