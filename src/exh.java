import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exh extends exk {
   private static final Logger b = LogUtils.getLogger();
   private static final vs c = vs.c("mco.snapshot.creating");
   private final long d;
   private final exd e;
   private final String f;
   private final String g;
   private final eto h;
   @Nullable
   private exm i;
   @Nullable
   private exn j;

   public exh(eto $$0, long $$1, exd $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      ett $$0 = ett.a();

      try {
         euk $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new exm($$1.a, this.f, this.g);
         this.j = new exn(this.e, $$1.a, ewi.a, () -> eyk.P().execute(() -> eto.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (evg var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public vs a() {
      return c;
   }

   @Override
   public void b() {
      super.b();
      if (this.i != null) {
         this.i.b();
      }

      if (this.j != null) {
         this.j.b();
      }
   }
}
