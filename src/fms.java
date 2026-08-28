import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fms extends fne {
   private static final xo a = xo.c("options.online.title");
   @Nullable
   private final ffh<Unit> u;

   public static fms a(ffe $$0, fnc $$1, ffi $$2) {
      List<ffh<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      ffh<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bqq $$1x = $$0x.al();
            return new ffh<>(
               "options.difficulty.online",
               ffh.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffh.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fms($$1, $$2, $$3.toArray(new ffh[0]), $$4);
   }

   private fms(fnc $$0, ffi $$1, ffh<?>[] $$2, @Nullable ffh<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.u != null) {
         fhb $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fhb $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
