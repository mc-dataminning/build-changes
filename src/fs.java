import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class fs implements fl {
   private final fr a;
   private final fr b;
   private final fr c;

   public fs(fr $$0, fr $$1, fr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ehf a(ds $$0) {
      ehf $$1 = $$0.d();
      return new ehf(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public ehe b(ds $$0) {
      ehe $$1 = $$0.k();
      return new ehe((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof fs $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static fs a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      fr $$2 = fr.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fr $$3 = fr.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fr $$4 = fr.a($$0);
            return new fs($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw fq.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw fq.a.createWithContext($$0);
      }
   }

   public static fs a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      fr $$3 = fr.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fr $$4 = fr.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fr $$5 = fr.a($$0, $$1);
            return new fs($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw fq.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw fq.a.createWithContext($$0);
      }
   }

   public static fs a(double $$0, double $$1, double $$2) {
      return new fs(new fr(false, $$0), new fr(false, $$1), new fr(false, $$2));
   }

   public static fs a(ehe $$0) {
      return new fs(new fr(false, (double)$$0.i), new fr(false, (double)$$0.j), new fr(true, 0.0));
   }

   public static fs d() {
      return new fs(new fr(true, 0.0), new fr(true, 0.0), new fr(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
