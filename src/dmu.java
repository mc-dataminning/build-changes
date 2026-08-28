import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dmu extends dke {
   public static final MapCodec<dmu> a = b(dmu::new);
   public static final dyo<jn> b = dod.e;
   public static final dyh c = dyg.k;
   private static final fcr d = dke.b(16.0, 0.0, 13.0);
   private static final fcr e = fco.a(d, dke.b(8.0, 13.0, 16.0));
   private static dxv f;

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxq $$0) {
      return true;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   public static dxv b() {
      if (f == null) {
         f = dxw.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dxu.a(dxz.a))
            .a('^', dxu.a(dxz.a(dkg.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.d))))
            .a('>', dxu.a(dxz.a(dkg.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.e))))
            .a('v', dxu.a(dxz.a(dkg.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.c))))
            .a('<', dxu.a(dxz.a(dkg.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jn.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
