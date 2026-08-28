import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fmx extends fnx {
   private static final wy a = wy.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final flt c = new flt(this);
   private final fnx q;
   private final Consumer<jm<ddu>> r;
   final jz<ddu> s;
   private fmx.a u;
   jm<ddu> v;
   private fig w;

   public fmx(fnx $$0, fte $$1, Consumer<jm<ddu>> $$2) {
      super(wy.c("createWorld.customize.buffet.title"));
      this.q = $$0;
      this.r = $$2;
      this.s = $$1.a().d(lu.aF);
      jm<ddu> $$3 = this.s.b(deb.b).or(() -> this.s.i().findAny()).orElseThrow();
      this.v = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.l.a(this.q);
   }

   @Override
   protected void aP_() {
      flx $$0 = this.c.a(flx.d().a(8));
      $$0.c().b();
      $$0.a(new fjn(this.n(), this.o));
      $$0.a(new fjn(a, this.o));
      this.u = this.c.c(new fmx.a());
      flx $$1 = this.c.b(flx.e().a(8));
      this.w = $$1.a(fig.a(wx.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(fig.a(wx.e, $$0x -> this.d()).a());
      this.u.a(this.u.aG_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.u.a(this.m, this.c);
   }

   void m() {
      this.w.j = this.u.h() != null;
   }

   class a extends fjc<fmx.a.a> {
      a() {
         super(fmx.this.l, fmx.this.m, fmx.this.n - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fmx.this.s.i().map($$0x -> new fmx.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fmx.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fmx.this.v = $$0.b;
         }

         fmx.this.m();
      }

      class a extends fjc.a<fmx.a.a> {
         final jm.c<ddu> b;
         final wy c;

         public a(final jm.c<ddu> $$0) {
            this.b = $$0;
            akq $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tv.a().b($$2)) {
               this.c = wy.c($$2);
            } else {
               this.c = wy.b($$1.toString());
            }
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.c);
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fmx.this.o, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
