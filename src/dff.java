import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dff extends cya {
   public static final MapCodec<dff> a = b(dff::new);
   public static final dlw b = dlv.E;
   private final bkz c = bkw.a(5);

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   public dff(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$0.B ? null : a($$2, div.K, djy::a);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, coz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
