import java.time.Instant;
import javax.annotation.Nullable;

public record ahd(String b, Instant c, long d, @Nullable xu e, xp.b f) implements zp<agv> {
   public static final zg<wf, ahd> a = zp.a(ahd::a, ahd::new);

   private ahd(wf $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xu::a), new xp.b($$0));
   }

   private void a(wf $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xu::a);
      this.f.a($$0);
   }

   @Override
   public zr<ahd> a() {
      return agt.bn;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xu g() {
      return this.e;
   }

   public xp.b h() {
      return this.f;
   }
}
