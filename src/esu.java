import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class esu extends esy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(akp.a(lu.bd).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, esu::new)
   );
   private final akp<esz> c;

   private esu(List<euw> $$0, akp<esz> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eta<esu> b() {
      return etb.H;
   }

   @Override
   public void a(err $$0) {
      if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(lu.bd, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected cuo a(cuo $$0, erl $$1) {
      esz $$2 = $$1.a().a(lu.bd, this.c).map(jm::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         erl.c<?> $$3 = erl.a($$2);
         if ($$1.b($$3)) {
            cuo var5;
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

   public static esy.a<?> a(akp<esz> $$0) {
      return a($$1 -> new esu($$1, $$0));
   }
}
