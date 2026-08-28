import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fot extends fpt {
   private static final xd a = xd.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fno c = new fno(this);
   private final fpt d;
   private final Consumer<jn<det>> s;
   final ka<det> u;
   private fot.a v;
   jn<det> w;
   private fka x;

   public fot(fpt $$0, fuy $$1, Consumer<jn<det>> $$2) {
      super(xd.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().d(lv.aF);
      jn<det> $$3 = this.u.b(dfa.b).or(() -> this.u.i().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aT_() {
      fns $$0 = this.c.a(fns.d().a(8));
      $$0.c().b();
      $$0.a(new flh(this.n(), this.p));
      $$0.a(new flh(a, this.p));
      this.v = this.c.c(new fot.a());
      fns $$1 = this.c.b(fns.e().a(8));
      this.x = $$1.a(fka.a(xc.d, $$0x -> {
         this.s.accept(this.w);
         this.d();
      }).a());
      $$1.a(fka.a(xc.e, $$0x -> this.d()).a());
      this.v.a(this.v.aK_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
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

   class a extends fkw<fot.a.a> {
      a() {
         super(fot.this.m, fot.this.n, fot.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fot.this.u.i().map($$0x -> new fot.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fot.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fot.this.w = $$0.b;
         }

         fot.this.m();
      }

      class a extends fkw.a<fot.a.a> {
         final jn.c<det> b;
         final xd c;

         public a(final jn.c<det> $$0) {
            this.b = $$0;
            alb $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (ua.a().b($$2)) {
               this.c = xd.c($$2);
            } else {
               this.c = xd.b($$1.toString());
            }
         }

         @Override
         public xd a() {
            return xd.a("narrator.select", this.c);
         }

         @Override
         public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fot.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
