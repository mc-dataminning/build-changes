import java.util.Optional;

public class acn implements ve<abd> {
   private final Optional<bib> a;
   private final Optional<bib> b;

   public acn(Optional<bib> $$0, Optional<bib> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acn(sp $$0) {
      this.a = $$0.b((sp.a<bib>)($$0x -> $$0x.a(jd.e)));
      this.b = $$0.b((sp.a<bib>)($$0x -> $$0x.a(jd.e)));
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$0x.a(jd.e, $$1));
      $$0.a(this.b, ($$0x, $$1) -> $$0x.a(jd.e, $$1));
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public Optional<bib> a() {
      return this.a;
   }

   public Optional<bib> d() {
      return this.b;
   }
}
