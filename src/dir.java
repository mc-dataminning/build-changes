import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dir extends dox {
   public static final MapCodec<dir> a = b(dir::new);
   public static final dwd b = dvz.R;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(b, jm.c));
   }

   @Nullable
   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return !$$0.C ? a($$2, dso.J, ($$0x, $$1x, $$2x, $$3) -> eap.c.a($$0x, $$3.gw(), $$3.gx())) : null;
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      return super.a($$0).b(b, $$0.g());
   }

   @Override
   public int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$3 != $$0.c(b) ? super.a($$0, $$1, $$2, $$3) : 0;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public int c() {
      return 10;
   }
}
