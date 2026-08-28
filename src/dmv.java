import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dmv extends dke {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final dyk<jm> b = doc.aF;
   public static final dye c = dyd.h;
   protected static final fcm d = dke.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fcm e = dke.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fcm f = fcj.a(d, e);
   private static dxs g;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   public static dxs b() {
      if (g == null) {
         g = dxt.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dxr.a(dxw.a))
            .a('^', dxr.a(dxw.a(dkg.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.d))))
            .a('>', dxr.a(dxw.a(dkg.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.e))))
            .a('v', dxr.a(dxw.a(dkg.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.c))))
            .a('<', dxr.a(dxw.a(dkg.fM).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
