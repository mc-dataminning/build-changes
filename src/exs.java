import java.util.List;
import javax.annotation.Nullable;

public class exs implements fab {
   private static final int a = 170;
   private final vb b;
   @Nullable
   private List<atk> c;
   @Nullable
   private final vb d;
   private int e;
   private long f;
   private boolean g;

   private exs(vb $$0, @Nullable vb $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public void a(int $$0) {
      this.e = $$0;
   }

   public static exs a(vb $$0, @Nullable vb $$1) {
      return new exs($$0, $$1);
   }

   public static exs a(vb $$0) {
      return new exs($$0, $$0);
   }

   @Override
   public void b(faa $$0) {
      if (this.d != null) {
         $$0.a(ezz.c, this.d);
      }
   }

   public List<atk> a(euk $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<atk> a(euk $$0, vb $$1) {
      return $$0.h.c($$1, 170);
   }

   public void a(boolean $$0, boolean $$1, fak $$2) {
      boolean $$3 = $$0 || $$1 && euk.N().aT().b();
      if ($$3 != this.g) {
         if ($$3) {
            this.f = ac.b();
         }

         this.g = $$3;
      }

      if ($$3 && ac.b() - this.f > (long)this.e) {
         fcc $$4 = euk.N().y;
         if ($$4 != null) {
            $$4.a(this, this.b($$0, $$1, $$2), $$1);
         }
      }
   }

   protected fev b(boolean $$0, boolean $$1, fak $$2) {
      return (fev)(!$$0 && $$1 && euk.N().aT().b() ? new fer($$2) : new fex($$2));
   }
}
