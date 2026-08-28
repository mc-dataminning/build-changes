import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fmr extends fnd {
   private static final xo a = xo.c("options.online.title");
   @Nullable
   private final ffg<Unit> u;

   public static fmr a(ffd $$0, fnb $$1, ffh $$2) {
      List<ffg<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      ffg<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bqp $$1x = $$0x.al();
            return new ffg<>(
               "options.difficulty.online",
               ffg.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffg.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fmr($$1, $$2, $$3.toArray(new ffg[0]), $$4);
   }

   private fmr(fnb $$0, ffh $$1, ffg<?>[] $$2, @Nullable ffg<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.u != null) {
         fha $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fha $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
