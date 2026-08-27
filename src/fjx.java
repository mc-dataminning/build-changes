import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjx extends fld {
   private static final wu a = wu.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fir c = new fir(this);
   private final fld d;
   private final Consumer<iw<dbc>> r;
   final jj<dbc> s;
   private fjx.a u;
   iw<dbc> v;
   private ffe w;

   public fjx(fld $$0, fqb $$1, Consumer<iw<dbc>> $$2) {
      super(wu.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.r = $$2;
      this.s = $$1.a().d(le.az);
      iw<dbc> $$3 = this.s.b(dbj.b).or(() -> this.s.h().findAny()).orElseThrow();
      this.v = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aM_() {
      fiv $$0 = this.c.a(fiv.d().a(8));
      $$0.c().b();
      $$0.a(new fgl(this.n(), this.p));
      $$0.a(new fgl(a, this.p));
      this.u = this.c.c(new fjx.a());
      fiv $$1 = this.c.b(fiv.e().a(8));
      this.w = $$1.a(ffe.a(wt.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(ffe.a(wt.e, $$0x -> this.d()).a());
      this.u.a(this.u.aE_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.u.a(this.n, this.c);
   }

   void m() {
      this.w.j = this.u.h() != null;
   }

   class a extends fga<fjx.a.a> {
      a() {
         super(fjx.this.m, fjx.this.n, fjx.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fjx.this.s.h().map($$0x -> new fjx.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fjx.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fjx.this.v = $$0.b;
         }

         fjx.this.m();
      }

      class a extends fga.a<fjx.a.a> {
         final iw.c<dbc> b;
         final wu c;

         public a(iw.c<dbc> $$0) {
            this.b = $$0;
            akh $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (tv.a().b($$2)) {
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
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fjx.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
