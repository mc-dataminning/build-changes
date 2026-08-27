import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecp extends edd {
   public static final Codec<ecp> a = Codec.unit(() -> ecp.b);
   public static final ecp b = new ecp();

   @Nullable
   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      hx $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cws.H);
      return $$7 && !cwq.a($$4.b().j($$0, $$6)) ? new edg.c($$6, cws.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected edf<?> a() {
      return edf.m;
   }
}
