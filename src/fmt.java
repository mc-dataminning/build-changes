import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fmt extends fnf {
   private static final xp a = xp.c("options.online.title");
   @Nullable
   private final ffi<Unit> u;

   public static fmt a(fff $$0, fnd $$1, ffj $$2) {
      List<ffi<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      ffi<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bqr $$1x = $$0x.al();
            return new ffi<>(
               "options.difficulty.online",
               ffi.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffi.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fmt($$1, $$2, $$3.toArray(new ffi[0]), $$4);
   }

   private fmt(fnd $$0, ffj $$1, ffi<?>[] $$2, @Nullable ffi<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.u = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.u != null) {
         fhc $$0 = this.s.b(this.u);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fhc $$1 = this.s.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.m.D();
      }
   }
}
