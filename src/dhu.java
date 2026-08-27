import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhu extends dhd implements dfs {
   public static final MapCodec<dhu> a = b(dhu::new);
   public static final dma c = dlz.C;

   @Override
   protected MapCodec<? extends dhu> a() {
      return a;
   }

   protected dhu(dli.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(egx.c)));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(c) ? egx.c.a(true) : super.c_($$0);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }
}
