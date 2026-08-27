import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class enc extends enq {
   public static final Codec<enc> a = Codec.unit(() -> enc.b);
   public static final enc b = new enc();

   @Nullable
   @Override
   public ent.c a(dcd $$0, ir $$1, ir $$2, ent.c $$3, ent.c $$4, enp $$5) {
      ir $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(dfe.am);
      return $$7 && !dfc.a($$4.b().j($$0, $$6)) ? new ent.c($$6, dfe.am.n(), $$4.c()) : $$4;
   }

   @Override
   protected ens<?> a() {
      return ens.m;
   }
}
