import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class esf extends esj {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akj.a(lr.bc).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, esf::new)
   );
   private final akj<esk> c;

   private esf(List<euh> $$0, akj<esk> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public esl<esf> b() {
      return esm.H;
   }

   @Override
   public void a(erc $$0) {
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
   protected cud a(cud $$0, eqw $$1) {
      esk $$2 = $$1.a().a(lr.bc, this.c).map(jj::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eqw.c<?> $$3 = eqw.a($$2);
         if ($$1.b($$3)) {
            cud var5;
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

   public static esj.a<?> a(akj<esk> $$0) {
      return a($$1 -> new esf($$1, $$0));
   }
}
