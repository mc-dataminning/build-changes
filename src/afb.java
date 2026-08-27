import java.util.List;

public class afb implements ze<abq> {
   public static final yv<vx, afb> a = ze.a(afb::a, afb::new);
   private final int b;
   private final int[] c;

   public afb(bru $$0) {
      this.b = $$0.al();
      List<bru> $$1 = $$0.cS();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).al();
      }
   }

   private afb(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zg<afb> a() {
      return agb.aJ;
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
