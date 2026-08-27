import java.time.Instant;
import javax.annotation.Nullable;

public record afs(String b, Instant c, long d, @Nullable ws e, wn.b f) implements yn<afl> {
   public static final ye<vg, afs> a = yn.a(afs::a, afs::new);

   private afs(vg $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(ws::a), new wn.b($$0));
   }

   private void a(vg $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, ws::a);
      this.f.a($$0);
   }

   @Override
   public yp<afs> a() {
      return afj.bj;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public ws g() {
      return this.e;
   }

   public wn.b h() {
      return this.f;
   }
}
