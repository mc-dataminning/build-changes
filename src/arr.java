import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

public class arr extends aqv {
   private final LongSet c = new LongOpenHashSet();
   private final int d;
   private final String e;

   public arr(bqy<Runnable> $$0, Executor $$1, int $$2) {
      super($$0, $$1);
      this.d = $$2;
      this.e = $$0.x_();
   }

   @Override
   protected void a(long $$0) {
      this.c.remove($$0);
   }

   @Nullable
   @Override
   protected aqw.a c() {
      return this.c.size() < this.d ? super.c() : null;
   }

   @Override
   protected void a(aqw.a $$0) {
      this.c.add($$0.a());
      super.a($$0);
   }

   @VisibleForTesting
   public String d() {
      return this.e + "=[" + this.c.stream().map($$0 -> $$0 + ":" + new deh($$0)).collect(Collectors.joining(",")) + "], s=" + this.b;
   }
}
