import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class doa extends djk implements dqq {
   public static final MapCodec<doa> a = b(doa::new);
   public static final int b = 15;
   public static final dxu c = dxl.aS;
   public static final dxm d = dxl.J;
   public static final ToIntFunction<dwv> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return bsi.b;
      } else {
         return bsi.c;
      }
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$3.a(cwr.hZ) ? fbp.b() : fbp.a();
   }

   @Override
   protected boolean e_(dwv $$0) {
      return $$0.y().c();
   }

   @Override
   protected dpv a_(dwv $$0) {
      return dpv.a;
   }

   @Override
   protected float c(dwv $$0, dfl $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(d) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static cwn a(cwn $$0, int $$1) {
      $$0.b(kv.am, cyp.a.a(c, $$1));
      return $$0;
   }
}
