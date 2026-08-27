import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fkt extends flf {
   private static final wu a = wu.c("options.online.title");
   @Nullable
   private final fdh<Unit> u;

   public static fkt a(fde $$0, fld $$1, fdi $$2) {
      List<fdh<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      fdh<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bpj $$1x = $$0x.ak();
            return new fdh<>(
               "options.difficulty.online",
               fdh.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fdh.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fkt($$1, $$2, $$3.toArray(new fdh[0]), $$4);
   }

   private fkt(fld $$0, fdi $$1, fdh<?>[] $$2, @Nullable fdh<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.u != null) {
         ffc $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      ffc $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
