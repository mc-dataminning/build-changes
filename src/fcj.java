import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class fcj extends fcv {
   @Nullable
   private final evd<Unit> l;

   public static fcj a(eva $$0, fct $$1, eve $$2) {
      List<evd<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      evd<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bjs $$1x = $$0x.ak();
            return new evd<>(
               "options.difficulty.online",
               evd.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new evd.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fcj($$1, $$2, $$3.toArray(new evd[0]), $$4);
   }

   private fcj(fct $$0, eve $$1, evd<?>[] $$2, @Nullable evd<Unit> $$3) {
      super($$0, $$1, vd.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aN_() {
      super.aN_();
      if (this.l != null) {
         eww $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      eww $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.j = this.f.A();
      }
   }
}
