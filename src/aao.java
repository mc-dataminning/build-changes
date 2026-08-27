import java.util.BitSet;
import javax.annotation.Nullable;

public class aao implements xg<zb> {
   private final int a;
   private final int b;
   private final aap c;

   public aao(cte $$0, eeo $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new aap($$0, $$1, $$2, $$3);
   }

   public aao(uj $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
      this.c = new aap($$0, this.a, this.b);
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public aap e() {
      return this.c;
   }
}
