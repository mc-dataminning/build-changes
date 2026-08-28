import javax.annotation.Nullable;

public class aet implements zb<abn> {
   public static final ys<vr, aet> a = zb.a(aet::a, aet::new);
   private final int b;
   private final int c;

   public aet(bsd $$0, @Nullable bsd $$1) {
      this.b = $$0.al();
      this.c = $$1 != null ? $$1.al() : 0;
   }

   private aet(vr $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vr $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zd<aet> a() {
      return afz.aD;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
