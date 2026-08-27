import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record elt(aiy b) implements emb {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<elt> a = RecordCodecBuilder.create($$0 -> $$0.group(aiy.a.fieldOf("name").forGetter(elt::c)).apply($$0, elt::new));

   @Override
   public emc b() {
      return emd.q;
   }

   @Override
   public void a(ejl $$0) {
      eje<emb> $$1 = new eje<>(ejh.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         emb.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ejc $$0) {
      emb $$1 = $$0.a().getElement(ejh.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ejc.c<?> $$2 = ejc.a($$1);
         if ($$0.b($$2)) {
            boolean var4;
            try {
               var4 = $$1.test($$0);
            } finally {
               $$0.c($$2);
            }

            return var4;
         } else {
            c.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   public static emb.a a(aiy $$0) {
      return () -> new elt($$0);
   }

   public aiy c() {
      return this.b;
   }
}
