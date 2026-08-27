import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exa extends eye {
   private static final tl a = tl.c("createWorld.customize.buffet.biome");
   private final eye b;
   private final Consumer<he<cqz>> c;
   final hq<cqz> k;
   private exa.a l;
   he<cqz> m;
   private esk n;

   public exa(eye $$0, fdb $$1, Consumer<he<cqz>> $$2) {
      super(tl.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(jc.aq);
      he<cqz> $$3 = this.k.b(crg.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void az_() {
      this.f.a(this.b);
   }

   @Override
   protected void aH_() {
      this.l = new exa.a();
      this.e(this.l);
      this.n = this.d(esk.a(tk.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esk.a(tk.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends etg<exa.a.a> {
      a() {
         super(exa.this.f, exa.this.g, exa.this.h, 40, exa.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         exa.this.k.h().map($$0x -> new exa.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable exa.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            exa.this.m = $$0.b;
         }

         exa.this.l();
      }

      class a extends etg.a<exa.a.a> {
         final he.c<cqz> b;
         final tl c;

         public a(he.c<cqz> $$0) {
            this.b = $$0;
            aez $$1 = $$0.g().a();
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
         public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(exa.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
