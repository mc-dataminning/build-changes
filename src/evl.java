import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class evl extends evp {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alh.a(lz.be).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, evl::new)
   );
   private final alh<evq> c;

   private evl(List<exn> $$0, alh<evq> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public evr<evl> b() {
      return evs.H;
   }

   @Override
   public void a(eui $$0) {
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
   protected cwb a(cwb $$0, euc $$1) {
      evq $$2 = $$1.a().c(this.c).map(jq::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         euc.c<?> $$3 = euc.a($$2);
         if ($$1.b($$3)) {
            cwb var5;
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

   public static evp.a<?> a(alh<evq> $$0) {
      return a($$1 -> new evl($$1, $$0));
   }
}
