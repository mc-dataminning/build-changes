import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class egl extends ego {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egl> a = RecordCodecBuilder.create($$0 -> a($$0).and(agm.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, egl::new));
   private final agm c;

   private egl(List<eib> $$0, agm $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public egq b() {
      return egr.B;
   }

   @Override
   public void a(efl $$0) {
      efe<egp> $$1 = new efe<>(efh.b, this.c);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.a("Unknown function table called " + this.c));
      }
   }

   @Override
   protected clo a(clo $$0, efc $$1) {
      egp $$2 = $$1.a().getElement(efh.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         efc.c<?> $$3 = efc.a($$2);
         if ($$1.b($$3)) {
            clo var5;
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

   public static ego.a<?> a(agm $$0) {
      return a($$1 -> new egl($$1, $$0));
   }
}
