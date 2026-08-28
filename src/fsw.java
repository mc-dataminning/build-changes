import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsw extends ftw {
   private static final xv a = xv.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final frs c = new frs(this);
   private final ftw d;
   private final Consumer<jq<dij>> s;
   final kd<dij> u;
   private fsw.a v;
   jq<dij> w;
   private fod x;

   public fsw(ftw $$0, fzf $$1, Consumer<jq<dij>> $$2) {
      super(xv.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(mb.aI);
      jq<dij> $$3 = this.u.a(diq.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   protected void aT_() {
      frw $$0 = this.c.a(frw.d().a(8));
      $$0.c().b();
      $$0.a(new fpl(this.m(), this.p));
      $$0.a(new fpl(a, this.p));
      this.v = this.c.c(new fsw.a());
      frw $$1 = this.c.b(frw.e().a(8));
      this.x = $$1.a(fod.a(xu.d, $$0x -> {
         this.s.accept(this.w);
         this.aP_();
      }).a());
      $$1.a(fod.a(xu.e, $$0x -> this.aP_()).a());
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

   class a extends fpa<fsw.a.a> {
      a() {
         super(fsw.this.m, fsw.this.n, fsw.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fsw.this.u.c().map($$0x -> new fsw.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fsw.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fsw.this.w = $$0.b;
         }

         fsw.this.l();
      }

      class a extends fpa.a<fsw.a.a> {
         final jq.c<dij> b;
         final xv c;

         public a(final jq.c<dij> $$0) {
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
         public void a(fnq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fsw.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
