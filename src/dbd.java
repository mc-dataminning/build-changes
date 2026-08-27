import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dbd extends cyo {
   public static final MapCodec<dbd> a = b(dbd::new);
   public static final dlz b = dcj.aE;
   public static final dlw c = dlv.h;
   protected static final eol d = cyo.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final eol e = cyo.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final eol f = eoi.a(d, e);
   private static dlk g;

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   public dbd(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }

   public static dlk b() {
      if (g == null) {
         g = dll.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dlj.a(dlo.a))
            .a('^', dlj.a(dlo.a(cyq.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ie.d))))
            .a('>', dlj.a(dlo.a(cyq.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ie.e))))
            .a('v', dlj.a(dlo.a(cyq.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ie.c))))
            .a('<', dlj.a(dlo.a(cyq.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ie.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
