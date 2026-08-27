import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exh extends eym {
   private static final tn a = tn.c("createWorld.customize.buffet.biome");
   private final eym b;
   private final Consumer<hg<cqv>> c;
   final ht<cqv> k;
   private exh.a l;
   hg<cqv> m;
   private ess n;

   public exh(eym $$0, fdi $$1, Consumer<hg<cqv>> $$2) {
      super(tn.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(je.ap);
      hg<cqv> $$3 = this.k.b(crc.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void az_() {
      this.f.a(this.b);
   }

   @Override
   protected void aH_() {
      this.l = new exh.a();
      this.e(this.l);
      this.n = this.d(ess.a(tm.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(ess.a(tm.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends eto<exh.a.a> {
      a() {
         super(exh.this.f, exh.this.g, exh.this.h, 40, exh.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         exh.this.k.h().map($$0x -> new exh.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable exh.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            exh.this.m = $$0.b;
         }

         exh.this.l();
      }

      class a extends eto.a<exh.a.a> {
         final hg.c<cqv> b;
         final tn c;

         public a(hg.c<cqv> $$0) {
            this.b = $$0;
            aey $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (qt.a().b($$2)) {
               this.c = tn.c($$2);
            } else {
               this.c = tn.b($$1.toString());
            }
         }

         @Override
         public tn a() {
            return tn.a("narrator.select", this.c);
         }

         @Override
         public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(exh.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
