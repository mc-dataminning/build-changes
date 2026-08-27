import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fii extends fjo {
   private static final wg a = wg.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fhc c = new fhc(this);
   private final fjo d;
   private final Consumer<il<czw>> o;
   final iy<czw> p;
   private fii.a q;
   il<czw> r;
   private fdp s;

   public fii(fjo $$0, fol $$1, Consumer<il<czw>> $$2) {
      super(wg.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.o = $$2;
      this.p = $$1.a().d(ks.av);
      il<czw> $$3 = this.p.b(dad.b).or(() -> this.p.h().findAny()).orElseThrow();
      this.r = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.j.a(this.d);
   }

   @Override
   protected void aN_() {
      fhg $$0 = this.c.a(fhg.d().a(8));
      $$0.c().b();
      $$0.a(new few(this.n(), this.m));
      $$0.a(new few(a, this.m));
      this.q = this.c.c(new fii.a());
      fhg $$1 = this.c.b(fhg.e().a(8));
      this.s = $$1.a(fdp.a(wf.d, $$0x -> {
         this.o.accept(this.r);
         this.d();
      }).a());
      $$1.a(fdp.a(wf.e, $$0x -> this.d()).a());
      this.q.a(this.q.aF_().stream().filter($$0x -> Objects.equals($$0x.b, this.r)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.q.a(this.k, this.c);
   }

   void m() {
      this.s.j = this.q.h() != null;
   }

   class a extends fel<fii.a.a> {
      a() {
         super(fii.this.j, fii.this.k, fii.this.l - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fii.this.p.h().map($$0x -> new fii.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fii.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fii.this.r = $$0.b;
         }

         fii.this.m();
      }

      class a extends fel.a<fii.a.a> {
         final il.c<czw> b;
         final wg c;

         public a(il.c<czw> $$0) {
            this.b = $$0;
            ajt $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (th.a().b($$2)) {
               this.c = wg.c($$2);
            } else {
               this.c = wg.b($$1.toString());
            }
         }

         @Override
         public wg a() {
            return wg.a("narrator.select", this.c);
         }

         @Override
         public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fii.this.m, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
