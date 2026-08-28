import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dln extends dnd implements dih, dpf {
   public static final MapCodec<dln> a = b(dln::new);
   private static final dwa c = dvz.C;
   private final dne d = new dne(this);

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dvj> b(int $$0) {
      return $$1 -> dnd.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, czs $$1) {
      return !$$1.n().a(cwf.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return jm.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dvj $$0) {
      return $$0.y().c();
   }

   @Override
   public dne c() {
      return this.d;
   }
}
