import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fph extends fqh {
   private static final xe a = xe.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final foc c = new foc(this);
   private final fqh d;
   private final Consumer<jo<dfk>> s;
   final kb<dfk> u;
   private fph.a v;
   jo<dfk> w;
   private fko x;

   public fph(fqh $$0, fvm $$1, Consumer<jo<dfk>> $$2) {
      super(xe.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(lw.aH);
      jo<dfk> $$3 = this.u.a(dfr.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aS_() {
      fog $$0 = this.c.a(fog.d().a(8));
      $$0.c().b();
      $$0.a(new flv(this.n(), this.p));
      $$0.a(new flv(a, this.p));
      this.v = this.c.c(new fph.a());
      fog $$1 = this.c.b(fog.e().a(8));
      this.x = $$1.a(fko.a(xd.d, $$0x -> {
         this.s.accept(this.w);
         this.d();
      }).a());
      $$1.a(fko.a(xd.e, $$0x -> this.d()).a());
      this.v.a(this.v.aJ_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.v.a(this.n, this.c);
   }

   void m() {
      this.x.j = this.v.h() != null;
   }

   class a extends flk<fph.a.a> {
      a() {
         super(fph.this.m, fph.this.n, fph.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fph.this.u.c().map($$0x -> new fph.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fph.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fph.this.w = $$0.b;
         }

         fph.this.m();
      }

      class a extends flk.a<fph.a.a> {
         final jo.c<dfk> b;
         final xe c;

         public a(final jo.c<dfk> $$0) {
            this.b = $$0;
            ale $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (ub.a().b($$2)) {
               this.c = xe.c($$2);
            } else {
               this.c = xe.b($$1.toString());
            }
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", this.c);
         }

         @Override
         public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fph.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
