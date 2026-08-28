import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acw(int b, int c, int d, List<acw.a> e) implements zp<ace> {
   public static final zg<wt, acw> a = zg.a(ze.h, acw::e, ze.h, acw::f, ze.h, acw::g, acw.a.a.a(ze.a()), acw::h, acw::new);

   public acw(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acw.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xl::a))).toList()
      );
   }

   @Override
   public zr<acw> a() {
      return agt.r;
   }

   public void a(ace $$0) {
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

   public List<acw.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xi> c) {
      public static final zg<wt, acw.a> a = zg.a(ze.m, acw.a::a, xk.e, acw.a::b, acw.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xi> b() {
         return this.c;
      }
   }
}
