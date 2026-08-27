import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fax extends fcc {
   private static final vb a = vb.c("createWorld.customize.buffet.biome");
   private final fcc b;
   private final Consumer<ie<ctx>> c;
   final ir<ctx> k;
   private fax.a l;
   ie<ctx> m;
   private ewh n;

   public fax(fcc $$0, fha $$1, Consumer<ie<ctx>> $$2) {
      super(vb.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(kc.as);
      ie<ctx> $$3 = this.k.b(cue.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void aF_() {
      this.f.a(this.b);
   }

   @Override
   protected void aP_() {
      this.l = new fax.a();
      this.e(this.l);
      this.n = this.d(ewh.a(va.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(ewh.a(va.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends exd<fax.a.a> {
      a() {
         super(fax.this.f, fax.this.g, fax.this.h, 40, fax.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         fax.this.k.h().map($$0x -> new fax.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable fax.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            fax.this.m = $$0.b;
         }

         fax.this.l();
      }

      class a extends exd.a<fax.a.a> {
         final ie.c<ctx> b;
         final vb c;

         public a(ie.c<ctx> $$0) {
            this.b = $$0;
            agt $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (se.a().b($$2)) {
               this.c = vb.c($$2);
            } else {
               this.c = vb.b($$1.toString());
            }
         }

         @Override
         public vb a() {
            return vb.a("narrator.select", this.c);
         }

         @Override
         public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(fax.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return true;
         }
      }
   }
}
