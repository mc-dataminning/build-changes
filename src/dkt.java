import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class dkt extends die {
   public static final MapCodec<dkt> a = b(dkt::new);
   public static final dwd b = dlz.aF;
   public static final dwa c = dvz.h;
   protected static final fah d = die.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final fah e = die.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final fah f = fae.a(d, e);
   private static dvo g;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dvj $$0) {
      return true;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.g().g()).b(c, Boolean.valueOf(false));
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   public static dvo b() {
      if (g == null) {
         g = dvp.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dvn.a(dvs.a))
            .a('^', dvn.a(dvs.a(dig.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.d))))
            .a('>', dvn.a(dvs.a(dig.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.e))))
            .a('v', dvn.a(dvs.a(dig.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.c))))
            .a('<', dvn.a(dvs.a(dig.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(jm.f))))
            .b();
      }

      return g;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
