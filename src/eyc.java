import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class eyc extends eyo {
   @Nullable
   private final era<Unit> l;

   public static eyc a(eqx $$0, eym $$1, erb $$2) {
      List<era<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.P());
      $$3.add($$2.Q());
      era<Unit> $$4 = x.a(
         $$0.r,
         $$0x -> {
            bgx $$1x = $$0x.ai();
            return new era<>(
               "options.difficulty.online",
               era.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new era.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new eyc($$1, $$2, $$3.toArray(new era[0]), $$4);
   }

   private eyc(eym $$0, erb $$1, era<?>[] $$2, @Nullable era<Unit> $$3) {
      super($$0, $$1, tn.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void aH_() {
      super.aH_();
      if (this.l != null) {
         esq $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.i = false;
         }
      }

      esq $$1 = this.k.b(this.b.ae());
      if ($$1 != null) {
         $$1.i = this.f.B();
      }
   }
}
