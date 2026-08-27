import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezu extends faz {
   private static final uv a = uv.c("createWorld.customize.buffet.biome");
   private final faz b;
   private final Consumer<ig<ctd>> c;
   final is<ctd> k;
   private ezu.a l;
   ig<ctd> m;
   private eve n;

   public ezu(faz $$0, ffx $$1, Consumer<ig<ctd>> $$2) {
      super(uv.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(kd.ar);
      ig<ctd> $$3 = this.k.b(ctk.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aG_() {
      this.f.a(this.b);
   }

   @Override
   protected void aQ_() {
      this.l = new ezu.a();
      this.e(this.l);
      this.n = this.d(eve.a(uu.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(eve.a(uu.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends ewa<ezu.a.a> {
      a() {
         super(ezu.this.f, ezu.this.g, ezu.this.h, 40, ezu.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         ezu.this.k.h().map($$0x -> new ezu.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable ezu.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            ezu.this.m = $$0.b;
         }

         ezu.this.l();
      }

      class a extends ewa.a<ezu.a.a> {
         final ig.c<ctd> b;
         final uv c;

         public a(ig.c<ctd> $$0) {
            this.b = $$0;
            agm $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (ry.a().b($$2)) {
               this.c = uv.c($$2);
            } else {
               this.c = uv.b($$1.toString());
            }
         }

         @Override
         public uv a() {
            return uv.a("narrator.select", this.c);
         }

         @Override
         public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ezu.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
