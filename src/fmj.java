import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fmj extends fnj {
   private static final wu a = wu.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final flf c = new flf(this);
   private final fnj q;
   private final Consumer<jj<ddf>> r;
   final jw<ddf> s;
   private fmj.a u;
   jj<ddf> v;
   private fhs w;

   public fmj(fnj $$0, fso $$1, Consumer<jj<ddf>> $$2) {
      super(wu.c("createWorld.customize.buffet.title"));
      this.q = $$0;
      this.r = $$2;
      this.s = $$1.a().d(lr.aE);
      jj<ddf> $$3 = this.s.b(ddm.b).or(() -> this.s.i().findAny()).orElseThrow();
      this.v = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.l.a(this.q);
   }

   @Override
   protected void aP_() {
      flj $$0 = this.c.a(flj.d().a(8));
      $$0.c().b();
      $$0.a(new fiz(this.n(), this.o));
      $$0.a(new fiz(a, this.o));
      this.u = this.c.c(new fmj.a());
      flj $$1 = this.c.b(flj.e().a(8));
      this.w = $$1.a(fhs.a(wt.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(fhs.a(wt.e, $$0x -> this.d()).a());
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

   class a extends fio<fmj.a.a> {
      a() {
         super(fmj.this.l, fmj.this.m, fmj.this.n - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fmj.this.s.i().map($$0x -> new fmj.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fmj.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fmj.this.v = $$0.b;
         }

         fmj.this.m();
      }

      class a extends fio.a<fmj.a.a> {
         final jj.c<ddf> b;
         final wu c;

         public a(final jj.c<ddf> $$0) {
            this.b = $$0;
            akk $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (ts.a().b($$2)) {
               this.c = wu.c($$2);
            } else {
               this.c = wu.b($$1.toString());
            }
         }

         @Override
         public wu a() {
            return wu.a("narrator.select", this.c);
         }

         @Override
         public void a(fhf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fmj.this.o, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
