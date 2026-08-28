import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fte extends ftg {
   private static final xd a = xd.c("options.online.title");
   @Nullable
   private fio<Unit> u;

   public fte(fqd $$0, fip $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aR_() {
      super.aR_();
      if (this.u != null) {
         fki $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fio<?>[] a(fip $$0, fil $$1) {
      List<fio<?>> $$2 = new ArrayList<>();
      $$2.add($$0.V());
      $$2.add($$0.W());
      fio<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            brm $$1x = $$0x.am();
            return new fio<>(
               "options.difficulty.online",
               fio.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fio.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fio[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
