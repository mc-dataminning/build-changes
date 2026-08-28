import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fql extends fqn {
   private static final wu a = wu.c("options.online.title");
   @Nullable
   private ffz<Unit> s;

   public fql(fnl $$0, fga $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aP_() {
      super.aP_();
      if (this.s != null) {
         fhs $$0 = this.q.b(this.s);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private ffz<?>[] a(fga $$0, ffw $$1) {
      List<ffz<?>> $$2 = new ArrayList<>();
      $$2.add($$0.T());
      $$2.add($$0.U());
      ffz<Unit> $$3 = x.a(
         $$1.r,
         $$0x -> {
            bqe $$1x = $$0x.al();
            return new ffz<>(
               "options.difficulty.online",
               ffz.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffz.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$3 != null) {
         this.s = $$3;
         $$2.add($$3);
      }

      return $$2.toArray(new ffz[0]);
   }

   @Override
   protected void m() {
      this.q.a(this.a(this.c, this.l));
   }
}
