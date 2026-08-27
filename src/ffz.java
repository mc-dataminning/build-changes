import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffz extends fhf {
   private static final vu a = vu.c("createWorld.customize.buffet.biome");
   private final fhf b;
   private final Consumer<il<cxy>> c;
   final iy<cxy> k;
   private ffz.a l;
   il<cxy> m;
   private fbg n;

   public ffz(fhf $$0, fmd $$1, Consumer<il<cxy>> $$2) {
      super(vu.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(kj.au);
      il<cxy> $$3 = this.k.b(cyf.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.f.a(this.b);
   }

   @Override
   protected void aO_() {
      this.l = this.c(new ffz.a());
      this.n = this.c(fbg.a(vt.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.c(fbg.a(vt.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.l().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void o() {
      this.n.j = this.l.i() != null;
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends fcc<ffz.a.a> {
      a() {
         super(ffz.this.f, ffz.this.g, ffz.this.h - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         ffz.this.k.h().map($$0x -> new ffz.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable ffz.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            ffz.this.m = $$0.b;
         }

         ffz.this.o();
      }

      class a extends fcc.a<ffz.a.a> {
         final il.c<cxy> b;
         final vu c;

         public a(il.c<cxy> $$0) {
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
         public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ffz.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
