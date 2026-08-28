import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dja extends djq {
   public static final dye a = dyd.x;
   private final drj.a b;

   public dja(drj.a $$0, dxm.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.F.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dja> a();

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dkg.he) || $$1.a(dkg.hf) || $$1.a(dkg.hg) || $$1.a(dkg.hh);
         if ($$3) {
            return a($$2, dur.q, dwe::a);
         }
      }

      return null;
   }

   public drj.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(a);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
