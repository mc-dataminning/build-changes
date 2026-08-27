import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekd extends eko {
   public static final Codec<ekd> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ekd::new));

   private ekd(List<emb> $$0) {
      super($$0);
   }

   @Override
   public ekq b() {
      return ekr.t;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      Float $$2 = $$1.c(eln.j);
      if ($$2 != null) {
         awp $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.M();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.f($$6);
      }

      return $$0;
   }

   public static eko.a<?> c() {
      return a(ekd::new);
   }
}
