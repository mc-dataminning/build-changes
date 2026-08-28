import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class evf extends evj {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alg.a(ly.be).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, evf::new)
   );
   private final alg<evk> c;

   private evf(List<exh> $$0, alg<evk> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public evl<evf> b() {
      return evm.H;
   }

   @Override
   public void a(euc $$0) {
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
   protected cvx a(cvx $$0, etw $$1) {
      evk $$2 = $$1.a().c(this.c).map(jp::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         etw.c<?> $$3 = etw.a($$2);
         if ($$1.b($$3)) {
            cvx var5;
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

   public static evj.a<?> a(alg<evk> $$0) {
      return a($$1 -> new evf($$1, $$0));
   }
}
