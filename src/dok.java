import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dok extends dlu {
   public static final MapCodec<dok> a = b(dok::new);
   public static final eam<ja> b = dpt.e;
   public static final eaf c = eae.k;
   private static final feq d = dlu.b(16.0, 0.0, 13.0);
   private static final feq e = fen.a(d, dlu.b(8.0, 13.0, 16.0));
   private static dzt f;

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   public dok(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   public static dzt b() {
      if (f == null) {
         f = dzu.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dzs.a(dzx.a))
            .a('^', dzs.a(dzx.a(dlw.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.d))))
            .a('>', dzs.a(dzx.a(dlw.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.e))))
            .a('v', dzs.a(dzx.a(dlw.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.c))))
            .a('<', dzs.a(dzx.a(dlw.fT).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
