import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dih extends dix {
   public static final dxn a = dxm.B;
   private final dqs.a b;

   public dih(dqs.a $$0, dwv.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dih> a();

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(djn.hl) || $$1.a(djn.hm) || $$1.a(djn.hn) || $$1.a(djn.ho);
         if ($$3) {
            return a($$2, dua.q, dvn::a);
         }
      }

      return null;
   }

   public dqs.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(a);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
