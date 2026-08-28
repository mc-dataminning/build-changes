import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class esf extends esj {
   public static final MapCodec<esf> a = esb.b.listOf().fieldOf("rules").xmap(esf::new, $$0 -> $$0.b);
   private final ImmutableList<esb> b;

   public esf(List<? extends esb> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      bam $$6 = bam.a(bae.a($$4.a()));
      dxv $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         esb $$8 = (esb)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new esm.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected esl<?> a() {
      return esl.i;
   }
}
