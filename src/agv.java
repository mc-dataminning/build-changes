import java.time.Instant;
import javax.annotation.Nullable;

public record agv(String b, Instant c, long d, @Nullable xi e, xd.b f) implements zd<agn> {
   public static final yu<vs, agv> a = zd.a(agv::a, agv::new);

   private agv(vs $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xi::a), new xd.b($$0));
   }

   private void a(vs $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xi::a);
      this.f.a($$0);
   }

   @Override
   public zf<agv> a() {
      return agl.br;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xi g() {
      return this.e;
   }

   public xd.b h() {
      return this.f;
   }
}
