import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fgb extends fhh {
   private static final vu a = vu.c("createWorld.customize.buffet.biome");
   private final fhh b;
   private final Consumer<il<cya>> c;
   final iy<cya> k;
   private fgb.a l;
   il<cya> m;
   private fbi n;

   public fgb(fhh $$0, fmf $$1, Consumer<il<cya>> $$2) {
      super(vu.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(kj.au);
      il<cya> $$3 = this.k.b(cyh.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.f.a(this.b);
   }

   @Override
   protected void aO_() {
      this.l = this.c(new fgb.a());
      this.n = this.c(fbi.a(vt.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.c(fbi.a(vt.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.l().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void o() {
      this.n.j = this.l.i() != null;
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends fce<fgb.a.a> {
      a() {
         super(fgb.this.f, fgb.this.g, fgb.this.h - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fgb.this.k.h().map($$0x -> new fgb.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fgb.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fgb.this.m = $$0.b;
         }

         fgb.this.o();
      }

      class a extends fce.a<fgb.a.a> {
         final il.c<cya> b;
         final vu c;

         public a(il.c<cya> $$0) {
            this.b = $$0;
            ajh $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (sv.a().b($$2)) {
               this.c = vu.c($$2);
            } else {
               this.c = vu.b($$1.toString());
            }
         }

         @Override
         public vu a() {
            return vu.a("narrator.select", this.c);
         }

         @Override
         public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fgb.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
