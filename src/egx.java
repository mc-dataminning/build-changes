import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class egx extends ehb {
   public static final Codec<egx> a = egt.b.listOf().fieldOf("rules").xmap(egx::new, $$0 -> $$0.b).codec();
   private final ImmutableList<egt> b;

   public egx(List<? extends egt> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      axd $$6 = axd.a(aww.a($$4.a()));
      dnb $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         egt $$8 = (egt)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ehe.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ehd<?> a() {
      return ehd.i;
   }
}
