import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class euu extends euy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<euu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ald.a(lw.bf).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, euu::new)
   );
   private final ald<euz> c;

   private euu(List<eww> $$0, ald<euz> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eva<euu> b() {
      return evb.H;
   }

   @Override
   public void a(etr $$0) {
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
   protected cvs a(cvs $$0, etl $$1) {
      euz $$2 = $$1.a().c(this.c).map(jo::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         etl.c<?> $$3 = etl.a($$2);
         if ($$1.b($$3)) {
            cvs var5;
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

   public static euy.a<?> a(ald<euz> $$0) {
      return a($$1 -> new euu($$1, $$0));
   }
}
