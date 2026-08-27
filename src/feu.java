import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class feu extends ffg {
   @Nullable
   private final exk<Unit> l;

   public static feu a(exh $$0, ffe $$1, exl $$2) {
      List<exk<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      exk<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            blr $$1x = $$0x.ak();
            return new exk<>(
               "options.difficulty.online",
               exk.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new exk.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new feu($$1, $$2, $$3.toArray(new exk[0]), $$4);
   }

   private feu(ffe $$0, exl $$1, exk<?>[] $$2, @Nullable exk<Unit> $$3) {
      super($$0, $$1, vq.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      if (this.l != null) {
         ezf $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.j = false;
         }
      }

      ezf $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.j = this.f.B();
      }
   }
}
