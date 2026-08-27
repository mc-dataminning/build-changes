import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class feg extends ffl {
   private static final vq a = vq.c("createWorld.customize.buffet.biome");
   private final ffl b;
   private final Consumer<ij<cwq>> c;
   final iv<cwq> k;
   private feg.a l;
   ij<cwq> m;
   private ezo n;

   public feg(ffl $$0, fkj $$1, Consumer<ij<cwq>> $$2) {
      super(vq.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(kg.at);
      ij<cwq> $$3 = this.k.b(cwx.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.f.a(this.b);
   }

   @Override
   protected void aQ_() {
      this.l = this.c(new feg.a());
      this.n = this.c(ezo.a(vp.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.c(ezo.a(vp.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.l().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void o() {
      this.n.j = this.l.i() != null;
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends fak<feg.a.a> {
      a() {
         super(feg.this.f, feg.this.g, feg.this.h - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         feg.this.k.h().map($$0x -> new feg.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable feg.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            feg.this.m = $$0.b;
         }

         feg.this.o();
      }

      class a extends fak.a<feg.a.a> {
         final ij.c<cwq> b;
         final vq c;

         public a(ij.c<cwq> $$0) {
            this.b = $$0;
            aiy $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (sr.a().b($$2)) {
               this.c = vq.c($$2);
            } else {
               this.c = vq.b($$1.toString());
            }
         }

         @Override
         public vq a() {
            return vq.a("narrator.select", this.c);
         }

         @Override
         public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(feg.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
