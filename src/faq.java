import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class faq extends fau {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alf.a(mg.br).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, faq::new)
   );
   private final alf<fav> c;

   private faq(List<fcq> $$0, alf<fav> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public faw<faq> b() {
      return fax.H;
   }

   @Override
   public void a(ezn $$0) {
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
   protected czd a(czd $$0, ezh $$1) {
      fav $$2 = $$1.a().c(this.c).map(je::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         ezh.c<?> $$3 = ezh.a($$2);
         if ($$1.b($$3)) {
            czd var5;
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

   public static fau.a<?> a(alf<fav> $$0) {
      return a($$1 -> new faq($$1, $$0));
   }
}
