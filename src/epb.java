import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epb extends epq {
   public static final MapCodec<epb> a = MapCodec.unit(() -> epb.b);
   public static final epb b = new epb();

   @Nullable
   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      jg $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dia.H);
      return $$7 && !dhy.a($$4.b().f($$0, $$6)) ? new ept.c($$6, dia.H.m(), $$4.c()) : $$4;
   }

   @Override
   protected eps<?> a() {
      return eps.m;
   }
}
