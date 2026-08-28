import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class err extends erv {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ale.a(lq.aV).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, err::new)
   );
   private final ale<erw> c;

   private err(List<ett> $$0, ale<erw> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public erx<err> b() {
      return ery.H;
   }

   @Override
   public void a(eqp $$0) {
      if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(lq.aV, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected cuq a(cuq $$0, eqj $$1) {
      erw $$2 = $$1.a().a(lq.aV, this.c).map(ji::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eqj.c<?> $$3 = eqj.a($$2);
         if ($$1.b($$3)) {
            cuq var5;
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

   public static erv.a<?> a(ale<erw> $$0) {
      return a($$1 -> new err($$1, $$0));
   }
}
