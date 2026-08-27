import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czs extends cso {
   public static final MapCodec<czs> a = b(czs::new);
   public static final dfu b = dft.E;
   private final bgj c = bgg.a(5);

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ded($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return $$0.B ? null : a($$2, ddb.K, ded::a);
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, cjl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
