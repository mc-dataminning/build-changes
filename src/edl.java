import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edl extends edw {
   public static final Codec<edl> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edl::new));

   private edl(List<efj> $$0) {
      super($$0);
   }

   @Override
   public edy b() {
      return edz.t;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      Float $$2 = $$1.c(eev.j);
      if ($$2 != null) {
         ash $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.L();
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

   public static edw.a<?> c() {
      return a(edl::new);
   }
}
