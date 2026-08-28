import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffk extends ffn {
   private static final Logger b = LogUtils.getLogger();
   private static final wz c = wz.c("mco.snapshot.creating");
   private final long d;
   private final ffg e;
   private final String f;
   private final String g;
   private final fbt h;
   @Nullable
   private ffp i;
   @Nullable
   private ffq j;

   public ffk(fbt $$0, long $$1, ffg $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      fby $$0 = fby.a();

      try {
         fcp $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new ffp($$1.a, this.f, this.g);
         this.j = new ffq(this.e, $$1.a, fel.a, () -> fgo.Q().execute(() -> fbt.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (fdj var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public wz a() {
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
