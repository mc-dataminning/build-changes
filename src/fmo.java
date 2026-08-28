import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fmo extends fna {
   private static final xl a = xl.c("options.online.title");
   @Nullable
   private final ffd<Unit> u;

   public static fmo a(ffa $$0, fmy $$1, ffe $$2) {
      List<ffd<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      ffd<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bqm $$1x = $$0x.al();
            return new ffd<>(
               "options.difficulty.online",
               ffd.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffd.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fmo($$1, $$2, $$3.toArray(new ffd[0]), $$4);
   }

   private fmo(fmy $$0, ffe $$1, ffd<?>[] $$2, @Nullable ffd<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.u != null) {
         fgx $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fgx $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
