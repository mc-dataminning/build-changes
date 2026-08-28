import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class ftt extends ftv {
   private static final xh a = xh.c("options.online.title");
   @Nullable
   private fjd<Unit> u;

   public ftt(fqs $$0, fje $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aS_() {
      super.aS_();
      if (this.u != null) {
         fkx $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fjd<?>[] a(fje $$0, fja $$1) {
      List<fjd<?>> $$2 = new ArrayList<>();
      $$2.add($$0.V());
      $$2.add($$0.W());
      fjd<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            brv $$1x = $$0x.am();
            return new fjd<>(
               "options.difficulty.online",
               fjd.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fjd.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fjd[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
