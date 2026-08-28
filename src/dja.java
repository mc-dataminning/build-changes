import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dja extends djq {
   public static final dyh a = dyg.A;
   private final drm.a b;

   public dja(drm.a $$0, dxp.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.B.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dja> a();

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dwh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dkg.hl) || $$1.a(dkg.hm) || $$1.a(dkg.hn) || $$1.a(dkg.ho);
         if ($$3) {
            return a($$2, duu.q, dwh::a);
         }
      }

      return null;
   }

   public drm.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(a);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
