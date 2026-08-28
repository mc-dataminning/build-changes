import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class epb extends epf {
   public static final MapCodec<epb> a = eox.b.listOf().fieldOf("rules").xmap(epb::new, $$0 -> $$0.b);
   private final ImmutableList<eox> b;

   public epb(List<? extends eox> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public epi.c a(dem $$0, jf $$1, jf $$2, epi.c $$3, epi.c $$4, epe $$5) {
      azn $$6 = azn.a(azf.a($$4.a()));
      dus $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eox $$8 = (eox)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new epi.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eph<?> a() {
      return eph.i;
   }
}
