import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dow extends dmf {
   public static final MapCodec<dow> a = b(dow::new);
   public static final ebf<ja> b = dqg.e;
   public static final eay c = eax.k;
   private static final ffk d = dmf.b(16.0, 0.0, 13.0);
   private static final ffk e = ffh.a(d, dmf.b(8.0, 13.0, 16.0));
   private static eam f;

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   public static eam b() {
      if (f == null) {
         f = ean.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', eal.a(eaq.a))
            .a('^', eal.a(eaq.a(dmh.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.d))))
            .a('>', eal.a(eaq.a(dmh.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.e))))
            .a('v', eal.a(eaq.a(dmh.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.c))))
            .a('<', eal.a(eaq.a(dmh.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
