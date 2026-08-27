import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fkj extends fkv {
   private static final ws a = ws.c("options.online.title");
   @Nullable
   private final fcx<Unit> u;

   public static fkj a(fcu $$0, fkt $$1, fcy $$2) {
      List<fcx<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      fcx<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bon $$1x = $$0x.ak();
            return new fcx<>(
               "options.difficulty.online",
               fcx.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fcx.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fkj($$1, $$2, $$3.toArray(new fcx[0]), $$4);
   }

   private fkj(fkt $$0, fcy $$1, fcx<?>[] $$2, @Nullable fcx<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.u != null) {
         fes $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fes $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
