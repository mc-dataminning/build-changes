import java.util.function.BiFunction;

public class abx implements ze<abq> {
   public static final yv<wi, abx> a = yv.a(io.b, abx::b, yt.a(lf.h), abx::e, yt.o, abx::f, abx::new);
   private final io b;
   private final dok<?> c;
   private final ud d;

   public static abx a(doi $$0, BiFunction<doi, jl, ud> $$1) {
      jl $$2 = $$0.i().H_();
      return new abx($$0.aA_(), $$0.r(), $$1.apply($$0, $$2));
   }

   public static abx a(doi $$0) {
      return a($$0, doi::a);
   }

   private abx(io $$0, dok<?> $$1, ud $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public zg<abx> a() {
      return agc.i;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public io b() {
      return this.b;
   }

   public dok<?> e() {
      return this.c;
   }

   public ud f() {
      return this.d;
   }
}
