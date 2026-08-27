import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewv extends eya {
   private static final tf a = tf.c("createWorld.customize.buffet.biome");
   private final eya b;
   private final Consumer<he<cqj>> c;
   final hr<cqj> k;
   private ewv.a l;
   he<cqj> m;
   private esg n;

   public ewv(eya $$0, fcw $$1, Consumer<he<cqj>> $$2) {
      super(tf.c("createWorld.customize.buffet.title"));
      this.b = $$0;
      this.c = $$2;
      this.k = $$1.a().d(jc.ap);
      he<cqj> $$3 = this.k.b(cqq.b).or(() -> this.k.h().findAny()).orElseThrow();
      this.m = $$1.d().a().c().c().stream().findFirst().orElse($$3);
   }

   @Override
   public void at_() {
      this.f.a(this.b);
   }

   @Override
   protected void aC_() {
      this.l = new ewv.a();
      this.e(this.l);
      this.n = this.d(esg.a(te.d, $$0 -> {
         this.c.accept(this.m);
         this.f.a(this.b);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esg.a(te.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.l.a(this.l.i().stream().filter($$0 -> Objects.equals($$0.b, this.m)).findFirst().orElse(null));
   }

   void l() {
      this.n.i = this.l.f() != null;
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.a(this.i, a, this.g / 2, 28, 10526880);
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   class a extends etc<ewv.a.a> {
      a() {
         super(ewv.this.f, ewv.this.g, ewv.this.h, 40, ewv.this.h - 37, 16);
         Collator $$0 = Collator.getInstance(Locale.getDefault());
         ewv.this.k.h().map($$0x -> new ewv.a.a($$0x)).sorted(Comparator.comparing($$0x -> $$0x.c.getString(), $$0)).forEach($$1 -> this.b($$1));
      }

      public void a(@Nullable ewv.a.a $$0) {
         super.a($$0);
         if ($$0 != null) {
            ewv.this.m = $$0.b;
         }

         ewv.this.l();
      }

      class a extends etc.a<ewv.a.a> {
         final he.c<cqj> b;
         final tf c;

         public a(he.c<cqj> $$0) {
            this.b = $$0;
            aer $$1 = $$0.g().a();
            String $$2 = $$1.f("biome");
            if (qm.a().b($$2)) {
               this.c = tf.c($$2);
            } else {
               this.c = tf.b($$1.toString());
            }
         }

         @Override
         public tf a() {
            return tf.a("narrator.select", this.c);
         }

         @Override
         public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(ewv.this.i, this.c, $$3 + 5, $$2 + 2, 16777215);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               a.this.a(this);
               return true;
            } else {
               return false;
            }
         }
      }
   }
}
