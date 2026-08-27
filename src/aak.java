import java.util.BitSet;
import javax.annotation.Nullable;

public class aak implements xf<za> {
   private final int a;
   private final int b;
   private final aaj c;
   private final aao d;

   public aak(dlo $$0, eeg $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      csw $$4 = $$0.f();
      this.a = $$4.e;
      this.b = $$4.f;
      this.c = new aaj($$0);
      this.d = new aao($$4, $$1, $$2, $$3);
   }

   public aak(ui $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
      this.c = new aaj($$0, this.a, this.b);
      this.d = new aao($$0, this.a, this.b);
   }

   @Override
   public void a(ui $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
      this.c.a($$0);
      this.d.a($$0);
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

   public aaj e() {
      return this.c;
   }

   public aao f() {
      return this.d;
   }
}
