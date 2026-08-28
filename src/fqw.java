import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqw extends frw {
   private static final xj a = xj.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fps c = new fps(this);
   private final frw d;
   private final Consumer<jq<dgo>> s;
   final kd<dgo> u;
   private fqw.a v;
   jq<dgo> w;
   private fmd x;

   public fqw(frw $$0, fxf $$1, Consumer<jq<dgo>> $$2) {
      super(xj.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(ma.aG);
      jq<dgo> $$3 = this.u.a(dgv.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aO_() {
      this.m.a(this.d);
   }

   @Override
   protected void aR_() {
      fpw $$0 = this.c.a(fpw.d().a(8));
      $$0.c().b();
      $$0.a(new fnk(this.n(), this.p));
      $$0.a(new fnk(a, this.p));
      this.v = this.c.c(new fqw.a());
      fpw $$1 = this.c.b(fpw.e().a(8));
      this.x = $$1.a(fmd.a(xi.d, $$0x -> {
         this.s.accept(this.w);
         this.aO_();
      }).a());
      $$1.a(fmd.a(xi.e, $$0x -> this.aO_()).a());
      this.v.a(this.v.aH_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
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

   class a extends fmz<fqw.a.a> {
      a() {
         super(fqw.this.m, fqw.this.n, fqw.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fqw.this.u.c().map($$0x -> new fqw.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fqw.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fqw.this.w = $$0.b;
         }

         fqw.this.m();
      }

      class a extends fmz.a<fqw.a.a> {
         final jq.c<dgo> b;
         final xj c;

         public a(final jq.c<dgo> $$0) {
            this.b = $$0;
            alj $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (ug.a().b($$2)) {
               this.c = xj.c($$2);
            } else {
               this.c = xj.b($$1.toString());
            }
         }

         @Override
         public xj a() {
            return xj.a("narrator.select", this.c);
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fqw.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
