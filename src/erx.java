import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class erx extends esb {
   public static final MapCodec<erx> a = ert.b.listOf().fieldOf("rules").xmap(erx::new, $$0 -> $$0.b);
   private final ImmutableList<ert> b;

   public erx(List<? extends ert> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ese.d a(dhd $$0, jh $$1, jh $$2, ese.d $$3, ese.d $$4, esa $$5) {
      bam $$6 = bam.a(bae.a($$4.a()));
      dxn $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ert $$8 = (ert)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ese.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected esd<?> a() {
      return esd.i;
   }
}
