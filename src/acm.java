import java.util.Optional;

public class acm implements vd<abc> {
   private final Optional<bib> a;
   private final Optional<bib> b;

   public acm(Optional<bib> $$0, Optional<bib> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acm(so $$0) {
      this.a = $$0.b((so.a<bib>)($$0x -> $$0x.a(jb.e)));
      this.b = $$0.b((so.a<bib>)($$0x -> $$0x.a(jb.e)));
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jb.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jb.e, $$1));
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public Optional<bib> a() {
      return this.a;
   }

   public Optional<bib> d() {
      return this.b;
   }
}
