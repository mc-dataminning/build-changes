import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fov(dvy a, ja<dtb> b, dvv c, iu<ake> d, akf e, daa f) {
   public fov(dvw $$0, iu<ake> $$1, akf $$2, daa $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fov(dvy $$0, dvv $$1, iu<ake> $$2, akf $$3, daa $$4) {
      this($$0, $$2.a(ake.c).d(ku.aQ), $$1, $$2.a(ake.c), $$3, $$4);
   }

   public fov a(dvy $$0, dvv $$1) {
      return new fov($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fov a(fov.b $$0) {
      return new fov($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fov a(fov.a $$0) {
      return new fov(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jb.b a() {
      return this.d.a();
   }

   public dvy b() {
      return this.a;
   }

   public ja<dtb> c() {
      return this.b;
   }

   public dvv d() {
      return this.c;
   }

   public iu<ake> e() {
      return this.d;
   }

   public akf f() {
      return this.e;
   }

   public daa g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jb.b, dvv, dvv> {
   }

   public interface b extends UnaryOperator<dvy> {
   }
}
