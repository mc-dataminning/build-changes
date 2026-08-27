import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ekl extends eko {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ekl> a = RecordCodecBuilder.create($$0 -> a($$0).and(aiy.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, ekl::new));
   private final aiy c;

   private ekl(List<emb> $$0, aiy $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ekq b() {
      return ekr.B;
   }

   @Override
   public void a(ejl $$0) {
      eje<ekp> $$1 = new eje<>(ejh.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cpd a(cpd $$0, ejc $$1) {
      ekp $$2 = $$1.a().getElement(ejh.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         ejc.c<?> $$3 = ejc.a($$2);
         if ($$1.b($$3)) {
            cpd var5;
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

   public static eko.a<?> a(aiy $$0) {
      return a($$1 -> new ekl($$1, $$0));
   }
}
