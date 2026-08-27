import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewe extends ewh {
   private static final Logger b = LogUtils.getLogger();
   private static final vq c = vq.c("mco.snapshot.creating");
   private final long d;
   private final ewa e;
   private final String f;
   private final String g;
   private final esl h;
   @Nullable
   private ewj i;
   @Nullable
   private ewk j;

   public ewe(esl $$0, long $$1, ewa $$2, String $$3, String $$4) {
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$0;
   }

   @Override
   public void run() {
      esq $$0 = esq.a();

      try {
         eth $$1 = $$0.a(Long.valueOf(this.d));
         this.i = new ewj($$1.a, this.f, this.g);
         this.j = new ewk(this.e, $$1.a, evf.a, () -> exh.O().execute(() -> esl.a($$1, this.h, true)));
         if (this.d()) {
            return;
         }

         this.i.run();
         if (this.d()) {
            return;
         }

         this.j.run();
      } catch (eud var3) {
         b.error("Couldn't create snapshot world", var3);
         this.a(var3);
      } catch (Exception var4) {
         b.error("Couldn't create snapshot world", var4);
         this.a(var4);
      }
   }

   @Override
   public vq a() {
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
