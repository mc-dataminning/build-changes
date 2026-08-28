import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emf extends emt {
   public static final MapCodec<emf> a = MapCodec.unit(() -> emf.b);
   public static final emf b = new emf();

   @Nullable
   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      ja $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfj.H);
      return $$7 && !dfh.a($$4.b().j($$0, $$6)) ? new emw.c($$6, dfj.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected emv<?> a() {
      return emv.m;
   }
}
