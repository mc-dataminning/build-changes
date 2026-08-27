import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbu extends fcz {
   private static final vf a = vf.c("createWorld.customize.buffet.biome");
   private final fcz b;
   private final Consumer<ih<cun>> c;
   final it<cun> k;
   private fbu.a l;
   ih<cun> m;
   private exe n;

   public fbu(fcz $$0, fhx $$1, Consumer<ih<cun>> $$2) {
      super(vf.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(ke.at);
      ih<cun> $$3 = this.k.b(cuu.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aE_() {
      this.f.a(this.b);
   }

   @Override
   protected void aN_() {
      this.l = this.d(new fbu.a());
      this.n = this.d(exe.a(ve.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(exe.a(ve.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.l().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void n() {
      this.n.j = this.l.i() != null;
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends eya<fbu.a.a> {
      a() {
         super(fbu.this.f, fbu.this.g, fbu.this.h - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fbu.this.k.h().map($$0x -> new fbu.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fbu.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fbu.this.m = $$0.b;
         }

         fbu.this.n();
      }

      class a extends eya.a<fbu.a.a> {
         final ih.c<cun> b;
         final vf c;

         public a(ih.c<cun> $$0) {
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
         public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fbu.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
