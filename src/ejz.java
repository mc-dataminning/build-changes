import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ejz extends ekd {
   public static final Codec<ejz> a = ejv.b.listOf().fieldOf("rules").xmap(ejz::new, $$0 -> $$0.b).codec();
   private final ImmutableList<ejv> b;

   public ejz(List<? extends ejv> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      ayd $$6 = ayd.a(axw.a($$4.a()));
      dpy $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ejv $$8 = (ejv)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ekg.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ekf<?> a() {
      return ekf.i;
   }
}
