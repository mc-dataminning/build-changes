import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dfy(dfz b, dfx c, OptionalInt d, deu e, Optional<List<den>> f) {
   public static final za<wn, dfy> a = za.a(dfz.a, dfy::a, dfx.e, dfy::b, yy.i, dfy::c, yy.a(mi.af), dfy::d, den.a.a(yy.a()).a(yy::a), dfy::e, dfy::new);

   public List<daa> a(bbd $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(csf $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dfz a() {
      return this.b;
   }

   public dfx b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public deu d() {
      return this.e;
   }

   public Optional<List<den>> e() {
      return this.f;
   }
}
