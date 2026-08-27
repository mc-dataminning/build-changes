import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fks extends fly {
   private static final wx a = wx.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fjm c = new fjm(this);
   private final fly d;
   private final Consumer<ix<dbw>> r;
   final jk<dbw> s;
   private fks.a u;
   ix<dbw> v;
   private ffz w;

   public fks(fly $$0, fqw $$1, Consumer<ix<dbw>> $$2) {
      super(wx.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.r = $$2;
      this.s = $$1.a().d(lf.az);
      ix<dbw> $$3 = this.s.b(dcd.b).or(() -> this.s.h().findAny()).orElseThrow();
      this.v = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aM_() {
      fjq $$0 = this.c.a(fjq.d().a(8));
      $$0.c().b();
      $$0.a(new fhg(this.n(), this.p));
      $$0.a(new fhg(a, this.p));
      this.u = this.c.c(new fks.a());
      fjq $$1 = this.c.b(fjq.e().a(8));
      this.w = $$1.a(ffz.a(ww.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(ffz.a(ww.e, $$0x -> this.d()).a());
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

   class a extends fgv<fks.a.a> {
      a() {
         super(fks.this.m, fks.this.n, fks.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fks.this.s.h().map($$0x -> new fks.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fks.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fks.this.v = $$0.b;
         }

         fks.this.m();
      }

      class a extends fgv.a<fks.a.a> {
         final ix.c<dbw> b;
         final wx c;

         public a(ix.c<dbw> $$0) {
            this.b = $$0;
            akm $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (ty.a().b($$2)) {
               this.c = wx.c($$2);
            } else {
               this.c = wx.b($$1.toString());
            }
         }

         @Override
         public wx a() {
            return wx.a("narrator.select", this.c);
         }

         @Override
         public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fks.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
