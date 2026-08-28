import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fti extends fui {
   private static final wo a = wo.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fse c = new fse(this);
   private final fui d;
   private final Consumer<jr<dhi>> s;
   final ke<dhi> u;
   private fti.a v;
   jr<dhi> w;
   private fop x;

   public fti(fui $$0, fzr $$1, Consumer<jr<dhi>> $$2) {
      super(wo.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(mc.aI);
      jr<dhi> $$3 = this.u.a(dhp.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aO_() {
      this.m.a(this.d);
   }

   @Override
   protected void aR_() {
      fsi $$0 = this.c.a(fsi.d().a(8));
      $$0.c().b();
      $$0.a(new fpx(this.n(), this.p));
      $$0.a(new fpx(a, this.p));
      this.v = this.c.c(new fti.a());
      fsi $$1 = this.c.b(fsi.e().a(8));
      this.x = $$1.a(fop.a(wn.d, $$0x -> {
         this.s.accept(this.w);
         this.aO_();
      }).a());
      $$1.a(fop.a(wn.e, $$0x -> this.aO_()).a());
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

   class a extends fpm<fti.a.a> {
      a() {
         super(fti.this.m, fti.this.n, fti.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fti.this.u.c().map($$0x -> new fti.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fti.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fti.this.w = $$0.b;
         }

         fti.this.m();
      }

      class a extends fpm.a<fti.a.a> {
         final jr.c<dhi> b;
         final wo c;

         public a(final jr.c<dhi> $$0) {
            this.b = $$0;
            aku $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tl.a().b($$2)) {
               this.c = wo.c($$2);
            } else {
               this.c = wo.b($$1.toString());
            }
         }

         @Override
         public wo a() {
            return wo.a("narrator.select", this.c);
         }

         @Override
         public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fti.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
