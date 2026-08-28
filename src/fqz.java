import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fqz extends frb {
   private static final wy a = wy.c("options.online.title");
   @Nullable
   private fgl<Unit> s;

   public fqz(fnx $$0, fgm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aP_() {
      super.aP_();
      if (this.s != null) {
         fie $$0 = this.q.b(this.s);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fgl<?>[] a(fgm $$0, fgi $$1) {
      List<fgl<?>> $$2 = new ArrayList<>();
      $$2.add($$0.T());
      $$2.add($$0.U());
      fgl<Unit> $$3 = x.a(
         $$1.r,
         $$0x -> {
            bqn $$1x = $$0x.al();
            return new fgl<>(
               "options.difficulty.online",
               fgl.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fgl.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fgl[0]);
   }

   @Override
   protected void m() {
      this.q.a(this.a(this.c, this.l));
   }
}
