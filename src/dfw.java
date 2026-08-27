import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfw extends cyr {
   public static final MapCodec<dfw> a = b(dfw::new);
   public static final dmv b = dmu.E;
   private final blq c = bln.a(5);

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   public dfw(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0.B ? null : a($$2, djn.K, dkq::a);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, cpq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
