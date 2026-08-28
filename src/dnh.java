import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dnh extends dko implements dkh, dri {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final dyo<jn> b = dyg.T;
   public static final dyq c = dyg.U;
   private final Function<dxq, fcr> g;

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   protected dnh(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<dxq, fcr> q() {
      return this.a(this.a(b, c));
   }

   @Override
   public dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(dxq $$0, dax $$1) {
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public dyq c() {
      return c;
   }

   @Override
   public dxq a(dax $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return true;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 1) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cxh(this));
      }
   }
}
