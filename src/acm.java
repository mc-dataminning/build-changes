import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acm(int b, int c, int d, List<acm.a> e) implements zg<abu> {
   public static final yx<wk, acm> a = yx.a(yv.g, acm::e, yv.g, acm::f, yv.g, acm::g, acm.a.a.a(yv.a()), acm::h, acm::new);

   public acm(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acm.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xc::a))).toList()
      );
   }

   @Override
   public zi<acm> a() {
      return agg.r;
   }

   public void a(abu $$0) {
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

   public List<acm.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wz> c) {
      public static final yx<wk, acm.a> a = yx.a(yv.l, acm.a::a, xb.e, acm.a::b, acm.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wz> b() {
         return this.c;
      }
   }
}
