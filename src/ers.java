import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ers extends erw {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ers> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ale.a(lq.aV).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, ers::new)
   );
   private final ale<erx> c;

   private ers(List<etu> $$0, ale<erx> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ery<ers> b() {
      return erz.H;
   }

   @Override
   public void a(eqq $$0) {
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
   protected cur a(cur $$0, eqk $$1) {
      erx $$2 = $$1.a().a(lq.aV, this.c).map(ji::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eqk.c<?> $$3 = eqk.a($$2);
         if ($$1.b($$3)) {
            cur var5;
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

   public static erw.a<?> a(ale<erx> $$0) {
      return a($$1 -> new ers($$1, $$0));
   }
}
