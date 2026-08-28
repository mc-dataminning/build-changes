import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class erq extends eru {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<erq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ale.a(lq.aV).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, erq::new)
   );
   private final ale<erv> c;

   private erq(List<ets> $$0, ale<erv> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public erw<erq> b() {
      return erx.H;
   }

   @Override
   public void a(eqo $$0) {
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
   protected cup a(cup $$0, eqi $$1) {
      erv $$2 = $$1.a().a(lq.aV, this.c).map(ji::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eqi.c<?> $$3 = eqi.a($$2);
         if ($$1.b($$3)) {
            cup var5;
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

   public static eru.a<?> a(ale<erv> $$0) {
      return a($$1 -> new erq($$1, $$0));
   }
}
