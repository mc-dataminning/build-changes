import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class fbc extends fbg {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alf.a(mh.bs).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, fbc::new)
   );
   private final alf<fbh> c;

   private fbc(List<fdc> $$0, alf<fbh> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fbi<fbc> b() {
      return fbj.H;
   }

   @Override
   public void a(ezz $$0) {
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
   protected czn a(czn $$0, ezt $$1) {
      fbh $$2 = $$1.a().c(this.c).map(jf::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         ezt.c<?> $$3 = ezt.a($$2);
         if ($$1.b($$3)) {
            czn var5;
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

   public static fbg.a<?> a(alf<fbh> $$0) {
      return a($$1 -> new fbc($$1, $$0));
   }
}
