import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class enm extends enq {
   public static final MapCodec<enm> a = eni.b.listOf().fieldOf("rules").xmap(enm::new, $$0 -> $$0.b);
   private final ImmutableList<eni> b;

   public enm(List<? extends eni> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ent.c a(dcz $$0, jd $$1, jd $$2, ent.c $$3, ent.c $$4, enp $$5) {
      ayw $$6 = ayw.a(ayo.a($$4.a()));
      dtc $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eni $$8 = (eni)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ent.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ens<?> a() {
      return ens.i;
   }
}
