import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbw extends fdb {
   private static final vf a = vf.c("createWorld.customize.buffet.biome");
   private final fdb b;
   private final Consumer<ih<cuo>> c;
   final it<cuo> k;
   private fbw.a l;
   ih<cuo> m;
   private exg n;

   public fbw(fdb $$0, fhz $$1, Consumer<ih<cuo>> $$2) {
      super(vf.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(ke.at);
      ih<cuo> $$3 = this.k.b(cuv.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aE_() {
      this.f.a(this.b);
   }

   @Override
   protected void aN_() {
      this.l = this.d(new fbw.a());
      this.n = this.d(exg.a(ve.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(exg.a(ve.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.l().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void n() {
      this.n.j = this.l.i() != null;
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends eyc<fbw.a.a> {
      a() {
         super(fbw.this.f, fbw.this.g, fbw.this.h - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fbw.this.k.h().map($$0x -> new fbw.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fbw.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fbw.this.m = $$0.b;
         }

         fbw.this.n();
      }

      class a extends eyc.a<fbw.a.a> {
         final ih.c<cuo> b;
         final vf c;

         public a(ih.c<cuo> $$0) {
            this.b = $$0;
            ahg $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (si.a().b($$2)) {
               this.c = vf.c($$2);
            } else {
               this.c = vf.b($$1.toString());
            }
         }

         @Override
         public vf a() {
            return vf.a("narrator.select", this.c);
         }

         @Override
         public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fbw.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
