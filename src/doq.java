import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class doq extends dma {
   public static final MapCodec<doq> a = b(doq::new);
   public static final eax<ja> b = dqa.e;
   public static final eaq c = eap.k;
   private static final ffc d = dma.b(16.0, 0.0, 13.0);
   private static final ffc e = fez.a(d, dma.b(8.0, 13.0, 16.0));
   private static eae f;

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dzz $$0) {
      return true;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   public static eae b() {
      if (f == null) {
         f = eaf.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', ead.a(eai.a))
            .a('^', ead.a(eai.a(dmc.fU).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.d))))
            .a('>', ead.a(eai.a(dmc.fU).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.e))))
            .a('v', ead.a(eai.a(dmc.fU).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.c))))
            .a('<', ead.a(eai.a(dmc.fU).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ja.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
