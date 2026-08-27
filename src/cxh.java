import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class cxh extends cut {
   public static final MapCodec<cxh> a = b(cxh::new);
   public static final dhq b = cyo.aE;
   public static final dhn c = dhm.h;
   protected static final ekb d = cut.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ekb e = cut.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ekb f = ejy.a(d, e);
   private static dhb g;

   @Override
   public MapCodec<cxh> a() {
      return a;
   }

   public cxh(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }

   public static dhb b() {
      if (g == null) {
         g = dhc.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dha.a(dhf.a))
            .a('^', dha.a(dhf.a(cuv.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.d))))
            .a('>', dha.a(dhf.a(cuv.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.e))))
            .a('v', dha.a(dhf.a(cuv.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.c))))
            .a('<', dha.a(dhf.a(cuv.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(hx.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
