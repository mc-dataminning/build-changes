import java.util.List;

public class afs implements zp<ace> {
   public static final zg<wf, afs> a = zp.a(afs::a, afs::new);
   private final int b;
   private final int[] c;

   public afs(bue $$0) {
      this.b = $$0.as();
      List<bue> $$1 = $$0.da();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).as();
      }
   }

   private afs(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<afs> a() {
      return agt.aK;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
