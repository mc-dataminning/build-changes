import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class epk extends epo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epk> a = RecordCodecBuilder.create($$0 -> a($$0).and(akf.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, epk::new));
   private final akf c;

   private epk(List<erh> $$0, akf $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public epq b() {
      return epr.C;
   }

   @Override
   public void a(eoj $$0) {
      eoc<epp> $$1 = new eoc<>(eof.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected csd a(csd $$0, eoa $$1) {
      epp $$2 = $$1.a().getElement(eof.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         eoa.c<?> $$3 = eoa.a($$2);
         if ($$1.b($$3)) {
            csd var5;
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

   public static epo.a<?> a(akf $$0) {
      return a($$1 -> new epk($$1, $$0));
   }
}
