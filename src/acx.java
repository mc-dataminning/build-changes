import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acx(int b, int c, int d, List<acx.a> e) implements zq<acf> {
   public static final zh<wu, acx> a = zh.a(zf.h, acx::e, zf.h, acx::f, zf.h, acx::g, acx.a.a.a(zf.a()), acx::h, acx::new);

   public acx(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acx.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xm::a))).toList()
      );
   }

   @Override
   public zs<acx> a() {
      return agu.r;
   }

   public void a(acf $$0) {
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

   public List<acx.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xj> c) {
      public static final zh<wu, acx.a> a = zh.a(zf.n, acx.a::a, xl.e, acx.a::b, acx.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xj> b() {
         return this.c;
      }
   }
}
