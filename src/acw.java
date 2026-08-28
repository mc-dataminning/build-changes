import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acw(int b, int c, int d, List<acw.a> e) implements zo<acf> {
   public static final ze<wp, acw> a = ze.a(zc.h, acw::e, zc.h, acw::f, zc.h, acw::g, acw.a.a.a(zc.a()), acw::h, acw::new);

   public acw(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acw.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xj::a))).toList()
      );
   }

   @Override
   public zq<acw> a() {
      return agy.q;
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

   public List<acw.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xg> c) {
      public static final ze<wp, acw.a> a = ze.a(zc.p, acw.a::a, xi.e, acw.a::b, acw.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xg> b() {
         return this.c;
      }
   }
}
