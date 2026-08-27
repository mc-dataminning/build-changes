import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class edp extends eds {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<edp> a = RecordCodecBuilder.create($$0 -> a($$0).and(aer.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, edp::new));
   private final aer c;

   private edp(List<eff> $$0, aer $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public edu b() {
      return edv.B;
   }

   @Override
   public void a(ecp $$0) {
      eci<edt> $$1 = new eci<>(ecl.b, this.c);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.a("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cix a(cix $$0, ecg $$1) {
      edt $$2 = $$1.a().getElement(ecl.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         ecg.c<?> $$3 = ecg.a($$2);
         if ($$1.b($$3)) {
            cix var5;
            try {
               var5 = $$2.apply($$0, $$1);
            } finally {
               $$1.c($$3);
            }

            return var5;
         } else {
            b.warn("Detected infinite loop in loot tables");
            return $$0;
         }
      }
   }

   public static eds.a<?> a(aer $$0) {
      return a($$1 -> new edp($$1, $$0));
   }
}
