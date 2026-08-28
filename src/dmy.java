import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmy extends dos implements dpf {
   public static final MapCodec<dmy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duy.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dmy::new)
   );
   public static final dwj b = dvz.at;
   public static final int c = 4;
   private static final fah[] j = new fah[]{
      die.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      die.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      die.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      die.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      die.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dwa k = dvz.C;
   public static final dwa d = dvz.j;

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(duy $$0, dvi.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(f, Integer.valueOf(0)).b(b, Integer.valueOf(0)).b(k, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dig.dR);
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erl.c;
      return super.a($$0).b(k, Boolean.valueOf($$2)).b(b, Integer.valueOf(4));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      ezn $$4 = $$0.a($$2);
      fah $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dig.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return $$1 == jm.b && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(k) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!o($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!q($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(dvj $$0) {
      return $$0.c(d);
   }

   private static boolean q(dvj $$0) {
      return $$0.c(b) == 4;
   }

   public static dvj c() {
      return b(0);
   }

   public static dvj b(int $$0) {
      return dig.E.m().b(d, Boolean.valueOf(true)).b(b, Integer.valueOf($$0));
   }
}
