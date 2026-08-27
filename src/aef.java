import javax.annotation.Nullable;

public class aef implements yp<aba> {
   public static final yg<vi, aef> a = yp.a(aef::a, aef::new);
   private final int b;
   private final int c;

   public aef(bqa $$0, @Nullable bqa $$1) {
      this.b = $$0.aj();
      this.c = $$1 != null ? $$1.aj() : 0;
   }

   private aef(vi $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vi $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public yr<aef> a() {
      return afl.aD;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
