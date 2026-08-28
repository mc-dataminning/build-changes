import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fsu extends fsw {
   private static final xd a = xd.c("options.online.title");
   @Nullable
   private fie<Unit> u;

   public fsu(fpt $$0, fif $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      if (this.u != null) {
         fjy $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fie<?>[] a(fif $$0, fib $$1) {
      List<fie<?>> $$2 = new ArrayList<>();
      $$2.add($$0.V());
      $$2.add($$0.W());
      fie<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            brh $$1x = $$0x.am();
            return new fie<>(
               "options.difficulty.online",
               fie.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fie.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fie[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
