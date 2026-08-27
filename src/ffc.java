import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffc extends fgh {
   private static final vs a = vs.c("createWorld.customize.buffet.biome");
   private final fgh b;
   private final Consumer<il<cxd>> c;
   final ix<cxd> k;
   private ffc.a l;
   il<cxd> m;
   private fak n;

   public ffc(fgh $$0, flf $$1, Consumer<il<cxd>> $$2) {
      super(vs.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(ki.au);
      il<cxd> $$3 = this.k.b(cxk.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.f.a(this.b);
   }

   @Override
   protected void aP_() {
      this.l = this.c(new ffc.a());
      this.n = this.c(fak.a(vr.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.c(fak.a(vr.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.l().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void o() {
      this.n.j = this.l.i() != null;
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends fbg<ffc.a.a> {
      a() {
         super(ffc.this.f, ffc.this.g, ffc.this.h - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         ffc.this.k.h().map($$0x -> new ffc.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable ffc.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            ffc.this.m = $$0.b;
         }

         ffc.this.o();
      }

      class a extends fbg.a<ffc.a.a> {
         final il.c<cxd> b;
         final vs c;

         public a(il.c<cxd> $$0) {
            this.b = $$0;
            ajc $$1 = $$0.h().a();
            String $$2 = $$1.f("biome");
            if (st.a().b($$2)) {
               this.c = vs.c($$2);
            } else {
               this.c = vs.b($$1.toString());
            }
         }

         @Override
         public vs a() {
            return vs.a("narrator.select", this.c);
         }

         @Override
         public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ffc.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
