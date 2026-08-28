import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fed extends gwq {
   private static final Logger a = LogUtils.getLogger();
   private static final gwr b = new gwr(Duration.ofSeconds(5L));
   private final List<ffn> c;
   private final fod B;
   private final fmd C = fmd.d();
   private volatile wz D;
   @Nullable
   private fjb E;

   public fed(fod $$0, ffn... $$1) {
      super(fgg.a);
      this.B = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.D = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (ffn $$1x : $$1) {
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
         $$3.setUncaughtExceptionHandler(new fdh(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.E != null) {
         b.a(this.l.aV(), this.E.z());
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
      this.C.c().b();
      this.E = new fjb(this.o, this.D);
      this.C.a(this.E, $$0 -> $$0.e(30));
      this.C.a(fim.a(wy.e, $$0 -> this.f()).a());
      this.C.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      flx.a(this.C, this.H());
   }

   protected void f() {
      for (ffn $$0 : this.c) {
         $$0.b();
      }

      this.l.a(this.B);
   }

   public void a(wz $$0) {
      if (this.E != null) {
         this.E.b($$0);
      }

      this.D = $$0;
   }
}
