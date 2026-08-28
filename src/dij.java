import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dij extends diz {
   public static final dxp a = dxo.B;
   private final dqu.a b;

   public dij(dqu.a $$0, dwx.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dij> a();

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(djp.hl) || $$1.a(djp.hm) || $$1.a(djp.hn) || $$1.a(djp.ho);
         if ($$3) {
            return a($$2, duc.q, dvp::a);
         }
      }

      return null;
   }

   public dqu.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(a);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
