import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class een extends efb {
   public static final Codec<een> a = Codec.unit(() -> een.b);
   public static final een b = new een();

   @Nullable
   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      hz $$6 = $$4.a();
      boolean $$7 = $$0.a_($$6).a(cyq.H);
      return $$7 && !cyo.a($$4.b().j($$0, $$6)) ? new efe.c($$6, cyq.H.o(), $$4.c()) : $$4;
   }

   @Override
   protected efd<?> a() {
      return efd.m;
   }
}
