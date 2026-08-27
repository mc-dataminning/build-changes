import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public record fdg(dlq a, ht<dit> b, dln c, hn<afg> d, afh e, cqo f) {
   public fdg(dlo $$0, hn<afg> $$1, afh $$2, cqo $$3) {
      this($$0.a(), $$0.b(), $$1, $$2, $$3);
   }

   public fdg(dlq $$0, dln $$1, hn<afg> $$2, afh $$3, cqo $$4) {
      this($$0, $$2.a(afg.c).d(je.aI), $$1, $$2.a(afg.c), $$3, $$4);
   }

   public fdg a(dlq $$0, dln $$1) {
      return new fdg($$0, this.b, $$1, this.d, this.e, this.f);
   }

   public fdg a(fdg.b $$0) {
      return new fdg($$0.apply(this.a), this.b, this.c, this.d, this.e, this.f);
   }

   public fdg a(fdg.a $$0) {
      return new fdg(this.a, this.b, $$0.apply(this.a(), this.c), this.d, this.e, this.f);
   }

   public hu.b a() {
      return this.d.a();
   }

   public dlq b() {
      return this.a;
   }

   public ht<dit> c() {
      return this.b;
   }

   public dln d() {
      return this.c;
   }

   public hn<afg> e() {
      return this.d;
   }

   public afh f() {
      return this.e;
   }

   public cqo g() {
      return this.f;
   }

   @FunctionalInterface
   public interface a extends BiFunction<hu.b, dln, dln> {
   }

   public interface b extends UnaryOperator<dlq> {
   }
}
