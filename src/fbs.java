import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class fbs extends fbw {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alj.a(mi.bs).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, fbs::new)
   );
   private final alj<fbx> c;

   private fbs(List<fds> $$0, alj<fbx> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fby<fbs> b() {
      return fbz.H;
   }

   @Override
   public void a(fap $$0) {
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
   protected daa a(daa $$0, faj $$1) {
      fbx $$2 = $$1.a().c(this.c).map(jg::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         faj.c<?> $$3 = faj.a($$2);
         if ($$1.b($$3)) {
            daa var5;
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

   public static fbw.a<?> a(alj<fbx> $$0) {
      return a($$1 -> new fbs($$1, $$0));
   }
}
