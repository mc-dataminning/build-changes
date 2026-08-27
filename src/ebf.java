import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ebf extends ebj {
   public static final Codec<ebf> a = ebb.b.listOf().fieldOf("rules").xmap(ebf::new, $$0 -> $$0.b).codec();
   private final ImmutableList<ebb> b;

   public ebf(List<? extends ebb> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      atw $$6 = atw.a(atq.a($$4.a()));
      dhn $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ebb $$8 = (ebb)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ebm.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ebl<?> a() {
      return ebl.i;
   }
}
