import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fcw(dlg a, hr<dij> b, dld c, hl<afa> d, afb e, cqe f) {
   public fcw(dle $$0, hl<afa> $$1, afb $$2, cqe $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fcw(dlg $$0, dld $$1, hl<afa> $$2, afb $$3, cqe $$4) {
      this($$0, $$2.a(afa.c).d(jc.aI), $$1, $$2.a(afa.c), $$3, $$4);
   }

   public fcw a(dlg $$0, dld $$1) {
      return new fcw($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fcw a(fcw.b $$0) {
      return new fcw($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fcw a(fcw.a $$0) {
      return new fcw(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public hs.b a() {
      return this.d.a();
   }

   public dlg b() {
      return this.a;
   }

   public hr<dij> c() {
      return this.b;
   }

   public dld d() {
      return this.c;
   }

   public hl<afa> e() {
      return this.d;
   }

   public afb f() {
      return this.e;
   }

   public cqe g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<hs.b, dld, dld> {
   }

   public interface b extends UnaryOperator<dlg> {
   }
}
