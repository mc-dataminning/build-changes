import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class ezx extends faj {
   @Nullable
   private final esu<Unit> l;

   public static ezx a(esr $$0, fah $$1, esv $$2) {
      List<esu<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.Q());
      $$3.add($$2.R());
      esu<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bin $$1x = $$0x.ai();
            return new esu<>(
               "options.difficulty.online",
               esu.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new esu.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new ezx($$1, $$2, $$3.toArray(new esu[0]), $$4);
   }

   private ezx(fah $$0, esv $$1, esu<?>[] $$2, @Nullable esu<Unit> $$3) {
      super($$0, $$1, ur.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aO_() {
      super.aO_();
      if (this.l != null) {
         euk $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      euk $$1 = this.k.b(this.b.af());
      if ($$1 != null) {
         $$1.i = this.f.A();
      }
   }
}
