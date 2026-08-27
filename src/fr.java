import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class fr implements fk {
   private final fq a;
   private final fq b;
   private final fq c;

   public fr(fq $$0, fq $$1, fq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eei a(ds $$0) {
      eei $$1 = $$0.d();
      return new eei(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public eeh b(ds $$0) {
      eeh $$1 = $$0.k();
      return new eeh((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
   }

   @Override
   public boolean a() {
      return this.a.a();
   }

   @Override
   public boolean b() {
      return this.b.a();
   }

   @Override
   public boolean c() {
      return this.c.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof fr $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static fr a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      fq $$2 = fq.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fq $$3 = fq.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fq $$4 = fq.a($$0);
            return new fr($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw fp.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw fp.a.createWithContext($$0);
      }
   }

   public static fr a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      fq $$3 = fq.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fq $$4 = fq.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fq $$5 = fq.a($$0, $$1);
            return new fr($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw fp.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw fp.a.createWithContext($$0);
      }
   }

   public static fr a(double $$0, double $$1, double $$2) {
      return new fr(new fq(false, $$0), new fq(false, $$1), new fq(false, $$2));
   }

   public static fr a(eeh $$0) {
      return new fr(new fq(false, (double)$$0.i), new fq(false, (double)$$0.j), new fq(true, 0.0));
   }

   public static fr d() {
      return new fr(new fq(true, 0.0), new fq(true, 0.0), new fq(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
