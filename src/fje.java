import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fje extends fjq {
   private static final wg a = wg.c("options.online.title");
   @Nullable
   private final fbs<Unit> q;

   public static fje a(fbp $$0, fjo $$1, fbt $$2) {
      List<fbs<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      fbs<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bnx $$1x = $$0x.ak();
            return new fbs<>(
               "options.difficulty.online",
               fbs.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fbs.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fje($$1, $$2, $$3.toArray(new fbs[0]), $$4);
   }

   private fje(fjo $$0, fbt $$1, fbs<?>[] $$2, @Nullable fbs<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.q = $$3;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.q != null) {
         fdn $$0 = this.p.b(this.q);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fdn $$1 = this.p.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.j.D();
      }
   }
}
