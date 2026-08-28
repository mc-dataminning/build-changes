import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dpv extends dne {
   public static final MapCodec<dpv> a = b(dpv::new);
   public static final ece<jc> b = drf.e;
   public static final ebx c = ebw.k;
   private static final fgm d = dne.b(16.0, 0.0, 13.0);
   private static final fgm e = fgj.a(d, dne.b(8.0, 13.0, 16.0));
   private static ebl f;

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   public dpv(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(ebg $$0) {
      return true;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$0.c(c) ? e : d;
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   public static ebl b() {
      if (f == null) {
         f = ebm.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', ebk.a(ebp.a))
            .a('^', ebk.a(ebp.a(dng.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jc.d))))
            .a('>', ebk.a(ebp.a(dng.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jc.e))))
            .a('v', ebk.a(ebp.a(dng.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jc.c))))
            .a('<', ebk.a(ebp.a(dng.fX).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jc.f))))
            .b();
      }

      return f;
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
