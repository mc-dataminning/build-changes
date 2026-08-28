import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqa extends fra {
   private static final xi a = xi.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fow c = new fow(this);
   private final fra d;
   private final Consumer<jq<dgc>> s;
   final kd<dgc> u;
   private fqa.a v;
   jq<dgc> w;
   private flh x;

   public fqa(fra $$0, fwh $$1, Consumer<jq<dgc>> $$2) {
      super(xi.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(lz.aG);
      jq<dgc> $$3 = this.u.a(dgj.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aR_() {
      fpa $$0 = this.c.a(fpa.d().a(8));
      $$0.c().b();
      $$0.a(new fmo(this.n(), this.p));
      $$0.a(new fmo(a, this.p));
      this.v = this.c.c(new fqa.a());
      fpa $$1 = this.c.b(fpa.e().a(8));
      this.x = $$1.a(flh.a(xh.d, $$0x -> {
         this.s.accept(this.w);
         this.d();
      }).a());
      $$1.a(flh.a(xh.e, $$0x -> this.d()).a());
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

   class a extends fmd<fqa.a.a> {
      a() {
         super(fqa.this.m, fqa.this.n, fqa.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fqa.this.u.c().map($$0x -> new fqa.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fqa.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fqa.this.w = $$0.b;
         }

         fqa.this.m();
      }

      class a extends fmd.a<fqa.a.a> {
         final jq.c<dgc> b;
         final xi c;

         public a(final jq.c<dgc> $$0) {
            this.b = $$0;
            ali $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (uf.a().b($$2)) {
               this.c = xi.c($$2);
            } else {
               this.c = xi.b($$1.toString());
            }
         }

         @Override
         public xi a() {
            return xi.a("narrator.select", this.c);
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fqa.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
