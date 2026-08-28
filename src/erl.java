import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class erl extends erp {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ala.a(lq.aV).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, erl::new)
   );
   private final ala<erq> c;

   private erl(List<etn> $$0, ala<erq> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public err<erl> b() {
      return ers.H;
   }

   @Override
   public void a(eqj $$0) {
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
   protected cuk a(cuk $$0, eqd $$1) {
      erq $$2 = $$1.a().a(lq.aV, this.c).map(ji::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eqd.c<?> $$3 = eqd.a($$2);
         if ($$1.b($$3)) {
            cuk var5;
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

   public static erp.a<?> a(ala<erq> $$0) {
      return a($$1 -> new erl($$1, $$0));
   }
}
