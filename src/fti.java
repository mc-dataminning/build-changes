import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fti extends ftk {
   private static final xe a = xe.c("options.online.title");
   @Nullable
   private fis<Unit> u;

   public fti(fqh $$0, fit $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aS_() {
      super.aS_();
      if (this.u != null) {
         fkm $$0 = this.d.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private fis<?>[] a(fit $$0, fip $$1) {
      List<fis<?>> $$2 = new ArrayList<>();
      $$2.add($$0.V());
      $$2.add($$0.W());
      fis<Unit> $$3 = x.a(
         $$1.s,
         $$0x -> {
            brp $$1x = $$0x.am();
            return new fis<>(
               "options.difficulty.online",
               fis.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fis.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new fis[0]);
   }

   @Override
   protected void m() {
      this.d.a(this.a(this.c, this.m));
   }
}
