import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class evw extends ewa {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ali.a(ma.be).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, evw::new)
   );
   private final ali<ewb> c;

   private evw(List<exy> $$0, ali<ewb> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ewc<evw> b() {
      return ewd.H;
   }

   @Override
   public void a(eut $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.c.a() + ", but references are not allowed");
      } else if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .c(this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected cwm a(cwm $$0, eun $$1) {
      ewb $$2 = $$1.a().c(this.c).map(jq::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eun.c<?> $$3 = eun.a($$2);
         if ($$1.b($$3)) {
            cwm var5;
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

   public static ewa.a<?> a(ali<ewb> $$0) {
      return a($$1 -> new evw($$1, $$0));
   }
}
