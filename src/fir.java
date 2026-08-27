import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fir extends fjx {
   private static final wi a = wi.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fhl c = new fhl(this);
   private final fjx d;
   private final Consumer<in<daf>> o;
   final ja<daf> p;
   private fir.a q;
   in<daf> r;
   private fdy s;

   public fir(fjx $$0, fov $$1, Consumer<in<daf>> $$2) {
      super(wi.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.o = $$2;
      this.p = $$1.a().d(ku.aw);
      in<daf> $$3 = this.p.b(dam.b).or(() -> this.p.h().findAny()).orElseThrow();
      this.r = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.j.a(this.d);
   }

   @Override
   protected void aM_() {
      fhp $$0 = this.c.a(fhp.d().a(8));
      $$0.c().b();
      $$0.a(new fff(this.n(), this.m));
      $$0.a(new fff(a, this.m));
      this.q = this.c.c(new fir.a());
      fhp $$1 = this.c.b(fhp.e().a(8));
      this.s = $$1.a(fdy.a(wh.d, $$0x -> {
         this.o.accept(this.r);
         this.d();
      }).a());
      $$1.a(fdy.a(wh.e, $$0x -> this.d()).a());
      this.q.a(this.q.aE_().stream().filter($$0x -> Objects.equals($$0x.b, this.r)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.q.a(this.k, this.c);
   }

   void m() {
      this.s.j = this.q.h() != null;
   }

   class a extends feu<fir.a.a> {
      a() {
         super(fir.this.j, fir.this.k, fir.this.l - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fir.this.p.h().map($$0x -> new fir.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fir.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fir.this.r = $$0.b;
         }

         fir.this.m();
      }

      class a extends feu.a<fir.a.a> {
         final in.c<daf> b;
         final wi c;

         public a(in.c<daf> $$0) {
            this.b = $$0;
            ajv $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (tj.a().b($$2)) {
               this.c = wi.c($$2);
            } else {
               this.c = wi.b($$1.toString());
            }
         }

         @Override
         public wi a() {
            return wi.a("narrator.select", this.c);
         }

         @Override
         public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fir.this.m, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
