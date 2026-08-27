import java.util.List;
import javax.annotation.Nullable;

public class eyp implements fay {
   private static final int a = 170;
   private final vf b;
   @Nullable
   private List<atz> c;
   @Nullable
   private final vf d;
   private int e;
   private long f;
   private boolean g;

   private eyp(vf $$0, @Nullable vf $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static eyp a(vf $$0, @Nullable vf $$1) {
      return new eyp($$0, $$1);
   }

   public static eyp a(vf $$0) {
      return new eyp($$0, $$0);
   }

   @Override
   public void b(fax $$0) {
      if (this.d != null) {
         $$0.a(faw.c, this.d);
      }
   }

   public List<atz> a(evg $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<atz> a(evg $$0, vf $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, fbh $$2) {
      boolean $$3 = $$0 || $$1 && evg.O().aU().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         fcz $$4 = evg.O().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected ffs b(boolean $$0, boolean $$1, fbh $$2) {
      return (ffs)(!$$0 && $$1 && evg.O().aU().b() ? new ffo($$2) : new ffu($$2));
   }
}
