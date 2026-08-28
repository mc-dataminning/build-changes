import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdx extends gwj {
   private static final Logger a = LogUtils.getLogger();
   private static final gwk b = new gwk(Duration.ofSeconds(5L));
   private final List<ffh> c;
   private final fnx A;
   private final flx B = flx.d();
   private volatile wy C;
   @Nullable
   private fiv D;

   public fdx(fnx $$0, ffh... $$1) {
      super(fga.a);
      this.A = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.C = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (ffh $$1x : $$1) {
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
         $$3.setUncaughtExceptionHandler(new fdb(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.D != null) {
         b.a(this.l.aV(), this.D.z());
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
   public void aP_() {
      this.B.c().b();
      this.D = new fiv(this.o, this.C);
      this.B.a(this.D, $$0 -> $$0.e(30));
      this.B.a(fig.a(wx.e, $$0 -> this.f()).a());
      this.B.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      flr.a(this.B, this.H());
   }

   protected void f() {
      for (ffh $$0 : this.c) {
         $$0.b();
      }

      this.l.a(this.A);
   }

   public void a(wy $$0) {
      if (this.D != null) {
         this.D.b($$0);
      }

      this.C = $$0;
   }
}
