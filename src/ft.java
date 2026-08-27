import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class ft implements fm {
   private final fs a;
   private final fs b;
   private final fs c;

   public ft(fs $$0, fs $$1, fs $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ehn a(dt $$0) {
      ehn $$1 = $$0.d();
      return new ehn(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public ehm b(dt $$0) {
      ehm $$1 = $$0.k();
      return new ehm((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof ft $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static ft a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      fs $$2 = fs.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fs $$3 = fs.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fs $$4 = fs.a($$0);
            return new ft($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw fr.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw fr.a.createWithContext($$0);
      }
   }

   public static ft a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      fs $$3 = fs.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         fs $$4 = fs.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fs $$5 = fs.a($$0, $$1);
            return new ft($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw fr.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw fr.a.createWithContext($$0);
      }
   }

   public static ft a(double $$0, double $$1, double $$2) {
      return new ft(new fs(false, $$0), new fs(false, $$1), new fs(false, $$2));
   }

   public static ft a(ehm $$0) {
      return new ft(new fs(false, (double)$$0.i), new fs(false, (double)$$0.j), new fs(true, 0.0));
   }

   public static ft d() {
      return new ft(new fs(true, 0.0), new fs(true, 0.0), new fs(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
