import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djh extends djx {
   public static final dyl a = dyk.x;
   private final drq.a b;

   public djh(drq.a $$0, dxt.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends djh> a();

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dkn.he) || $$1.a(dkn.hf) || $$1.a(dkn.hg) || $$1.a(dkn.hh);
         if ($$3) {
            return a($$2, duy.q, dwl::a);
         }
      }

      return null;
   }

   public drq.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(a);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
