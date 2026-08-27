import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record abe(int b, int c, int d, List<abe.a> e) implements yb<aam> {
   public static final xs<vf, abe> a = xs.a(xq.d, abe::e, xq.d, abe::f, xq.d, abe::g, abe.a.a.a(xq.a()), abe::h, abe::new);

   public abe(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new abe.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(vx::a))).toList()
      );
   }

   @Override
   public yd<abe> a() {
      return aex.r;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public Suggestions b() {
      StringRange $$0 = StringRange.between(this.c, this.c + this.d);
      return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), $$1.b().orElse(null))).toList());
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public List<abe.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<vu> c) {
      public static final xs<vf, abe.a> a = xs.a(xq.i, abe.a::a, vw.c, abe.a::b, abe.a::new);

      public String a() {
         return this.b;
      }

      public Optional<vu> b() {
         return this.c;
      }
   }
}
