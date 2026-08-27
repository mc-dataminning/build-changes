import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcb extends fce {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.snapshot.creating");
   private final long d;
   private final fbx e;
   private final String f;
   private final String g;
   private final eyi h;
   @Nullable
   private fcg i;
   @Nullable
   private fch j;

   public fcb(eyi $$0, long $$1, fbx $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      eyn $$0 = eyn.a();

      try {
         eze $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new fcg($$1.a, this.f, this.g);
         this.j = new fch(this.e, $$1.a, fbc.a, () -> fde.Q().execute(() -> eyi.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (faa var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public wu a() {
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
