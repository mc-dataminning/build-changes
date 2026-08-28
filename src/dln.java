import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dln extends dmd {
   public static final ebk a = ebj.A;
   private final dud.a b;

   public dln(dud.a $$0, eas.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.C.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dln> a();

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dmt.hp) || $$1.a(dmt.hq) || $$1.a(dmt.hr) || $$1.a(dmt.hs);
         if ($$3) {
            return a($$2, dxt.q, dzh::a);
         }
      }

      return null;
   }

   public dud.a b() {
      return this.b;
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(a);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
