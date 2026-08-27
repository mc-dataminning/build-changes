import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record ftp(dzs a, jn<dwv> b, dzp c, jh<alc> d, ale e, dcu f) {
   public ftp(dzq $$0, jh<alc> $$1, ale $$2, dcu $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public ftp(dzs $$0, dzp $$1, jh<alc> $$2, ale $$3, dcu $$4) {
      this($$0, $$2.a(alc.c).d(li.aT), $$1, $$2.a(alc.c), $$3, $$4);
   }

   public ftp a(dzs $$0, dzp $$1) {
      return new ftp($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public ftp a(ftp.b $$0) {
      return new ftp($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public ftp a(ftp.a $$0) {
      return new ftp(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public jo.b a() {
      return this.d.a();
   }

   public dzs b() {
      return this.a;
   }

   public jn<dwv> c() {
      return this.b;
   }

   public dzp d() {
      return this.c;
   }

   public jh<alc> e() {
      return this.d;
   }

   public ale f() {
      return this.e;
   }

   public dcu g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<jo.b, dzp, dzp> {
   }

   public interface b extends UnaryOperator<dzs> {
   }
}
