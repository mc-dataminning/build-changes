import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exz extends ezd {
   private static final ui a = ui.c("createWorld.customize.buffet.biome");
   private final ezd b;
   private final Consumer<ib<crx>> c;
   final io<crx> k;
   private exz.a l;
   ib<crx> m;
   private etj n;

   public exz(ezd $$0, fea $$1, Consumer<ib<crx>> $$2) {
      super(ui.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(jz.aq);
      ib<crx> $$3 = this.k.b(cse.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aC_() {
      this.f.a(this.b);
   }

   @Override
   protected void aM_() {
      this.l = new exz.a();
      this.e(this.l);
      this.n = this.d(etj.a(uh.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(etj.a(uh.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends euf<exz.a.a> {
      a() {
         super(exz.this.f, exz.this.g, exz.this.h, 40, exz.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         exz.this.k.h().map($$0x -> new exz.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable exz.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            exz.this.m = $$0.b;
         }

         exz.this.l();
      }

      class a extends euf.a<exz.a.a> {
         final ib.c<crx> b;
         final ui c;

         public a(ib.c<crx> $$0) {
            this.b = $$0;
            afw $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (ro.a().b($$2)) {
               this.c = ui.c($$2);
            } else {
               this.c = ui.b($$1.toString());
            }
         }

         @Override
         public ui a() {
            return ui.a("narrator.select", this.c);
         }

         @Override
         public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(exz.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
