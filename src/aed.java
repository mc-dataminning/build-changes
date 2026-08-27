import javax.annotation.Nullable;

public class aed implements yn<aay> {
   public static final ye<vg, aed> a = yn.a(aed::a, aed::new);
   private final int b;
   private final int c;

   public aed(bpv $$0, @Nullable bpv $$1) {
      this.b = $$0.aj();
      this.c = $$1 != null ? $$1.aj() : 0;
   }

   private aed(vg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vg $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public yp<aed> a() {
      return afj.aD;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
