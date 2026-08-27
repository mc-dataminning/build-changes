import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class emd extends emg {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emd> a = RecordCodecBuilder.create($$0 -> a($$0).and(ajh.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, emd::new));
   private final ajh c;

   private emd(List<ent> $$0, ajh $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public emi b() {
      return emj.B;
   }

   @Override
   public void a(eld $$0) {
      ekw<emh> $$1 = new ekw<>(ekz.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cqk a(cqk $$0, eku $$1) {
      emh $$2 = $$1.a().getElement(ekz.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         eku.c<?> $$3 = eku.a($$2);
         if ($$1.b($$3)) {
            cqk var5;
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

   public static emg.a<?> a(ajh $$0) {
      return a($$1 -> new emd($$1, $$0));
   }
}
