import java.util.List;

public class afc implements ze<abq> {
   public static final yv<vx, afc> a = ze.a(afc::a, afc::new);
   private final int b;
   private final int[] c;

   public afc(brw $$0) {
      this.b = $$0.al();
      List<brw> $$1 = $$0.cS();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).al();
      }
   }

   private afc(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<afc> a() {
      return agc.aJ;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
