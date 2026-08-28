import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emo extends emv {
   public final awm<dfi> a;
   public static final MapCodec<emo> b = awm.b(lr.f).xmap(emo::new, $$0 -> $$0.a).fieldOf("value");

   public emo(awm<dfi> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      return ebl.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected emx<?> a() {
      return emx.n;
   }
}
