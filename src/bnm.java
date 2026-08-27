import java.util.EnumSet;

public class bnm extends bmv {
   private static final bqm b = bqm.b().a(6.0);
   public static final int a = 400;
   private final brx c;
   private byb d;
   private int e;

   public bnm(brx $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bmv.a.a, bmv.a.b));
   }

   @Override
   public boolean a() {
      if (!this.c.dI().N()) {
         return false;
      } else if (this.c.ec().a(8000) != 0) {
         return false;
      } else {
         this.d = this.c.dI().a(byb.class, b, this.c, this.c.dn(), this.c.dp(), this.c.dt(), this.c.cE().c(6.0, 2.0, 6.0));
         return this.d != null;
      }
   }

   @Override
   public boolean b() {
      return this.e > 0;
   }

   @Override
   public void c() {
      this.e = this.a(400);
      this.c.w(true);
   }

   @Override
   public void d() {
      this.c.w(false);
      this.d = null;
   }

   @Override
   public void e() {
      this.c.E().a(this.d, 30.0F, 30.0F);
      this.e--;
   }
}
