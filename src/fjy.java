import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjy extends hhw {
   private static final Logger a = LogUtils.getLogger();
   private static final hhx b = new hhx(Duration.ofSeconds(5L));
   private final List<flf> c;
   private final fty C;
   private final fry D = fry.d();
   private volatile xv E;
   @Nullable
   private fov F;

   public fjy(fty $$0, flf... $$1) {
      super(flx.a);
      this.C = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.E = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (flf $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
               if ($$1x.d()) {
                  return;
               }
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new fjc(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.F != null) {
         b.a(this.m.aZ(), this.F.z());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void aT_() {
      this.D.c().b();
      this.F = new fov(this.p, this.E);
      this.D.a(this.F, $$0 -> $$0.e(30));
      this.D.a(fof.a(xu.e, $$0 -> this.f()).a());
      this.D.a($$1 -> {
         fod var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
      frs.a(this.D, this.H());
   }

   protected void f() {
      for (flf $$0 : this.c) {
         $$0.b();
      }

      this.m.a(this.C);
   }

   public void a(xv $$0) {
      if (this.F != null) {
         this.F.b($$0);
      }

      this.E = $$0;
   }
}
