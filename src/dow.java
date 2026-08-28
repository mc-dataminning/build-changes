import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dow extends dhq {
   public static final MapCodec<dow> a = b(dow::new);
   public static final dwa b = dvz.E;
   private final bri c = brf.a(5);

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0.C ? null : a($$2, dso.K, dtu::a);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, cwb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
