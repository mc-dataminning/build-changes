import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eta extends ete {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eta> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akq.a(lu.bd).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eta::new)
   );
   private final akq<etf> c;

   private eta(List<evc> $$0, akq<etf> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public etg<eta> b() {
      return eth.H;
   }

   @Override
   public void a(erx $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.c.a() + ", but references are not allowed");
      } else if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(lu.bd, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected cuq a(cuq $$0, err $$1) {
      etf $$2 = $$1.a().a(lu.bd, this.c).map(jm::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         err.c<?> $$3 = err.a($$2);
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

   public static ete.a<?> a(akq<etf> $$0) {
      return a($$1 -> new eta($$1, $$0));
   }
}
