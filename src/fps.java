import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fps extends fqs {
   private static final xh a = xh.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fon c = new fon(this);
   private final fqs d;
   private final Consumer<jp<dfw>> s;
   final kc<dfw> u;
   private fps.a v;
   jp<dfw> w;
   private fkz x;

   public fps(fqs $$0, fvx $$1, Consumer<jp<dfw>> $$2) {
      super(xh.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.s = $$2;
      this.u = $$1.a().e(ly.aG);
      jp<dfw> $$3 = this.u.a(dgd.b).or(() -> this.u.c().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aS_() {
      fos $$0 = this.c.a(fos.d().a(8));
      $$0.c().b();
      $$0.a(new fmg(this.n(), this.p));
      $$0.a(new fmg(a, this.p));
      this.v = this.c.c(new fps.a());
      fos $$1 = this.c.b(fos.e().a(8));
      this.x = $$1.a(fkz.a(xg.d, $$0x -> {
         this.s.accept(this.w);
         this.d();
      }).a());
      $$1.a(fkz.a(xg.e, $$0x -> this.d()).a());
      this.v.a(this.v.aJ_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
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

   class a extends flv<fps.a.a> {
      a() {
         super(fps.this.m, fps.this.n, fps.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fps.this.u.c().map($$0x -> new fps.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fps.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fps.this.w = $$0.b;
         }

         fps.this.m();
      }

      class a extends flv.a<fps.a.a> {
         final jp.c<dfw> b;
         final xh c;

         public a(final jp.c<dfw> $$0) {
            this.b = $$0;
            alh $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (ue.a().b($$2)) {
               this.c = xh.c($$2);
            } else {
               this.c = xh.b($$1.toString());
            }
         }

         @Override
         public xh a() {
            return xh.a("narrator.select", this.c);
         }

         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fps.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
