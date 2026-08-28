import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ese extends esi {
   public static final MapCodec<ese> a = esa.b.listOf().fieldOf("rules").xmap(ese::new, $$0 -> $$0.b);
   private final ImmutableList<esa> b;

   public ese(List<? extends esa> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public esl.d a(dhc $$0, ji $$1, ji $$2, esl.d $$3, esl.d $$4, esh $$5) {
      azh $$6 = azh.a(ayz.a($$4.a()));
      dxq $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         esa $$8 = (esa)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new esl.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected esk<?> a() {
      return esk.i;
   }
}
