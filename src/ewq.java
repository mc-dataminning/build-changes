import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewq extends exv {
   private static final te a = te.c("createWorld.customize.buffet.biome");
   private final exv b;
   private final Consumer<hf<cqi>> c;
   final hs<cqi> k;
   private ewq.a l;
   hf<cqi> m;
   private esi n;

   public ewq(exv $$0, fcn $$1, Consumer<hf<cqi>> $$2) {
      super(te.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(jd.ap);
      hf<cqi> $$3 = this.k.b(cqp.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void au_() {
      this.f.a(this.b);
   }

   @Override
   protected void aE_() {
      this.l = new ewq.a();
      this.e(this.l);
      this.n = this.d(esi.a(td.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esi.a(td.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends ete<ewq.a.a> {
      a() {
         super(ewq.this.f, ewq.this.g, ewq.this.h, 40, ewq.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         ewq.this.k.h().map($$0x -> new ewq.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable ewq.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            ewq.this.m = $$0.b;
         }

         ewq.this.l();
      }

      class a extends ete.a<ewq.a.a> {
         final hf.c<cqi> b;
         final te c;

         public a(hf.c<cqi> $$0) {
            this.b = $$0;
            aep $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (qn.a().b($$2)) {
               this.c = te.c($$2);
            } else {
               this.c = te.b($$1.toString());
            }
         }

         @Override
         public te a() {
            return te.a("narrator.select", this.c);
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ewq.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               a.this.a(this);
               return true;
            } else {
               return false;
            }
         }
      }
   }
}
