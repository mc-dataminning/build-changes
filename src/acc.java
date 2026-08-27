import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acc(int b, int c, int d, List<acc.a> e) implements yz<abk> {
   public static final yq<wd, acc> a = yq.a(yo.f, acc::e, yo.f, acc::f, yo.f, acc::g, acc.a.a.a(yo.a()), acc::h, acc::new);

   public acc(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acc.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(wv::a))).toList()
      );
   }

   @Override
   public zb<acc> a() {
      return afv.r;
   }

   public void a(abk $$0) {
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

   public List<acc.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<ws> c) {
      public static final yq<wd, acc.a> a = yq.a(yo.k, acc.a::a, wu.e, acc.a::b, acc.a::new);

      public String a() {
         return this.b;
      }

      public Optional<ws> b() {
         return this.c;
      }
   }
}
