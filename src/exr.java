import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class exr extends exv {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alo.a(mb.bh).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, exr::new)
   );
   private final alo<exw> c;

   private exr(List<ezr> $$0, alo<exw> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public exx<exr> b() {
      return exy.H;
   }

   @Override
   public void a(ewo $$0) {
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
   protected cxg a(cxg $$0, ewi $$1) {
      exw $$2 = $$1.a().c(this.c).map(jq::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         ewi.c<?> $$3 = ewi.a($$2);
         if ($$1.b($$3)) {
            cxg var5;
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

   public static exv.a<?> a(alo<exw> $$0) {
      return a($$1 -> new exr($$1, $$0));
   }
}
