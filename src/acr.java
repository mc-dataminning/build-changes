import javax.annotation.Nullable;

public class acr implements zb<abn> {
   public static final ys<vr, acr> a = zb.a(acr::a, acr::new);
   private final int b;
   private final byte c;

   public acr(bsh $$0, byte $$1) {
      this.b = $$0.an();
      this.c = $$1;
   }

   private acr(vr $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(vr $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public zd<acr> a() {
      return afz.D;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   @Nullable
   public bsh a(dcg $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
