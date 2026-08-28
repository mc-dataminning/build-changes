import java.util.BitSet;
import javax.annotation.Nullable;

public class ads implements zo<acd> {
   public static final zf<we, ads> a = zo.a(ads::a, ads::new);
   private final int b;
   private final int c;
   private final adt d;

   public ads(deb $$0, eqt $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adt($$0, $$1, $$2, $$3);
   }

   private ads(we $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adt($$0, this.b, this.c);
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zq<ads> a() {
      return ags.N;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adt f() {
      return this.d;
   }
}
