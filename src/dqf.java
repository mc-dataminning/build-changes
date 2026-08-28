import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dqf extends dno {
   public static final MapCodec<dqf> a = b(dqf::new);
   public static final eco<jc> b = drp.e;
   public static final ech c = ecg.k;
   private static final fgw d = dno.b(16.0, 0.0, 13.0);
   private static final fgw e = fgt.a(d, dno.b(8.0, 13.0, 16.0));
   private static ebv f;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   public dqf(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebq $$0) {
      return true;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   public static ebv b() {
      if (f == null) {
         f = ebw.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', ebu.a(ebz.a))
            .a('^', ebu.a(ebz.a(dnq.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jc.d))))
            .a('>', ebu.a(ebz.a(dnq.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jc.e))))
            .a('v', ebu.a(ebz.a(dnq.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jc.c))))
            .a('<', ebu.a(ebz.a(dnq.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jc.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
