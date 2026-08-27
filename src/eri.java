import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eri(akg<erq> b) implements erq {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<eri> a = RecordCodecBuilder.create($$0 -> $$0.group(akg.a(le.aW).fieldOf("name").forGetter(eri::c)).apply($$0, eri::new));

   @Override
   public err b() {
      return ers.r;
   }

   @Override
   public void a(eor $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         erq.super.a($$0);
         $$0.a()
            .a(le.aW, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eol $$0) {
      erq $$1 = $$0.a().a(le.aW, this.b).map(iw.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eol.c<?> $$2 = eol.a($$1);
         if ($$0.b($$2)) {
            boolean var4;
            try {
               var4 = $$1.test($$0);
            } finally {
               $$0.c($$2);
            }

            return var4;
         } else {
            c.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   public static erq.a a(akg<erq> $$0) {
      return () -> new eri($$0);
   }

   public akg<erq> c() {
      return this.b;
   }
}
