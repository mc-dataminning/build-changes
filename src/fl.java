import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class fl implements fk {
   public static final char a = '^';
   private final double b;
   private final double c;
   private final double d;

   public fl(double $$0, double $$1, double $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ehe a(dr $$0) {
      ehd $$1 = $$0.k();
      ehe $$2 = $$0.m().a($$0);
      float $$3 = arp.b(($$1.j + 90.0F) * (float) (Math.PI / 180.0));
      float $$4 = arp.a(($$1.j + 90.0F) * (float) (Math.PI / 180.0));
      float $$5 = arp.b(-$$1.i * (float) (Math.PI / 180.0));
      float $$6 = arp.a(-$$1.i * (float) (Math.PI / 180.0));
      float $$7 = arp.b((-$$1.i + 90.0F) * (float) (Math.PI / 180.0));
      float $$8 = arp.a((-$$1.i + 90.0F) * (float) (Math.PI / 180.0));
      ehe $$9 = new ehe((double)($$3 * $$5), (double)$$6, (double)($$4 * $$5));
      ehe $$10 = new ehe((double)($$3 * $$7), (double)$$8, (double)($$4 * $$7));
      ehe $$11 = $$9.c($$10).a(-1.0);
      double $$12 = $$9.c * this.d + $$10.c * this.c + $$11.c * this.b;
      double $$13 = $$9.d * this.d + $$10.d * this.c + $$11.d * this.b;
      double $$14 = $$9.e * this.d + $$10.e * this.c + $$11.e * this.b;
      return new ehe($$2.c + $$12, $$2.d + $$13, $$2.e + $$14);
   }

   @Override
   public ehd b(dr $$0) {
      return ehd.a;
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public boolean c() {
      return true;
   }

   public static fl a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      double $$2 = a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         double $$3 = a($$0, $$1);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            double $$4 = a($$0, $$1);
            return new fl($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw fp.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw fp.a.createWithContext($$0);
      }
   }

   private static double a(StringReader $$0, int $$1) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw fq.a.createWithContext($$0);
      } else if ($$0.peek() != '^') {
         $$0.setCursor($$1);
         throw fp.b.createWithContext($$0);
      } else {
         $$0.skip();
         return $$0.canRead() && $$0.peek() != ' ' ? $$0.readDouble() : 0.0;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fl $$1) ? false : this.b == $$1.b && this.c == $$1.c && this.d == $$1.d;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c, this.d);
   }
}
