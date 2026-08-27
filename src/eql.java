import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eql extends eqo {
   private static final Logger b = LogUtils.getLogger();
   private static final ui c = ui.c("mco.snapshot.creating");
   private final long d;
   private final eqh e;
   private final String f;
   private final String g;
   private final ems h;
   @Nullable
   private eqw i;
   @Nullable
   private eqq j;

   public eql(ems $$0, long $$1, eqh $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      emx $$0 = emx.a();

      try {
         eno $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new eqw($$1.a, this.f, this.g);
         this.j = new eqq(this.e, $$1.a, epm.a, () -> ero.O().execute(() -> ems.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (eok var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public ui a() {
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
