import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class don extends dke implements dri {
   public static final MapCodec<don> a = b(don::new);
   public static final dye b = dyd.j;
   public static final dye c = dyd.D;
   protected static final fcm d = fcj.a(dke.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dke.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final fcm e = fcj.a(dke.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dke.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<don> a() {
      return a;
   }

   public don(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      etp $$1 = $$0.q().b_($$0.a());

      for (jm $$2 : $$0.f()) {
         if ($$2.o() == jm.a.b) {
            dxn $$3 = this.m().b(b, Boolean.valueOf($$2 == jm.b));
            if ($$3.a((dhd)$$0.q(), $$0.a())) {
               return $$3.b(c, Boolean.valueOf($$1.a() == etq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jm $$3 = o($$0).g();
      return dke.a($$1, $$2.a($$3), $$3.g());
   }

   protected static jm o(dxn $$0) {
      return $$0.c(b) ? jm.a : jm.b;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return o($$0).g() == $$4 && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(c) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
