import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emf extends emj {
   public static final MapCodec<emf> a = emb.b.listOf().fieldOf("rules").xmap(emf::new, $$0 -> $$0.b);
   private final ImmutableList<emb> b;

   public emf(List<? extends emb> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emm.c a(dcd $$0, iz $$1, iz $$2, emm.c $$3, emm.c $$4, emi $$5) {
      azh $$6 = azh.a(ayz.a($$4.a()));
      dse $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         emb $$8 = (emb)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new emm.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eml<?> a() {
      return eml.i;
   }
}
