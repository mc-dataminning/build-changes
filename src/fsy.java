import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsy extends fty {
   private static final xv a = xv.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fru c = new fru(this);
   private final fty d;
   private final Consumer<jq<dik>> s;
   final kd<dik> u;
   private fsy.a v;
   jq<dik> w;
   private fof x;

   public fsy(fty $$0, fzh $$1, Consumer<jq<dik>> $$2) {
      super(xv.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(mb.aI);
      jq<dik> $$3 = this.u.a(dir.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   protected void aT_() {
      fry $$0 = this.c.a(fry.d().a(8));
      $$0.c().b();
      $$0.a(new fpn(this.m(), this.p));
      $$0.a(new fpn(a, this.p));
      this.v = this.c.c(new fsy.a());
      fry $$1 = this.c.b(fry.e().a(8));
      this.x = $$1.a(fof.a(xu.d, $$0x -> {
         this.s.accept(this.w);
         this.aP_();
      }).a());
      $$1.a(fof.a(xu.e, $$0x -> this.aP_()).a());
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

   class a extends fpc<fsy.a.a> {
      a() {
         super(fsy.this.m, fsy.this.n, fsy.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fsy.this.u.c().map($$0x -> new fsy.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fsy.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fsy.this.w = $$0.b;
         }

         fsy.this.l();
      }

      class a extends fpc.a<fsy.a.a> {
         final jq.c<dik> b;
         final xv c;

         public a(final jq.c<dik> $$0) {
            this.b = $$0;
            alz $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (us.a().b($$2)) {
               this.c = xv.c($$2);
            } else {
               this.c = xv.b($$1.toString());
            }
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", this.c);
         }

         @Override
         public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fsy.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
