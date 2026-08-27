import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eou extends eox {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eou> a = RecordCodecBuilder.create($$0 -> a($$0).and(ajv.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eou::new));
   private final ajv c;

   private eou(List<eql> $$0, ajv $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eoz b() {
      return epa.C;
   }

   @Override
   public void a(ent $$0) {
      enm<eoy> $$1 = new enm<>(enp.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected crs a(crs $$0, enk $$1) {
      eoy $$2 = $$1.a().getElement(enp.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         enk.c<?> $$3 = enk.a($$2);
         if ($$1.b($$3)) {
            crs var5;
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

   public static eox.a<?> a(ajv $$0) {
      return a($$1 -> new eou($$1, $$0));
   }
}
