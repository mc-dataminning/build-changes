import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fng extends fon {
   private static final xe a = xe.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fma c = new fma(this);
   private final fon d;
   private final Consumer<ja<dcz>> r;
   final jn<dcz> s;
   private fng.a u;
   ja<dcz> v;
   private fin w;

   public fng(fon $$0, ftp $$1, Consumer<ja<dcz>> $$2) {
      super(xe.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.r = $$2;
      this.s = $$1.a().d(li.az);
      ja<dcz> $$3 = this.s.b(ddg.b).or(() -> this.s.h().findAny()).orElseThrow();
      this.v = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aN_() {
      fme $$0 = this.c.a(fme.d().a(8));
      $$0.c().b();
      $$0.a(new fju(this.n(), this.p));
      $$0.a(new fju(a, this.p));
      this.u = this.c.c(new fng.a());
      fme $$1 = this.c.b(fme.e().a(8));
      this.w = $$1.a(fin.a(xd.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(fin.a(xd.e, $$0x -> this.d()).a());
      this.u.a(this.u.aE_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.u.a(this.n, this.c);
   }

   void B() {
      this.w.j = this.u.h() != null;
   }

   class a extends fjj<fng.a.a> {
      a() {
         super(fng.this.m, fng.this.n, fng.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fng.this.s.h().map($$0x -> new fng.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fng.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fng.this.v = $$0.b;
         }

         fng.this.B();
      }

      class a extends fjj.a<fng.a.a> {
         final ja.c<dcz> b;
         final xe c;

         public a(ja.c<dcz> $$0) {
            this.b = $$0;
            akt $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (uf.a().b($$2)) {
               this.c = xe.c($$2);
            } else {
               this.c = xe.b($$1.toString());
            }
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", this.c);
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fng.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
