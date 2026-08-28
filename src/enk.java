import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class enk extends eno {
   public static final MapCodec<enk> a = eng.b.listOf().fieldOf("rules").xmap(enk::new, $$0 -> $$0.b);
   private final ImmutableList<eng> b;

   public enk(List<? extends eng> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public enr.c a(dcz $$0, jd $$1, jd $$2, enr.c $$3, enr.c $$4, enn $$5) {
      ayw $$6 = ayw.a(ayo.a($$4.a()));
      dtc $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eng $$8 = (eng)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new enr.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected enq<?> a() {
      return enq.i;
   }
}
