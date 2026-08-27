import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewy extends gpe {
   private static final Logger a = LogUtils.getLogger();
   private static final gpf b = new gpf(Duration.ofSeconds(5L));
   private final List<eyi> c;
   private final fhh v;
   private final fez w = fez.d();
   private volatile vu x;
   @Nullable
   private fbx y;

   public ewy(fhh $$0, eyi... $$1) {
      super(eza.a);
      this.v = $$0;
      this.c = List.of($$1);
      if (this.c.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.x = this.c.get(0).a();
         Runnable $$2 = () -> {
            for (eyi $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new ewc(a));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.y != null) {
         b.a(this.f.aY(), this.y.x());
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
   public void aO_() {
      this.w.c().b();
      this.y = new fbx(this.i, this.x);
      this.w.a(this.y, $$0 -> $$0.e(30));
      this.w.a(fbi.a(vt.e, $$0 -> this.f()).a());
      this.w.a($$1 -> {
         fbg var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.w.a();
      fet.a(this.w, this.F());
   }

   protected void f() {
      for (eyi $$0 : this.c) {
         $$0.b();
      }

      this.f.a(this.v);
   }

   public void a(vu $$0) {
      if (this.y != null) {
         this.y.b($$0);
      }

      this.x = $$0;
   }
}
