import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqp extends frp {
   private static final xl a = xl.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fpl c = new fpl(this);
   private final frp d;
   private final Consumer<jq<dgh>> s;
   final kd<dgh> u;
   private fqp.a v;
   jq<dgh> w;
   private flw x;

   public fqp(frp $$0, fwx $$1, Consumer<jq<dgh>> $$2) {
      super(xl.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(ma.aG);
      jq<dgh> $$3 = this.u.a(dgo.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   protected void aS_() {
      fpp $$0 = this.c.a(fpp.d().a(8));
      $$0.c().b();
      $$0.a(new fnd(this.n(), this.p));
      $$0.a(new fnd(a, this.p));
      this.v = this.c.c(new fqp.a());
      fpp $$1 = this.c.b(fpp.e().a(8));
      this.x = $$1.a(flw.a(xk.d, $$0x -> {
         this.s.accept(this.w);
         this.aP_();
      }).a());
      $$1.a(flw.a(xk.e, $$0x -> this.aP_()).a());
      this.v.a(this.v.aI_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
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

   class a extends fms<fqp.a.a> {
      a() {
         super(fqp.this.m, fqp.this.n, fqp.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fqp.this.u.c().map($$0x -> new fqp.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fqp.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fqp.this.w = $$0.b;
         }

         fqp.this.m();
      }

      class a extends fms.a<fqp.a.a> {
         final jq.c<dgh> b;
         final xl c;

         public a(final jq.c<dgh> $$0) {
            this.b = $$0;
            all $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (ui.a().b($$2)) {
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
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fqp.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
