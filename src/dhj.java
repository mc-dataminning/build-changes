import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dhj extends deu {
   public static final MapCodec<dhj> a = b(dhj::new);
   public static final dsr b = diq.aE;
   public static final dso c = dsn.h;
   protected static final ewf d = deu.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final ewf e = deu.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final ewf f = ewc.a(d, e);
   private static dsc g;

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   public static dsc b() {
      if (g == null) {
         g = dsd.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dsb.a(dsg.a))
            .a('^', dsb.a(dsg.a(dew.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.d))))
            .a('>', dsb.a(dsg.a(dew.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.e))))
            .a('v', dsb.a(dsg.a(dew.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.c))))
            .a('<', dsb.a(dsg.a(dew.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(je.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
