import javax.annotation.Nullable;

public class afn implements zb<abn> {
   public static final ys<vr, afn> a = zb.a(afn::a, afn::new);
   private final int b;
   @Nullable
   private final tx c;

   public afn(int $$0, @Nullable tx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afn(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a((uu)this.c);
   }

   @Override
   public zd<afn> a() {
      return afz.aX;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public tx e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
