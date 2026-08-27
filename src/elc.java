import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class elc extends elg {
   public static final MapCodec<elc> a = eky.b.listOf().fieldOf("rules").xmap(elc::new, $$0 -> $$0.b);
   private final ImmutableList<eky> b;

   public elc(List<? extends eky> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public elj.c a(dba $$0, io $$1, io $$2, elj.c $$3, elj.c $$4, elf $$5) {
      ayk $$6 = ayk.a(ayd.a($$4.a()));
      drb $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eky $$8 = (eky)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new elj.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eli<?> a() {
      return eli.i;
   }
}
