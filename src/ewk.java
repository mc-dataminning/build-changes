import java.util.List;
import javax.annotation.Nullable;

public class ewk implements eyt {
   private static final int a = 170;
   private final ur b;
   @Nullable
   private List<asy> c;
   @Nullable
   private final ur d;
   private int e;
   private long f;
   private boolean g;

   private ewk(ur $$0, @Nullable ur $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static ewk a(ur $$0, @Nullable ur $$1) {
      return new ewk($$0, $$1);
   }

   public static ewk a(ur $$0) {
      return new ewk($$0, $$0);
   }

   @Override
   public void b(eys $$0) {
      if (this.d != null) {
         $$0.a(eyr.c, this.d);
      }
   }

   public List<asy> a(etd $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<asy> a(etd $$0, ur $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, ezc $$2) {
      boolean $$3 = $$0 || $$1 && etd.N().aT().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         fau $$4 = etd.N().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected fdn b(boolean $$0, boolean $$1, ezc $$2) {
      return (fdn)(!$$0 && $$1 && etd.N().aT().b() ? new fdj($$2) : new fdp($$2));
   }
}
