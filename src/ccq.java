import java.util.EnumSet;

public class ccq extends ccw {
   private final bwa a;

   public ccq(bwa $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccw.a.c));
      $$0.O().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(awv.a) > this.a.do() || this.a.bv();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dX().i() < 0.8F) {
         this.a.N().a();
      }
   }
}
