import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class fai extends fam {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fai> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alf.a(mg.bq).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, fai::new)
   );
   private final alf<fan> c;

   private fai(List<fci> $$0, alf<fan> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fao<fai> b() {
      return fap.H;
   }

   @Override
   public void a(ezf $$0) {
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
   protected cyy a(cyy $$0, eyz $$1) {
      fan $$2 = $$1.a().c(this.c).map(je::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eyz.c<?> $$3 = eyz.a($$2);
         if ($$1.b($$3)) {
            cyy var5;
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

   public static fam.a<?> a(alf<fan> $$0) {
      return a($$1 -> new fai($$1, $$0));
   }
}
