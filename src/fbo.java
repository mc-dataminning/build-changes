import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbo extends fct {
   private static final vd a = vd.c("createWorld.customize.buffet.biome");
   private final fct b;
   private final Consumer<ih<cuh>> c;
   final it<cuh> k;
   private fbo.a l;
   ih<cuh> m;
   private ewy n;

   public fbo(fct $$0, fhr $$1, Consumer<ih<cuh>> $$2) {
      super(vd.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(ke.at);
      ih<cuh> $$3 = this.k.b(cuo.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aE_() {
      this.f.a(this.b);
   }

   @Override
   protected void aN_() {
      this.l = this.d(new fbo.a());
      this.n = this.d(ewy.a(vc.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(ewy.a(vc.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.l().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void n() {
      this.n.j = this.l.i() != null;
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends exu<fbo.a.a> {
      a() {
         super(fbo.this.f, fbo.this.g, fbo.this.h - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fbo.this.k.h().map($$0x -> new fbo.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fbo.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fbo.this.m = $$0.b;
         }

         fbo.this.n();
      }

      class a extends exu.a<fbo.a.a> {
         final ih.c<cuh> b;
         final vd c;

         public a(ih.c<cuh> $$0) {
            this.b = $$0;
            ahd $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (sg.a().b($$2)) {
               this.c = vd.c($$2);
            } else {
               this.c = vd.b($$1.toString());
            }
         }

         @Override
         public vd a() {
            return vd.a("narrator.select", this.c);
         }

         @Override
         public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fbo.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
