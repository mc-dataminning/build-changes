import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fqj extends fql {
   private static final wu a = wu.c("options.online.title");
   @Nullable
   private ffw<Unit> s;

   public fqj(fnj $$0, ffx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aP_() {
      super.aP_();
      if (this.s != null) {
         fhq $$0 = this.q.b(this.s);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private ffw<?>[] a(ffx $$0, fft $$1) {
      List<ffw<?>> $$2 = new ArrayList<>();
      $$2.add($$0.T());
      $$2.add($$0.U());
      ffw<Unit> $$3 = x.a(
         $$1.r,
         $$0x -> {
            bqd $$1x = $$0x.al();
            return new ffw<>(
               "options.difficulty.online",
               ffw.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffw.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$3 != null) {
         this.s = $$3;
         $$2.add($$3);
      }

      return $$2.toArray(new ffw[0]);
   }

   @Override
   protected void m() {
      this.q.a(this.a(this.c, this.l));
   }
}
