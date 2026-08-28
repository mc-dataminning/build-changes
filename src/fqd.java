import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fqd extends fqf {
   private static final wu a = wu.c("options.online.title");
   @Nullable
   private ffq<Unit> s;

   public fqd(fnd $$0, ffr $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aO_() {
      super.aO_();
      if (this.s != null) {
         fhk $$0 = this.q.b(this.s);
         if ($$0 != null) {
            $$0.j = false;
         }
      }
   }

   private ffq<?>[] a(ffr $$0, ffn $$1) {
      List<ffq<?>> $$2 = new ArrayList<>();
      $$2.add($$0.T());
      $$2.add($$0.U());
      ffq<Unit> $$3 = x.a(
         $$1.r,
         $$0x -> {
            bqa $$1x = $$0x.al();
            return new ffq<>(
               "options.difficulty.online",
               ffq.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new ffq.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
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

      return $$2.toArray(new ffq[0]);
   }

   @Override
   protected void m() {
      this.q.a(this.a(this.c, this.l));
   }
}
