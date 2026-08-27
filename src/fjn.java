import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjn extends fkt {
   private static final ws a = ws.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final fih c = new fih(this);
   private final fkt d;
   private final Consumer<iv<dat>> r;
   final ji<dat> s;
   private fjn.a u;
   iv<dat> v;
   private feu w;

   public fjn(fkt $$0, fpr $$1, Consumer<iv<dat>> $$2) {
      super(ws.c("createWorld.customize.buffet.title"));
      this.d = $$0;
      this.r = $$2;
      this.s = $$1.a().d(ld.ay);
      iv<dat> $$3 = this.s.b(dba.b).or(() -> this.s.h().findAny()).orElseThrow();
      this.v = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   protected void aM_() {
      fil $$0 = this.c.a(fil.d().a(8));
      $$0.c().b();
      $$0.a(new fgb(this.n(), this.p));
      $$0.a(new fgb(a, this.p));
      this.u = this.c.c(new fjn.a());
      fil $$1 = this.c.b(fil.e().a(8));
      this.w = $$1.a(feu.a(wr.d, $$0x -> {
         this.r.accept(this.v);
         this.d();
      }).a());
      $$1.a(feu.a(wr.e, $$0x -> this.d()).a());
      this.u.a(this.u.aE_().stream().filter($$0x -> Objects.equals($$0x.b, this.v)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.u.a(this.n, this.c);
   }

   void m() {
      this.w.j = this.u.h() != null;
   }

   class a extends ffq<fjn.a.a> {
      a() {
         super(fjn.this.m, fjn.this.n, fjn.this.o - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fjn.this.s.h().map($$0x -> new fjn.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fjn.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fjn.this.v = $$0.b;
         }

         fjn.this.m();
      }

      class a extends ffq.a<fjn.a.a> {
         final iv.c<dat> b;
         final ws c;

         public a(iv.c<dat> $$0) {
            this.b = $$0;
            akf $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (tt.a().b($$2)) {
               this.c = ws.c($$2);
            } else {
               this.c = ws.b($$1.toString());
            }
         }

         @Override
         public ws a() {
            return ws.a("narrator.select", this.c);
         }

         @Override
         public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fjn.this.p, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
