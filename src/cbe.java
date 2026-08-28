import java.util.EnumSet;

public class cbe extends cbk {
   private final bup a;

   public cbe(bup $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbk.a.c));
      $$0.P().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bi() && this.a.b(axb.a) > this.a.dm() || this.a.bw();
   }

   @Override
   public boolean U_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dV().i() < 0.8F) {
         this.a.O().a();
      }
   }
}
