import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqc extends dpt {
   public static final MapCodec<dqc> e = b(dqc::new);

   @Override
   public MapCodec<? extends dqc> a() {
      return e;
   }

   public dqc(dzy.d $$0) {
      super($$0);
   }

   public static dzz b() {
      return dmc.J.m();
   }

   @Override
   public void a(div $$0, cqy $$1, iu $$2, dzz $$3, @Nullable dwx $$4, cyy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dfn.a($$5, axe.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         dzz $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.a(dje.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dzz $$0, div $$1, iu $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
