import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dfl(dfm b, dfk c, OptionalInt d, deh e, Optional<List<dea>> f) {
   public static final yw<wj, dfl> a = yw.a(dfm.a, dfl::a, dfk.e, dfl::b, yu.i, dfl::c, yu.a(mh.af), dfl::d, dea.a.a(yu.a()).a(yu::a), dfl::e, dfl::new);

   public List<czn> a(baz $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(crs $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dfm a() {
      return this.b;
   }

   public dfk b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public deh d() {
      return this.e;
   }

   public Optional<List<dea>> e() {
      return this.f;
   }
}
