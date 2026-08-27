import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class ffb extends ffn {
   @Nullable
   private final exr<Unit> l;

   public static ffb a(exo $$0, ffl $$1, exs $$2) {
      List<exr<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      exr<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            blt $$1x = $$0x.aj();
            return new exr<>(
               "options.difficulty.online",
               exr.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new exr.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new ffb($$1, $$2, $$3.toArray(new exr[0]), $$4);
   }

   private ffb(ffl $$0, exs $$1, exr<?>[] $$2, @Nullable exr<Unit> $$3) {
      super($$0, $$1, vq.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      if (this.l != null) {
         ezm $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      ezm $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.j = this.f.C();
      }
   }
}
