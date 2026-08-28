import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsr extends ftr {
   private static final xk a = xk.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final frn c = new frn(this);
   private final ftr d;
   private final Consumer<jq<dib>> s;
   final kd<dib> u;
   private fsr.a v;
   jq<dib> w;
   private fny x;

   public fsr(ftr $$0, fza $$1, Consumer<jq<dib>> $$2) {
      super(xk.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(mb.aI);
      jq<dib> $$3 = this.u.a(dii.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   protected void aT_() {
      frr $$0 = this.c.a(frr.d().a(8));
      $$0.c().b();
      $$0.a(new fpg(this.m(), this.p));
      $$0.a(new fpg(a, this.p));
      this.v = this.c.c(new fsr.a());
      frr $$1 = this.c.b(frr.e().a(8));
      this.x = $$1.a(fny.a(xj.d, $$0x -> {
         this.s.accept(this.w);
         this.aP_();
      }).a());
      $$1.a(fny.a(xj.e, $$0x -> this.aP_()).a());
      this.v.a(this.v.aI_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.v.a(this.n, this.c);
   }

   void l() {
      this.x.j = this.v.g() != null;
   }

   class a extends fov<fsr.a.a> {
      a() {
         super(fsr.this.m, fsr.this.n, fsr.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fsr.this.u.c().map($$0x -> new fsr.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fsr.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fsr.this.w = $$0.b;
         }

         fsr.this.l();
      }

      class a extends fov.a<fsr.a.a> {
         final jq.c<dib> b;
         final xk c;

         public a(final jq.c<dib> $$0) {
            this.b = $$0;
            alp $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (uh.a().b($$2)) {
               this.c = xk.c($$2);
            } else {
               this.c = xk.b($$1.toString());
            }
         }

         @Override
         public xk a() {
            return xk.a("narrator.select", this.c);
         }

         @Override
         public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fsr.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
