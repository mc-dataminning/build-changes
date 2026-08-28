import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dos extends din implements dih {
   public static final MapCodec<dos> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duy.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dos::new)
   );
   public static final dwj f = dvz.aU;
   protected static final float g = 6.0F;
   protected static final fah h = die.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final duy i;

   @Override
   public MapCodec<? extends dos> a() {
      return e;
   }

   protected dos(duy $$0, dvi.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return h;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arn $$0, jh $$1, dvj $$2, azs $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return true;
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f);
   }
}
