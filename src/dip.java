import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dip extends dbk {
   public static final MapCodec<dip> a = b(dip::new);
   public static final dpq b = dpp.E;
   private final bnf c = bnc.a(5);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dnl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return $$0.B ? null : a($$2, dmh.K, dnl::a);
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, crj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
