import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftk extends fuk {
   private static final wp a = wp.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fsg c = new fsg(this);
   private final fuk d;
   private final Consumer<jr<dhj>> s;
   final ke<dhj> u;
   private ftk.a v;
   jr<dhj> w;
   private fos x;

   public ftk(fuk $$0, fzt $$1, Consumer<jr<dhj>> $$2) {
      super(wp.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(mc.aI);
      jr<dhj> $$3 = this.u.a(dhq.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aO_() {
      this.m.a(this.d);
   }

   @Override
   protected void aR_() {
      fsk $$0 = this.c.a(fsk.d().a(8));
      $$0.c().b();
      $$0.a(new fpz(this.n(), this.p));
      $$0.a(new fpz(a, this.p));
      this.v = this.c.c(new ftk.a());
      fsk $$1 = this.c.b(fsk.e().a(8));
      this.x = $$1.a(fos.a(wo.d, $$0x -> {
         this.s.accept(this.w);
         this.aO_();
      }).a());
      $$1.a(fos.a(wo.e, $$0x -> this.aO_()).a());
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
      this.x.j = this.v.p() != null;
   }

   class a extends fpo<ftk.a.a> {
      a() {
         super(ftk.this.m, ftk.this.n, ftk.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         ftk.this.u.c().map($$0x -> new ftk.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable ftk.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            ftk.this.w = $$0.b;
         }

         ftk.this.m();
      }

      class a extends fpo.a<ftk.a.a> {
         final jr.c<dhj> b;
         final wp c;

         public a(final jr.c<dhj> $$0) {
            this.b = $$0;
            akv $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tl.a().b($$2)) {
               this.c = wp.c($$2);
            } else {
               this.c = wp.b($$1.toString());
            }
         }

         @Override
         public wp a() {
            return wp.a("narrator.select", this.c);
         }

         @Override
         public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ftk.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
