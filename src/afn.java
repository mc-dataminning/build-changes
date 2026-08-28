import javax.annotation.Nullable;

public class afn implements zv<ach> {
   public static final zm<wl, afn> a = zv.a(afn::a, afn::new);
   private final int b;
   private final int c;

   public afn(bst $$0, @Nullable bst $$1) {
      this.b = $$0.al();
      this.c = $$1 != null ? $$1.al() : 0;
   }

   private afn(wl $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wl $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zx<afn> a() {
      return agt.aD;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
