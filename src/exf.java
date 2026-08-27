import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exf extends eyk {
   private static final tl a = tl.c("createWorld.customize.buffet.biome");
   private final eyk b;
   private final Consumer<he<cqt>> c;
   final hq<cqt> k;
   private exf.a l;
   he<cqt> m;
   private esq n;

   public exf(eyk $$0, fdg $$1, Consumer<he<cqt>> $$2) {
      super(tl.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(jc.ap);
      he<cqt> $$3 = this.k.b(cra.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void az_() {
      this.f.a(this.b);
   }

   @Override
   protected void aH_() {
      this.l = new exf.a();
      this.e(this.l);
      this.n = this.d(esq.a(tk.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esq.a(tk.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends etm<exf.a.a> {
      a() {
         super(exf.this.f, exf.this.g, exf.this.h, 40, exf.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         exf.this.k.h().map($$0x -> new exf.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable exf.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            exf.this.m = $$0.b;
         }

         exf.this.l();
      }

      class a extends etm.a<exf.a.a> {
         final he.c<cqt> b;
         final tl c;

         public a(he.c<cqt> $$0) {
            this.b = $$0;
            aew $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (qr.a().b($$2)) {
               this.c = tl.c($$2);
            } else {
               this.c = tl.b($$1.toString());
            }
         }

         @Override
         public tl a() {
            return tl.a("narrator.select", this.c);
         }

         @Override
         public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(exf.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
