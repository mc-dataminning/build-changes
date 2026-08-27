import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class esw extends eta {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<esw> a = RecordCodecBuilder.create($$0 -> a($$0).and(aks.a(li.aV).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, esw::new));
   private final aks<etb> c;

   private esw(List<euu> $$0, aks<etb> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public etc b() {
      return etd.E;
   }

   @Override
   public void a(erv $$0) {
      if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(li.aV, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      etb $$2 = $$1.a().a(li.aV, this.c).map(ja::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         erp.c<?> $$3 = erp.a($$2);
         if ($$1.b($$3)) {
            cuh var5;
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

   public static eta.a<?> a(aks<etb> $$0) {
      return a($$1 -> new esw($$1, $$0));
   }
}
