import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fjn extends fjz {
   private static final wi a = wi.c("options.online.title");
   @Nullable
   private final fcb<Unit> q;

   public static fjn a(fby $$0, fjx $$1, fcc $$2) {
      List<fcb<?>> $$3 = new ArrayList<>();
      $$3.add($$2.T());
      $$3.add($$2.U());
      fcb<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            boc $$1x = $$0x.ak();
            return new fcb<>(
               "options.difficulty.online",
               fcb.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new fcb.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new fjn($$1, $$2, $$3.toArray(new fcb[0]), $$4);
   }

   private fjn(fjx $$0, fcc $$1, fcb<?>[] $$2, @Nullable fcb<Unit> $$3) {
      super($$0, $$1, a, $$2);
      this.q = $$3;
   }

   @Override
   protected void aM_() {
      super.aM_();
      if (this.q != null) {
         fdw $$0 = this.p.b(this.q);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      fdw $$1 = this.p.b(this.c.ai());
      if ($$1 != null) {
         $$1.j = this.j.D();
      }
   }
}
