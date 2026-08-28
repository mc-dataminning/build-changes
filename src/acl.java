import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acl(int b, int c, int d, List<acl.a> e) implements zf<abt> {
   public static final yw<wj, acl> a = yw.a(yu.g, acl::e, yu.g, acl::f, yu.g, acl::g, acl.a.a.a(yu.a()), acl::h, acl::new);

   public acl(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acl.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xb::a))).toList()
      );
   }

   @Override
   public zh<acl> a() {
      return agf.r;
   }

   public void a(abt $$0) {
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

   public List<acl.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wy> c) {
      public static final yw<wj, acl.a> a = yw.a(yu.l, acl.a::a, xa.e, acl.a::b, acl.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wy> b() {
         return this.c;
      }
   }
}
