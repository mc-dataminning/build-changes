import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class erx extends esb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<erx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akj.a(lr.bc).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, erx::new)
   );
   private final akj<esc> c;

   private erx(List<etz> $$0, akj<esc> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public esd<erx> b() {
      return ese.H;
   }

   @Override
   public void a(equ $$0) {
      if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(lr.bc, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      esc $$2 = $$1.a().a(lr.bc, this.c).map(jj::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eqo.c<?> $$3 = eqo.a($$2);
         if ($$1.b($$3)) {
            cua var5;
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

   public static esb.a<?> a(akj<esc> $$0) {
      return a($$1 -> new erx($$1, $$0));
   }
}
