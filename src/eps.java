import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eps extends epw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eps> a = RecordCodecBuilder.create($$0 -> a($$0).and(akg.a(le.aV).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eps::new));
   private final akg<epx> c;

   private eps(List<erq> $$0, akg<epx> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public epy b() {
      return epz.E;
   }

   @Override
   public void a(eor $$0) {
      if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(le.aV, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      epx $$2 = $$1.a().a(le.aV, this.c).map(iw::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         eol.c<?> $$3 = eol.a($$2);
         if ($$1.b($$3)) {
            csz var5;
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

   public static epw.a<?> a(akg<epx> $$0) {
      return a($$1 -> new eps($$1, $$0));
   }
}
