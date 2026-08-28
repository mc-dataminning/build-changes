import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class arh extends aqk {
   private final LongSet c = new LongOpenHashSet();
   private final int d;
   private final String e;

   public arh(brg<Runnable> $$0, Executor $$1, int $$2) {
      super($$0, $$1);
      this.d = $$2;
      this.e = $$0.A_();
   }

   @Override
   protected void a(long $$0) {
      this.c.remove($$0);
   }

   @Nullable
   @Override
   protected aql.a c() {
      return this.c.size() < this.d ? super.c() : null;
   }

   @Override
   protected void a(aql.a $$0) {
      this.c.add($$0.a());
      super.a($$0);
   }

   @VisibleForTesting
   public String d() {
      return this.e + "=[" + this.c.longStream().mapToObj($$0 -> $$0 + ":" + new dfp($$0)).collect(Collectors.joining(",")) + "], s=" + this.b;
   }
}
