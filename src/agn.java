import java.time.Instant;
import javax.annotation.Nullable;

public record agn(String b, Instant c, long d, @Nullable xa e, wv.b f) implements yv<agf> {
   public static final ym<vl, agn> a = yv.a(agn::a, agn::new);

   private agn(vl $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(xa::a), new wv.b($$0));
   }

   private void a(vl $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, xa::a);
      this.f.a($$0);
   }

   @Override
   public yx<agn> a() {
      return agd.br;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public xa g() {
      return this.e;
   }

   public wv.b h() {
      return this.f;
   }
}
