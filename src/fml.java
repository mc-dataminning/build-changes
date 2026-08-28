import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fml extends fnl {
   private static final wu a = wu.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final flh c = new flh(this);
   private final fnl q;
   private final Consumer<jj<ddg>> r;
   final jw<ddg> s;
   private fml.a u;
   jj<ddg> v;
   private fhu w;

   public fml(fnl $$0, fsq $$1, Consumer<jj<ddg>> $$2) {
      super(wu.c("createWorld.customize.buffet.title"));
      this.q = $$0;
      this.r = $$2;
      this.s = $$1.a().d(lr.aE);
      jj<ddg> $$3 = this.s.b(ddn.b).or(() -> this.s.i().findAny()).orElseThrow();
      this.v = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.l.a(this.q);
   }

   @Override
   protected void aP_() {
      fll $$0 = this.c.a(fll.d().a(8));
      $$0.c().b();
      $$0.a(new fjb(this.n(), this.o));
      $$0.a(new fjb(a, this.o));
      this.u = this.c.c(new fml.a());
      fll $$1 = this.c.b(fll.e().a(8));
      this.w = $$1.a(fhu.a(wt.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(fhu.a(wt.e, $$0x -> this.d()).a());
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

   class a extends fiq<fml.a.a> {
      a() {
         super(fml.this.l, fml.this.m, fml.this.n - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fml.this.s.i().map($$0x -> new fml.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fml.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fml.this.v = $$0.b;
         }

         fml.this.m();
      }

      class a extends fiq.a<fml.a.a> {
         final jj.c<ddg> b;
         final wu c;

         public a(final jj.c<ddg> $$0) {
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
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fml.this.o, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
