import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eol extends eox {
   public static final Codec<eol> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eol::new));

   private eol(List<eql> $$0) {
      super($$0);
   }

   @Override
   public eoz b() {
      return epa.u;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      Float $$2 = $$1.c(epx.j);
      if ($$2 != null) {
         axt $$3 = $$1.b();
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

   public static eox.a<?> c() {
      return a(eol::new);
   }
}
