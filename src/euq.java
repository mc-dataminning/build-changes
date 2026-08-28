import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class euq extends euu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alb.a(lv.be).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, euq::new)
   );
   private final alb<euv> c;

   private euq(List<ews> $$0, alb<euv> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public euw<euq> b() {
      return eux.H;
   }

   @Override
   public void a(etn $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.c.a() + ", but references are not allowed");
      } else if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(lv.be, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected cvp a(cvp $$0, eth $$1) {
      euv $$2 = $$1.a().a(lv.be, this.c).map(jn::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eth.c<?> $$3 = eth.a($$2);
         if ($$1.b($$3)) {
            cvp var5;
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

   public static euu.a<?> a(alb<euv> $$0) {
      return a($$1 -> new euq($$1, $$0));
   }
}
