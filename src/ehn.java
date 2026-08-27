import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ehn extends ehq {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehn> a = RecordCodecBuilder.create($$0 -> a($$0).and(agt.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, ehn::new));
   private final agt c;

   private ehn(List<ejd> $$0, agt $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ehs b() {
      return eht.B;
   }

   @Override
   public void a(egn $$0) {
      egg<ehr> $$1 = new egg<>(egj.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cmh a(cmh $$0, ege $$1) {
      ehr $$2 = $$1.a().getElement(egj.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         ege.c<?> $$3 = ege.a($$2);
         if ($$1.b($$3)) {
            cmh var5;
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

   public static ehq.a<?> a(agt $$0) {
      return a($$1 -> new ehn($$1, $$0));
   }
}
