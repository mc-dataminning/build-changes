import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record aba(int b, int c, int d, List<aba.a> e) implements xz<aai> {
   public static final xq<vd, aba> a = xq.a(xo.d, aba::e, xo.d, aba::f, xo.d, aba::g, aba.a.a.a(xo.a()), aba::h, aba::new);

   public aba(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new aba.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(vv::a))).toList()
      );
   }

   @Override
   public yb<aba> a() {
      return aet.r;
   }

   public void a(aai $$0) {
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

   public List<aba.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<vs> c) {
      public static final xq<vd, aba.a> a = xq.a(xo.i, aba.a::a, vu.c, aba.a::b, aba.a::new);

      public String a() {
         return this.b;
      }

      public Optional<vs> b() {
         return this.c;
      }
   }
}
