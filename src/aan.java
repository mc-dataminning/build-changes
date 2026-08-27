import java.util.BitSet;
import javax.annotation.Nullable;

public class aan implements xf<za> {
   private final int a;
   private final int b;
   private final aao c;

   public aan(csv $$0, eef $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.a = $$0.e;
      this.b = $$0.f;
      this.c = new aao($$0, $$1, $$2, $$3);
   }

   public aan(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
      this.c = new aao($$0, this.a, this.b);
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      this.c.a($$0);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public aao e() {
      return this.c;
   }
}
