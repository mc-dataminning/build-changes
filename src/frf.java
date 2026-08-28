import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class frf extends frh {
   private static final wz a = wz.c("options.online.title");
   @Nullable
   private fgr<Unit> u;

   public frf(fod $$0, fgs $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.u != null) {
         fik $$0 = this.r.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fgr<?>[] a(fgs $$0, fgo $$1) {
      List<fgr<?>> $$2 = new ArrayList<>();
      $$2.add($$0.T());
      $$2.add($$0.U());
      fgr<Unit> $$3 = x.a(
         $$1.r,
         $$0x -> {
            bqo $$1x = $$0x.al();
            return new fgr<>(
               "options.difficulty.online",
               fgr.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fgr.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fgr[0]);
   }

   @Override
   protected void m() {
      this.r.a(this.a(this.c, this.l));
   }
}
