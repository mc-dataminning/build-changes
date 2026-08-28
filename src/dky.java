import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dky extends dij {
   public static final MapCodec<dky> a = b(dky::new);
   public static final dwl<jm> b = dme.aF;
   public static final dwf c = dwe.h;
   protected static final fal d = dij.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fal e = dij.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fal f = fai.a(d, e);
   private static dvt g;

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   public dky(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   public static dvt b() {
      if (g == null) {
         g = dvu.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dvs.a(dvx.a))
            .a('^', dvs.a(dvx.a(dil.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.d))))
            .a('>', dvs.a(dvx.a(dil.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.e))))
            .a('v', dvs.a(dvx.a(dil.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.c))))
            .a('<', dvs.a(dvx.a(dil.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
