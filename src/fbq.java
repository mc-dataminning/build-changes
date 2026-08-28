import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class fbq extends fbu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alh.a(mh.bs).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, fbq::new)
   );
   private final alh<fbv> c;

   private fbq(List<fdq> $$0, alh<fbv> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fbw<fbq> b() {
      return fbx.H;
   }

   @Override
   public void a(fan $$0) {
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
   protected czy a(czy $$0, fah $$1) {
      fbv $$2 = $$1.a().c(this.c).map(jf::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         fah.c<?> $$3 = fah.a($$2);
         if ($$1.b($$3)) {
            czy var5;
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

   public static fbu.a<?> a(alh<fbv> $$0) {
      return a($$1 -> new fbq($$1, $$0));
   }
}
