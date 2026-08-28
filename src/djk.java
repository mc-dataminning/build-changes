import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class djk extends dgv {
   public static final MapCodec<djk> a = b(djk::new);
   public static final duu b = dkr.aE;
   public static final dur c = duq.h;
   protected static final eyx d = dgv.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eyx e = dgv.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eyx f = eyu.a(d, e);
   private static duf g;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   public djk(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }

   public static duf b() {
      if (g == null) {
         g = dug.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', due.a(duj.a))
            .a('^', due.a(duj.a(dgx.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jj.d))))
            .a('>', due.a(duj.a(dgx.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jj.e))))
            .a('v', due.a(duj.a(dgx.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jj.c))))
            .a('<', due.a(duj.a(dgx.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jj.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
