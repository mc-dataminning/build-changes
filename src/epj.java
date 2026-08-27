import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epj extends epw {
   public static final Codec<epj> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, epj::new));

   private epj(List<erq> $$0) {
      super($$0);
   }

   @Override
   public epy b() {
      return epz.w;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      Float $$2 = $$1.c(erc.j);
      if ($$2 != null) {
         ayg $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.G();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.e($$6);
      }

      return $$0;
   }

   public static epw.a<?> c() {
      return a(epj::new);
   }
}
