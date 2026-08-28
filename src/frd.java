import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class frd extends frf {
   private static final wz a = wz.c("options.online.title");
   @Nullable
   private fgp<Unit> u;

   public frd(fob $$0, fgq $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.u != null) {
         fii $$0 = this.r.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fgp<?>[] a(fgq $$0, fgm $$1) {
      List<fgp<?>> $$2 = new ArrayList<>();
      $$2.add($$0.T());
      $$2.add($$0.U());
      fgp<Unit> $$3 = x.a(
         $$1.r,
         $$0x -> {
            bqo $$1x = $$0x.al();
            return new fgp<>(
               "options.difficulty.online",
               fgp.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fgp.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$3 != null) {
         this.u = $$3;
         $$2.add($$3);
      }

      return $$2.toArray(new fgp[0]);
   }

   @Override
   protected void m() {
      this.r.a(this.a(this.c, this.l));
   }
}
