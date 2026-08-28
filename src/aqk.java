import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aqk implements aqg.a, AutoCloseable {
   public static final int a = 4;
   private static final Logger c = LogUtils.getLogger();
   private final aql d;
   private final brg<Runnable> e;
   private final brd f;
   protected boolean b;

   public aqk(brg<Runnable> $$0, Executor $$1) {
      this.d = new aql($$0.A_() + "_queue");
      this.e = $$0;
      this.f = new brd(4, $$1, "dispatcher");
      this.b = true;
   }

   public boolean a() {
      return this.f.c() || this.d.b();
   }

   @Override
   public void onLevelChange(dfp $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.f.a_(new brf.c(0, () -> {
         int $$4 = $$1.getAsInt();
         this.d.a($$4, $$0, $$2);
         $$3.accept($$2);
      }));
   }

   public void a(long $$0, Runnable $$1, boolean $$2) {
      this.f.a_(new brf.c(1, () -> {
         this.d.a($$0, $$2);
         this.a($$0);
         if (this.b) {
            this.b = false;
            this.b();
         }

         $$1.run();
      }));
   }

   public void a(Runnable $$0, long $$1, IntSupplier $$2) {
      this.f.a_(new brf.c(2, () -> {
         int $$3 = $$2.getAsInt();
         this.d.a($$0, $$1, $$3);
         if (this.b) {
            this.b = false;
            this.b();
         }
      }));
   }

   protected void b() {
      this.f.a_(new brf.c(3, () -> {
         aql.a $$0 = this.c();
         if ($$0 == null) {
            this.b = true;
         } else {
            this.a($$0);
         }
      }));
   }

   protected void a(aql.a $$0) {
      CompletableFuture.allOf($$0.b().stream().map($$0x -> this.e.a($$1 -> {
            $$0x.run();
            $$1.complete(baf.a);
         })).toArray(CompletableFuture[]::new)).thenAccept($$0x -> this.b());
   }

   protected void a(long $$0) {
   }

   @Nullable
   protected aql.a c() {
      return this.d.a();
   }

   @Override
   public void close() {
      this.e.close();
   }
}
