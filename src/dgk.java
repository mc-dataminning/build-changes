import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgk extends cyo {
   public static final MapCodec<dgk> a = b(dgk::new);
   private static final vq d = vq.c("container.stonecutter");
   public static final dlz b = dcj.aE;
   protected static final eol c = cyo.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgk(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c));
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atu.ay);
         return blu.b;
      }
   }

   @Nullable
   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return new bme(($$2x, $$3, $$4) -> new cma($$2x, $$3, ckm.a($$1, $$2)), d);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
