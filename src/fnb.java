import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fnb extends fob {
   private static final wz a = wz.c("createWorld.customize.buffet.biome").b(-8355712);
   private static final int b = 8;
   private final flx c = new flx(this);
   private final fob r;
   private final Consumer<jm<ddw>> s;
   final jz<ddw> u;
   private fnb.a v;
   jm<ddw> w;
   private fik x;

   public fnb(fob $$0, fti $$1, Consumer<jm<ddw>> $$2) {
      super(wz.c("createWorld.customize.buffet.title"));
      this.r = $$0;
      this.s = $$2;
      this.u = $$1.a().d(lu.aF);
      jm<ddw> $$3 = this.u.b(ded.b).or(() -> this.u.i().findAny()).orElseThrow();
      this.w = $$1.e().a().d().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void d() {
      this.l.a(this.r);
   }

   @Override
   protected void aT_() {
      fmb $$0 = this.c.a(fmb.d().a(8));
      $$0.c().b();
      $$0.a(new fjr(this.n(), this.o));
      $$0.a(new fjr(a, this.o));
      this.v = this.c.c(new fnb.a());
      fmb $$1 = this.c.b(fmb.e().a(8));
      this.x = $$1.a(fik.a(wy.d, $$0x -> {
         this.s.accept(this.w);
         this.d();
      }).a());
      $$1.a(fik.a(wy.e, $$0x -> this.d()).a());
      this.v.a(this.v.aK_().stream().filter($$0x -> Objects.equals($$0x.b, this.w)).findFirst().orElse(null));
      this.c.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      this.v.a(this.m, this.c);
   }

   void m() {
      this.x.j = this.v.h() != null;
   }

   class a extends fjg<fnb.a.a> {
      a() {
         super(fnb.this.l, fnb.this.m, fnb.this.n - 77, 40, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fnb.this.u.i().map($$0x -> new fnb.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fnb.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fnb.this.w = $$0.b;
         }

         fnb.this.m();
      }

      class a extends fjg.a<fnb.a.a> {
         final jm.c<ddw> b;
         final wz c;

         public a(final jm.c<ddw> $$0) {
            this.b = $$0;
            akr $$1 = $$0.h().a();
            String $$2 = $$1.h("biome");
            if (tw.a().b($$2)) {
               this.c = wz.c($$2);
            } else {
               this.c = wz.b($$1.toString());
            }
         }

         @Override
         public wz a() {
            return wz.a("narrator.select", this.c);
         }

         @Override
         public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fnb.this.o, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }
      }
   }
}
