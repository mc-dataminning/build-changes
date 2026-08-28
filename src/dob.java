import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dob extends djl implements dqr {
   public static final MapCodec<dob> a = b(dob::new);
   public static final int b = 15;
   public static final dxv c = dxm.aS;
   public static final dxn d = dxm.J;
   public static final ToIntFunction<dww> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   public dob(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C && $$3.gG()) {
         $$1.a($$2, $$0.a(c), 2);
         return bsj.b;
      } else {
         return bsj.c;
      }
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$3.a(cws.hZ) ? fbq.b() : fbq.a();
   }

   @Override
   protected boolean e_(dww $$0) {
      return $$0.y().c();
   }

   @Override
   protected dpw a_(dww $$0) {
      return dpw.a;
   }

   @Override
   protected float c(dww $$0, dfm $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(d) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static cwo a(cwo $$0, int $$1) {
      $$0.b(kv.am, cyq.a.a(c, $$1));
      return $$0;
   }
}
