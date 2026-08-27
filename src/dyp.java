import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyp extends dyt {
   public static final Codec<dyp> a = dyl.b.listOf().fieldOf("rules").xmap(dyp::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dyl> b;

   public dyp(List<? extends dyl> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      arx $$6 = arx.a(ars.a($$4.a()));
      dfe $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dyl $$8 = (dyl)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dyw.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dyv<?> a() {
      return dyv.i;
   }
}
