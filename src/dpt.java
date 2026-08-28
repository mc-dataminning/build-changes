import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dpt extends dnc {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final ecc<jb> b = drd.e;
   public static final ebv c = ebu.k;
   private static final fgk d = dnc.b(16.0, 0.0, 13.0);
   private static final fgk e = fgh.a(d, dnc.b(8.0, 13.0, 16.0));
   private static ebj f;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebe $$0) {
      return true;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   public static ebj b() {
      if (f == null) {
         f = ebk.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', ebi.a(ebn.a))
            .a('^', ebi.a(ebn.a(dne.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.d))))
            .a('>', ebi.a(ebn.a(dne.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.e))))
            .a('v', ebi.a(ebn.a(dne.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.c))))
            .a('<', ebi.a(ebn.a(dne.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jb.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
