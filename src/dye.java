import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dye extends dys {
   public static final Codec<dye> a = Codec.unit(() -> dye.b);
   public static final dye b = new dye();

   @Nullable
   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      gw $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cte.H);
      return $$7 && !ctc.a($$4.b().j($$0, $$6)) ? new dyv.c($$6, cte.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected dyu<?> a() {
      return dyu.m;
   }
}
