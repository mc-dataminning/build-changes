import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class fax extends fbb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fax> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alf.a(mh.br).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, fax::new)
   );
   private final alf<fbc> c;

   private fax(List<fcx> $$0, alf<fbc> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fbd<fax> b() {
      return fbe.H;
   }

   @Override
   public void a(ezu $$0) {
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
   protected czk a(czk $$0, ezo $$1) {
      fbc $$2 = $$1.a().c(this.c).map(jf::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         ezo.c<?> $$3 = ezo.a($$2);
         if ($$1.b($$3)) {
            czk var5;
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

   public static fbb.a<?> a(alf<fbc> $$0) {
      return a($$1 -> new fax($$1, $$0));
   }
}
