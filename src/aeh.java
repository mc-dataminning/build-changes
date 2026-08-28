import java.util.BitSet;
import javax.annotation.Nullable;

public class aeh implements aac<acr> {
   public static final zt<ws, aeh> a = aac.a(aeh::a, aeh::new);
   private final int b;
   private final int c;
   private final aei d;

   public aeh(dgg $$0, ete $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.g;
      this.c = $$0.h;
      this.d = new aei($$0, $$1, $$2, $$3);
   }

   private aeh(ws $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new aei($$0, this.b, this.c);
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public aae<aeh> a() {
      return ahk.N;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public aei f() {
      return this.d;
   }
}
