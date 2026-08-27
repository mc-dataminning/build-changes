import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezp extends fau {
   private static final ur a = ur.c("createWorld.customize.buffet.biome");
   private final fau b;
   private final Consumer<ib<csy>> c;
   final io<csy> k;
   private ezp.a l;
   ib<csy> m;
   private euz n;

   public ezp(fau $$0, ffs $$1, Consumer<ib<csy>> $$2) {
      super(ur.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(jz.ar);
      ib<csy> $$3 = this.k.b(ctf.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aF_() {
      this.f.a(this.b);
   }

   @Override
   protected void aP_() {
      this.l = new ezp.a();
      this.e(this.l);
      this.n = this.d(euz.a(uq.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(euz.a(uq.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends evv<ezp.a.a> {
      a() {
         super(ezp.this.f, ezp.this.g, ezp.this.h, 40, ezp.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         ezp.this.k.h().map($$0x -> new ezp.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable ezp.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            ezp.this.m = $$0.b;
         }

         ezp.this.l();
      }

      class a extends evv.a<ezp.a.a> {
         final ib.c<csy> b;
         final ur c;

         public a(ib.c<csy> $$0) {
            this.b = $$0;
            agi $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (ru.a().b($$2)) {
               this.c = ur.c($$2);
            } else {
               this.c = ur.b($$1.toString());
            }
         }

         @Override
         public ur a() {
            return ur.a("narrator.select", this.c);
         }

         @Override
         public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ezp.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
