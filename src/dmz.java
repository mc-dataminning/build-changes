import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmz extends die implements dpf {
   public static final MapCodec<dmz> a = b(dmz::new);
   public static final dwa b = dvz.C;

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   protected dmz(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dvj $$0, dvj $$1, jm $$2) {
      return $$1.a(dig.ac) && $$2.o() == jm.a.b;
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erl.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(b) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }
}
